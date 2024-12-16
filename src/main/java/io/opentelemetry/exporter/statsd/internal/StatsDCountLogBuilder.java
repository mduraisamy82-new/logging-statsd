/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.exporter.statsd.internal;

public abstract class StatsDCountLogBuilder extends StatsDLogBuilder {

  @Override
  protected void appendMetricType() {
    getBuilder().append('c');
  }
}
