# Extending the OpenTelemetry Java Agent: StatsD Metrics Console exporter.

This repository demonstrates how to generate and log StatsD metrics using OpenTelemetry Java Agent extension. It provides a foundational implementation for developers looking to incorporate StatsD/Other metrics standards into their observability pipeline, particularly for tools like Splunk Enterprise or other StatsD-compatible backends.

## Features

- **StatsD Metric Logging**: Supports counters, gauges, and other metric types.
- **Console Output**: Logs metrics directly to the console for debugging and learning purposes.
- **Extensibility**: Provides a base for integrating metrics into StatsD-compatible backends like Splunk, Datadog, or Telegraf.

## Prerequisites

To build and run the example, ensure you have the following:

- **Java Development Kit (JDK)**: Version 8 or later.
- **Build Tool**: Gradle (preferred) or Maven.

## Setup

### Clone the Repository

```bash
git clone https://github.com/mduraisamy82-new/logging-statsd.git
cd logging-statsd
```

### Build the Project

Use Gradle to build the project:

```bash
gradle build
```

This will compile the project and generate the necessary binaries in the `build/libs` directory.

## Running as a Java Agent with Spring PetClinic

This example can also be used as a Java agent for metrics instrumentation. You can run it alongside the Spring PetClinic application as an executable JAR.

### Steps to Run as a Java Agent

1. **Build the Java Agent**:

   The Java agent is already configured in this repository. Build the project as described above.

2. **Download the Spring PetClinic Application**:

   Clone the Spring PetClinic repository and build it:

   ```bash
   git clone https://github.com/spring-projects/spring-petclinic.git
   cd spring-petclinic
   ./mvnw package
   ```

   This will create the `spring-petclinic-*.jar` file in the `target` directory.

3. **Run Spring PetClinic with the Java Agent**:

   Use the following command to attach the `logging-statsd` agent to the Spring PetClinic application:

   ```bash
   java -javaagent:/path/to/opentelemetry-javaagent.jar "-Dotel.javaagent.extensions=/path/to/extensions" "-Dotel.traces.exporter=none" "-Dotel.metrics.exporter=logging-statsd"  "-Dotel.logs.exporter=none" "-Dotel.instrumentation.micrometer.enabled=true"  -jar target/spring-petclinic-*.jar

   ```

4. **Verify Metrics**:

   The Java agent will log StatsD metrics from the Spring PetClinic application to the console. These metrics can be further routed to Splunk or other StatsD-compatible backends.

## Use Cases

- **Debugging**: Quickly test StatsD metric generation locally.
- **Education**: Learn how StatsD works in a Java application.
- **Integration**: Build upon the example to create production-ready observability tools.

## Contributing

Contributions are welcome! If you have suggestions for improvements or want to report an issue, please create a pull request or open an issue on the [GitHub repository](https://github.com/mduraisamy82-new/logging-statsd).

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

By using this repository, you can kickstart your journey into integrating StatsD metrics into your Java applications or use as a base for creating OpenTelemetry Java Agent extension and observability pipelines. Happy coding!
