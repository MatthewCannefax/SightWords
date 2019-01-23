package com.matthewcannefax.sightwords.model;

import android.graphics.Color;

import java.util.List;

public class WordGroup {
    private List<SightWord> sightWords;
    private String groupName;
    private int groupID;
    private GroupDifficulty difficulty;


    public WordGroup(){}

    public WordGroup(String groupName, int groupID, GroupDifficulty difficulty, List<SightWord> sightWords){
        this.groupName = groupName;
        this.groupID = groupID;
        this.difficulty = difficulty;
        this.sightWords = sightWords;
    }

    public List<SightWord> getSightWords() {
        return sightWords;
    }

    public void setSightWords(List<SightWord> sightWords) {
        this.sightWords = sightWords;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public GroupDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(GroupDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return groupName;
    }
}
