package com.company;

import java.util.HashMap;

public class Ex1Main {
    public static void main(String[] args) {
        Ex1Map ex1Map = new Ex1Map();
        HashMap<String, Integer> usersRanking = ex1Map.scoreBoard;
        //1. Wyszukaj liczbę punktów użytkownika "Michał"
        int scoreOfMichal = usersRanking.get("Michał");
        System.out.println("Liczba punktów użytkownika Michał: " + scoreOfMichal);
        //2. Zaktualizuj liczbę punktów użytkownika "Karol".
        int scoreOfKarol = usersRanking.get("Karol");
        System.out.println("Liczba punktów użytkownika Karol przed aktualizacja: " + scoreOfMichal);
        usersRanking.put("Karol", 0);
        scoreOfKarol = usersRanking.get("Karol");
        System.out.println("Liczba punktów użytkownika Karol po aktualizacji: " + scoreOfMichal);
        //3.Sprawdź ilu uzytkowników występuje w mapie
        System.out.println("Liczba użytkowników w Mapie: " + usersRanking.size());
        //4. Wypsiz wszystkich użytkowników z liczbą punktów >10.
        usersRanking.forEach((key, value) -> {
            if (value > 10) {
                System.out.println("Użytkownik " + key + " ma " + value + " punktów.");
            }
        });
        //5. Wypsiz wszystkich użytkowników i ich punkty
        usersRanking.forEach((key, value) -> {
            System.out.println("Użytkownik " + key + " ma " + value + " punktów.");
        });

    }
}
