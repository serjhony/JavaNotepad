
package proje_0517_38_78_79;

/**
 *
 * @author {Sercan Bayram:05170000038, Egemen Aydın:05170000078, Oğuz Türk:05170000079} 
 */
public class Invoker {
    /* Tema değiştirmek için kullanılan decorator pattern'deki invoker görevini üstlenen class
     Command fonksiyonunu çalıştırır.
    */
    public  Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void execute(){
	this.command.execute();
	}
}
