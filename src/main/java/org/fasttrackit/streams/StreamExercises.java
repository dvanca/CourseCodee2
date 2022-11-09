package org.fasttrackit.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExercises {
    public static void main(String[] args) {
        List<Citizen> citizens = List.of(
                new Citizen("Mike",28,"student",false),
                new Citizen("Amanda", 20, "artist", true),
                new Citizen("Nick", 24, "designer", true),
                new Citizen("Raluca",33, "economist", true)
        );

        Stream<Citizen> stream = citizens.stream();
        List<Citizen> marriedOverThirty = citizens.stream()
                .filter(citizen -> citizen.age() > 30)
                .filter(Citizen::married)
                .toList();
        System.out.println(marriedOverThirty);

        List<Integer> nameLength = citizens.stream()
                .map(Citizen::name)
                .map(String::length)
                .toList();
        System.out.println(nameLength);

        long count = citizens.stream()
                .filter(Citizen::married)
                .count();

        System.out.println("Married citizens " + count);

        boolean areAllArtistsMarried = citizens.stream()
                .filter(citizen -> citizen.profession().equals("artist"))
                .allMatch(Citizen::married);
        System.out.println(areAllArtistsMarried);

       // boolean isAnyArtistMarried = citizens.stream()
        //        .filter()

        List<String> sortNaturallySorted = citizens.stream()
                .map(Citizen::name)
                .sorted()
                .toList();
        System.out.println(sortNaturallySorted);

        List<Citizen> sortedCitizens = citizens.stream()
                .sorted((c1, c2) -> Boolean.compare(c1.married(),c2.married()))  // de vazut la curs in fisier
                .toList();
        System.out.println(sortedCitizens);
    }
}

record Citizen(String name, int age, String profession, boolean married){

}