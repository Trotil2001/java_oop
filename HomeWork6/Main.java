import Interface.IPersister;
import Interface.IReport;

public class Main{
	public static void main(String[] args){
		User user = new User("Bob");

		IReport iReport = new UserReport(user);
		iReport.report();
		IPersister iPersister = new Persister(user);
		iPersister.save();
	}
}