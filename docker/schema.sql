--
-- PostgreSQL database dump
--

-- Dumped from database version 13.2
-- Dumped by pg_dump version 13.2

-- Started on 2021-05-12 00:39:11 GMT

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
-- TOC entry 3259 (class 1262 OID 16386)
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
-- TOC entry 201 (class 1259 OID 16389)
-- Name: tb_story; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_story (
    id bigint NOT NULL,
    author_id character varying(30),
    entries text,
    story_id character varying(255),
    lang character varying(2),
    possibly_sensitive integer,
    source character varying(255),
    story text,
    created_at timestamp with time zone DEFAULT CURRENT_TIMESTAMP
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
-- TOC entry 3260 (class 0 OID 0)
-- Dependencies: 200
-- Name: tb_story_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_story_id_seq OWNED BY public.tb_story.id;


--
-- TOC entry 3116 (class 2604 OID 16392)
-- Name: tb_story id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_story ALTER COLUMN id SET DEFAULT nextval('public.tb_story_id_seq'::regclass);


--
-- TOC entry 3253 (class 0 OID 16389)
-- Dependencies: 201
-- Data for Name: tb_story; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.tb_story (id, author_id, entries, story_id, lang, possibly_sensitive, source, story, created_at) VALUES (8, 'ass31111122', '{"yea":"kee"}', '21d12125556f4360bc8cc4a1a3797881', 'en', 1, 'eedd', 'eeee', '2021-05-08 22:18:21.006961+00');


--
-- TOC entry 3261 (class 0 OID 0)
-- Dependencies: 200
-- Name: tb_story_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_story_id_seq', 8, true);


--
-- TOC entry 3119 (class 2606 OID 16399)
-- Name: tb_story author_id_uqx; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_story
    ADD CONSTRAINT author_id_uqx UNIQUE (author_id);


--
-- TOC entry 3121 (class 2606 OID 16397)
-- Name: tb_story tb_story_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_story
    ADD CONSTRAINT tb_story_pkey PRIMARY KEY (id);


-- Completed on 2021-05-12 00:39:12 GMT

--
-- PostgreSQL database dump complete
--

