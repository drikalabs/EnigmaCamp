package com.enigma.model;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "student")
public class Student {
    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_place")
    private String birthPlace;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "gender")
    private String gender;
    @Column(name = "major")
    private String major;
    @ManyToOne
    @JoinColumn(name = "clasrom_id")
    private Room classromId;

    public Student(Integer id, String name, String birthPlace, Date birthDate, String gender, String major) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.gender = gender;
        this.major = major;
    }

    public Student() {
    }
    public void setClassromId(Room classYangDidapat) {
        this.classromId=classYangDidapat;
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

    public Room getClassromId() {
        return classromId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                /*", classromId=" + classromId.getId() +*/
                '}';
    }
}
