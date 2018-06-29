package blockchain.socialmedia.octotelegram;

import java.util.ArrayList;

public class User {
	
	private Long id;
	private String username;
	private ArrayList<User> friends;
	
	public User(Long id, String username, ArrayList<User> friends) {
		this.id = id;
		this.username = username;
		this.friends = friends;
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
