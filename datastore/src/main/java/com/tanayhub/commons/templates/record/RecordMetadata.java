package com.tanayhub.commons.templates.record;

import java.time.Instant;
import java.util.Objects;

public abstract class RecordMetadata<I> extends RecordIdentifier<I> {
    public static final long VERSION = 0L;

    public static final boolean DISABLED = false;

    public static final String UNKNOWN = "UNKNOWN";

    private final long version;

    private final boolean disabled;

    private final String createdBy;

    private final Instant createdAt;

    private final String updatedBy;

    private final Instant updatedAt;

    public RecordMetadata(
        I identifier,
        Long version,
        Boolean disabled,
        String createdBy,
        Instant createdAt,
        String updatedBy,
        Instant updatedAt
    ) {
        super(identifier);
        this.version = Objects.requireNonNullElse(version, VERSION);
        this.disabled = Objects.requireNonNullElse(disabled, DISABLED);
        this.createdBy = Objects.requireNonNullElse(createdBy, UNKNOWN);
        this.createdAt = Objects.requireNonNullElse(createdAt, Instant.now());
        this.updatedBy = Objects.requireNonNullElse(updatedBy, UNKNOWN);
        this.updatedAt = Objects.requireNonNullElse(updatedAt, Instant.now());
    }

    public long getVersion() {
        return version;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
