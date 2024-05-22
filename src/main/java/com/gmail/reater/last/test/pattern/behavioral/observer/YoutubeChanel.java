package com.gmail.reater.last.test.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChanel implements Publisher{

    private List<Subscriber> subscribers = new ArrayList<>();
    private List<String> videoTitles = new ArrayList<>();

    @Override
    public void addSubscriber(final Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(final Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(final String text) {
        subscribers.forEach(subscriber -> subscriber.showNotification(text));
    }

    public void uploadNewVideo(String videoTitle) {
        videoTitles.add(videoTitle);
        notifySubscribers(videoTitle);
    }
}
