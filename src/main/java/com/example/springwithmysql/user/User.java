package com.example.springwithmysql.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String position;
    private int wage_USD;

    public User() {
    }

    public User(String name, String position, int wage_USD) {
        this.name = name;
        this.position = position;
        this.wage_USD = wage_USD;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWage_USD() {
        return wage_USD;
    }

    public void setWage_USD(int wage_USD) {
        this.wage_USD = wage_USD;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", wage_USD=" + wage_USD +
                '}';
    }
}