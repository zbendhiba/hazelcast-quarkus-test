package org.acme.hazelcast.listener;

import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.map.MapEvent;

public class MyEntryListener implements EntryListener<Object, Object> {
    @Override
    public void entryAdded(EntryEvent<Object, Object> event) {

    }

    @Override
    public void entryEvicted(EntryEvent<Object, Object> event) {

    }

    @Override
    public void entryExpired(EntryEvent<Object, Object> event) {

    }

    @Override
    public void entryRemoved(EntryEvent<Object, Object> event) {

    }

    @Override
    public void entryUpdated(EntryEvent<Object, Object> event) {

    }

    @Override
    public void mapCleared(MapEvent event) {

    }

    @Override
    public void mapEvicted(MapEvent event) {

    }
}
