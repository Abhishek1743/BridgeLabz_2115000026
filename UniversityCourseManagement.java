import java.util.*;

// Abstract class representing a course type
abstract class CourseType{
    private String courseName;
    
    public CourseType(String courseName){
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    @Override
    public String toString(){
        return getClass().getSimpleName() + " - " + courseName;
    }
}

// Specific course types extending CourseType
class ExamCourse extends CourseType{
    public ExamCourse(String courseName){
        super(courseName);
    }
}

class AssignmentCourse extends CourseType{
    public AssignmentCourse(String courseName){
        super(courseName);
    }
}

class ResearchCourse extends CourseType{
    public ResearchCourse(String courseName){
        super(courseName);
    }
}

// Generic class for course management
class Course<T extends CourseType>{
    private List<T> courses = new ArrayList<>();
    
    public void addCourse(T course){
        courses.add(course);
    }
    
    public List<T> getCourses(){
        return courses;
    }
}

// Utility class to display courses with wildcard
class CourseUtils{
    public static void displayCourses(List<? extends CourseType> courses){
        for (CourseType course : courses){
            System.out.println(course);
        }
    }
}

// Main class
public class UniversityCourseManagement{
    public static void main(String[] args){
		
        // Creating course management for different types
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));
        
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Programming"));
		assignmentCourses.addCourse(new AssignmentCourse("DSA"));
        assignmentCourses.addCourse(new AssignmentCourse("Sorting Algorithms"));
        
        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing"));
        
        // Display courses
        System.out.println("Exam-Based Courses:");
        CourseUtils.displayCourses(examCourses.getCourses());
        
        System.out.println("\nAssignment-Based Courses:");
        CourseUtils.displayCourses(assignmentCourses.getCourses());
        
        System.out.println("\nResearch-Based Courses:");
        CourseUtils.displayCourses(researchCourses.getCourses());
    }
}