package com.brightskies.biker_system.enums;

public enum UserRole {
    customer("customer"),
    biker("biker"),
    manager("manager"),
    admin("admin");

    private String name;
    UserRole(String name) {
        this.name = name;
    }
}