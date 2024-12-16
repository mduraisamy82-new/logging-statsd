/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.exporter.statsd.internal;

import io.opentelemetry.sdk.metrics.data.PointData;
import javax.annotation.Nonnull;

public interface StatsDBuilder<T> {

  StatsDBuilder<T> setMetricName(@Nonnull String metricName);

  StatsDBuilder<T> setValue(@Nonnull PointData value);

  T build();
}
