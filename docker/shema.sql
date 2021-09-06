--
-- PostgreSQL database dump
--

-- Dumped from database version 13.3
-- Dumped by pg_dump version 13.2

-- Started on 2021-09-06 20:37:35 GMT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE IF EXISTS saysay;
--
-- TOC entry 3346 (class 1262 OID 16386)
-- Name: saysay; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE saysay WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'en_US.UTF-8';


ALTER DATABASE saysay OWNER TO postgres;

\connect saysay

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 209 (class 1259 OID 16454)
-- Name: tb_sector; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_sector (
    id bigint NOT NULL,
    sid character varying(50),
    name character varying(255),
    createdby character varying(255),
    description text,
    createdon character varying DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE public.tb_sector OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 16452)
-- Name: sector_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.sector_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sector_id_seq OWNER TO postgres;

--
-- TOC entry 3347 (class 0 OID 0)
-- Dependencies: 208
-- Name: sector_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.sector_id_seq OWNED BY public.tb_sector.id;


--
-- TOC entry 211 (class 1259 OID 16466)
-- Name: tb_category; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_category (
    id bigint NOT NULL,
    cid character varying(50),
    name character varying(255),
    description text,
    createdby character varying(255),
    createdon character varying DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE public.tb_category OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 16464)
-- Name: tb_category_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_category_id_seq OWNER TO postgres;

--
-- TOC entry 3348 (class 0 OID 0)
-- Dependencies: 210
-- Name: tb_category_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_category_id_seq OWNED BY public.tb_category.id;


--
-- TOC entry 203 (class 1259 OID 16418)
-- Name: tb_comment; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_comment (
    id bigint NOT NULL,
    authorid character varying(50),
    cid character varying(50),
    storyid character varying(50),
    possibilitysensitive integer,
    lang character varying(2),
    entities text,
    authorname character varying(255),
    createdon character varying DEFAULT CURRENT_TIMESTAMP,
    comment text
);


ALTER TABLE public.tb_comment OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16416)
-- Name: tb_comment_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_comment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_comment_id_seq OWNER TO postgres;

--
-- TOC entry 3349 (class 0 OID 0)
-- Dependencies: 202
-- Name: tb_comment_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_comment_id_seq OWNED BY public.tb_comment.id;


--
-- TOC entry 205 (class 1259 OID 16430)
-- Name: tb_company; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_company (
    id bigint NOT NULL,
    name character varying(255),
    location character varying(255),
    phonenumber character varying(50) NOT NULL,
    sectorname character varying(255),
    rating integer,
    logo text,
    backgroundinfo text,
    entities text,
    cid character varying(50),
    code character varying(10),
    createdby character varying(255),
    email character varying(255),
    website text,
    otherlinks text,
    categoryname character varying(255),
    sectorid character varying(50),
    categoryid character varying(50),
    active integer DEFAULT 1,
    createdon character varying DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE public.tb_company OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16428)
-- Name: tb_company_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_company_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_company_id_seq OWNER TO postgres;

--
-- TOC entry 3350 (class 0 OID 0)
-- Dependencies: 204
-- Name: tb_company_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_company_id_seq OWNED BY public.tb_company.id;


--
-- TOC entry 213 (class 1259 OID 16544)
-- Name: tb_likes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_likes (
    id bigint NOT NULL,
    authorid character varying(50),
    lid character varying(50),
    comment_id character varying(50),
    storyid character varying(50),
    possibilitysensitive integer,
    lang character varying(2),
    entities text,
    authorname character varying(255),
    createdon character varying DEFAULT CURRENT_TIMESTAMP,
    status character varying(1)
);


ALTER TABLE public.tb_likes OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 16542)
-- Name: tb_likes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_likes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_likes_id_seq OWNER TO postgres;

--
-- TOC entry 3351 (class 0 OID 0)
-- Dependencies: 212
-- Name: tb_likes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_likes_id_seq OWNED BY public.tb_likes.id;


--
-- TOC entry 201 (class 1259 OID 16389)
-- Name: tb_story; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_story (
    id bigint NOT NULL,
    authorid character varying(30),
    entities text,
    sid character varying(255),
    lang character varying(2),
    possiblysensitive integer,
    source character varying(255),
    story text,
    likecount integer,
    commentcount integer,
    cautioncount integer,
    categoryname character varying(255),
    sectorname character varying(255),
    companyid character varying(50),
    sectorid character varying(50),
    categoryid character varying(50),
    authorname character varying(255),
    companyname character varying(255),
    createdon character varying DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE public.tb_story OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 16387)
