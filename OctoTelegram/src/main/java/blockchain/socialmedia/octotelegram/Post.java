package blockchain.socialmedia.octotelegram;

import java.util.Date;

public class Post {
	
	private String title, content;
	private Date timecode;
	private long id; // timecode ddmmyyyyhhmm
	private User author;

	public Post(String title, String content, Date timecode, User author){
		this.title = title;
		this.content = content;
		this.timecode = timecode;
		this.author = author;

		String contents = title + content + timecode + author.getUsername();
		this.id = contents.hashCode();
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

	public Date getTimecode() {
		return timecode;
	}

	public User getAuthor() {
		return author;
	}
}
