/*
 * Copyright (c) 2016, salesforce.com, inc.
 * All rights reserved.
 * Licensed under the BSD 3-Clause license.
 * For full license text, see LICENSE.TXT file in the repo root  or https://opensource.org/licenses/BSD-3-Clause
 */
package org.wso2.carbon.inbound.salesforce.poll;

/**
 * A subscription to a topic
 *
 * @author hal.hildebrand
 * @since 202
 */
public interface TopicSubscription {

    /**
     * Cancel the subscription
     */
    void cancel();

    /**
     * @return the current replayFrom event id of the subscription
     */
    long getReplayFrom();

    /**
     * @return the topic subscribed to
     */
    String getTopic();
}