# Designing a Logging Framework

## Entities:

1. LogLevel enum defines the different log levels supported by the logging framework.
2. LogMessage class represents a log message with a timestamp, log level, and message content.
3. LogAppender interface defines the contract for appending log messages to different output destinations.
4. ConsoleAppender : logging to the console
5. FileAppender : logging to the database
6. DatabaseAppender : logging to the file.

## Config::

5. LoggerConfig class holds the configuration settings for the logger, including the log level and the selected log
   appender.

## Service:

6. Logger class is a singleton that provides the main logging functionality. It allows setting the configuration,
   logging messages at different levels, and provides convenience methods for each log level.

## Test Class:

7. LoggingExample class demonstrates the usage of the logging framework, showcasing different log levels, changing the
   configuration, and logging from multiple threads.