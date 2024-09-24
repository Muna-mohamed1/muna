package xasid;


public class que1

{
    int courseId;
    String courseName;

    {
       courseId = 2101;
        courseName = "Research method";

            System.out.println("the uniqueId from IIB" + courseId);
            System.out.println("the StudentName from IIB" + courseName);

    }
    public que1(int courseId, String courseName) {
       this.courseId=courseId;
        this.courseName =courseName;


            System.out.println("the uniqueId from constructor" + courseId);
            System.out.println("the StudentName from constructor" +courseName);
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}


