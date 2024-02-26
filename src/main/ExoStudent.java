package main;

import main.beans.StudentBean;

public class ExoStudent {

    public static void main(String[] args) {
        StudentBean student = new StudentBean();
        student.name = "toto";
        student.note = 18;




        StudentBean s2 = new StudentBean();
        s2.name = "tata";
        s2.note = 19;

//        printStudent(student);
        //doubleNote(null);
//        printStudent(student);

        printStudent(bestStudent(student, s2));

    }


    //Affiche le nom et la note de l’élève, exemple : Toto : 12
    public static void printStudent(StudentBean e) {
        if (e == null) {
            System.out.println(e);
        } else {
            System.out.println(e.name + " : " + e.note);
        }
    }

    //Double la note de l’élève sans qu'elle ne puisse dépasser 20
//Si la note est à 12 l'élève se retrouve avec 20
    public static void doubleNote(StudentBean e) {
        if (e != null) {
            e.note *= 2;

            if(e.note > 20){
                e.note = 20;
            }
        }
    }

    //Retourne l’élève qui a la meilleur note ou nulle en cas d’égalité
    public static StudentBean bestStudent(StudentBean e1, StudentBean e2) {
        if (e1 == null) {
            return e2;
        } else if (e2 == null) {
            return e1;
        } else if (e1.note > e2.note) {
            return e1;
        } else if (e1.note < e2.note) {
            return e2;
        }

        return null;
    }
}
