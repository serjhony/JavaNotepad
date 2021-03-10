package proje_0517_38_78_79;

import static proje_0517_38_78_79.NewJFrame.textArea;

/**
 *
 * @author {Sercan Bayram:05170000038, Egemen Aydın:05170000078, Oğuz Türk:05170000079} 
 */
public class LightThemeDecorator extends ThemeDecorator {
    //Aydınlık tema için görsel düzenlemeleri yapan class
    public LightThemeDecorator(Theme decoratedTheme) {
        super(decoratedTheme);
    }
    
    @Override
    public void tema(){
        decoratedTheme.tema();
        setLight(decoratedTheme);
    }
    private void setLight(Theme decoratedTheme){
        textArea.setBackground(new java.awt.Color(255, 255, 255));
        textArea.setForeground(new java.awt.Color(0, 0, 0));
        
    }
}
