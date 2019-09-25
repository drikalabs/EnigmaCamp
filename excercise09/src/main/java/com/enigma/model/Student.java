package com.enigma.model;

import java.util.Date;

public class Student {
    private Integer id;
    private String name;
    private String birthPlace;
    private Date birthDate;
    private String gender;
    private String major;

    public Student() {
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getBirthPlace() { return birthPlace; }

    public void setBirthPlace(String birthPlace) { this.birthPlace = birthPlace; }

    public Date getBirthDate() { return birthDate; }

    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getMajor() { return major; }

    public void setMajor(String major) { this.major = major; }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
