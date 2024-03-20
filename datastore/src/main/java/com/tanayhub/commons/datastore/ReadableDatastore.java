package com.tanayhub.commons.datastore;

import com.tanayhub.commons.templates.criterion.Criterion;
import com.tanayhub.commons.templates.record.RecordIdentifier;

import java.util.Collection;
import java.util.Optional;

public interface ReadableDatastore<I, R extends RecordIdentifier<I>> {
    Optional<R> query(I identifier);

    Collection<R> query(Criterion criterion);
}
