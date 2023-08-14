/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;
import java.util.Scanner;
/**
 *
 * @author carol
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
static Students addStudent(){
    Scanner in = new Scanner(System.in);
    String firstName;
    String lastName;
    //String studentID;
    int gradeLevel;
    System.out.println("Student Name: ");
    firstName = in.nextLine();
    System.out.println("Student Last Name: ");
    lastName = in.nextLine();
    System.out.println("Student Grade Level: ");
    gradeLevel = in.nextInt();
    Students student = new Students(firstName, lastName, gradeLevel);
    student.addStudentID();
    return student;
}    
    public static void main(String[] args) {
        // TODO code application logic here
        int choice = 0;
        int index = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Student Management Menu");
        Students[] students = new Students[1000];
        do {
            System.out.println("1. ADD A STUDENT \n2. REMOVE A STUDENT \n3.DISPLAY ALL STUDENTS \n4.EXIT");
            choice = in.nextInt();
            if (choice == 1){
                students[index] = addStudent();
                index++;
            }
            else if (choice == 2){
                System.out.println("welp\n");
            }
            else if(choice == 3){
                for(int i=0;i<index;i++){
                    students[i].display();
                }
            }
        }while(choice != 4);
    }

}
