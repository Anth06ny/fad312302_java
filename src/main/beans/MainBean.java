package main.beans;

public class MainBean {

    public static void main(String[] args) {
        LoadedDiceBean dp = new LoadedDiceBean(4);
        System.out.println("La face pipée est : " + dp.getLoadedFace());
        dp.roll();
        System.out.println("Valeur obtenue : " + dp.getValue());
        DiceBean d = dp;
        System.out.println("Valeur obtenue : " + d.getValue());
        //Vérifier qu'elle méthode roll sera appelée
        d.roll();

        //20 lancées normaux
        DiceBean d2 = new DiceBean();
        for(int i=0; i<20; i++) {
            d2.roll();
            System.out.print(d2.getValue() + " ");
        }
        System.out.println();

        //20 lancées pipées
        d2 = new LoadedDiceBean(6);
        for(int i=0; i<20; i++) {
            d2.roll();
            System.out.print(d2.getValue() + " ");
        }

    }
}
