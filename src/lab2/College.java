/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import lab1.*;
import java.util.ArrayList;
/**
 *
 * @author Ashlee
 */
public class College {
    //List keeps track of all courses at the college
    private ArrayList<Courses> courseInventory = new ArrayList<>();
    
    public void addNewCourse(Courses courses){
        courseInventory.add(courses);
        System.out.println("New course added for this semester: " + courses.getCourseName());
    }
}
