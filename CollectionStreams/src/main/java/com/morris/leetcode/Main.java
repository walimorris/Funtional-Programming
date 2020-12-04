package com.morris.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;

public class Main {

    public static void main(String[] args) {
        Artist eminem = new Artist("Marshall", 45, "Detroit");
        Artist drake = new Artist("Aubrey", 35, "Toronto");
        Artist hootie = new Artist("Darius", 52, "South Carolina");
        List<Artist> artists = List.of(eminem, drake, hootie);
        artists.forEach(artist -> System.out.println(artist.getName() + " " +
                artist.getAge() + " " + artist.getOrigin()));

        List<Artist> filters = new ArrayList<>();
        artists.forEach(artist -> {
            if ( artist.getOrigin().equals("Detroit")) {
                filters.add(artist);
            }
        });
        filters.forEach(artist -> System.out.println(artist.getName() +
                " is from " + artist.getOrigin()));

       artists.stream().filter(artist -> artist.getOrigin().equals("Toronto"))
       .forEach(torontoArtist -> System.out.println(torontoArtist.getName()));

       List<String> locations = artists.stream().map(Artist::getOrigin)
               .collect(Collectors.toList());
       List<String> testLocations = List.of("Detroit", "Toronto", "South Carolina");
       Assert.assertNotNull(locations);
       Assert.assertEquals(locations, testLocations);

       long torontoCount = locations.stream()
               .filter(origin -> origin.equals("Toronto"))
               .count();

       Assert.assertEquals(1, torontoCount);
    }
}
