package org.columbia.service;

import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.simple.*;
import org.columbia.entity.PartOfSpeech;
import org.columbia.entity.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LanguageService {

    /**
     * Let's start putting together our NLP services! :)
     */

    final private String nounPattern = "NN";
    final private String adjectivePattern = "JJ";

    private PartOfSpeechBuilderImpl builder;

    //should return an entity ...
    public List<PartOfSpeech> parseEnglishSentence(Text text) {

        ArrayList<PartOfSpeech> posList = new ArrayList<>();

        Document doc = new Document(text.getText());
        /**
         * This will iterate over sentences
         * Let's use a builder pattern?
         */
        for (Sentence sentence : doc.sentences()) {
            SemanticGraph graph = sentence.dependencyGraph();
            System.out.println("analyzing: \"" + sentence.text() + "\"");
            System.out.println(sentence.parse());
            System.out.println(sentence.dependencyGraph().getAllNodesByPartOfSpeechPattern(nounPattern));

            posList.add(builder.setNouns(graph.getAllNodesByPartOfSpeechPattern(nounPattern))
                               .setAdjectives(graph.getAllNodesByPartOfSpeechPattern(adjectivePattern))
                               .build());

        }

        /**
         * What do we want? NER and POS returned as a JSON entity?
         */

        return posList;
    }
}
