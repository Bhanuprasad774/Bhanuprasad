package Project;
import java.util.ArrayList;

public class userOperations {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userOperations obj = new userOperations();
		ArrayList<User> Users = new ArrayList<User>();
		
	User userObj = obj.createUsers();
		obj.add(userObj);

	}
	

	
	
	User createUsers() {
		User user1 = new User();
		return user1;
	}
void add(User userObj) {
	users.add(userObj);
}

void printUser(){
}
void deleteUser(){
}
}