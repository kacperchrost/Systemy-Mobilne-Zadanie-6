package com.example.a6;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {

    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public UUID getId() {
        return id;
    }

    public Task(String name) {
        this.name = name;
        id = UUID.randomUUID();
        date = new Date();
    }
}
