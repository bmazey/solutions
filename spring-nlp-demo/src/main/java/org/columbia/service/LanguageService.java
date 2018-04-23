package org.columbia.service;

import edu.stanford.nlp.simple.*;
import org.columbia.entity.PartOfSpeechEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LanguageService {

    /**
     * Let's start putting together our NLP services! :)
     */

    //should return an entity ...
    public List<PartOfSpeechEntity> parseEnglishSentence(PartOfSpeechEntity posEntity) {

        //add "document" for multiple sentences here ...
        Sentence sentence = new Sentence(posEntity.getText());
        System.out.println("analyzing: \"" + posEntity.getText() + "\" ... ");
        System.out.println(sentence.dependencyGraph().getAllNodesByPartOfSpeechPattern("NN"));

        /**
         * What do we want? NER and POS returned as a JSON entity?
         */

        return new ArrayList<PartOfSpeechEntity>();
    }
}
