package proje_0517_38_78_79;

/**
 *
 * @author {Sercan Bayram:05170000038, Egemen Aydın:05170000078, Oğuz Türk:05170000079} 
 */
public abstract class ThemeDecorator implements Theme {
    // Decorator pattern için thema'yı override eden decorator class'ı.
    protected Theme decoratedTheme;
    
    public ThemeDecorator(Theme decoratedTheme){
        this.decoratedTheme=decoratedTheme;
    }
    
    
    public void tema() {
        decoratedTheme.tema();
    }
    
}
