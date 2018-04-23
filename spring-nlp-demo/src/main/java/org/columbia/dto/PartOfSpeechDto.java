package org.columbia.dto;

import java.util.ArrayList;

public class PartOfSpeechDto {

    private String text;

    private ArrayList<String> Articles;
    private ArrayList<String> Prepositions;
    private ArrayList<String> Nouns;
    private ArrayList<String> Verbs;
    private ArrayList<String> Adjectives;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getNouns() {
        return Nouns;
    }

    public void setNouns(ArrayList<String> nouns) {
        Nouns = nouns;
    }

    public ArrayList<String> getAdjectives() {
        return Adjectives;
    }

    public void setAdjectives(ArrayList<String> adjectives) {
        Adjectives = adjectives;
    }

    public ArrayList<String> getVerbs() {
        return Verbs;
    }

    public void setVerbs(ArrayList<String> verbs) {
        Verbs = verbs;
    }

    public ArrayList<String> getPrepositions() {

        return Prepositions;
    }

    public void setPrepositions(ArrayList<String> prepositions) {
        Prepositions = prepositions;
    }

    public ArrayList<String> getArticles() {

        return Articles;
    }

    public void setArticles(ArrayList<String> articles) {
        Articles = articles;
    }

}
