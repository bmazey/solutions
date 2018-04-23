package org.columbia.service;

import edu.stanford.nlp.simple.Sentence;
import org.columbia.dto.GreetingDTO;
import org.springframework.stereotype.Component;

@Component
public class LanguageService {

    /**
     * Let's start putting together our NLP services! :)
     */

    public void parseEnglishSentence(String s) {
        Sentence sentence = new Sentence(s);
        System.out.println(sentence.posTags());
    }
}
