package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class employee{
    @Id
    private int id;

    private String name;
    private int age;
    private String gender;

    public employee(){};
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender"+ gender+'}';
    }
}