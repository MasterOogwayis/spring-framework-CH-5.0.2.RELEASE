/*
 * Copyright 2002-2016 the original author or authors.
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

package org.springframework.context;

/**
 * 事件
 *
 * Interface that encapsulates event publication functionality.
 * Serves as super-interface for {@link ApplicationContext}.
 *
 * @author Juergen Hoeller
 * @author Stephane Nicoll
 * @see ApplicationContext
 * @see ApplicationEventPublisherAware
 * @see org.springframework.context.ApplicationEvent
 * @see org.springframework.context.event.EventPublicationInterceptor
 * @since 1.1.1
 */
@FunctionalInterface
public interface ApplicationEventPublisher {

    /**
     * Notify all <strong>matching</strong> listeners registered with this
     * application of an application event. Events may be framework events
     * (such as RequestHandledEvent) or application-specific events.
     *
     * @param event the event to publish
     * @see org.springframework.web.context.support.RequestHandledEvent
     */
    default void publishEvent(ApplicationEvent event) {
        publishEvent((Object) event);
    }

    /**
     * Notify all <strong>matching</strong> listeners registered with this
     * application of an event.
     * <p>If the specified {@code event} is not an {@link ApplicationEvent},
     * it is wrapped in a {@link PayloadApplicationEvent}.
     *
     * @param event the event to publish
     * @see PayloadApplicationEvent
     * @since 4.2
     */
    void publishEvent(Object event);

}
