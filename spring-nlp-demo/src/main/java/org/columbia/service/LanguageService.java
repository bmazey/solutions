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
     * Check this link out for more info on the REGEX patterns below ...
     * https://stackoverflow.com/questions/1833252/java-stanford-nlp-part-of-speech-labels
     *
     * Not sure about "DT" for article pattern
     */

    final private String NOUN_PATTERN = "NN.*";
    final private String ADJ_PATTERN = "JJ.*";
    final private String VERB_PATTERN = "V.*";
    final private String PREP_PATTERN = "IN";
    final private String ART_PATTERN = "DT";

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

            //TODO - figure out a way to clean up the word tokens (ie: "tall/JJ")
            posList.add(new PartOfSpeechBuilderImpl().setSentence(sentence.text())
                                                     .setNouns(graph.getAllNodesByPartOfSpeechPattern(NOUN_PATTERN))
                                                     .setAdjectives(graph.getAllNodesByPartOfSpeechPattern(ADJ_PATTERN))
                                                     .setVerbs(graph.getAllNodesByPartOfSpeechPattern(VERB_PATTERN))
                                                     .setPrepositions(graph.getAllNodesByPartOfSpeechPattern(PREP_PATTERN))
                                                     .setArticles(graph.getAllNodesByPartOfSpeechPattern(ART_PATTERN))
                                                     .build());

        }

        /**
         * What do we want? NER and POS returned as a JSON entity?
         */

        return posList;
    }
}
