package JavaKampı.Homework3;

public class StudentManager {

    public void add(User user){
        System.out.println("New student added : " + user.getName() +"" + user.getSurname());
    }
    public void delete(User user){
        System.out.println("Student deleted: " + user.getName() +"" + user.getSurname() );
    }
    public void showProgressLevel(Student student){
        System.out.println("Student's progress level is: " + student.getLevelOfProgress());
    }
    public void showTakenCourse(Student student){
        System.out.println("Student's taken course :" + student.getTakenCourse());
    }
}
