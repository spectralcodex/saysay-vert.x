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
 A service interface managing stories.
 <p>
 This service is an event bus service (aka. service proxy)
 </p>

 @class
*/
export default class StoryService {

  constructor (eb: any, address: string);

  init(resultHandler: (err: any, result: any) => any) : StoryService;

  addStory(story: any, resultHandler: (err: any, result: any) => any) : StoryService;

  retrieveStory(id: string, resultHandler: (err: any, result: Object) => any) : StoryService;

  retrieveStoryByAuthorId(authorId: string, resultHandler: (err: any, result: Object) => any) : StoryService;

  retrieveAllStoriesByAuthorId(authorId: string, resultHandler: (err: any, result: Array<Object>) => any) : StoryService;

  retrieveAllStories(resultHandler: (err: any, result: Array<Object>) => any) : StoryService;

  updateStory(story: any, resultHandler: (err: any, result: any) => any) : StoryService;

  deleteStory(id: string, resultHandler: (err: any, result: any) => any) : StoryService;
}