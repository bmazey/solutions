package org.columbia.service;

import org.columbia.entity.PartOfSpeech;

import java.util.List;

class PartOfSpeechBuilderImpl implements PartOfSpeechBuilder {

    private PartOfSpeech pos;

    public PartOfSpeechBuilderImpl() {
        pos = new PartOfSpeech();
    }

    @Override
    public PartOfSpeech build() {
        return pos;
    }

    @Override
    public PartOfSpeechBuilder setText(String text) {
        pos.setText(text);
        return null;
    }

    @Override
    public PartOfSpeechBuilder setArticles(List<String> articles) {
        pos.setArticles(articles);
        return null;
    }

    @Override
    public PartOfSpeechBuilder setPrepositions(List<String> prepositions) {
        pos.setPrepositions(prepositions);
        return null;
    }

    @Override
    public PartOfSpeechBuilder setVerbs(List<String> verbs) {
        return null;
    }

    @Override
    public PartOfSpeechBuilder setNouns(List<String> nouns) {
        return null;
    }

    @Override
    public PartOfSpeechBuilder setAdjectives(List<String> adjectives) {
        return null;
    }
}
