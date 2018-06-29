package blockchain.socialmedia.octotelegram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
	
	private String title, content,displayed;
	private Date timecode;
	private long id; // timecode ddmmyyyyhhmm
	private User author;

	public Post(String title, String content, Date timecode, User author){
		this.title = title;
		this.content = content;
		this.timecode = timecode;
		this.author = author;

		this.content = content;
		displayed = title + ""
				+ "\n" + author.getUsername() + ""
				+ "\n" + Ref.dateFormat.format(timecode)
				+ "\n\n" +  content;
				;
		this.id = content.hashCode();
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
