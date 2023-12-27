/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package io.debezium.metrics;

import io.debezium.annotation.ThreadSafe;
import io.debezium.config.CommonConnectorConfig;
import io.debezium.connector.common.CdcSourceTaskContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/** Disabling debezium metrics altogether. */
@ThreadSafe
public abstract class Metrics {
    private static final Logger LOGGER = LoggerFactory.getLogger(Metrics.class);

    protected Metrics(CdcSourceTaskContext taskContext, String contextName) {}

    protected Metrics(CdcSourceTaskContext taskContext, Map<String, String> tags) {}

    protected Metrics(
            CommonConnectorConfig connectorConfig,
            String contextName,
            boolean multiPartitionMode) {}

    /**
     * Registers a metrics MBean into the platform MBean server. The method is intentionally
     * synchronized to prevent preemption between registration and unregistration.
     */
    public synchronized void register() {
        LOGGER.info("JMX Metrics are not supported");
    }

    /**
     * Unregisters a metrics MBean from the platform MBean server. The method is intentionally
     * synchronized to prevent preemption between registration and unregistration.
     */
    public synchronized void unregister() {
        LOGGER.info("JMX Metrics are not supported");
    }
}