-- Name: tb_story_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_story_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_story_id_seq OWNER TO postgres;

--
-- TOC entry 3352 (class 0 OID 0)
-- Dependencies: 200
-- Name: tb_story_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_story_id_seq OWNED BY public.tb_story.id;


--
-- TOC entry 207 (class 1259 OID 16442)
-- Name: tb_user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_user (
    id bigint NOT NULL,
    roleid character varying(50),
    firstname character varying(50),
    lastname character varying(50),
    email character varying(255) NOT NULL,
    mobile character varying(50),
    hashedpassword text,
    salt text,
    profilepic text,
    backgroundinfo text,
    website text,
    gpslocation character varying(255),
    dob character varying(50),
    otherinfo text,
    createdby character varying(255),
    rolename character varying(255),
    uid character varying(50),
    active integer DEFAULT 1,
    verified integer DEFAULT 0,
    verificationcode text,
    createdon timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    verifiedon timestamp without time zone
);


ALTER TABLE public.tb_user OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 16440)
-- Name: tb_user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_user_id_seq OWNER TO postgres;

--
-- TOC entry 3353 (class 0 OID 0)
-- Dependencies: 206
-- Name: tb_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_user_id_seq OWNED BY public.tb_user.id;


--
-- TOC entry 3171 (class 2604 OID 16469)
-- Name: tb_category id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_category ALTER COLUMN id SET DEFAULT nextval('public.tb_category_id_seq'::regclass);


--
-- TOC entry 3160 (class 2604 OID 16421)
-- Name: tb_comment id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_comment ALTER COLUMN id SET DEFAULT nextval('public.tb_comment_id_seq'::regclass);


--
-- TOC entry 3162 (class 2604 OID 16433)
-- Name: tb_company id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_company ALTER COLUMN id SET DEFAULT nextval('public.tb_company_id_seq'::regclass);


--
-- TOC entry 3173 (class 2604 OID 16547)
-- Name: tb_likes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_likes ALTER COLUMN id SET DEFAULT nextval('public.tb_likes_id_seq'::regclass);


--
-- TOC entry 3169 (class 2604 OID 16457)
-- Name: tb_sector id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_sector ALTER COLUMN id SET DEFAULT nextval('public.sector_id_seq'::regclass);


--
-- TOC entry 3158 (class 2604 OID 16392)
-- Name: tb_story id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_story ALTER COLUMN id SET DEFAULT nextval('public.tb_story_id_seq'::regclass);


--
-- TOC entry 3165 (class 2604 OID 16445)
-- Name: tb_user id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_user ALTER COLUMN id SET DEFAULT nextval('public.tb_user_id_seq'::regclass);


--
-- TOC entry 3338 (class 0 OID 16466)
-- Dependencies: 211
-- Data for Name: tb_category; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_category (id, cid, name, description, createdby, createdon) FROM stdin;
\.


--
-- TOC entry 3330 (class 0 OID 16418)
-- Dependencies: 203
-- Data for Name: tb_comment; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_comment (id, authorid, cid, storyid, possibilitysensitive, lang, entities, authorname, createdon, comment) FROM stdin;
1	35443544333577787688	C74fc0b19d7ea4f709a1a66c9aa14ac66	eeee	1	en	{"yea":"kee"}	shrug_life	2021-07-23 15:53:36.007856+00	Abena Korkor is my baby
\.


--
-- TOC entry 3332 (class 0 OID 16430)
-- Dependencies: 205
-- Data for Name: tb_company; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_company (id, name, location, phonenumber, sectorname, rating, logo, backgroundinfo, entities, cid, code, createdby, email, website, otherlinks, categoryname, sectorid, categoryid, active, createdon) FROM stdin;
7	SaySay	accrsdffdgfa	00000000	ertert	\N	ertre			Cb951db333f5e4e20ac34f6e9ae39ffe5	ertr	23423aaa			423432	ertrt	2342332	435435	1	2021-05-26 19:30:42.608999+00
\.


--
-- TOC entry 3340 (class 0 OID 16544)
-- Dependencies: 213
-- Data for Name: tb_likes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_likes (id, authorid, lid, comment_id, storyid, possibilitysensitive, lang, entities, authorname, createdon, status) FROM stdin;
\.


--
-- TOC entry 3336 (class 0 OID 16454)
-- Dependencies: 209
-- Data for Name: tb_sector; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_sector (id, sid, name, createdby, description, createdon) FROM stdin;
\.


