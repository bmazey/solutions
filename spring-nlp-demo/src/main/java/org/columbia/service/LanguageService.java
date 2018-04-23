package org.columbia.service;

import edu.stanford.nlp.simple.*;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import org.springframework.stereotype.Component;

@Component
public class LanguageService {

    /**
     * Let's start putting together our NLP services! :)
     */

    public void parseEnglishSentence(String s) {
        //MaxentTagger tagger = new MaxentTagger("edu/stanford/nlp/models/pos-tagger/english-left3words/english-left3words-distsim.tagger");
        Sentence sentence = new Sentence(s);
        System.out.println(sentence.posTags());
    }
}
