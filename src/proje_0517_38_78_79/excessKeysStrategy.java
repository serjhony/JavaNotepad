package proje_0517_38_78_79;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;


public class excessKeysStrategy implements Strategy {
    /* Bu class'ta kelimeleri düzeltmek için kelime yazımı sırasında...
    bir harfe iki kere tıklanmış olabileceği kontrol edilir.
    Çift olarak bulunan karakterleri silme stratejisi uygulanır.
    */
    @Override
    public String changeWord(String word) {
        /* Fonksiyona gelen kelimenin her karakteri için döngü kurulmuştur.
        her karakter bir sonraki karakter ile karşılaştırılır.
        Eşleşme varsa sonraki karakter kelimeden çıkarılarak arama yapılır.
        Arama başarılı olursa yeni kelime döndürülür.
        Hiçbir karakter için eşleşme bulunamazsa kelime ilk hâli ile döndürülür.
        */
        String temp=word;
        Content searcher = new Content();
        for(CharacterIterator it = new StringCharacterIterator(word);it.getIndex()<word.length()-1;it.next()){
            if(word.charAt(it.getIndex())==word.charAt(it.getIndex()+1)){
                temp=word.substring(0,it.getIndex())+word.substring(it.getIndex()+1);
                if(searcher.varMi(temp)) return temp;
                else {
                    temp = word;
                    for(int x=it.getIndex()+1;x<word.length()-1;x++){
                        if(word.charAt(x)==word.charAt(x+1)){
                            temp=word.substring(0,x)+word.substring(x+1);
                            if(searcher.varMi(temp)) return temp;
                            }
                        word = temp;
                        }
                    }
                }
            }
        return word;
    }
    
}
