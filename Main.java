package JavaKampı.Homework3;

public class Main {
    public static void main(String[] args) {

        Student student1= new Student(1,"Sinem", "Türkçü", "sinemturkcuqgmail.com","JAVA", "50");
        Instructor instructor1= new Instructor("Engin","Demiroğ",2 ,"engindemirog@gmail.com");

        UserManager userManager=new UserManager();
        userManager.add(new Student());
        userManager.delete(new Instructor());

        StudentManager studentManager=new StudentManager();
        studentManager.showProgressLevel(student1);
        studentManager.showTakenCourse(student1);



    }
}
