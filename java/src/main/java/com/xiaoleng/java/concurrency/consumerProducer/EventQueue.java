package com.xiaoleng.java.concurrency.consumerProducer;

import java.util.LinkedList;

public class EventQueue {

    private int max;

    static class Event {
    }

    private final LinkedList<Event> eventQueue = new LinkedList<>();

    private final static int DEFAULT_MAX_SIZE = 10;

    public EventQueue() {

    }

    public EventQueue(int max) {
        this.max = max;
    }

    public void offer(Event event) {
        synchronized (eventQueue) {
            if (eventQueue.size() >= DEFAULT_MAX_SIZE) {
                try {
                    console("the queue is full.");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            console("the new event is submitted.");
            eventQueue.addLast(event);
            eventQueue.notify();
        }
    }

    public Event take() {
        synchronized (eventQueue) {
            if (eventQueue.isEmpty()) {
                try {
                    console("the queue is empty.");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Event event = eventQueue.removeFirst();
            console("the event " + event + "is handle.");
            eventQueue.notify();

            return event;
        }
    }

    private void console(String message) {
        System.out.printf("%s:%s\n", Thread.currentThread().getName(), message);
    }

}
