package com.postgrad.practice;

import com.postgrad.practice.models.Location;
import com.postgrad.practice.models.Player;
import com.postgrad.practice.models.Portal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private Player player;
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player tempPlayer = new Player(1, "player1", "java", 100);

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

            List<Portal> portals = locations.get(location).getPortals();
            System.out.println("Please choose a direction:");
            for (Portal portal : portals) {
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
            if (portals.contains(portalChoice)) {
                location = Integer.parseInt(portalChoice);
            } else {
                System.out.println("Invalid direction, try again!");
            }
        }
    }
}
