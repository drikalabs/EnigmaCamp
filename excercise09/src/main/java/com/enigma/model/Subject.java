package com.enigma.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    private Integer id;
    @Column(name = "subject")
    private String subject;
    @Column(name = "sks")
    private Integer sks;
    @OneToMany(mappedBy = "idSubject")
    private Set<StudentSubject> studentSubjects;

    public Subject(Integer id, String subject, Integer sks) {
        this.id = id;
        this.subject = subject;
        this.sks = sks;
    }

    public Subject() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

    public Set<StudentSubject> getStudentSubjects() {
        return studentSubjects;
    }

    public void setStudentSubjects(Set<StudentSubject> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", sks=" + sks +
                ", studentSubjects=" + studentSubjects +
                '}';
    }
}
