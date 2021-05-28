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

/** @module vertx-saysay-administration-js/administration_service */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JAdministrationService = Java.type('io.vertx.saysayX.ms.administration.AdministrationService');
var UserBean = Java.type('io.vertx.saysayX.ms.administration.pojo.UserBean');
var CompanyBean = Java.type('io.vertx.saysayX.ms.administration.pojo.CompanyBean');

/**
 A service interface managing Users.
 <p>
 This service is an event bus service (aka. service proxy)
 </p>

 @class
*/
var AdministrationService = function(j_val) {

  var j_administrationService = j_val;
  var that = this;

  var __super_initializePersistence = this.initializePersistence;
  var __super_addUser = this.addUser;
  var __super_retrieveUserById = this.retrieveUserById;
  var __super_retrieveUserByEmail = this.retrieveUserByEmail;
  var __super_deleteUser = this.deleteUser;
  var __super_activateUser = this.activateUser;
  var __super_updateUser = this.updateUser;
  var __super_retrieveAllUsers = this.retrieveAllUsers;
  var __super_addCompany = this.addCompany;
  var __super_retrieveCompanyById = this.retrieveCompanyById;
  var __super_deleteCompany = this.deleteCompany;
  var __super_activateCompany = this.activateCompany;
  var __super_updateCompanyById = this.updateCompanyById;
  var __super_retrieveAllCompany = this.retrieveAllCompany;
  /**

   @public
   @param resultHandler {function} the result handler will be called as soon as the initialization has been accomplished. The jooq.async result indicates whether the operation was successful or not. 
   @return {AdministrationService}
   */
  this.initializePersistence =  function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_administrationService["initializePersistence(io.vertx.core.Handler)"](function(ar) {
        if (ar.succeeded()) {
          __args[0](null, null);
        } else {
          __args[0](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_initializePersistence != 'undefined') {
      return __super_initializePersistence.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a User to the persistence.

   @public
   @param user {Object} a User entity that we want to add 
   @param resultHandler {function} the result handler will be called as soon as the User has been added. The jooq.async result indicates whether the operation was successful or not. 
   @return {AdministrationService}
   */
  this.addUser =  function(user, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_administrationService["addUser(io.vertx.saysayX.ms.administration.pojo.UserBean,io.vertx.core.Handler)"](__args[0]  != null ? new UserBean(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_addUser != 'undefined') {
      return __super_addUser.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param userId {string} 
   @param resultHandler {function} 
   @return {AdministrationService} 
   */
  this.retrieveUserById =  function(userId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_administrationService["retrieveUserById(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveUserById != 'undefined') {
      return __super_retrieveUserById.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param email {string} 
   @param resultHandler {function} 
   @return {AdministrationService} 
   */
  this.retrieveUserByEmail =  function(email, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_administrationService["retrieveUserByEmail(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveUserByEmail != 'undefined') {
      return __super_retrieveUserByEmail.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param userId {string} 
   @param resultHandler {function} 
   @return {AdministrationService} 
   */
  this.deleteUser =  function(userId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_administrationService["deleteUser(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_deleteUser != 'undefined') {
      return __super_deleteUser.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param userId {string} 
   @param resultHandler {function} 
   @return {AdministrationService}
   */
  this.activateUser =  function(userId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_administrationService["activateUser(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_activateUser != 'undefined') {
      return __super_activateUser.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param user {Object} userId we want to query for 
   @param resultHandler {function} this handler will return as soon as update is complete. The jooq.async result * indicates whether the operation was successful or not. 
   @return {AdministrationService} 
   */
  this.updateUser =  function(user, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_administrationService["updateUser(io.vertx.saysayX.ms.administration.pojo.UserBean,io.vertx.core.Handler)"](__args[0]  != null ? new UserBean(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_updateUser != 'undefined') {
      return __super_updateUser.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param resultHandler {function} for all users 
   @return {AdministrationService} 
   */
  this.retrieveAllUsers =  function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_administrationService["retrieveAllUsers(io.vertx.core.Handler)"](function(ar) {
        if (ar.succeeded()) {
          __args[0](utils.convReturnListSetJson(ar.result()), null);
        } else {
          __args[0](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveAllUsers != 'undefined') {
      return __super_retrieveAllUsers.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a Company to the persistence.

   @public
   @param company {Object} 
   @param resultHandler {function} 
   @return {AdministrationService} 
   */
  this.addCompany =  function(company, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_administrationService["addCompany(io.vertx.saysayX.ms.administration.pojo.CompanyBean,io.vertx.core.Handler)"](__args[0]  != null ? new CompanyBean(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_addCompany != 'undefined') {
      return __super_addCompany.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param companyId {string} 
   @param resultHandler {function} 
   @return {AdministrationService}
   */
  this.retrieveCompanyById =  function(companyId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_administrationService["retrieveCompanyById(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](utils.convReturnJson(ar.result()), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveCompanyById != 'undefined') {
      return __super_retrieveCompanyById.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param companyId {string} 
   @param resultHandler {function} 
   @return {AdministrationService}
   */
  this.deleteCompany =  function(companyId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_administrationService["deleteCompany(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_deleteCompany != 'undefined') {
      return __super_deleteCompany.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param companyId {string} 
   @param resultHandler {function} 
   @return {AdministrationService}
   */
  this.activateCompany =  function(companyId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_administrationService["activateCompany(java.lang.String,io.vertx.core.Handler)"](__args[0], function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_activateCompany != 'undefined') {
      return __super_activateCompany.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param company {Object} 
   @param resultHandler {function} 
   @return {AdministrationService}
   */
  this.updateCompanyById =  function(company, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_administrationService["updateCompanyById(io.vertx.saysayX.ms.administration.pojo.CompanyBean,io.vertx.core.Handler)"](__args[0]  != null ? new CompanyBean(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
        if (ar.succeeded()) {
          __args[1](ar.result(), null);
        } else {
          __args[1](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_updateCompanyById != 'undefined') {
      return __super_updateCompanyById.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param resultHandler {function} 
   @return {AdministrationService}
   */
  this.retrieveAllCompany =  function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_administrationService["retrieveAllCompany(io.vertx.core.Handler)"](function(ar) {
        if (ar.succeeded()) {
          __args[0](utils.convReturnListSetJson(ar.result()), null);
        } else {
          __args[0](null, ar.cause());
        }
      }) ;
      return that;
    } else if (typeof __super_retrieveAllCompany != 'undefined') {
      return __super_retrieveAllCompany.apply(this, __args);
    }
    else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_administrationService;
};

AdministrationService._jclass = utils.getJavaClass("io.vertx.saysayX.ms.administration.AdministrationService");
AdministrationService._jtype = {accept: function(obj) {
    return AdministrationService._jclass.isInstance(obj._jdel);
  },wrap: function(jdel) {
    var obj = Object.create(AdministrationService.prototype, {});
    AdministrationService.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
AdministrationService._create = function(jdel) {var obj = Object.create(AdministrationService.prototype, {});
  AdministrationService.apply(obj, arguments);
  return obj;
}
AdministrationService.SERVICE_NAME = JAdministrationService.SERVICE_NAME;
AdministrationService.SERVICE_ADDRESS = JAdministrationService.SERVICE_ADDRESS;
module.exports = AdministrationService;