package com.thehecklers.sburrestdemo;

public class GameRequest {
    private String name; // nome do jogo

    public GameRequest() {}

    public GameRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
