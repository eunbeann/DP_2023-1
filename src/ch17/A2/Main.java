package ch17.A2;
public class Main {
    public static void main(String[] args) {
    	// °üÂû ´ë»ó
        NumberGenerator generator = new RandomNumberGenerator();
        
        // °üÂûÀÚµé
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new FrameObserver();
        
        
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        
        
        generator.execute();
    }
}
