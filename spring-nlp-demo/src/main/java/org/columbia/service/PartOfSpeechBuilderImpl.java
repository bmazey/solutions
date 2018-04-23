package org.columbia.service;

import edu.stanford.nlp.ling.IndexedWord;
import org.columbia.entity.PartOfSpeech;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
        return this;
    }

    @Override
    public PartOfSpeechBuilder setArticles(List<IndexedWord> articles) {
        pos.setArticles(streamIndexedWords(articles));
        return this;
    }

    @Override
    public PartOfSpeechBuilder setPrepositions(List<IndexedWord> prepositions) {
        pos.setPrepositions(streamIndexedWords(prepositions));
        return this;
    }

    @Override
    public PartOfSpeechBuilder setVerbs(List<IndexedWord> verbs) {
        pos.setVerbs(streamIndexedWords(verbs));
        return this;
    }

    @Override
    public PartOfSpeechBuilder setNouns(List<IndexedWord> nouns) {
        pos.setNouns(streamIndexedWords(nouns));
        return this;
    }

    @Override
    public PartOfSpeechBuilder setAdjectives(List<IndexedWord> adjectives) {
        pos.setAdjectives(streamIndexedWords(adjectives));
        return this;
    }

    private List<String> streamIndexedWords (List<IndexedWord> list) {
        List<String> strings = list.stream()
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());
        return strings;
    }
}
