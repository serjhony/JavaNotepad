package proje_0517_38_78_79;


public class GeriAlmaCommand implements Command {
    /* Geri alma işleminde command pattern kullanılmıştır.
    Bu class'ta geri alma işlemi için Command interface'i override edilmiştir.
    */
    GeriAll geriAll=new GeriAll();

    
    public GeriAlmaCommand() {
        this.geriAll=geriAll;
    }
        @Override

    public void execute() {
        geriAll.SonHarfiSil();
        
    }
    
}
