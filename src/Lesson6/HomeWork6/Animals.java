package Lesson6.HomeWork6;

public abstract class Animals {
    static final int SWIM_YES = 1;
    static final int SWIM_NO = 2;
    static final int SWIM_NOBODY = 3;

    private String kind;
    protected String name;
    private float run;
    private float swim;

    public Animals(String kind, String name, float run, float swim) {
        this.kind = kind;
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    String getName(){
        return this.name;
    }
    String getKind(){
        return this.kind;
    }
    float getRun(){
        return this.run;
    }
    float getSwim(){
        return this.swim;
    }
    protected boolean run(float length){
        return (length <= run);
    }
    protected int swim(float length){
        return (length <= swim) ? SWIM_YES:SWIM_NO;

    }
}
