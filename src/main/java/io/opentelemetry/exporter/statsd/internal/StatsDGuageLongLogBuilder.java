/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.exporter.statsd.internal;

import io.opentelemetry.sdk.metrics.data.LongPointData;

public class StatsDGuageLongLogBuilder extends StatsDGuageLogBuilder {

  @Override
  protected void appendMetricValue() {
    LongPointData pointData = (LongPointData) getValue();
    if (pointData != null) {
      getBuilder().append(pointData.getValue());
    }
  }
}
