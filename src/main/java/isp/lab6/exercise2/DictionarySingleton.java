package isp.lab6.exercise2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionarySingleton{
        private static  DictionarySingleton INSTANCE=null;

        Map<Word,WordDescription> descriptionByWord= new HashMap<>();

        private DictionarySingleton(){ }

    /**
     * get instance of the singleton dictionary class
     * @return the singleton class
     */
    public static DictionarySingleton getINSTANCE(){
            if(INSTANCE==null){
                INSTANCE = new DictionarySingleton();
            }
            return INSTANCE;
        }

    /**
     * this method verify if there are all the synonyms int the dictionary
     * @param synonyms the list of synonyms
     * @return true if all the word are in the list or false if there ar not all
     */
    public boolean allSynonymsInDictionary(List<Word> synonyms){
            for(Word w :synonyms){
                if(!INSTANCE.descriptionByWord.containsKey(w));
                return false;
            }
            return true;
        }

    /**
     *  this method should override existing word if already exists
     *   If synonyms are provided, all synonyms should already be in the dictionary
     * @param word  the word to add
     * @param wordDescription the description of the word that has to be added
     * @returntrue if the word was successfully added or false if a particular synonym not found in the dictionary
     */
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

    /**
     * this method should delete a word
     * @param word the word that has to be deleted
     * @returnreturn true if word was found and successfully deleted
     */
    public boolean deleteWord(Word word){
            if(INSTANCE.descriptionByWord.containsKey(word)){
                INSTANCE.descriptionByWord.remove(word);
                return true;
            }
            return false;
        }

    /**
     * this method search a word in the HashMap
     * @param word the word that has to be searched
     * @return null if the function could't find the word or the word if the function find it
     */
    public WordDescription searchWord(Word word){
            if(word!=null)
                return INSTANCE.descriptionByWord.get(word);
            else
                return null;
        }

    /**
     * this method should find all the synonyms for the given word
     * @param word the word for which the function has to find all the synonyms
     * @return null if there are not even a synonym or the synonyms of the word if there are
     */
    public List<Word> findSynonyms(Word word){
            if(INSTANCE.descriptionByWord.containsKey(word)){
                return INSTANCE.descriptionByWord.get(word).getSynonyms();
            }
            return null;
        }

}
