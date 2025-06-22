package com.lld.problems.E_LoggingFramework.entities.logappender;

import com.lld.problems.E_LoggingFramework.entities.LogMessage;

public class ConsoleAppender implements LogAppender {
  @Override
  public void append(LogMessage logMessage) {
    System.out.println(logMessage);
  }
}
