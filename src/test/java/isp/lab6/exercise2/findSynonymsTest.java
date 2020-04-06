package isp.lab6.exercise2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class findSynonymsTest {
    @Test
    public void findSynonymsTest(){
        DictionarySingleton d1 = DictionarySingleton.getINSTANCE();
        Word w1 = new Word("PC");
        WordDescription wd1 = new WordDescription("electronics");
        d1.addWord(w1,wd1);
        Word w2 = new Word("Iphone");
        d1.searchWord(w1).addWordSynonym(w2);
        assertEquals(d1.searchWord(w1).getSynonyms(),d1.findSynonyms(w1));
    }
}
