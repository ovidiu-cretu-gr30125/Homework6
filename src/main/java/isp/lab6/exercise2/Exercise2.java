package isp.lab6.exercise2;

public class Exercise2 {

    public static void main(String[] args) {
            DictionarySingleton d1 = DictionarySingleton.getINSTANCE();
            Word w1 = new Word("PC");
            WordDescription wd1 = new WordDescription("electronics");
            d1.addWord(w1,wd1);
            System.out.println(d1.searchWord(w1));
            Word w2 = new Word("phone");
            d1.searchWord(w1).addWordSynonym(w2);
            System.out.println(d1.findSynonyms(w1).toString());
            d1.deleteWord(w1);
            System.out.println((d1.searchWord(w1)));
            System.out.println(d1.searchWord(w2));
            System.out.println(d1.searchWord(w1));

    }
}
