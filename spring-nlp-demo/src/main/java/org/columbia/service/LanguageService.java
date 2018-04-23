package org.columbia.service;

import edu.stanford.nlp.simple.*;
import org.columbia.entity.PartOfSpeech;
import org.columbia.entity.Text;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LanguageService {

    /**
     * Let's start putting together our NLP services! :)
     */
    final String nounPattern = "NN";
    final String adjectivePattern = "JJ";

    //should return an entity ...
    public List<PartOfSpeech> parseEnglishSentence(Text text) {

        ArrayList<PartOfSpeech> posList = new ArrayList<>();

        Document doc = new Document(text.getText());
        /**
         * This will iterate over sentences
         * Let's use a builder pattern?
         */
        for (Sentence sentence : doc.sentences()) {
            System.out.println("analyzing: \"" + sentence.text() + "\"");
            System.out.println(sentence.parse());
            System.out.println(sentence.dependencyGraph().getAllNodesByPartOfSpeechPattern(nounPattern));
        }

        /**
         * What do we want? NER and POS returned as a JSON entity?
         */

        return posList;
    }
}
