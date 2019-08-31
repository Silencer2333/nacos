/*
 * Copyright (C) 2019 the original author or authors.
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
package com.alibaba.nacos.core.remoting.event;

/**
 * Events with remote nature.
 *
 * @author pbting
 * @date 2019-08-23 2:10 PM
 */
public class RemotingEvent extends Event {

    /**
     * the sink of event from remoting request
     */
    private String sink;

    public RemotingEvent(Object source, Object value, Class<? extends Event> eventType) {
        super(source, value, eventType);
    }

    public void setSink(String sink) {
        this.sink = sink;
    }

    public String getSink() {
        return sink;
    }

    /**
     * when an event is remoting ,the event value is IInteractive.
     * <p>
     * then use it to retrieve request payload by {@IInteractive#getRequestPayload}
     * and will response payload by {@IInteractive#sendResponsePayload}.
     *
     * @return
     */

    @Override
    public <T> T getValue() {
        return super.getValue();
    }
}