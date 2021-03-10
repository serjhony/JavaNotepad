package proje_0517_38_78_79;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author {Sercan Bayram:05170000038, Egemen Aydın:05170000078, Oğuz Türk:05170000079} 
 */
public class Content {
    //words = ingilizce kelimeler için sözlük , metin = Text Area içeriğini tutar.
    static ArrayList<String> words;
    public String metin="";
    
    public Content(ArrayList<String> words){
        this.words=words;
    }
    public Content(){
        
    }
    
    /* "kelime" değişkeninin noktalama işaretlerinden arındıırlmış string olması beklenmektedir.
        bu string ile word nesnesi oluşturulduktan sonra bu nesne metine eklenir */
    public void  add(String kelime){
        Word temp = new Word(kelime);
        
        metin += temp;
    }
    
    // sözlüğü görselleştirmek için kullandığımız fonksiyon
    public String wordVer(){
        String main="";
       
        
        
        for(Iterator i =words.iterator();i.hasNext();){
            main+=i.next()+"\n";
        }
                return main;
    }
    
    public boolean varMi(String word){
        /* Arama fonksiyonu
         .txt dosyasındaki kelimeler alfabetik sırada olduğu için
         binary search kullanımı uygun görülmüştür.*/
        int deger=1;
        int bas = 0;
        int son = words.size()-1;
        while(deger!=0){
            deger = word.toLowerCase().compareTo(words.get((bas+son)/2));
            
            if (deger>0){
                
                bas = (bas+son)/2;
                }
            if(deger<0){
                son = (bas+son)/2;
                }
            if(bas+1==son && deger !=0){
                return false;
                }
        }
        
        
        return true;
    }
    
    
    
    class Word {
    // word class'ı ; string girdisinin word olmadan önce belirli kontrollerden geçmesini sağlar.    
    private String word;
    
    public Word(String word){
        setWord(word);
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        
        Context context = new Context(new swappingStrategy());
        /* kelime words'de (sözlükte) bulunursa word nesnesi oluşturulur
           bulunamaz ise iki harf değiştirerek elde edilen türevlerinden words içinde olanı aranır.
           hiçbir türevi sözlükte yoksa ilk hâli ile nesne oluşturulur.*/
        if(!varMi(word)){
            word = context.execute(word);
        }
        if(!varMi(word)){
            context = new Context(new excessKeysStrategy());
            word = context.execute(word);
        }
        if(!varMi(word)){
            context = new Context(new nearKeysStrategy());
            word = context.execute(word);
        }
        
        this.word = word;
        
        
        
        
    }
    
    
        
    
        public String toString(){
        return word;
        }
    }
    
    
}