--
-- TOC entry 3328 (class 0 OID 16389)
-- Dependencies: 201
-- Data for Name: tb_story; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_story (id, authorid, entities, sid, lang, possiblysensitive, source, story, likecount, commentcount, cautioncount, categoryname, sectorname, companyid, sectorid, categoryid, authorname, companyname, createdon) FROM stdin;
\.


--
-- TOC entry 3334 (class 0 OID 16442)
-- Dependencies: 207
-- Data for Name: tb_user; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_user (id, roleid, firstname, lastname, email, mobile, hashedpassword, salt, profilepic, backgroundinfo, website, gpslocation, dob, otherinfo, createdby, rolename, uid, active, verified, verificationcode, createdon, verifiedon) FROM stdin;
49	2332111	\N	\N	fr3man.stephen@gmail.com	233248620321	\N	\N	\N	\N	\N	\N	\N	\N	freeman	basic	Uf57750246e0a4e08b6966af00c81ca01	1	1	ieRyPleaiS1sBAMJ	2021-08-18 17:47:32.814348	\N
\.


--
-- TOC entry 3354 (class 0 OID 0)
-- Dependencies: 208
-- Name: sector_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.sector_id_seq', 1, false);


--
-- TOC entry 3355 (class 0 OID 0)
-- Dependencies: 210
-- Name: tb_category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_category_id_seq', 1, false);


--
-- TOC entry 3356 (class 0 OID 0)
-- Dependencies: 202
-- Name: tb_comment_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_comment_id_seq', 1, true);


--
-- TOC entry 3357 (class 0 OID 0)
-- Dependencies: 204
-- Name: tb_company_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_company_id_seq', 8, true);


--
-- TOC entry 3358 (class 0 OID 0)
-- Dependencies: 212
-- Name: tb_likes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_likes_id_seq', 3, true);


--
-- TOC entry 3359 (class 0 OID 0)
-- Dependencies: 200
-- Name: tb_story_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_story_id_seq', 40, true);


--
-- TOC entry 3360 (class 0 OID 0)
-- Dependencies: 206
-- Name: tb_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_user_id_seq', 49, true);


--
-- TOC entry 3186 (class 2606 OID 16503)
-- Name: tb_user email_uqx; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_user
    ADD CONSTRAINT email_uqx UNIQUE (email);


--
-- TOC entry 3188 (class 2606 OID 16505)
-- Name: tb_user mobile_uqx; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_user
    ADD CONSTRAINT mobile_uqx UNIQUE (mobile);


--
-- TOC entry 3182 (class 2606 OID 16525)
-- Name: tb_company phonenumber_uqx; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_company
    ADD CONSTRAINT phonenumber_uqx UNIQUE (phonenumber);


--
-- TOC entry 3192 (class 2606 OID 16463)
-- Name: tb_sector sector_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_sector
    ADD CONSTRAINT sector_pkey PRIMARY KEY (id);


--
-- TOC entry 3176 (class 2606 OID 16482)
-- Name: tb_story sid_uqx; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_story
    ADD CONSTRAINT sid_uqx UNIQUE (sid);


--
-- TOC entry 3194 (class 2606 OID 16475)
-- Name: tb_category tb_category_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_category
    ADD CONSTRAINT tb_category_pkey PRIMARY KEY (id);


--
-- TOC entry 3180 (class 2606 OID 16426)
-- Name: tb_comment tb_comment_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_comment
    ADD CONSTRAINT tb_comment_pkey PRIMARY KEY (id);


--
-- TOC entry 3184 (class 2606 OID 16439)
-- Name: tb_company tb_company_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_company
    ADD CONSTRAINT tb_company_pkey PRIMARY KEY (id);


--
-- TOC entry 3196 (class 2606 OID 16553)
-- Name: tb_likes tb_likes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_likes
    ADD CONSTRAINT tb_likes_pkey PRIMARY KEY (id);


--
-- TOC entry 3178 (class 2606 OID 16397)
-- Name: tb_story tb_story_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_story
    ADD CONSTRAINT tb_story_pkey PRIMARY KEY (id);


--
-- TOC entry 3190 (class 2606 OID 16451)
-- Name: tb_user tb_user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_user
    ADD CONSTRAINT tb_user_pkey PRIMARY KEY (id);


-- Completed on 2021-09-06 20:37:35 GMT

--
-- PostgreSQL database dump complete
--
