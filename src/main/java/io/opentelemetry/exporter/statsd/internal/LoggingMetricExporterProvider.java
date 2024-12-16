/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.exporter.statsd.internal;

import com.google.auto.service.AutoService;
import io.opentelemetry.exporter.statsd.StatsDMetricLogExporter;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.metrics.ConfigurableMetricExporterProvider;
import io.opentelemetry.sdk.metrics.export.MetricExporter;

@AutoService(ConfigurableMetricExporterProvider.class)
public class LoggingMetricExporterProvider implements ConfigurableMetricExporterProvider {

  @Override
  public MetricExporter createExporter(ConfigProperties configProperties) {
    return StatsDMetricLogExporter.create();
  }

  @Override
  public String getName() {
    return "logging-statsd";
  }
}
