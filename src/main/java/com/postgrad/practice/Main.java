package com.postgrad.practice;

import com.postgrad.practice.models.Location;
import com.postgrad.practice.models.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private Player player;
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> temporaryPortal = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "Exiting program. Have a good day!", "sad", temporaryPortal));

        temporaryPortal = new HashMap<String, Integer>();
        locations.put(1, new Location(1, "You are in your bed. Get to the castle!", "cozy", temporaryPortal));
        temporaryPortal.put("W", 2);

        temporaryPortal = new HashMap<String, Integer>();
        locations.put(2, new Location(2, "You are in a forest.", "muggy", temporaryPortal));
        temporaryPortal.put("N", 1);
        temporaryPortal.put("E", 1);
        temporaryPortal.put("S", 1);
        temporaryPortal.put("W", 2);

        temporaryPortal = new HashMap<String, Integer>();
        locations.put(3, new Location(3, "You are on an island.", "tropical", temporaryPortal));
        temporaryPortal.put("N", 1);
        temporaryPortal.put("E", 1);
        temporaryPortal.put("S", 3);
        temporaryPortal.put("W", 1);

        temporaryPortal = new HashMap<String, Integer>();
        locations.put(4, new Location(4, "You are at the park.", "breezy", temporaryPortal));
        temporaryPortal.put("N", 4);
        temporaryPortal.put("E", 1);
        temporaryPortal.put("S", 1);
        temporaryPortal.put("W", 1);

        temporaryPortal = new HashMap<String, Integer>();
        locations.put(5, new Location(5, "Congratulations, you made it to the museum! It's time to test your luck. Type [I] for an item.", "controlled", temporaryPortal));
        temporaryPortal.put("N", 1);
        temporaryPortal.put("E", 5);
        temporaryPortal.put("S", 1);
        temporaryPortal.put("W", 1);

//        Item holyGrail = new Item(1, "The Holy Grail", "A really nice cup a lot of guys seem to want.", 100);
//        Item rubberDucky = new Item(2, "Rubber Ducky", "A stealthy hunter hidden behind the veil of innocence.", 42);
//        Item basicSword = new Item(2, "Basic Sword", "*Clink clank*", 10);
//        Item spaghetti = new Item(2, "Spaghetti", "Piping hot and ready to satiate.", 35);
//        Item cellPhone = new Item(2, "Cell Phone", "A small handheld computer used for phoning friends (or ignoring them).", 3);

        Map<String, String> wholeWordResponse = new HashMap<String, String>();
        wholeWordResponse.put("QUIT", "Q");
        wholeWordResponse.put("NORTH", "N");
        wholeWordResponse.put("EAST", "E");
        wholeWordResponse.put("SOUTH", "S");
        wholeWordResponse.put("WEST", "W");
        wholeWordResponse.put("ITEM", "I");

        int location = 1;
        while(true) {
            System.out.println(locations.get(location).getDescription());
            if (location == 0) {
                break;
            }

            Map<String, Integer> portals = locations.get(location).getPortals();
            System.out.println("Please choose a direction:");
            for (String portal : portals.keySet()) {
                System.out.print("[" + portal + "]" + " ");
            }
            System.out.println();

            String portalChoice = scanner.nextLine().toUpperCase();
            if (portalChoice.length() > 1) {
                String[] words = portalChoice.split(" ");
                for(String word : words) {
                    if (wholeWordResponse.containsKey(word)) {
                        portalChoice = wholeWordResponse.get(word);
                        break;
                    }
                }
            }
            if (portals.containsKey(portalChoice)) {
                location = portals.get(portalChoice);
            } else {
                System.out.println("Invalid direction, try again!");
            }
        }
    }
}
