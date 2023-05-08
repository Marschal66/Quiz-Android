package com.github.marschal66.quiz.android.logging;

import androidx.annotation.NonNull;

public class Logger {

    // default values
    // TODO: change to get from settings
    private static final Level DEFAULT_LEVEL = Level.INFO;
    private static final boolean DEFAULT_EOL = true;
    private static final String DEFAULT_PREFIX = null;

    public Logger(){
        // TODO: implement
    }

    public void log(String message) {
        this.log(DEFAULT_LEVEL, DEFAULT_EOL, DEFAULT_PREFIX, message);
    }

    public void log(Level level, String message){
        this.log(level, DEFAULT_EOL, DEFAULT_PREFIX, message);
    }

    public void log(String prefix, String message){
        this.log(DEFAULT_LEVEL, DEFAULT_EOL, prefix, message);
    }

    public void log(boolean eol, String message){
        this.log(DEFAULT_LEVEL, eol, DEFAULT_PREFIX, message);
    }

    public void log(Level level, String prefix, String message){
        this.log(level, DEFAULT_EOL, prefix, message);
    }

    public void log(Level level, boolean eol, String message){
        this.log(level, eol, DEFAULT_PREFIX, message);
    }

    public void log(boolean eol, String prefix, String message){
        this.log(DEFAULT_LEVEL, eol, prefix, message);
    }

    public void log(Level level, boolean eol, String prefix, String message){
        StringBuilder logMessage = new StringBuilder();
        logMessage.append("[").append(level).append("]");
        if (prefix != null && !prefix.isEmpty()){
            logMessage.append(" ").append("[").append(prefix).append("]");
        }
        logMessage.append(" ").append(message);
        if (eol){
            logMessage.append("\n");
        }

        // TODO: replace with logger
        System.out.print(logMessage.toString());
    }
}
