package Tasks_15;

public class Class_B extends Class_A {
    public static void main(String[] args) {
        Class_B myClass = new Class_B();
        myClass.makeAnimalSound();
        myClass.makeTrumpetSound();
        myClass.makeHowlingSound();
        myClass.makeWavesSound();
        myClass.makeScratchingSound();
    }
    public void makeScratchingSound(){
        System.out.println("Making scratching sound");
    }
    public void makeHowlingSound(){
        System.out.println("Making howling sound");
    }


}
