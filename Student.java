package JavaKampı.Homework3;

public class Student extends User {
    private String takenCourse;
    private String levelOfProgress;

    public Student(){

    }

    public Student(int id, String name, String surname, String email, String takenCourse, String levelOfProgress) {
        super(id, name, surname, email);
        this.takenCourse = takenCourse;
        this.levelOfProgress = levelOfProgress;
    }

    public String getTakenCourse() {
        return takenCourse;
    }

    public void setTakenCourse(String takenCourse) {
        this.takenCourse = takenCourse;
    }

    public String getLevelOfProgress() {
        return levelOfProgress;
    }

    public void setLevelOfProgress(String levelOfProgress) {
        this.levelOfProgress = levelOfProgress;
    }


}
