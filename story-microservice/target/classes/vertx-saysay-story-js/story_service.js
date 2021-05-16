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

/** @module vertx-saysay-story-js/story_service */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JStoryService = Java.type('io.vertx.saysayX.ms.story.StoryService');
var Story = Java.type('io.vertx.saysayX.ms.story.jpojo.Story');

/**
 A service interface managing stories.
 <p>
 This service is an event bus service (aka. service proxy)
 </p>

 @class
*/
var StoryService = function(j_val) {

  var j_storyService = j_val;
  var that = this;

  var __super_init = this.init;
  var __super_addStory = this.addStory;
  var __super_retrieveStory = this.retrieveStory;
  var __super_retrieveStoryByUsername = this.retrieveStoryByUsername;
  var __super_retrieveAllStoriesByUsername = this.retrieveAllStoriesByUsername;
  var __super_retrieveAllStories = this.retrieveAllStories;
  var __super_updateStory = this.updateStory;
  var __super_deleteStory = this.deleteStory;
  var __super_deleteAllAccounts = this.deleteAllAccounts;
  /**

   @public
   @param resultHandler {function} the result handler will be called as soon as the initialization has been accomplished. The jooq.async result indicates whether the operation was successful or not. 
   @return {StoryService}
   */
  this.init =  function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_storyService["init(io.vertx.core.Handler)"](function(ar) {
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
   Add a story to the persistence.

   @public
   @param story {Object} a Story entity that we want to add 
   @param resultHandler {function} the result handler will be called as soon as the Story has been added. The jooq.async result indicates whether the operation was successful or not. 
   @return {StoryService}
   */
  this.addStory =  function(story, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_storyService["addStory(io.vertx.saysayX.ms.story.jpojo.Story,io.vertx.core.Handler)"](__args[0]  != null ? new Story(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_addStory != 'undefined') {
      return __super_addStory.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve the story with certain `id`.

   @public
   @param id {string} story id 
   @param resultHandler {function} the result handler will be called as soon as the story has been retrieved. The async result indicates whether the operation was successful or not. 
   @return {StoryService}
   */
  this.retrieveStory =  function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_storyService["retrieveStory(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveStory != 'undefined') {
      return __super_retrieveStory.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve the story account with certain `username`.

   @public
   @param username {string} username 
   @param resultHandler {function} the result handler will be called as soon as the Story has been retrieved. The async result indicates whether the operation was successful or not. 
   @return {StoryService}
   */
  this.retrieveStoryByUsername =  function(username, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_storyService["retrieveStoryByUsername(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveStoryByUsername != 'undefined') {
      return __super_retrieveStoryByUsername.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve all story accounts.

   @public
   @param username {string} 
   @param resultHandler {function} the result handler will be called as soon as the stories have been retrieved. The async result indicates whether the operation was successful or not. 
   @return {StoryService}
   */
  this.retrieveAllStoriesByUsername =  function(username, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_storyService["retrieveAllStoriesByUsername(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnListSetJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveAllStoriesByUsername != 'undefined') {
      return __super_retrieveAllStoriesByUsername.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param resultHandler {function} 
   @return {StoryService}
   */
  this.retrieveAllStories =  function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_storyService["retrieveAllStories(io.vertx.core.Handler)"](function(ar) {
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
   Update story account info.

   @public
   @param story {Object} a story entity that we want to update 
   @param resultHandler {function} the result handler will be called as soon as the account has been added. The async result indicates whether the operation was successful or not. 
   @return {StoryService}
   */
  this.updateStory =  function(story, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_storyService["updateStory(io.vertx.saysayX.ms.story.jpojo.Story,io.vertx.core.Handler)"](__args[0]  != null ? new Story(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_updateStory != 'undefined') {
      return __super_updateStory.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete a story account from the persistence

   @public
   @param id {string} Story id 
   @param resultHandler {function} the result handler will be called as soon as the story has been removed. The async result indicates whether the operation was successful or not. 
   @return {StoryService}
   */
  this.deleteStory =  function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_storyService["deleteStory(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_deleteStory != 'undefined') {
      return __super_deleteStory.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete all stories from the persistence

   @public
   @param resultHandler {function} the result handler will be called as soon as the stories have been removed. The async result indicates whether the operation was successful or not. 
   @return {StoryService}
   */
  this.deleteAllAccounts =  function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_storyService["deleteAllAccounts(io.vertx.core.Handler)"](function(ar) {
        if (ar.succeeded()) {
          __args[0](null, null);
        } else {
          __args[0](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_deleteAllAccounts != 'undefined') {
      return __super_deleteAllAccounts.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_storyService;
};

StoryService._jclass = utils.getJavaClass("io.vertx.saysayX.ms.story.StoryService");
StoryService._jtype = {accept: function(obj) {
    return StoryService._jclass.isInstance(obj._jdel);
  },wrap: function(jdel) {
    var obj = Object.create(StoryService.prototype, {});
    StoryService.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
StoryService._create = function(jdel) {var obj = Object.create(StoryService.prototype, {});
  StoryService.apply(obj, arguments);
  return obj;
}
StoryService.SERVICE_NAME = JStoryService.SERVICE_NAME;
StoryService.SERVICE_ADDRESS = JStoryService.SERVICE_ADDRESS;
module.exports = StoryService;