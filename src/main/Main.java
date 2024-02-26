package main;


import main.beans.CountryBean;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CountryBean c = new CountryBean("France", 100000, 5000);
        CountryBean c2 = new CountryBean();


    }



    public static int minuteToSecond(int minute) {
        return minute * 60;
    }

    public static int multiply(int p1, int p2) {
        //Affichage
        System.out.println("p1*p2=" + (p1 * p2));

        //Retourne la valeur, mais ici ne compile pas,
        //car ce n'est pas le typage attendu (String au lieu de int)
        return p1 * p2;
    }

    public static void boulangerieInteractive() {

        //Demande un nombre dans la console à un utilisateur et le met dans nombre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre de croissant: ");
        int nbC = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre de baguette : ");
        int nbB = scanner2.nextInt();
        scanner2.nextLine(); // Pour consommer le retour à la ligne

        boulangerie(nbC, nbB);
    }

    public static void boulangerie(int nbCroissant, int nbBaguette) {

        double total = nbCroissant * 1.1 + nbBaguette * 0.9;

        System.out.println("Total : " + total);

    }


    public static void crepesInteractive() {

        //Demande un nombre dans la console à un utilisateur et le met dans nombre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre de crèpes: ");
        int nbC = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne
        crepes(nbC);

    }


    public static void crepes(int nbCrepe) {
        int farine = 20 * nbCrepe;
        int oeufs = nbCrepe / 5;

        System.out.println("Pour " + nbCrepe + " crêpes il faut :");
        System.out.println("-" + farine + "g de farine");
        System.out.println("-" + oeufs + " oeufs");
    }

    public static void exo1() {
        int i = 7;
        int j = 3;

        int divEnt = i / j;
        System.out.println("divEnt=" + divEnt);

        int reste = i % j;
        System.out.println("reste=" + reste);

        double divClassic = (double) i / j;
        System.out.println("divClassic=" + divClassic);

        System.out.println("sum=" + (divEnt + reste + divClassic));
    }

}