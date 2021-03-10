package proje_0517_38_78_79;

import static proje_0517_38_78_79.NewJFrame.textArea;

/**
 *
 * @author {Sercan Bayram:05170000038, Egemen Aydın:05170000078, Oğuz Türk:05170000079} 
 */
public class GeriAll {
    // Geri alma fonksiyonu
     public void SonHarfiSil(){
        String temp=textArea.getText();
        int L = temp.length();
        if(L>1) textArea.setText(temp.substring(0,L-1));
        
        
    }
    
}
