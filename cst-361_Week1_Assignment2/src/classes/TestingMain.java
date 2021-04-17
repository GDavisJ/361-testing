package classes;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import classes.Singleton;
import classes.UserDaoImpl;
import classes.NameRepository;

@RequestScoped
@Named
public class TestingMain  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Singleton Pattern
	public String printSingleton() {
		System.out.println("Singleton Pattern:");
		Singleton singleObj = Singleton.getInstance();
		
		singleObj.showMessage();
		return "success";
	}
	
	//Dao Pattern
	public String getUsers() {
		System.out.println("DAO Pattern:");
		UserDao userDao = new UserDaoImpl();

	      //print all users
	      for (User user : userDao.getAllUsers()) {
	         System.out.println("Username : " + user.getUsername() + ", Password : " + user.getPassword());
	      }
		return "success";
	}
	
	//Iterator Pattern
	public String printNames() {
		System.out.println("Iterator Pattern:");
		NameRepository namesRepository = new NameRepository();
		for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      }
		return "success";
	}
	
}
