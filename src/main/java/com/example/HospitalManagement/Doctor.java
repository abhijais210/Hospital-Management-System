package com.example.HospitalManagement;

public class Doctor {
    private String name;
    private int age;
    private int doctorId;
    private String specialist;
    private String qualification;

    public Doctor(String name, int age, int doctorId, String specialist, String qualification) {
        this.name = name;
        this.age = age;
        this.doctorId = doctorId;
        this.specialist = specialist;
        this.qualification = qualification;
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

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
