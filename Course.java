
package javaapplication2;


public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames;
    private static int courseCount;
    
    public Course(String courseTitle, double feesPerStudent){
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
    }
    
    
    public String getCourseTitle() {
        return courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public static int getCourseCount() {
        return courseCount;
    }
   

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public static void setCourseCount(int numCourse) {
        Course.courseCount++;
    }
    
    public int getNoOfStudents(){
        return noOfStudents;
    }
    
    
    public double calcFeesCollected(){
        return feesPerStudent * noOfStudents;
    }
    
    public void addStudent(String studName){
        
    }
}
