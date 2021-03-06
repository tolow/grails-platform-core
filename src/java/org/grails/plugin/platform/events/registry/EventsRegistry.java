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
package org.grails.plugin.platform.events.registry;

import groovy.lang.Closure;

import java.lang.reflect.Method;

/**
 * @author Stephane Maldini <smaldini@doc4web.com>
 * @version 1.0
 * @file
 * @date 02/01/12
 * @section DESCRIPTION
 * <p/>
 * [Does stuff]
 */
public interface EventsRegistry {

    public String addListener(String scope, String topic, Object bean, Method callbackMethod);

    public String addListener(String scope, String topic, Object bean, Method callbackMethod, Object filter);

    public String addListener(String scope, String topic, Object bean, String callbackMethodName);

    public String addListener(String scope, String topic, Object bean, String callbackMethodName, Object filter);

    public String addListener(String scope, String topic, Closure callback);

    public String addListener(String scope, String topic, Closure callback, Object filter);

    public int removeListeners(String callbackId);

    public int countListeners(String callbackId);
}
