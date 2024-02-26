package main;

import java.util.Random;

public class ExoTab {

    public static void main(String[] args) {
        int[] tab2 = new int[5];

        fillTab(tab2);

    }

    //Retourne la somme
    public static int sum(int[] tab) {
        int sortie = 0;
        for (int value : tab) {
            sortie += value;
        }
        return sortie;
    }

    //Affiche les valeurs supérieures à la moyenne (ne retourne rien)
    public static void supAverage (int[] tab) {
        double average = average(tab);
        for (int value : tab) {
            if(value > average){
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }


    // Retourne la moyenne
    public static double average (int[] tab) {
        return (double)sum(tab) / tab.length;
    }

    public static void fillTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(100);
        }
    }


    public static void add1(int entier, int[] tab) {
        entier++;
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }

    public static void exo1() {
//        Créer un tableau de taille 5 contenant les valeurs (2, 5, 8, 12 et 20)
        int[] tab = new int[]{2, 5, 8, 12, 20};

//        Afficher la 5ᵉ valeur du tableau
        System.out.println("2/ tab[4]=" + tab[4]);

//        Dans sa case numéro 2 mettre la valeur 12
        tab[2] = 12;

//        Afficher la taille du tableau
        System.out.println("4/ taille=" + tab.length);

//        Pour chaque case, afficher sa position et sa valeur. Ex: 0:3 1:5 3:8
        for (int i = 0; i < tab.length; i++) {
            int v = tab[i];
            System.out.print(i + ":" + v + " ");
        }
        System.out.println();

//        Incrémenter de 1 chaque case {2 ,4, 7} -> { 3, 5, 8}
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] + 1;
        }

//        Afficher l'ensemble des valeurs du tableau Ex: 0 15 3 8
        for (int i = 0; i < tab.length; i++) {
            int v = tab[i];
            System.out.print(i + ":" + v + " ");
        }

//        Faire en sorte que chaque case incrémente de 1 par rapport à sa case précédente. Exemple 1er case 7 -> { 7, 8, 9 ,10 ,11 ,12}
        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[i - 1] + 1;
        }
        System.out.println();


//        Afficher la somme des éléments du tableau
        int sum = 0;
        for (int v : tab) {
            sum += v;
        }

        System.out.println("sum = " + sum);
    }
}
