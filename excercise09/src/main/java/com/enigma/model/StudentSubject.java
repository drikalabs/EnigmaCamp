package com.enigma.model;

import javax.persistence.*;

@Entity
@Table(name = "studentsubject")
public class StudentSubject {
    @Id
    private Integer idStuSub;

    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student idStudent;

    @ManyToOne
    @JoinColumn(name = "id_subject")
    private Subject idSubject;

    public StudentSubject(Integer idStuSub, Student idStudent, Subject isSubject) {
        this.idStuSub = idStuSub;
        this.idStudent = idStudent;
        this.idSubject = isSubject;
    }

    public StudentSubject() {
    }

    public Integer getIdStuSub() {
        return idStuSub;
    }

    public void setIdStuSub(Integer idStuSub) {
        this.idStuSub = idStuSub;
    }

    public Student getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Student idStudent) {
        this.idStudent = idStudent;
    }

    public Subject getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Subject isSubject) {
        this.idSubject = isSubject;
    }

    @Override
    public String toString() {
        return "StudentSubject{" +
                "idStuSub=" + idStuSub +
                ", idStudent=" + idStudent.getId() +
                ", idSubject=" + idSubject.getId() +
                '}';
    }
}
