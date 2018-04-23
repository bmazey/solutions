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

    //should return an entity ...
    public List<PartOfSpeech> parseEnglishSentence(Text text) {

        ArrayList<PartOfSpeech> poseList = new ArrayList<>();

        //add "document" for multiple sentences here ...
        Sentence sentence = new Sentence(text.getText());
        System.out.println("analyzing: \"" + text.getText() + "\" ... ");
        System.out.println(sentence.dependencyGraph().getAllNodesByPartOfSpeechPattern("NN"));

        /**
         * What do we want? NER and POS returned as a JSON entity?
         */

        return new ArrayList<PartOfSpeech>();
    }
}
