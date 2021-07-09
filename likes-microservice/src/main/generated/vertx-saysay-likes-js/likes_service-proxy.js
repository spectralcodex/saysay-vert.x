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

/// <reference path="./likes_service-proxy.d.ts" />

/** @module vertx-saysay-likes-js/likes_service */
!function (factory) {
  if (typeof require === 'function' && typeof module !== 'undefined') {
    factory();
  } else if (typeof define === 'function' && define.amd) {
    // AMD loader
    define('vertx-saysay-likes-js/likes_service-proxy', [], factory);
  } else {
    // plain old include
    LikesService = factory();
  }
}(function () {

  /**
   @class
  */
  var LikesService = function(eb, address) {
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
     @return {LikesService}
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
     Add a Likes to the persistence.

     @public
     @param Likes {Object} a Likes entity that we want to add 
     @param resultHandler {function} the result handler will be called as soon as the Likes has been added. The jooq.async result indicates whether the operation was successful or not. 
     @return {LikesService}
     */
    this.addLikes =  function(Likes, resultHandler) {
      var __args = arguments;
      if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"Likes":__args[0]}, {"action":"addLikes"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
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
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"id":__args[0]}, {"action":"retrieveLikes"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
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
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"authorId":__args[0]}, {"action":"retrieveLikesByAuthorId"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
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
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"authorId":__args[0]}, {"action":"retrieveAllStoriesByAuthorId"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
    };

    /**

     @public
     @param resultHandler {function} 
     @return {LikesService}
     */
    this.retrieveAllStories =  function(resultHandler) {
      var __args = arguments;
      if (__args.length === 1 && typeof __args[0] === 'function') {
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {}, {"action":"retrieveAllStories"}, function(err, result) { __args[0](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
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
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"Likes":__args[0]}, {"action":"updateLikes"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
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
        if (closed) {
          throw new Error('Proxy is closed');
        }
        j_eb.send(j_address, {"id":__args[0]}, {"action":"deleteLikes"}, function(err, result) { __args[1](err, result && result.body); });
        return that;
      } else throw new TypeError('function invoked with invalid arguments');
    };

  };

  if (typeof exports !== 'undefined') {
    if (typeof module !== 'undefined' && module.exports) {
      exports = module.exports = LikesService;
    } else {
      exports.LikesService = LikesService;
    }
  } else {
    return LikesService;
  }
});