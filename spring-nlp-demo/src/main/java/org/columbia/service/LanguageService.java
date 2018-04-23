package org.columbia.service;

import edu.stanford.nlp.semgraph.SemanticGraph;
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
     * https://stanfordnlp.github.io/CoreNLP/simple.html
     *
     * Check this link out for more info on the labels below ...
     * https://stackoverflow.com/questions/1833252/java-stanford-nlp-part-of-speech-labels
     *
     * Not sure about "DT" for article label
     */

    final private String NOUN_LABEL = "NN";
    final private String ADJ_LABEL = "JJ";
    final private String VERB_LABEL = "VBZ";
    final private String PREP_LABEL = "IN";
    final private String ART_LABEL = "DT";

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

            //TODO - add logger
            System.out.println("analyzing: \"" + sentence.text() + "\"");
            System.out.println(sentence.parse());

            posList.add(new PartOfSpeechBuilderImpl().setSentence(sentence.text())
                                                     .setNouns(graph.getAllNodesByPartOfSpeechPattern(NOUN_LABEL))
                                                     .setAdjectives(graph.getAllNodesByPartOfSpeechPattern(ADJ_LABEL))
                                                     .setVerbs(graph.getAllNodesByPartOfSpeechPattern(VERB_LABEL))
                                                     .setPrepositions(graph.getAllNodesByPartOfSpeechPattern(PREP_LABEL))
                                                     .setArticles(graph.getAllNodesByPartOfSpeechPattern(ART_LABEL))
                                                     .build());

        }

        /**
         * What do we want? NER and POS returned as a JSON entity?
         */

        return posList;
    }
}
