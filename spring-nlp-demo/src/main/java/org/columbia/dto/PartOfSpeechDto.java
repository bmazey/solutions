package org.columbia.dto;

import java.util.ArrayList;

public class PartOfSpeechDto {

    private String sentence;

    //TODO add Optional<?>
    private ArrayList<String> nouns;
    private ArrayList<String> verbs;
    private ArrayList<String> adjectives;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public ArrayList<String> getNouns() {
        return nouns;
    }

    public void setNouns(ArrayList<String> nouns) {
        this.nouns = nouns;
    }

    public ArrayList<String> getAdjectives() {
        return adjectives;
    }

    public void setAdjectives(ArrayList<String> adjectives) {
        this.adjectives = adjectives;
    }

    public ArrayList<String> getVerbs() {
        return verbs;
    }

    public void setVerbs(ArrayList<String> verbs) {
        this.verbs = verbs;
    }
}
