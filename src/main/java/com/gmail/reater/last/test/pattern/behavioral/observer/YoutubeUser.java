package com.gmail.reater.last.test.pattern.behavioral.observer;

public class YoutubeUser implements Subscriber{

    @Override
    public void showNotification(final String text) {
        System.out.println("Вышло новое видео с загаловком - " + text);
    }
}
