/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
* 
 * @author Ashlee
 */
public class CollegeCourses {
    private Reports reportS = new Reports();
     public static void main(String[] args) {
        
         CollegeCourses start = new CollegeCourses();
        
        start.addClasses();
    }
    public void addClasses(){
        
        IntroToProgrammingCourse ip = new IntroToProgrammingCourse("Introduction to Programming", "152-107", 2.0, "None", "C-1");
        IntroJavaCourse ij = new IntroJavaCourse("Java Programming", "152-134", 4.0, "Introduction to Programming and Math & Logic");
        AdvancedJavaCourse aj = new AdvancedJavaCourse("Advanced Java Programming", "152-135", 4.0, "Java Programming and Database Concepts");


        College college = new College();    

        college.addNewCourse(ip);
        
        reportS.addData("This course uses Raspberry Pi's. The cart number is: " + ip.getRaspberryPiCartNumber());
        reportS.outputReport();
reportS        
        college.addNewCourse(ij);
        ij.teachBasicsOfProgrammingWithClasses();
        
        college.addNewCourse(aj);
        aj.teachInheritanceContent();
    }
}
