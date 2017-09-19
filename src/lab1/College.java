/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.ArrayList;
/**
 *
 * @author Ashlee
 */
public class College {
    //couldn't get all parts of lab
    //keeps track of courses at the college
    //private ArrayList<CollegeCourses> courseInventory = new ArrayList<>();
    private Reports reportS = new Reports();
    
    public void addNewCourse(CollegeCourses collegeCourses){
        //courseInventory.add(collegeCourses);
        reportS.addData("New course added for this semester: ");
    }
    
    public void outputNewCourseReport(){
        reportS.outputReport();
        reportS.clearReport();
    }
}
