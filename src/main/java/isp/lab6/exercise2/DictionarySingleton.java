package isp.lab6.exercise2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionarySingleton{
        private static  DictionarySingleton INSTANCE=null;

        Map<Word,WordDescription> descriptionByWord= new HashMap<>();

        private DictionarySingleton(){ }

        public static DictionarySingleton getINSTANCE(){
            if(INSTANCE==null){
                INSTANCE = new DictionarySingleton();
            }
            return INSTANCE;
        }
        public boolean allSynonymsInDictionary(List<Word> synonyms){
            for(Word w :synonyms){
                if(!INSTANCE.descriptionByWord.containsKey(w));
                return false;
            }
            return true;
        }
        public boolean addWord(Word word,WordDescription wordDescription) {
            if (!INSTANCE.allSynonymsInDictionary(wordDescription.getSynonyms())) return false;
            if (INSTANCE.descriptionByWord.containsKey(word)) {
                INSTANCE.descriptionByWord.remove(word);
                INSTANCE.descriptionByWord.put(word, wordDescription);
                for (Word synonyms : wordDescription.getSynonyms()) {
                    INSTANCE.descriptionByWord.get(synonyms).getSynonyms().add(word);
                }
            } else {
                INSTANCE.descriptionByWord.put(word, wordDescription);
                for (Word synonyms : wordDescription.getSynonyms()) {
                    INSTANCE.descriptionByWord.get(synonyms).getSynonyms().add(word);
                }
            }
            return true;
        }

        public boolean deleteWord(Word word){
            if(INSTANCE.descriptionByWord.containsKey(word)){
               /* for(Word synonyms : INSTANCE.descriptionByWord.get(word).getSynonyms()){
                        if(INSTANCE.descriptionByWord.get(synonyms).getSynonyms().equals(word)){
                            INSTANCE.descriptionByWord.get(synonyms).getSynonyms().remove(word);
                        }
                }*/
                INSTANCE.descriptionByWord.remove(word);
                return true;
            }
            return false;
        }
        public WordDescription searchWord(Word word){
            if(word!=null)
                return INSTANCE.descriptionByWord.get(word);
            else
                return null;
        }
        public List<Word> findSynonyms(Word word){
            if(INSTANCE.descriptionByWord.containsKey(word)){
                return INSTANCE.descriptionByWord.get(word).getSynonyms();
            }
            return null;
        }

}
