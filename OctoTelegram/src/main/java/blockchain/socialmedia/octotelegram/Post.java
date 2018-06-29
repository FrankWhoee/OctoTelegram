package blockchain.socialmedia.octotelegram;

public class Post {
	
	private String title, content;
	private int id, timecode; // timecode ddmmyyyyhhmm
	private User author;

	public Post(String title, String content, int timecode, User author){
		this.title = title;
		this.content = content;
		this.timecode = timecode;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getId() {
		return id;
	}

	public int getTimecode() {
		return timecode;
	}

	public User getAuthor() {
		return author;
	}
}
