package com.shah.javacoretutorials.model;

import lombok.Data;

/**
 * @author NORUL
 */
@Data
public class Worker {
    private int id;
    private String name;
    private static String supervisor;

    public Worker(int id, String name, String supervisor) {
        super();
        this.id = id;
        this.name = name;
        Worker.supervisor = supervisor;
    }

    public String toString() {
        return id + ", " + name + ", " + supervisor;
    }
}
