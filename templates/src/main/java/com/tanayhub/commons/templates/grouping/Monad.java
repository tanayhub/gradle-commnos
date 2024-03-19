package com.tanayhub.commons.templates.grouping;

import java.util.Objects;

public class Monad<T> {
    public final T value;

    protected Monad(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) { return true; }
        if (object == null || getClass() != object.getClass()) { return false; }
        Monad<?> monad = (Monad<?>) object;
        return Objects.equals(value, monad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return Monad.class.getSimpleName() + "{\"value\":" + value + '}';
    }

    public static <T> Monad<T> of(T value1) {
        return new Monad<>(value1);
    }
}
