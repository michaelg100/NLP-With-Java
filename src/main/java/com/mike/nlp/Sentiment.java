package com.mike.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class Sentiment {

    public static void main(String[] args){

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "this is the first text";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for (CoreSentence sentence : sentences){
            String sentiment = sentence.sentiment();
            System.out.println(sentence + "\n" + sentiment);
        }

    }
}
