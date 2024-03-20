package com.tanayhub.commons.datastore;

import com.tanayhub.commons.templates.record.RecordIdentifier;

public interface Datastore<I, R extends RecordIdentifier<I>, E>
    extends ReadableDatastore<I, R>, WritableDatastore<I, R> {
    E getEngine();
}
