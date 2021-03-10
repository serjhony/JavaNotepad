package proje_0517_38_78_79;


public class nearKeysStrategy implements Strategy {
    /* Bu class'ta kelimeleri düzeltmek için kelime yazımı sırasında...
    bir harfe basılmak istenirken komşu bir harfe tıklanmış olabileceği...
    üzerinde durulur. Her harfi komşuları ile değiştirme stratejisi uygulanır.
    */
    @Override
    public String changeWord(String word) {
        if(word.length()>=3){
            
        Content searcher = new Content();
        // Klavye temsili için bir array.
        char keyboard[][] = {{'q','w','e','r','t','y','u','i','o','p','\0','Q','W','E','R','T','Y','U','I','O','P'} 
                           , {'a','s','d','f','g','h','j','k','l','\0','\0','A','S','D','F','G','H','J','K','L','\0'}
                           , {'z','x','c','v','b','n','m','\0','\0','\0','\0','Z','X','C','V','B','N','M','\0','\0','\0'}};
        
        boolean exit=false;
        for (int i = 0; i < word.length(); i++) {
            //Kelime içindeki her harf için tekrarlanacak döngü.
            char word_char=word.charAt(i);
            char temp_char;
            String temp_string=word;
            
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 21; k++) {
                    temp_char = keyboard[j][k]; 
                     
                    if (temp_char==word_char){
                        /* burada kelimenin klavye üstündeki indexi bulunur.
                        üst, alt, sağ ,sol komşuları ile değiştirilerek...
                        yeni oluşan kelime arama algoritmasına gönderilir.
                        */
                        if(j-1>=0 && keyboard[j-1][k]!='\0'){
                            temp_string=word.substring(0,i)+keyboard[j-1][k]+word.substring(i+1);
                            if(searcher.varMi(temp_string)){
                                word=temp_string;
                                exit=true;
                                break;
                            }
                            
                        }
                        if(j+1<3 && keyboard[j+1][k]!='\0'){
                            temp_string=word.substring(0,i)+keyboard[j+1][k]+word.substring(i+1);
                            if(searcher.varMi(temp_string)){
                                word=temp_string;
                                exit=true;
                                break;
                            }
                            
                        }
                        if(k-1>=0 && keyboard[j][k-1]!='\0'){
                            temp_string=word.substring(0,i)+keyboard[j][k-1]+word.substring(i+1);
                            if(searcher.varMi(temp_string)){
                                word=temp_string;
                                exit=true;
                                break;
                            }
                            
                        }
                        if(k+1<21 && keyboard[j][k+1]!='\0'){
                            temp_string=word.substring(0,i)+keyboard[j][k+1]+word.substring(i+1);
                            if(searcher.varMi(temp_string)){
                                word=temp_string;
                                exit=true;
                                break;
                            }
                            
                        }
                        
                    }
                }
                if(exit) break;
            }
             if(exit) break;
        }
        
        }
    // kelime düzeltilemezse ilk hâli döner.
    return word;
    }
    
}
