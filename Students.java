/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author carol
 */
public class Students {
    private int studentID;
    private String firstName;
    private String lastName;
    private int gradeLevel;
    public Students(String f, String l, int g){
        //this.studentID++;
        this.firstName = f;
        this.lastName = l;
        this.gradeLevel = g;
    }
    String getFirstName(){
        return firstName;
    }
    int getStudentID(){
        return studentID;
    }
    String getLastName(){
        return lastName;
    }
    int getGradeLevel(){
        return gradeLevel;
    }
    void setFirstName(String f){
        firstName = f;
    }
    void setLastName(String l){
        lastName = l;
    }
    void setGradeLevel(int g){
        gradeLevel = g;
    }
    int addStudentID(){
        return studentID = studentID +1;
    }
    void display(){
        System.out.println("Student ID: "+getStudentID()+"\n"
                            + "First Name: "+getFirstName()+"\n"
                            + "Last Name: "+getLastName()+"\n"
                            + "Grade Level: "+getGradeLevel()+"\n");
    }
   }

