import Interface.IReport;

public class UserReport implements IReport {
    private User user;
    public UserReport(User user){
        this.user = user;
    }
    public void report(){
        System.out.printf("Report for user: %s \n", user.getName());
    }

}
