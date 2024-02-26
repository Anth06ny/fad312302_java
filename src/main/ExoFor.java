package main;

public class ExoFor {

    public static void main(String[] args) {
        testFor();

        String res = withoutE("Une chaine avec Des E");
        System.out.println("res=" + res);
    }

    public static int nbA(String entree) {
        int sortie = 0;

        for (int i = 0; i < entree.length(); i++) {
            char c = entree.charAt(i);
            if (c == 'A' || c == 'a') {
                //sortie = sortie + c;
                sortie++;
            }
        }

        return sortie;
    }

    public static String reverseV2(String entree) {
        String sortie = "";

        for (int i = entree.length()-1; i >= 0;  i--) {
            char c = entree.charAt(i);
            sortie += c;
        }

        return sortie;

    }

    public static String reverse(String entree) {
        String sortie = "";

        for (int i = 0; i < entree.length(); i++) {
            char c = entree.charAt(i);
            sortie = c + sortie;
        }

        return sortie;

    }


    public static String withoutE(String entree) {
        String sortie = "";

        for (int i = 0; i < entree.length(); i++) {
            char c = entree.charAt(i);
            if (c != 'E' && c != 'e') {
                //sortie = sortie + c;
                sortie += c;
            }
        }

        return sortie;

    }

    public static void testFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 5; i <= 12; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 4; i <= 48; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " " + i + " ");
        }

        System.out.println();
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println();
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(i + " ");
            }
        }


    }


}
