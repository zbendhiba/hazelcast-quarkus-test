package org.acme.hazelcast.listener;

import com.hazelcast.core.EntryEvent;
import com.hazelcast.map.MapEvent;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MyMaplListener implements MapEntryListener<Object, Object> {
    @Override
    public void entryAdded(EntryEvent event) {

    }

    @Override
    public void entryEvicted(EntryEvent event) {

    }

    @Override
    public void entryMerged(EntryEvent event) {

    }

    @Override
    public void entryRemoved(EntryEvent event) {

    }

    @Override
    public void entryUpdated(EntryEvent event) {

    }

    @Override
    public void mapCleared(MapEvent event) {

    }

    @Override
    public void mapEvicted(MapEvent event) {

    }
}
