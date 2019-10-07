package com.enigma.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    String name;
    Integer age;
    String gender;
    public Person(String name,Integer age,String gender){
        this.name=name;this.age=age;this.gender=gender;
    }
    public void witeText(){
        try {
            Set<Person> person = new HashSet<>();
            person.add(new Person(this.name,this.age,this.gender));
                FileWriter fileWriter = new FileWriter("D:\\Academy\\excercise06\\dataContainer\\data.txt", true);
                fileWriter.write(print()+"\n");
                fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(gender, person.gender);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String print() {
        return String.format("%1$-30s","Nama  :"+this.name)+
                String.format("%1$-3s","Umur   :"+this.age)+
                String.format("%1$-2s","Gender :"+this.gender);
    }
}
