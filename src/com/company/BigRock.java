package com.company;


public class BigRock {
    private String name;
    private boolean happy = false;

    public BigRock(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }

    public String getHappyMessage(){
//        if(!happy){
//            throw new IllegalStateException();
//        }
        return "I'm happy";
    }

    public int getFavNum(){return 42;}

    public void waitTillHappy(){
        while(!happy){
            // wait
        }
    }
}
