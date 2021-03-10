package proje_0517_38_78_79;

import static proje_0517_38_78_79.NewJFrame.textArea;

/**
 *
 * @author {Sercan Bayram:05170000038, Egemen Aydın:05170000078, Oğuz Türk:05170000079} 
 */
public class DarkThemeDecorator extends ThemeDecorator {
    // Karanlık tema için görsel düzenlemeleri yapan class
    public DarkThemeDecorator(Theme decoratedTheme) {
        super(decoratedTheme);
    }
    @Override
    public void tema(){
        decoratedTheme.tema();
        setDark(decoratedTheme);
    }
    private void setDark(Theme decoratedTheme){
        textArea.setBackground(new java.awt.Color(0, 0, 0));
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        
        
        
    }
}
