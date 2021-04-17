package classes;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
	
	List<User> users;
	
	public UserDaoImpl(){
	      users = new ArrayList<User>();
	      User user1 = new User("Gary","password1");
	      User user2 = new User("Davis","password2");
	      users.add(user1);
	      users.add(user2);		
	   }

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public User getUser(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
