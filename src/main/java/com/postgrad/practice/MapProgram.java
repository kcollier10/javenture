package com.postgrad.practice;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "Compiled, high-level, object-oriented platform independent language.");
        languages.put("Python", "Interpreted object-oriented, high-level programming language.");
        languages.put("Tailwind", "Easily-customizable CSS framework.");
        languages.put("Svelte", "New JS language created to reduce lines of code and code readability.");
        languages.put("Bootstrap", "Pre-made designs designed for a mobile-friendly, sleek UI.");

        languages.replace("Tailwind", "A CSS framework used for highly-customizable designs and UI.");
        // can only do this if the key is present
        // languages.replace("React", "A JS framework using JSX.") will not work since "React" is not a key that exists yet
        // equal comparisons can be compromised, so it's important to be vigilant when choosing to use a Map

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
