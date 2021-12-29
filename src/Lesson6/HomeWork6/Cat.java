package Lesson6.HomeWork6;

public class Cat extends Animals {

    public static String kind = "Cat";

    public Cat(String kind,String name, float run, float swim) {
        super(kind, name, run, swim);
    }

    @Override
    protected int swim(float length){
        return Animals.SWIM_NOBODY;
    }



}
