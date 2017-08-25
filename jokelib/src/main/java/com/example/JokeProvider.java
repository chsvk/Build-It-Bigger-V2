package com.example;
import java.util.Random;

public class JokeProvider {
    private static final String[] jokes = {
            "The four most beautiful words in our common language: I told you so.",
            "All pro athletes are bilingual. They speak English and profanity.",
            "\n" +
                    "\n" +
                    "My girlfriend and I often laugh about how competitive we are.\n" +
                    "\n" +
                    "But I laugh more.\n",
            "Next time I send a damn fool, I go myself",
            "When I lost my rifle, the Army charged me $85. That’s why in the Navy, the captain goes down with the ship.",
            "The closest a person ever comes to perfection is when he fills out a job application form."
    };

    public static String getJoke(){
        int size = jokes.length;

        Random r = new Random();
        int index = r.nextInt(size);

        return jokes[index];
    }
}
