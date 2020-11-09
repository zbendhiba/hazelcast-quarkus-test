package org.acme.hazelcast.listener;

import com.hazelcast.map.listener.EntryAddedListener;
import com.hazelcast.map.listener.EntryEvictedListener;
import com.hazelcast.map.listener.EntryMergedListener;
import com.hazelcast.map.listener.EntryRemovedListener;
import com.hazelcast.map.listener.EntryUpdatedListener;
import com.hazelcast.map.listener.MapClearedListener;
import com.hazelcast.map.listener.MapEvictedListener;

public interface MapEntryListener<K, V> extends MapClearedListener, MapEvictedListener,
        EntryAddedListener<K, V>, EntryEvictedListener<K, V>, EntryRemovedListener<K, V>,
        EntryMergedListener<K, V>, EntryUpdatedListener<K, V> {

}
