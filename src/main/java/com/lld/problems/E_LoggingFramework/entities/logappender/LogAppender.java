package com.lld.problems.E_LoggingFramework.entities.logappender;

import com.lld.problems.E_LoggingFramework.entities.LogMessage;

public interface LogAppender {
  void append(LogMessage logMessage);
}
