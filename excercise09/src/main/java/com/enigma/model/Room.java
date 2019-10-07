package com.enigma.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {
    @Id
    private Integer id;

    @Column(name = "room_name")
    private String roomname;

    @Column(name = "capacity")
    private Integer capacity;

    @OneToMany(mappedBy = "classromId")
    private List<Student> students;

    public Room() {
    }

    public Room(Integer id, String roomname, Integer capacity, List<Student> students) {
        this.id = id;
        this.roomname = roomname;
        this.capacity = capacity;
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomname='" + roomname + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}
