/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/** @module vertx-saysay-comment-js/likes_service */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JLikesService = Java.type('io.vertx.saysayX.ms.likes.LikesService');
var LikesBean = Java.type('io.vertx.saysayX.ms.likes.pojo.LikesBean');

/**
 @class
*/
var LikesService = function(j_val) {

  var j_likesService = j_val;
  var that = this;

  var __super_init = this.init;
  var __super_addLikes = this.addLikes;
  var __super_retrieveLikes = this.retrieveLikes;
  var __super_retrieveLikesByAuthorId = this.retrieveLikesByAuthorId;
  var __super_retrieveAllStoriesByAuthorId = this.retrieveAllStoriesByAuthorId;
  var __super_retrieveAllStories = this.retrieveAllStories;
  var __super_updateLikes = this.updateLikes;
  var __super_deleteLikes = this.deleteLikes;
  /**

   @public
   @param resultHandler {function} the result handler will be called as soon as the initialization has been accomplished. The jooq.async result indicates whether the operation was successful or not. 
   @return {LikesService}
   */
  this.init =  function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_likesService["init(io.vertx.core.Handler)"](function(ar) {
        if (ar.succeeded()) {
          __args[0](null, null);
        } else {
          __args[0](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_init != 'undefined') {
      return __super_init.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a Likes to the persistence.

   @public
   @param Likes {Object} a Likes entity that we want to add 
   @param resultHandler {function} the result handler will be called as soon as the Likes has been added. The jooq.async result indicates whether the operation was successful or not. 
   @return {LikesService}
   */
  this.addLikes =  function(Likes, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_likesService["addLikes(io.vertx.saysayX.ms.likes.pojo.LikesBean,io.vertx.core.Handler)"](__args[0]  != null ? new LikesBean(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_addLikes != 'undefined') {
      return __super_addLikes.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve the Likes with certain `id`.

   @public
   @param id {string} Likes id 
   @param resultHandler {function} the result handler will be called as soon as the Likes has been retrieved. The async result indicates whether the operation was successful or not. 
   @return {LikesService}
   */
  this.retrieveLikes =  function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_likesService["retrieveLikes(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveLikes != 'undefined') {
      return __super_retrieveLikes.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve the Likes account with certain `username`.

   @public
   @param authorId {string} username 
   @param resultHandler {function} the result handler will be called as soon as the Likes has been retrieved. The async result indicates whether the operation was successful or not. 
   @return {LikesService}
   */
  this.retrieveLikesByAuthorId =  function(authorId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_likesService["retrieveLikesByAuthorId(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnListSetJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveLikesByAuthorId != 'undefined') {
      return __super_retrieveLikesByAuthorId.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve all Likes accounts.

   @public
   @param authorId {string} 
   @param resultHandler {function} the result handler will be called as soon as the stories have been retrieved. The async result indicates whether the operation was successful or not. 
   @return {LikesService}
   */
  this.retrieveAllStoriesByAuthorId =  function(authorId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_likesService["retrieveAllStoriesByAuthorId(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnListSetJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveAllStoriesByAuthorId != 'undefined') {
      return __super_retrieveAllStoriesByAuthorId.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param resultHandler {function} 
   @return {LikesService}
   */
  this.retrieveAllStories =  function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_likesService["retrieveAllStories(io.vertx.core.Handler)"](function(ar) {
        if (ar.succeeded()) {
          __args[0](utils.convReturnListSetJson(ar.result()), null);
        } else {
          __args[0](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveAllStories != 'undefined') {
      return __super_retrieveAllStories.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Update Likes account info.

   @public
   @param Likes {Object} a Likes entity that we want to update 
   @param resultHandler {function} the result handler will be called as soon as the account has been added. The async result indicates whether the operation was successful or not. 
   @return {LikesService}
   */
  this.updateLikes =  function(Likes, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_likesService["updateLikes(io.vertx.saysayX.ms.likes.pojo.LikesBean,io.vertx.core.Handler)"](__args[0]  != null ? new LikesBean(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_updateLikes != 'undefined') {
      return __super_updateLikes.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete a Likes account from the persistence

   @public
   @param id {string} Likes id 
   @param resultHandler {function} the result handler will be called as soon as the Likes has been removed. The async result indicates whether the operation was successful or not. 
   @return {LikesService}
   */
  this.deleteLikes =  function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_likesService["deleteLikes(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_deleteLikes != 'undefined') {
      return __super_deleteLikes.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_likesService;
};

LikesService._jclass = utils.getJavaClass("io.vertx.saysayX.ms.likes.LikesService");
LikesService._jtype = {accept: function(obj) {
    return LikesService._jclass.isInstance(obj._jdel);
  },wrap: function(jdel) {
    var obj = Object.create(LikesService.prototype, {});
    LikesService.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
LikesService._create = function(jdel) {var obj = Object.create(LikesService.prototype, {});
  LikesService.apply(obj, arguments);
  return obj;
}
LikesService.SERVICE_NAME = JLikesService.SERVICE_NAME;
LikesService.SERVICE_ADDRESS = JLikesService.SERVICE_ADDRESS;
module.exports = LikesService;