package com.tanayhub.commons.templates.grouping;

import java.util.Objects;

public class Triad<T1, T2, T3> {
    public final T1 value1;

    public final T2 value2;

    public final T3 value3;

    protected Triad(T1 value1, T2 value2, T3 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }

    public T3 getValue3() {
        return value3;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) { return true; }
        if (object == null || getClass() != object.getClass()) { return false; }
        Triad<?, ?, ?> triad = (Triad<?, ?, ?>) object;
        return Objects.equals(value1, triad.value1) &&
            Objects.equals(value2, triad.value2) &&
            Objects.equals(value3, triad.value3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2, value3);
    }

    @Override
    public String toString() {
        return Triad.class.getSimpleName() + "{\"value1\":" + value1 +
            ", \"value2\":" + value2 +
            ", \"value3\":" + value3 +
            '}';
    }

    public static <V1, V2, V3> Triad<V1, V2, V3> of(V1 value1, V2 value2, V3 value3) {
        return new Triad<>(value1, value2, value3);
    }

    public static <V> Trio<V> trio(V value1, V value2, V value3) {
        return new Trio<>(value1, value2, value3);
    }

    public static class Trio<T> extends Triad<T, T, T> {
        protected Trio(T value1, T value2, T value3) {
            super(value1, value2, value3);
        }
    }
}
