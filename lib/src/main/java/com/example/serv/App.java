package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyAhR6qihxMpaAoHnd2b8lPuhOLzmtRkWO0";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bEL25Kgbd30kJ-gCBjzINVqn5qR8UUhUcctoTslxaaWDour_9LP7ScqEPS4I4rPRw1Ns6yxw0ay4vC_GI5-sQmaY8zm2Ej0S8MLTdMQVDD1fG6qhj3lWVeVW8sq7mzAxS4ELs1F");

        c.createData("Working!!", "Test message");

        return c;
    }
}

