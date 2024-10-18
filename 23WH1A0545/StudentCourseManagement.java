package cse545;
class CourseManagementException extends Exception {

 public CourseManagementException(String message) {

     super(message);

 }

}
class Course {

 private String id;

 private String name;

 private double price;

 public Course(String id, String name, double price) {

     this.id = id;

     this.name = name;

     this.price = price;

 }

 public String getId() {

     return id;

 }



 public void setId(String id) {

     this.id = id;

 }



 public String getName() {

     return name;

 }



 public void setName(String name) {

     this.name = name;

 }



 public double getPrice() {

     return price;

 }



 public void setPrice(double price) {

     this.price = price;

 }

}


interface StudentCourse {

 void addCourse(Course course) throws CourseManagementException;

 Course[] viewCourses() throws CourseManagementException;

 double addFee(double fee) throws CourseManagementException;

}
class Semester implements StudentCourse {

 private Course[] courses;

 private int courseCount;

 private static final int MAX_COURSES = 10;



 public Semester() {

     this.courses = new Course[MAX_COURSES];

     this.courseCount = 0;

 }



 @Override

 public void addCourse(Course course) throws CourseManagementException {

     if (courseCount >= MAX_COURSES) {

         throw new CourseManagementException("Course limit reached. Cannot add more courses.");

     }

     courses[courseCount++] = course;

 }



 @Override

 public Course[] viewCourses() throws CourseManagementException {

     if (courseCount == 0) {

         throw new CourseManagementException("No courses available.");

     }

     return courses;

 }



 @Override

 public double addFee(double fee) throws CourseManagementException {

     if (fee < 1000 || fee > 3000) {

         throw new CourseManagementException("Fee must be between 1000 and 3000.");

     }

     double discount = 0;

     if (fee > 1500) {

         discount = fee * 0.10; // 10% discount

     }

     return fee - discount;

 }

}


public class StudentCourseManagement {

 public static void main(String[] args) {

     try {

         Semester semester = new Semester();


         semester.addCourse(new Course("CS101", "Computer Science", 2000));

         semester.addCourse(new Course("MATH101", "Mathematics", 1500));



         Course[] courses = semester.viewCourses();

         System.out.println("Available Courses:");

         for (Course course : courses) {

             if (course != null) {

                 System.out.println("ID: " + course.getId() + ", Name: " + course.getName() + ", Price: " + course.getPrice());

             }

         }


         double fee = semester.addFee(2500);

         System.out.println("Final fee after discount: " + fee);

     } catch (CourseManagementException e) {

         System.err.println(e.getMessage());

     }

 }

}
