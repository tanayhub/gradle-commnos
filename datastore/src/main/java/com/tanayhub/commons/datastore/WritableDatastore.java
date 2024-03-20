package com.tanayhub.commons.datastore;

import com.tanayhub.commons.templates.record.RecordIdentifier;

import java.util.Optional;

public interface WritableDatastore<I, R extends RecordIdentifier<I>> {
    Optional<R> insert(R record);

    Optional<R> update(R record);

    Optional<R> remove(I identifier);
}
