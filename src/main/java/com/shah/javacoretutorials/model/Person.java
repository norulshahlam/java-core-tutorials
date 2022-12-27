package com.shah.javacoretutorials.model;

import lombok.Data;

@Data
public class Person {

    // composition has-a relationship - Person has-a job
    private Job job;
    public Person() {
        this.job = new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }
}
