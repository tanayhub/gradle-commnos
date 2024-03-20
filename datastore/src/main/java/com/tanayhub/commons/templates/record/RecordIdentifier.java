package com.tanayhub.commons.templates.record;

import java.util.Objects;

public abstract class RecordIdentifier<I> {
    private final I identifier;

    protected RecordIdentifier(I identifier) {
        this.identifier = Objects.requireNonNullElse(identifier, getIdentifier());
    }

    public I getIdentifier() {
        return identifier;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) { return true; }
        if (object == null || getClass() != object.getClass()) { return false; }
        RecordIdentifier<?> that = (RecordIdentifier<?>) object;
        return Objects.equals(identifier, that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }

    protected abstract I generateIdentifier();
}
