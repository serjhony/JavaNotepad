 package proje_0517_38_78_79;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;


public class swappingStrategy implements Strategy {
    /* Bu class'ta kelimeleri düzeltmek için kelime yazımı sırasında...
    iki harfin yer değiştirmiş olma ihtimali kontrol edilir.
    Her harf çifti için 'swapping' stratejisi uygulanır.
    */

    @Override
    public String changeWord(String word) {
        String temp = word; 
        Content searcher = new Content();
        /* Bu döngüde her karakterin bir sonraki ile yer değiştirilmesiyle...
        elde edilen kelime arama algoritmasına gönderilir.
        Kelime düzeltilemez ise ilk hâli döndürülür.
        */
        for (CharacterIterator it = new StringCharacterIterator(word);it.getIndex()<word.length()-1;it.next()) {
           temp=word.substring(0,it.getIndex())+word.charAt(it.getIndex()+1)+word.charAt(it.getIndex())+word.substring(it.getIndex()+2);
           
            if(searcher.varMi(temp)){
             
             return temp;
            }
            
        }
        
        return word;
    }
    
    
}
