package blockchain.socialmedia.octotelegram;

import java.time.LocalDateTime;
import java.util.Date;

public class OctoTelegram {
	
	
	public static void PostTelegram(String title, String content, User author) {
		LocalDateTime date = java.time.LocalDateTime.now();
		Post post = new Post(title,content,date,author);
	}
	
}
