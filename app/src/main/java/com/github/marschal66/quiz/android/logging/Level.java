package com.github.marschal66.quiz.android.logging;

import androidx.annotation.NonNull;

public enum Level {
    DEBUG,
    INFO,
    WARN,
    ERROR;

    private final short id;
    private final String name;

    Level(){
        this.id = (short) this.ordinal();
        this.name = this.toString();
    }

    @NonNull
    @Override
    public String toString(){
        return this.name;
    }

    public short getId() {
        return id;
    }
}
