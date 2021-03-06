/* Copyright 2011-2012 the original author or authors:
 *
 *    Marc Palmer (marc@grailsrocks.com)
 *    Stéphane Maldini (stephane.maldini@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.plugin.platform.test

import grails.events.Listener

/**
 * @file
 * @author Stephane Maldini <smaldini@doc4web.com>
 * @version 1.0
 * @date 02/01/12

 * @section DESCRIPTION
 *
 * [Does stuff]
 */
class SampleService {

    static transactional = true

    @Listener('beforeInsert')
    void beforeInsertBook(Book book) {
        println "will insert book - $book.title"
    }

    @Listener('beforeInsert')
    void beforeInsertAuthor(Author author) {
        println "will insert author - $author.name"
    }

    @Listener
    void afterLoad(Author author) {
        println "will load author -  $author.name"
    }

    @Listener('sampleHello')
    def testEvent(test) {
        println "Hello (bis) - $test"
    }
}
