package main.dictee;

public class Dictee {


    public static void main(String[] args) {
        //    Ajoutez la méthode de départ main
//    Elle appellera m2
        m2();
        double v = m3(12,8.5);
//    puis m3 avec les valeurs 12 et 8,5 et mettra le résultat dans une variable v

//    Elle appellera m1 avec v casté en entier
        m1((int)v) ;

    }

//    Créer 3 méthodes public static ne retournant rien m1, m2 et m3
    public static void m1(int p1){
        //    Ajouter un paramètre p1 à m1 de type int
        //    m1 affiche dans sa console p1= et la valeur de p1
        System.out.println("p1=" + p1);
    }
    public static void m2(){
        //    Ajouter une variable v1 dans m2 de type long initialisé à 3
        long v1 = 3;
        //    Idem pour m2 avec v1
        System.out.println("v1=" + v1);
    }
    public static double m3(double p1, double p2){
        //    Ajouter 2 paramètres p1 et p2 à m3 de type double
        //    Faites évoluer m3 pour qu'elle retourne la somme de p1 et p2
        return p1 + p2;
    }










}
