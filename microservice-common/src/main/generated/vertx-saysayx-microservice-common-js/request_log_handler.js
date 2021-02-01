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

/** @module vertx-saysayx-microservice-common-js/request_log_handler */
var utils = require('vertx-js/util/utils');
var RoutingContext = require('vertx-web-js/routing_context');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JRequestLogHandler = Java.type('io.vertx.saysayX.common.config.RequestLogHandler');

/**
 @class
*/
var RequestLogHandler = function(j_val) {

  var j_requestLogHandler = j_val;
  var that = this;

  var __super_handle = this.handle;
  var __super_create = this.create;
  var __super_create = this.create;
  /**

   @public
   @param arg0 {RoutingContext} 
   */
  this.handle =  function(arg0) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_requestLogHandler["handle(io.vertx.ext.web.RoutingContext)"](__args[0]._jdel);
    } else if (typeof __super_handle != 'undefined') {
      return __super_handle.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_requestLogHandler;
};

RequestLogHandler._jclass = utils.getJavaClass("io.vertx.saysayX.common.config.RequestLogHandler");
RequestLogHandler._jtype = {accept: function(obj) {
    return RequestLogHandler._jclass.isInstance(obj._jdel);
  },wrap: function(jdel) {
    var obj = Object.create(RequestLogHandler.prototype, {});
    RequestLogHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
RequestLogHandler._create = function(jdel) {var obj = Object.create(RequestLogHandler.prototype, {});
  RequestLogHandler.apply(obj, arguments);
  return obj;
}
/**

 @memberof module:vertx-saysayx-microservice-common-js/request_log_handler
 @param format {Object} 
 @return {RequestLogHandler}
 */
RequestLogHandler.create =  function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(RequestLogHandler, JRequestLogHandler["create()"]()) ;
  } else if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(RequestLogHandler, JRequestLogHandler["create(io.vertx.ext.web.handler.LoggerFormat)"](io.vertx.ext.web.handler.LoggerFormat.valueOf(__args[0]))) ;
  }else throw new TypeError('function invoked with invalid arguments');
};

module.exports = RequestLogHandler;