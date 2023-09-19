/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import studentmanager.Student;

public class StudentTest {

    @Test
    public void StudentcaptureTest() {
        Student student = new Student();

        String[] Studentinfo = { "Carlos Sainz", "29", "CarlosSainz@ferrari.com", "F12023" };

        student.capture(Studentinfo);

        assertArrayEquals(student.returnStudentInfoArr(1), Studentinfo);

    }

    @Test
    public void TestSearchStudent() {
        Student student = new Student();

        String[] Studentinfo = { "Carlos Sainz", "29", "CarlosSainz@ferrari.com", "F12023" };

        student.capture(Studentinfo);

        String result = student.searchStudent("10112");

        String expected = "Name: " + Studentinfo[0] + System.lineSeparator() + "ID: " + "10112" + System.lineSeparator()
                + "Age: " + Studentinfo[1] + System.lineSeparator() + "Email: " + Studentinfo[2]
                + System.lineSeparator() + "Course: " + Studentinfo[3] + System.lineSeparator()
                + "************************************" + System.lineSeparator();

        assertEquals(result, expected);

    }






    @Test 
    public void TestSearchStudent_StudentNotFound(){

        Student student = new Student();

        String[] Studentinfo = { "Carlos Sainz", "29", "CarlosSainz@ferrari.com", "F12023" };

        student.capture(Studentinfo);

        String result = student.searchStudent("1012313");


        assertEquals("Student not Found", result);

    }



    @Test
    public void TestDeleteStudent() {

        Student student = new Student();

        String[] Studentinfo = { "Carlos Sainz", "29", "CarlosSainz@ferrari.com", "F12023" };

        student.capture(Studentinfo);


        student.delete(10112);


        String result = student.searchStudent("10112");


        assertEquals("Student not Found", result);
        
    }

    @Test
    public void TestStudentAge_StudentAgeValid(){
        boolean valid = Student.checkStudentAge("19");

        assertEquals(valid, true);

    }

    @Test
    public void TestStudentAge_StudentAgeInValid(){
        boolean valid = Student.checkStudentAge("14");

        assertEquals(valid, false);

    }

    @Test
    public void TestStudentAge_StudentAgeInValidCharacter(){
        boolean valid = Student.checkStudentAge("aeasdadd");

        assertEquals(valid, false);

    }







}

