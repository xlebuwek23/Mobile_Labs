package com.example.labs.Work12;

public class Item {
    private int id;
    private String name;
    private String developer;

    public Item(int id, String name, String developer) {
        this.id = id;
        this.name = name;
        this.developer = developer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
