package com.github.mrbean355.mappiebug;

import androidx.annotation.NonNull;

public final class JavaModel {
    public final JavaUser user;

    public JavaModel(JavaUser user) {
        this.user = user;
    }

    @NonNull
    @Override
    public String toString() {
        return "JavaModel{" +
                "user=" + user +
                '}';
    }
}
