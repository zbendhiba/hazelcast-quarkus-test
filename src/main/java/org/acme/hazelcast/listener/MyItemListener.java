package org.acme.hazelcast.listener;

import com.hazelcast.collection.ItemEvent;
import com.hazelcast.collection.ItemListener;

public class MyItemListener implements ItemListener<Object> {
    @Override
    public void itemAdded(ItemEvent<Object> item) {

    }

    @Override
    public void itemRemoved(ItemEvent<Object> item) {

    }
}
