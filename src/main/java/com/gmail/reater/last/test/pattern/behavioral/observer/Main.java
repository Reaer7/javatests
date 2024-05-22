package com.gmail.reater.last.test.pattern.behavioral.observer;

public class Main {

    /*
        Наблюдатель - это паттерн проектирования,
        который создает механизм подписки,
        позволяющий одним объектам следить и реагировать на события,
        происходящие в других объектах
    */
    public static void main(String[] args) {
        YoutubeChanel youtubeChanel = new YoutubeChanel();

        Subscriber youtubeUser1 = new YoutubeUser();
        youtubeChanel.addSubscriber(youtubeUser1);
        Subscriber youtubeUser2 = new YoutubeUser();
        youtubeChanel.addSubscriber(youtubeUser2);
        Subscriber youtubeUser3 = new YoutubeUser();
        youtubeChanel.addSubscriber(youtubeUser3);

        youtubeChanel.uploadNewVideo("Как реализовать паттерн наблюдатель?");
    }
}
