package main.test;

import main.ExoStudent;
import main.beans.StudentBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ExoStudentTest {

    StudentBean[] tabStudent;

    //on peut déclarer un jeu de donnée qu'on pourra utiliser dans tous les tests
    private StudentBean student9;
    private StudentBean student10;
    private StudentBean student11;
    private StudentBean student_5;



    @BeforeEach
    public void initData(){
        tabStudent = new StudentBean[21];
        for (int i = 0; i <tabStudent.length; i++) {
            tabStudent[i] = new StudentBean();
            tabStudent[i].note = i;
        }

        student9 = new StudentBean();
        student9.name = "Toto";
        student9.note = 9;

        student10 = new StudentBean();
        student10.name = "Bob";
        student10.note = 10;

        student11 = new StudentBean();
        student11.name = "Bobby";
        student11.note = 11;

        student_5 = new StudentBean();
        student_5.name = "Tobby";
        student_5.note = -5;
    }


    @Test
    public void doubleNote(){

        for (int i = 0; i < tabStudent.length; i++) {
           ExoStudent.doubleNote(tabStudent[i]);

            assertEquals(Math.min(20, i*2),  tabStudent[i].note);
        }

    }

    @Test
    public void bestStudent() {
        //1er plus grande
        StudentBean res = ExoStudent.bestStudent(student11, student9);
        assertSame(student11, res);

        //2eme plus grande
        res = ExoStudent.bestStudent(student9, student11);
        assertSame(student11, res);

        //Note identique
        res = ExoStudent.bestStudent(student11, student11);
        Assertions.assertNull(res);

        //1er null
        res = ExoStudent.bestStudent(null, student11);
        assertSame(student11, res);

        //2eme null
        res = ExoStudent.bestStudent(student11, null);
        assertSame(student11, res);

        //Les 2 null
        res = ExoStudent.bestStudent(null, null);
        Assertions.assertNull(res);
    }


}
