package blockchain.socialmedia.octotelegram;

import java.time.LocalDateTime;

public class Post {
	
	private String title, content,displayed;
	private LocalDateTime timecode;
	private long id;
	private User author;

	public Post(String title, String content, LocalDateTime timecode, User author){
		this.title = title;
		this.content = content;
		this.timecode = timecode;
		this.author = author;

		this.content = content;
		displayed = title + "" + "\n" + author.getUsername() + "" + "\n" + timecode + "\n\n" +  content;
		this.id = displayed.hashCode();
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public long getId() {
		return id;
	}

	public LocalDateTime getTimecode() {
		return timecode;
	}

	public User getAuthor() {
		return author;
	}
}
