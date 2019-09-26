package com.enigma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentsubject")
public class StudentSubject {
    @Id
    private Integer idStuSub;

    @Column(name = "id_student")
    private Integer idStudent;

    @Column(name = "id_subject")
    private Integer isSubject;

    public StudentSubject(Integer idStuSub, Integer idStudent, Integer isSubject) {
        this.idStuSub = idStuSub;
        this.idStudent = idStudent;
        this.isSubject = isSubject;
    }

    public StudentSubject() {
    }

    public Integer getIdStuSub() {
        return idStuSub;
    }

    public void setIdStuSub(Integer idStuSub) {
        this.idStuSub = idStuSub;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getIsSubject() {
        return isSubject;
    }

    public void setIsSubject(Integer isSubject) {
        this.isSubject = isSubject;
    }

    @Override
    public String toString() {
        return "StudentSubject{" +
                "idStuSub=" + idStuSub +
                ", idStudent=" + idStudent +
                ", isSubject=" + isSubject +
                '}';
    }
}
