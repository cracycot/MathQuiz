package com.example.mathquiz;

public class MathGenerator {

    public String getProblem() {
        int a = getRandom(-50, 50);
        int b = getRandom(-50, 50);
        return  a + " + " + b;
    }
    public String getResult(){
        return String.valueOf(result);
    }
    public getNoiseResult(){
        return String.valueOf(result + getRandom(-5,5));
    }

    public int getRandom(int max, int min) {
        int random = (int)(Math.random() * (max - min) + min);
        //Log.d("DEBUGGER_TAG", "max: " + max + " min: " + min + " random: " + random);
        return random;
    }
}
