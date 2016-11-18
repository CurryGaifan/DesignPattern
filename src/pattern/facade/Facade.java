package pattern.facade;

public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void operation(){
        subSystemA.operation();
        subSystemB.operation();
        subSystemC.operation();
    }
}
