package com.lld.problems.E_LoggingFramework.entities;
public record LogMessage(
        String message,
        LogLevel level,
        long timestamp){

    public LogMessage(String message, LogLevel logLevel) {
        this(message,logLevel,System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "[" + level + "] " + timestamp + " - " + message;
    }
}
