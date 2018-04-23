package org.columbia.service;

import org.columbia.entity.PartOfSpeech;

import java.util.List;

interface PartOfSpeechBuilder {
    PartOfSpeech build();
    PartOfSpeechBuilder setText(final String text);
    PartOfSpeechBuilder setArticles(final List<String> articles);
    PartOfSpeechBuilder setPrepositions(final List<String> prepositions);
    PartOfSpeechBuilder setVerbs(final List<String> verbs);
    PartOfSpeechBuilder setNouns(final List<String> nouns);
    PartOfSpeechBuilder setAdjectives(final List<String> adjectives);
}

