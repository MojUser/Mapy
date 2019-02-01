package com.company;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ex2Main {

    public static void main(String[] args) {
        Ex2Map map = new Ex2Map();
        HashMap<User, Integer> usersScoreBoard = map.brokenMap;
        //1.Ilu użytkowników występuje w Mapie
        System.out.println("Liczba użytkowników w Mapie: " + usersScoreBoard.size());
        //2. Czy w Tablicy występuje Użytkownik Adam Adam z id = 1  i wiekiem 30 ?
        User user = new User("Adam", "Adam", 1, 30);
        //Należy zaimplementować metodę equals w klasie User
        if (usersScoreBoard.containsKey(user)) {
            System.out.println("Użytkownik znajduje się w mapie.");
        } else {
            System.out.println("Użytkownika nie ma w mapie.");
        }
        //3. Przyjmij od użytkownika imię, nazwisko i wiek. Następnie wpisz go do tabeli z losową liczbą punktów.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Swoje imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj Swoje nazwisko: ");
        String surname = scanner.nextLine();
        System.out.println("Podaj swoj wiek: ");
        int age = scanner.nextInt();
        Random random = new Random();
        int points = random.nextInt();
        int id = usersScoreBoard
                .values()
                .stream()
                .max(Comparator.naturalOrder()).get();
        User newUser = new User(name, surname, age, id+1);
        usersScoreBoard.put(newUser, points);
        System.out.println("Witaj " + newUser.getName() + " " + newUser.getSurname() + " masz " + newUser.getAge() + " lat. Twoja liczba punktów to: " +usersScoreBoard.get(newUser));
    }
}
