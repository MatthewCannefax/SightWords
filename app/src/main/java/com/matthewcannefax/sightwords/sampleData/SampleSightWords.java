package com.matthewcannefax.sightwords.sampleData;

import android.graphics.Color;

import com.matthewcannefax.sightwords.model.GroupDifficulty;
import com.matthewcannefax.sightwords.model.SightWord;
import com.matthewcannefax.sightwords.model.WordGroup;

import java.util.ArrayList;
import java.util.List;

public class SampleSightWords {
    private static List<SightWord> sightWords;
    private static String negativeWord = "Incorrect";
    private static List<String> positiveWords;

    private static WordGroup blueGroup;
    private static WordGroup purpleGroup;
    private static WordGroup yellowGroup;

    private static List<WordGroup> allGroups;

    public static List<WordGroup> getAllGroups(){
        allGroups = new ArrayList<>();

        allGroups.add(getBlueGroup());
        allGroups.add(getPurpleGroup());
        allGroups.add(getYellowGroup());

        return allGroups;
    }

    public static WordGroup getBlueGroup(){
        List<SightWord> sightWords = new ArrayList<>();

        sightWords.add(new SightWord("to"));
        sightWords.add(new SightWord("the"));
        sightWords.add(new SightWord("I"));
        sightWords.add(new SightWord("it"));
        sightWords.add(new SightWord("and"));
        sightWords.add(new SightWord("go"));
        sightWords.add(new SightWord("A"));

        blueGroup.setDifficulty(new GroupDifficulty("Beginners", 1));
        blueGroup.setGroupID(1);
        blueGroup.setGroupName("Blue");

        blueGroup.setSightWords(sightWords);

        return blueGroup;
    }

    public static WordGroup getPurpleGroup(){
        List<SightWord> sightWords = new ArrayList<>();

        sightWords.add(new SightWord("so"));
        sightWords.add(new SightWord("at"));
        sightWords.add(new SightWord("like"));
        sightWords.add(new SightWord("my"));
        sightWords.add(new SightWord("look"));
        sightWords.add(new SightWord("me"));
        sightWords.add(new SightWord("up"));
        sightWords.add(new SightWord("am"));

        purpleGroup.setDifficulty(new GroupDifficulty("Beginners", 1));
        purpleGroup.setGroupName("Purple");
        purpleGroup.setGroupID(2);

        return purpleGroup;
    }

    public static WordGroup getYellowGroup(){
        List<SightWord> sightWords = new ArrayList<>();

        sightWords.add(new SightWord("way"));
        sightWords.add(new SightWord("can"));
        sightWords.add(new SightWord("no"));
        sightWords.add(new SightWord("an"));
        sightWords.add(new SightWord("is"));
        sightWords.add(new SightWord("in"));
        sightWords.add(new SightWord("he"));
        sightWords.add(new SightWord("see"));

        yellowGroup.setGroupID(3);
        yellowGroup.setGroupName("Yellow");
        yellowGroup.setDifficulty(new GroupDifficulty("Beginners", 1));

        yellowGroup.setSightWords(sightWords);

        return yellowGroup;
    }

    public static List<SightWord> sampleWordsList(){
        sightWords = new ArrayList<>();






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
