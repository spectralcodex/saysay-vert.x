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


/**
 A service interface managing Users.
 <p>
 This service is an event bus service (aka. service proxy)
 </p>

 @class
*/
export default class AdministrationService {

  constructor (eb: any, address: string);

  initializePersistence(resultHandler: (err: any, result: any) => any) : AdministrationService;

  addUser(user: any, resultHandler: (err: any, result: any) => any) : AdministrationService;

  retrieveUserById(userId: string, resultHandler: (err: any, result: Object) => any) : AdministrationService;

  retrieveUserByEmail(email: string, resultHandler: (err: any, result: Object) => any) : AdministrationService;

  deleteUser(userId: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  updateUser(userId: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  retrieveAllUsers(resultHandler: (err: any, result: Array<Object>) => any) : AdministrationService;

  addCompany(companyId: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  retrieveCompanyById(companyId: string, resultHandler: (err: any, result: Object) => any) : AdministrationService;

  deleteCompany(companyId: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  updateCompanyById(companyId: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  retrieveCompanyAll(resultHandler: (err: any, result: Array<Object>) => any) : AdministrationService;
}