package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.List;

public class WordDescription {
    private String description;

    private List<Word> Synonyms= new ArrayList<Word>();

    public WordDescription(String description){
        this.description=description;
    }

    public List<Word> getSynonyms() {
        return Synonyms;
    }

    public String getDescription() {
        return description;
    }

    public void addWordSynonym(Word word){
        Synonyms.add(word);
    }

    @Override
    public String toString() {
        return "WordDescription{" +
                "description='" + description + '\'' +
                ", Synonyms=" + Synonyms +
                '}';
    }
}
