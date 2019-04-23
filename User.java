package com.company;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
    }

    @Override
    public String toString() {
        return String.format("%s, %s",lastName,firstName);
    }

    @Override
    public int compareTo(User o) {
        if (firstName.compareTo(o.getLastName()) == 0){
            return firstName.compareTo(o.getFirstName());
        }
        return lastName.compareTo(o.getLastName());
    }
}
