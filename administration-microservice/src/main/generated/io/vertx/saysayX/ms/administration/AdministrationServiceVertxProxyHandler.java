/*
* Copyright 2014 Red Hat, Inc.
*
* Red Hat licenses this file to you under the Apache License, version 2.0
* (the "License"); you may not use this file except in compliance with the
* License. You may obtain a copy of the License at:
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations
* under the License.
*/

package io.vertx.saysayX.ms.administration;

import io.vertx.saysayX.ms.administration.AdministrationService;
import io.vertx.core.Vertx;
import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import io.vertx.core.eventbus.MessageConsumer;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.ReplyException;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import io.vertx.serviceproxy.ServiceBinder;
import io.vertx.serviceproxy.ProxyHandler;
import io.vertx.serviceproxy.ServiceException;
import io.vertx.serviceproxy.ServiceExceptionMessageCodec;
import io.vertx.serviceproxy.HelperUtils;

import io.vertx.saysayX.ms.administration.pojo.InterestBean;
import java.util.List;
import io.vertx.saysayX.ms.administration.pojo.UserBean;
import io.vertx.saysayX.ms.administration.AdministrationService;
import io.vertx.saysayX.ms.administration.pojo.CompanyBean;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
/*
  Generated Proxy code - DO NOT EDIT
  @author Roger the Robot
*/

@SuppressWarnings({"unchecked", "rawtypes"})
public class AdministrationServiceVertxProxyHandler extends ProxyHandler {

  public static final long DEFAULT_CONNECTION_TIMEOUT = 5 * 60; // 5 minutes 
  private final Vertx vertx;
  private final AdministrationService service;
  private final long timerID;
  private long lastAccessed;
  private final long timeoutSeconds;

  public AdministrationServiceVertxProxyHandler(Vertx vertx, AdministrationService service){
    this(vertx, service, DEFAULT_CONNECTION_TIMEOUT);
  }

  public AdministrationServiceVertxProxyHandler(Vertx vertx, AdministrationService service, long timeoutInSecond){
    this(vertx, service, true, timeoutInSecond);
  }

  public AdministrationServiceVertxProxyHandler(Vertx vertx, AdministrationService service, boolean topLevel, long timeoutSeconds) {
      this.vertx = vertx;
      this.service = service;
      this.timeoutSeconds = timeoutSeconds;
      try {
        this.vertx.eventBus().registerDefaultCodec(ServiceException.class,
            new ServiceExceptionMessageCodec());
      } catch (IllegalStateException ex) {}
      if (timeoutSeconds != -1 && !topLevel) {
        long period = timeoutSeconds * 1000 / 2;
        if (period > 10000) {
          period = 10000;
        }
        this.timerID = vertx.setPeriodic(period, this::checkTimedOut);
      } else {
        this.timerID = -1;
      }
      accessed();
    }


  private void checkTimedOut(long id) {
    long now = System.nanoTime();
    if (now - lastAccessed > timeoutSeconds * 1000000000) {
      close();
    }
  }

    @Override
    public void close() {
      if (timerID != -1) {
        vertx.cancelTimer(timerID);
      }
      super.close();
    }

    private void accessed() {
      this.lastAccessed = System.nanoTime();
    }

  public void handle(Message<JsonObject> msg) {
    try{
      JsonObject json = msg.body();
      String action = msg.headers().get("action");
      if (action == null) throw new IllegalStateException("action not specified");
      accessed();
      switch (action) {
        case "initializePersistence": {
          service.initializePersistence(HelperUtils.createHandler(msg));
          break;
        }
        case "addUser": {
          service.addUser(json.getJsonObject("user") == null ? null : new io.vertx.saysayX.ms.administration.pojo.UserBean(json.getJsonObject("user")),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "updateUserVerificationCode": {
          service.updateUserVerificationCode(json.getJsonObject("user") == null ? null : new io.vertx.saysayX.ms.administration.pojo.UserBean(json.getJsonObject("user")),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "addUserByEmail": {
          service.addUserByEmail(json.getJsonObject("user") == null ? null : new io.vertx.saysayX.ms.administration.pojo.UserBean(json.getJsonObject("user")),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "retrieveUserById": {
          service.retrieveUserById((java.lang.String)json.getValue("userId"),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "retrieveUserByEmail": {
          service.retrieveUserByEmail((java.lang.String)json.getValue("email"),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "deleteUser": {
          service.deleteUser((java.lang.String)json.getValue("userId"),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "activateUserByUid": {
          service.activateUserByUid(json.getJsonObject("user") == null ? null : new io.vertx.saysayX.ms.administration.pojo.UserBean(json.getJsonObject("user")),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "activateUserByMail": {
          service.activateUserByMail(json.getJsonObject("user") == null ? null : new io.vertx.saysayX.ms.administration.pojo.UserBean(json.getJsonObject("user")),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "verifyUser": {
          service.verifyUser((java.lang.String)json.getValue("userVerifyCode"),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "updateUser": {
          service.updateUser(json.getJsonObject("user") == null ? null : new io.vertx.saysayX.ms.administration.pojo.UserBean(json.getJsonObject("user")),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "retrieveAllUsers": {
          service.retrieveAllUsers(HelperUtils.createListHandler(msg));
          break;
        }
        case "addCompany": {
          service.addCompany(json.getJsonObject("company") == null ? null : new io.vertx.saysayX.ms.administration.pojo.CompanyBean(json.getJsonObject("company")),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "retrieveCompanyById": {
          service.retrieveCompanyById((java.lang.String)json.getValue("companyId"),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "deleteCompany": {
          service.deleteCompany((java.lang.String)json.getValue("companyId"),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "activateCompany": {
          service.activateCompany((java.lang.String)json.getValue("companyId"),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "updateCompanyById": {
          service.updateCompanyById(json.getJsonObject("company") == null ? null : new io.vertx.saysayX.ms.administration.pojo.CompanyBean(json.getJsonObject("company")),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "retrieveAllCompany": {
          service.retrieveAllCompany(HelperUtils.createListHandler(msg));
          break;
        }
        case "addInterest": {
          service.addInterest(json.getJsonObject("interestId") == null ? null : new io.vertx.saysayX.ms.administration.pojo.InterestBean(json.getJsonObject("interestId")),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "retrieveInterestId": {
          service.retrieveInterestId((java.lang.String)json.getValue("interestId"),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "deleteInterest": {
          service.deleteInterest((java.lang.String)json.getValue("interestId"),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "activateInterest": {
          service.activateInterest((java.lang.String)json.getValue("interestId"),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "updateInterestById": {
          service.updateInterestById(json.getJsonObject("interest") == null ? null : new io.vertx.saysayX.ms.administration.pojo.InterestBean(json.getJsonObject("interest")),
                        HelperUtils.createHandler(msg));
          break;
        }
        case "retrieveAllInterest": {
          service.retrieveAllInterest(HelperUtils.createListHandler(msg));
          break;
        }
        default: throw new IllegalStateException("Invalid action: " + action);
      }
    } catch (Throwable t) {
      msg.reply(new ServiceException(500, t.getMessage()));
      throw t;
    }
  }
}