package main;

import main.beans.HouseBean;

import java.util.Random;

public class ExoHouse {








    public static void main(String[] args) {

        HouseBean[] tab = new HouseBean[5];
        createHouses(tab);
        printHouses(tab);
    }


    /* -------------------------------- */
    // Tableau
    /* -------------------------------- */

    //Créer une maison dans chaque case du tableau avec des largeurs et longueurs aléatoires
    public static void createHouses(HouseBean[] tab) {
        if (tab != null) {
            for (int i = 0; i < tab.length; i++) {
                tab[i] = new HouseBean();
                tab[i].setWidth(new Random().nextInt(100));
                tab[i].setLength(new Random().nextInt(100));
            }
        }
    }


    //Affiche les maisons du tableau avec leur taille. 1 maison par ligne ex : 18x24
    public static void printHouses(HouseBean[] tab) {
        if (tab != null) {
            for (HouseBean houseBean : tab) {
                printHouse(houseBean);
            }
        }

    }

    //Retourne la maison la plus grande (Longueur * largeur). La 1ere en cas d'égalité
    public static HouseBean bigHouses(HouseBean[] tab) {
        HouseBean max = null;

        if(tab != null) {
            for (HouseBean houseBean : tab) {
                //V1
                if (max == null) {
                    max = houseBean;
                } else if (houseBean == null) {

                } else if (max.getArea() < houseBean.getArea()) {
                    max = houseBean;
                }

                //V2
//            if (max == null
//                    ||
//                    (houseBean != null && max.length * max.width < houseBean.length * houseBean.width)
//            ) {
//                max = houseBean;
//            }


            }
        }

        return max;
    }

    /* -------------------------------- */
    // Unitaire
    /* -------------------------------- */

    //Affiche la largeur, longueur de la maison ou Null  : Exemple attendu :     12x25
    public static void printHouse(HouseBean m) {
        if (m != null) {
            System.out.println(m.getWidth() + "x" + m.getLength());
        } else {
            System.out.println("Null");
        }
    }

    //Double la taille de la maison. (N'affiche rien)
    public static void doubleHouse(HouseBean m) {
        if (m != null) {
            m.setWidth(m.getWidth() * 2);
            m.setLength(m.getLength() *  2);
        }
    }

    //Retourne la maison la plus grande, et null si de la même taille. N'affiche rien
    public static HouseBean bigHouse(HouseBean m1, HouseBean m2) {
        if (m1 == null) {
            return m2;
        } else if (m2 == null) {
            return m1;
        } else if (m1.getArea() < m2.getArea()) {
            return m2;
        } else if (m1.getArea() > m2.getArea()) {
            return m1;
        } else {
            return null;
        }
    }


    public static void exo1() {
//        Créer une variable m de type HouseBean initialisée avec null
        HouseBean m = null;

//        Afficher m dans la console
        System.out.println(m);

//        Créer(new) une maison et la mettre dans m
        m = new HouseBean();

//        Afficher m dans la console
        System.out.println(m);

//        Définir la largeur de m à 5
        m.setWidth(5);

//        Afficher la largeur de m dans la console
        System.out.println("La largeur est : " + m.getWidth());

//        Créer une variable m2 et lui assigner m
        HouseBean m2 = m;


//        Afficher m2 et la largeur de m2
        System.out.println("La largeur est : " + m2.getWidth());


//        Changer la largeur de m2 à 10
        m2.setWidth(10);

//        Afficher la largeur de m et de m2
        System.out.println("m.width=" + m.getWidth() + " \nm2.width=" + m2.getWidth());
    }


}
