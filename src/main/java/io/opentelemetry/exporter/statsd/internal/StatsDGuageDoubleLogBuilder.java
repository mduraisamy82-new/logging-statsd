/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.exporter.statsd.internal;

import io.opentelemetry.sdk.metrics.data.DoublePointData;

public class StatsDGuageDoubleLogBuilder extends StatsDGuageLogBuilder {

  @Override
  protected void appendMetricValue() {
    DoublePointData pointData = (DoublePointData) getValue();
    if (pointData != null) {
      getBuilder().append(String.format("%.2f", pointData.getValue()));
    }
  }
}
