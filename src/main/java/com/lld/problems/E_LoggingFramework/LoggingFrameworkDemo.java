package com.lld.problems.E_LoggingFramework;

import com.lld.problems.E_LoggingFramework.config.LoggerConfig;
import com.lld.problems.E_LoggingFramework.entities.LogLevel;
import com.lld.problems.E_LoggingFramework.entities.logappender.FileAppender;
import com.lld.problems.E_LoggingFramework.service.Logger;

public class LoggingFrameworkDemo {
  public static void main(String[] args) {
    Logger logger = Logger.getInstance();

    // Logging with default configuration
    logger.info("This is an information message");
    logger.error("This is an error message");
    logger.warning("This is a warning message");

    // Changing log level and appender
    LoggerConfig config = new LoggerConfig(LogLevel.DEBUG, new FileAppender("app.log"));
    logger.setConfig(config);

    logger.debug("This is a debug Message");
    logger.info("This is an information message");
  }
}
