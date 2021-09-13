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

  updateUserVerificationCode(user: any, resultHandler: (err: any, result: any) => any) : AdministrationService;

  addUserByEmail(user: any, resultHandler: (err: any, result: any) => any) : AdministrationService;

  retrieveUserById(userId: string, resultHandler: (err: any, result: Object) => any) : AdministrationService;

  retrieveUserByEmail(email: string, resultHandler: (err: any, result: Object) => any) : AdministrationService;

  deleteUser(userId: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  activateUserByUid(user: any, resultHandler: (err: any, result: any) => any) : AdministrationService;

  activateUserByMail(user: any, resultHandler: (err: any, result: any) => any) : AdministrationService;

  verifyUser(userVerifyCode: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  updateUser(user: any, resultHandler: (err: any, result: any) => any) : AdministrationService;

  retrieveAllUsers(resultHandler: (err: any, result: Array<Object>) => any) : AdministrationService;

  addCompany(company: any, resultHandler: (err: any, result: any) => any) : AdministrationService;

  retrieveCompanyById(companyId: string, resultHandler: (err: any, result: Object) => any) : AdministrationService;

  deleteCompany(companyId: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  activateCompany(companyId: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  updateCompanyById(company: any, resultHandler: (err: any, result: any) => any) : AdministrationService;

  retrieveAllCompany(resultHandler: (err: any, result: Array<Object>) => any) : AdministrationService;

  addInterest(interestId: any, resultHandler: (err: any, result: any) => any) : AdministrationService;

  retrieveInterestId(interestId: string, resultHandler: (err: any, result: Object) => any) : AdministrationService;

  deleteInterest(interestId: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  activateInterest(interestId: string, resultHandler: (err: any, result: any) => any) : AdministrationService;

  updateInterestById(interest: any, resultHandler: (err: any, result: any) => any) : AdministrationService;

  retrieveAllInterest(resultHandler: (err: any, result: Array<Object>) => any) : AdministrationService;
}