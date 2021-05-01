package JavaKampı.Homework3;

public class InstructorManager {

    public InstructorManager(int id, String name, String surname, String email) {
        super();
    }

    public void add(User user){
        System.out.println("New instructor added : " + user.getName() +"" + user.getSurname());
    }

    public void delete(User user){
        System.out.println("Instructor deleted: " + user.getName() +"" + user.getSurname() );
    }
}
