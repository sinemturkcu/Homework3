package JavaKampı.Homework3;

public class UserManager {

    public void add(User user){
        System.out.println("New person added : " + user.getName() +"" + user.getSurname());
    }
    public void delete(User user){
        System.out.println("The person deleted: " + user.getName() +"" + user.getSurname() );
    }

}
