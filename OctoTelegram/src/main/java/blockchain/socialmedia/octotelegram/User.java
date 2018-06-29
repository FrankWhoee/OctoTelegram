package blockchain.socialmedia.octotelegram;

import java.util.ArrayList;
import java.util.Date;


public class User {
	
	private Long id;
	private String username;
	private ArrayList<User> friends;
	private Date dateJoined;
	
	
	public User(Long id, String username, ArrayList<User> friends,Date dateJoined) {
		this.id = id;
		this.username = username;
		this.friends = friends;
		this.dateJoined = dateJoined;
	}
	
	public Long getIdLong() {
		return id;
	}
	
	public String getId() {
		return "" + id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public ArrayList<User> getFriends() {
		return friends;
	}
	
}
