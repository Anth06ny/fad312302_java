package main.beans;

import java.util.Random;

public class DiceBean {

    private static Random random = new Random();
    //Attributs /field
    private int value;



    public static void main(String[] args) {


        long avant = System.currentTimeMillis();

        int[] resultat = new int[7];


        for (int i = 0; i < 100_000; i++) {
            DiceBean dice = new DiceBean();
            dice.roll();
            resultat[dice.getValue()]++;
            if (dice.getValue() < 1 || dice.getValue() > 6) {
                System.out.println("Valeur incorrecte : " + dice.getValue());
            }
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " : " + resultat[i]);
        }

        long apres = System.currentTimeMillis();
        System.out.println("Durée : " + (apres - avant) + "ms");

    }

    public void roll() {
        value = random.nextInt(6) + 1;
    }


    //Accesseurs : Getter et setter
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
