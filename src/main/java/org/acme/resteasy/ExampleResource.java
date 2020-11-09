package org.acme.resteasy;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.hazelcast.collection.IList;
import com.hazelcast.collection.IQueue;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.hazelcast.multimap.MultiMap;
import com.hazelcast.replicatedmap.ReplicatedMap;
import com.hazelcast.topic.ITopic;
import org.acme.hazelcast.listener.MyEntryListener;
import org.acme.hazelcast.listener.MyItemListener;
import org.acme.hazelcast.listener.MyMaplListener;
import org.acme.hazelcast.listener.MyMessageListener;

@Path("/test")
public class ExampleResource {

    @Inject
    HazelcastInstance hazelcastInstance;

    @GET()
    @Path("topic")
    public Response topic() {
       ITopic<Object> topic =  hazelcastInstance.getTopic("foo-topic");
       // topic.addMessageListener(new MyMessageListener());
        return Response.ok().build();
    }

    @GET()
    @Path("topic-reliable")
    @Produces(MediaType.TEXT_PLAIN)
    public Response topicReliable() {
        ITopic<Object> topic = hazelcastInstance.getReliableTopic("foo:topic-reliable");
        //topic.addMessageListener(new MyMessageListener());
        return Response.ok().build();
    }

    @GET()
    @Path("map")
    public Response map() {
        IMap<Object, Object> cache = hazelcastInstance.getMap("foo-map");
        //cache.addEntryListener(new MyMaplListener(), true);
        return Response.ok().build();
    }

    @GET()
    @Path("queue")
    public Response queue() {
        IQueue<Object> queue = hazelcastInstance.getQueue("foo-queue");
        //queue.addItemListener(new MyItemListener(), true);
        return Response.ok().build();
    }

    @GET()
    @Path("multimap")
    public Response multimap() {
        MultiMap<Object, Object> cache = hazelcastInstance.getMultiMap("foo-multimap");
        //cache.addEntryListener(new MyEntryListener(), true);
        return Response.ok().build();
    }

    @GET()
    @Path("replicated-map")
    public Response replicatedMap() {
        ReplicatedMap<Object, Object> cache = hazelcastInstance.getReplicatedMap("foo-replicated-map");
        //cache.addEntryListener(new MyEntryListener(), true);
        return Response.ok().build();
    }

    @GET()
    @Path("list")
    public Response list() {
        IList<Object> list = hazelcastInstance.getList("foo-list");
        list.addItemListener(new MyItemListener(), true);
        return Response.ok().build();
    }

}