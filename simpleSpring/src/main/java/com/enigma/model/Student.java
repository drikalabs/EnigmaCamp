package com.enigma.model;

import java.util.Date;
import java.util.Objects;

public class Student {
    Integer idSudent;
    String name;
    String birthPlace;
    Date birthDate;
    String Gender;
    String Major;

    public Student(Integer idSudent, String name, String birthPlace, Date birthDate, String gender, String major) {
        this.idSudent = idSudent;
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        Gender = gender;
        Major = major;
    }

    public Integer getIdSudent() {
        return idSudent;
    }

    public void setIdSudent(Integer idSudent) {
        this.idSudent = idSudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(idSudent, student.idSudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSudent);
    }
}
