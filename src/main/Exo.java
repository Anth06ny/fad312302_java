package main;

import java.util.Scanner;

public class Exo {

    public static void main(String[] args) {

//        int toto = 3;
//        int res = max(1,2,toto);
//        System.out.println("res=" + res);

        char d =  charAt3("abcd");
        System.out.println("d=" + d);

    }

    public static char charAt3(String toto){
        if(toto.length() < 3) {
            return '?';
        }

        char c = toto.charAt(2);
        return c;
    }


    public static void maxInteractive() {

        //Demande un nombre dans la console à un utilisateur et le met dans nombre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre : ");
        int a = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        System.out.print("Veuillez entrer un nombre : ");
        int b = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        System.out.print("Veuillez entrer un nombre : ");
        int c = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        System.out.println("Le max est " + max(a, b, c));



    }

    public static int max(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }

    }

}
