package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main1 {

    public static void printUniversities(List<University> universities, int rank) {
        for (University u : universities) {
            if (u.getRank() == rank) {
                System.out.println(u.name);
            }
        }
    }

    public static void main(String[] args) {

        List<University> universities = new ArrayList<>();

        universities.add(new University(1, "Oxford", "Англия", 1, Arrays.asList(5, 5, 4)));
        universities.add(new University(2, "Harvard", "США", 2, Arrays.asList(2, 3, 2)));
        universities.add(new University(3, "Cambridge", "Англия", 3, Arrays.asList(4, 5, 5)));
        universities.add(new University(4, "Stanford", "США", 4, Arrays.asList(4, 4, 5)));

        for (University u : universities) {
            if (u.getAverageRating() < 3) {
                System.out.println(u.name);
            }
        }

        for (University u : universities) {
            if (u.getAverageRating() >= 4) {
                u.setRank(u.getRank() + 1);
            }
        }

        printUniversities(universities, 2);

        universities.sort(
                Comparator.comparingDouble(University::getAverageRating)
                        .reversed()
                        .thenComparing(u -> u.name)
        );

        for (University u : universities) {
            System.out.println(u.id + " " + u.name + " " + u.getAverageRating());
        }
    }
}