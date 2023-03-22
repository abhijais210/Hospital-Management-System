package com.example.HospitalManagement;

public class Patient {

    private String name;
    private int age;
    private int id;
    private String disease;

    public Patient(String name, int age, int id, String disease) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
