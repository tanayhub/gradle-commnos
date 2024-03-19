package com.tanayhub.commons.templates.grouping;

import java.util.Objects;

public class Dyad<T1, T2> {
    public final T1 value1;

    public final T2 value2;

    protected Dyad(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) { return true; }
        if (object == null || getClass() != object.getClass()) { return false; }
        Dyad<?, ?> dyad = (Dyad<?, ?>) object;
        return Objects.equals(value1, dyad.value1) && Objects.equals(value2, dyad.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }

    @Override
    public String toString() {
        return Dyad.class.getSimpleName() + "{\"value1\":" + value1 + ", \"value2\":" + value2 + '}';
    }

    public static <V1, V2> Dyad<V1, V2> of(V1 value1, V2 value2) {
        return new Dyad<>(value1, value2);
    }

    public static <V> Pair<V> pair(V value1, V value2) {
        return new Pair<>(value1, value2);
    }

    public static class Pair<T> extends Dyad<T, T> {
        protected Pair(T value1, T value2) {
            super(value1, value2);
        }
    }
}
