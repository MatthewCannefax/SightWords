package com.matthewcannefax.sightwords.sampleData;

import com.matthewcannefax.sightwords.model.SightWord;

import java.util.ArrayList;
import java.util.List;

public class SampleSightWords {
    private static List<SightWord> sightWords;
    private static String negativeWord = "Incorrect";
    private static List<String> positiveWords;

    public static List<SightWord> sampleWordsList(){
        sightWords = new ArrayList<>();

        sightWords.add(new SightWord("way"));
        sightWords.add(new SightWord("can"));
        sightWords.add(new SightWord("no"));
        sightWords.add(new SightWord("an"));
        sightWords.add(new SightWord("is"));
        sightWords.add(new SightWord("in"));
        sightWords.add(new SightWord("he"));
        sightWords.add(new SightWord("see"));
        sightWords.add(new SightWord("so"));

        return sightWords;
    }

    public static String getNegativeWord(){
        return negativeWord;
    }

    public static List<String> positiveWordList(){
        positiveWords = new ArrayList<>();

        positiveWords.add("Great!");
        positiveWords.add("Wonderful!");
        positiveWords.add("Excellent!");
        positiveWords.add("Good Job!");
        positiveWords.add("Well Done!");
        positiveWords.add("Voondapah!");

        return positiveWords;
    }
}
