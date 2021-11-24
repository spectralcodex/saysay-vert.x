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

/// <reference path="./comment_service-proxy.d.ts" />

/** @module vertx-saysay-comment-js/comment_service */
!function (factory) {
  if (typeof require === 'function' && typeof module !== 'undefined') {
    factory();
  } else if (typeof define === 'function' && define.amd) {
    // AMD loader
    define('vertx-saysay-comment-js/comment_service-proxy', [], factory);
  } else {
    // plain old include
    CommentService = factory();
  }
}(function () {

  /**
   @class
  */
  var CommentService = function(eb, address) {
    var j_eb = eb;
    var j_address = address;
    var closed = false;
    var that = this;
    var convCharCollection = function(coll) {
      var ret = [];
      for (var i = 0;i < coll.length;i++) {
        ret.push(String.fromCharCode(coll[i]));
      }
      return ret;
    };

    /**

     @public
     @param resultHandler {function} the result handler will be called as soon as the initialization has been accomplished. The jooq.async result indicates whether the operation was successful or not. 
     @return {CommentService}
     */
    this.init =  function(resultHandler) {
      var __args = arguments;
      if (__args.length === 1 && typeof __args[0] === 'function') {
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {}, {"action":"init"}, function(err, result) { __args[0](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
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
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"Comment":__args[0]}, {"action":"addComment"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
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
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"id":__args[0]}, {"action":"retrieveComment"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
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
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"authorId":__args[0]}, {"action":"retrieveCommentByAuthorId"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
    };

    /**
     Retrieve all Comment accounts.

     @public
     @param resultHandler {function} the result handler will be called as soon as the stories have been retrieved. The async result indicates whether the operation was successful or not. 
     @return {CommentService}
     */
    this.retrieveAllComments =  function(resultHandler) {
      var __args = arguments;
      if (__args.length === 1 && typeof __args[0] === 'function') {
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {}, {"action":"retrieveAllComments"}, function(err, result) { __args[0](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
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
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"Comment":__args[0]}, {"action":"updateComment"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
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
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"id":__args[0]}, {"action":"deleteComment"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
    };

  };

  if (typeof exports !== 'undefined') {
    if (typeof module !== 'undefined' && module.exports) {
      exports = module.exports = CommentService;
    } else {
      exports.CommentService = CommentService;
    }
  } else {
    return CommentService;
  }
});