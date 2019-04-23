package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = loadUsers();
        System.out.println("---Original---");
        printUserList(users);

        Collections.sort(users);

        System.out.println("---Sorted---");
        printUserList(users);

    }
        private static ArrayList<User> loadUsers () {
            ArrayList<User> users = new ArrayList<>();
            try {
                Scanner fileScanner = new Scanner(
                        new File("E:\\Morris\\UserCatalogue\\src\\com\\company\\Users.csv"));
                String user;
                String[] nameParts;
                while (fileScanner.hasNextLine()) {
                    user = fileScanner.nextLine();
                    nameParts = user.split(",");
                    users.add(new User(nameParts[0], nameParts[1]));

                }
                fileScanner.close();
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        return users;
    }
    private static void printUserList(ArrayList<User> users){
        for (User s: users){
            System.out.println(s);
        }
    }
}
