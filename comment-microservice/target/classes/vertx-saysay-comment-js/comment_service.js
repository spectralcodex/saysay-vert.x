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

/** @module vertx-saysay-comment-js/comment_service */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JCommentService = Java.type('io.vertx.saysayX.ms.comment.CommentService');
var CommentBean = Java.type('io.vertx.saysayX.ms.comment.pojo.CommentBean');

/**
 @class
*/
var CommentService = function(j_val) {

  var j_commentService = j_val;
  var that = this;

  var __super_init = this.init;
  var __super_addComment = this.addComment;
  var __super_retrieveComment = this.retrieveComment;
  var __super_retrieveCommentByAuthorId = this.retrieveCommentByAuthorId;
  var __super_retrieveAllStoriesByAuthorId = this.retrieveAllStoriesByAuthorId;
  var __super_retrieveAllStories = this.retrieveAllStories;
  var __super_updateComment = this.updateComment;
  var __super_deleteComment = this.deleteComment;
  /**

   @public
   @param resultHandler {function} the result handler will be called as soon as the initialization has been accomplished. The jooq.async result indicates whether the operation was successful or not. 
   @return {CommentService}
   */
  this.init =  function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_commentService["init(io.vertx.core.Handler)"](function(ar) {
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
   Add a Comment to the persistence.

   @public
   @param Comment {Object} a Comment entity that we want to add 
   @param resultHandler {function} the result handler will be called as soon as the Comment has been added. The jooq.async result indicates whether the operation was successful or not. 
   @return {CommentService}
   */
  this.addComment =  function(Comment, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_commentService["addComment(io.vertx.saysayX.ms.comment.pojo.CommentBean,io.vertx.core.Handler)"](__args[0]  != null ? new CommentBean(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_addComment != 'undefined') {
      return __super_addComment.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve the Comment with certain `id`.

   @public
   @param id {string} Comment id 
   @param resultHandler {function} the result handler will be called as soon as the Comment has been retrieved. The async result indicates whether the operation was successful or not. 
   @return {CommentService}
   */
  this.retrieveComment =  function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_commentService["retrieveComment(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveComment != 'undefined') {
      return __super_retrieveComment.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve the Comment account with certain `username`.

   @public
   @param authorId {string} username 
   @param resultHandler {function} the result handler will be called as soon as the Comment has been retrieved. The async result indicates whether the operation was successful or not. 
   @return {CommentService}
   */
  this.retrieveCommentByAuthorId =  function(authorId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_commentService["retrieveCommentByAuthorId(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnListSetJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveCommentByAuthorId != 'undefined') {
      return __super_retrieveCommentByAuthorId.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve all Comment accounts.

   @public
   @param authorId {string} 
   @param resultHandler {function} the result handler will be called as soon as the stories have been retrieved. The async result indicates whether the operation was successful or not. 
   @return {CommentService}
   */
  this.retrieveAllStoriesByAuthorId =  function(authorId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_commentService["retrieveAllStoriesByAuthorId(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
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
   @return {CommentService}
   */
  this.retrieveAllStories =  function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_commentService["retrieveAllStories(io.vertx.core.Handler)"](function(ar) {
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
   Update Comment account info.

   @public
   @param Comment {Object} a Comment entity that we want to update 
   @param resultHandler {function} the result handler will be called as soon as the account has been added. The async result indicates whether the operation was successful or not. 
   @return {CommentService}
   */
  this.updateComment =  function(Comment, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_commentService["updateComment(io.vertx.saysayX.ms.comment.pojo.CommentBean,io.vertx.core.Handler)"](__args[0]  != null ? new CommentBean(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_updateComment != 'undefined') {
      return __super_updateComment.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete a Comment account from the persistence

   @public
   @param id {string} Comment id 
   @param resultHandler {function} the result handler will be called as soon as the Comment has been removed. The async result indicates whether the operation was successful or not. 
   @return {CommentService}
   */
  this.deleteComment =  function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_commentService["deleteComment(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_deleteComment != 'undefined') {
      return __super_deleteComment.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_commentService;
};

CommentService._jclass = utils.getJavaClass("io.vertx.saysayX.ms.comment.CommentService");
CommentService._jtype = {accept: function(obj) {
    return CommentService._jclass.isInstance(obj._jdel);
  },wrap: function(jdel) {
    var obj = Object.create(CommentService.prototype, {});
    CommentService.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
CommentService._create = function(jdel) {var obj = Object.create(CommentService.prototype, {});
  CommentService.apply(obj, arguments);
  return obj;
}
CommentService.SERVICE_NAME = JCommentService.SERVICE_NAME;
CommentService.SERVICE_ADDRESS = JCommentService.SERVICE_ADDRESS;
module.exports = CommentService;