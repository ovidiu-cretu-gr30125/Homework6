package isp.lab6.exercise2;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class addWordTest {
    @Test
    public void addWordTest(){
        DictionarySingleton d1 = DictionarySingleton.getINSTANCE();
        Word w1 = new Word("PC");
        WordDescription wd1 = new WordDescription("electronics");
        assertEquals(true,d1.addWord(w1,wd1));
    }
}
