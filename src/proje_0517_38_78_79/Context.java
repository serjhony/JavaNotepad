package proje_0517_38_78_79;

/**
 *
 * @author {Sercan Bayram:05170000038, Egemen Aydın:05170000078, Oğuz Türk:05170000079} 
 */
public class Context {
    // Strategy pattern'ındeki context görevinde kullanılan class.
    private Strategy strategy;
    
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public String execute(String word){
        return strategy.changeWord(word);
    }
}
