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
        Sentence sentence = new Sentence(s);
        System.out.println("analyzing \"" + s + "\" ... ");
        System.out.println(sentence.parse());

        /**
         * What do we want? NER and POS returned as a JSON entity?
         */
    }
}
