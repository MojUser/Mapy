package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex0Main {
    public static void main(String[] args) {
        //1. Stwórz listę obiektów typu Integer i ją posortuj używając dostępnej metody.
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);
        lista.add(0);
        System.out.println("Lista przed posortowaniem: " + lista);
        lista.sort(Comparator.naturalOrder());
        System.out.println("Lista po sortowaniu: " + lista);
        //2.Stwórz klasę User, zawierającą: Imię, Nazwisko, Wiek, Id. Stwórz listę i wypełnij ją obiektami typu User. A następnie posortuj listę użytkowników od najstarszego do najmłodszego.
        User user = new User("Adam", "Adam", 1, 30);
        User user1 = new User("Jan", "Muzykant", 8, 10);
        User user2 = new User("Patryk", "Patryciński", 7, 15);
        User user3 = new User("Józefina", "Kowalski", 6, 34);
        User user4 = new User("Józef", "Michalski", 5, 66);
        User user5 = new User("Karolina", "Dybalski", 4, 9);
        User user6 = new User("Andrzej", "Kosiński", 3, 3);
        User user7 = new User("Karol", "Bryński", 2, 44);
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        System.out.println("Lista użytkowników przed posortowaniem: " + users);
        users.sort((a, b) -> {
            if(a.getAge() > b.getAge()) {
                return -1;
            } else if (a.getAge() < b.getAge()) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println("Lista użytkowników po sortowaniu: " + users);

        //3. Stwórz metodę sortującą tablicę typu int[] bez użycia żadnych innych metod.
        int[] array = new int[]{0, 2 , 5, 6, 7, 11 ,22, -1, -5, 44};
        for (int i = 1; i < array.length - 1 ; i++) {
           int j = i-1;
           int z = i;
           while (j >= 0 && array[j] > array[z]) {
               int swap = array[j];
               array[j] = array[z];
               array[z] = swap;
               z -= 1;
               j -= 1;
           }
        }
        System.out.println(Arrays.toString(array));
        //3. Czy można posortować Zbiór obiektów(Set)? Stwórz zbiór obiektów typu Integer i spróbuj go posortować. Set nie trzyma kolejności, więc by go posortować trzeba go zamienić na listę :)
        Set<Integer> ints = new HashSet<>();
        ints.add(0);
        ints.add(10);
        ints.add(1);
        ints.add(-1);
        List<Integer> sortedListFromSet = ints.stream().sorted().collect(Collectors.toList());
    }
}
