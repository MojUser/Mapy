package com.company;

import java.util.HashMap;

public class Ex2Map {
    HashMap<User, Integer> brokenMap = new HashMap<>();

    public Ex2Map() {
        User user = new User("Adam", "Adam", 1, 30);
        User user1 = new User("Jan", "Muzykant", 8, 10);
        User user2 = new User("Patryk", "Patryciński", 7, 15);
        User user3 = new User("Józefina", "Kowalski", 6, 34);
        User user4 = new User("Józef", "Michalski", 5, 66);
        User user5 = new User("Karolina", "Dybalski", 4, 9);
        User user6 = new User("Andrzej", "Kosiński", 3, 3);
        User user7 = new User("Karol", "Bryński", 2, 44);
        brokenMap.put(user, 10);
        brokenMap.put(user1, 20);
        brokenMap.put(user2, 40);
        brokenMap.put(user3, 10);
        brokenMap.put(user4, 20);
        brokenMap.put(user5, 30);
        brokenMap.put(user6, 50);
        brokenMap.put(user7, 100);

    }

}
