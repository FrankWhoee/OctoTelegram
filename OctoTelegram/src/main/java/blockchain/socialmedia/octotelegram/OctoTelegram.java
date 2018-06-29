package blockchain.socialmedia.octotelegram;

import java.util.Date;

public class OctoTelegram {
	
	
	public void PostTelegram(String title, String content, User author) {
		Date date = new Date();
		Post post = new Post(title,content,date,author);
	}
	
}
