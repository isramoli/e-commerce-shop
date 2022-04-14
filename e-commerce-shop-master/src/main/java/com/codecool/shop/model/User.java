package com.codecool.shop.model;

import java.util.Objects;

public class User extends BaseModel {
    private String password;

    public User(String name) {
        super(name);
    }

    public User(String name, String password) {
        super(name);
        this.password = password;
    }


    public boolean equals(User o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }
}
