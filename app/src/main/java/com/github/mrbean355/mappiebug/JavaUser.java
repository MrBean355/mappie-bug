package com.github.mrbean355.mappiebug;

public final class JavaUser {
    public final String name;

    public JavaUser(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JavaUser{" +
                "name='" + name + '\'' +
                '}';
    }
}
