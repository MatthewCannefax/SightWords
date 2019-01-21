package com.matthewcannefax.sightwords.model;

public class SightWord {
    private String word;
    private boolean isCorrect;
    private int streak;

    public SightWord() {
    }

    public SightWord(String word) {
        this.word = word;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int getStreak() {
        return streak;
    }

    public void incrementStreak() {
        this.streak++;
    }

    public void streakBroken(){
        this.streak = 0;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getUpper(){
        return word.toUpperCase();
    }

    public String getLower(){
        return word.toLowerCase();
    }

    @Override
    public String toString() {
        return word;
    }
}
