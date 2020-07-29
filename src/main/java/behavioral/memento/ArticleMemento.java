package main.java.behavioral.memento;

public class ArticleMemento {

	private String author;
	private String content;

	public ArticleMemento(String author, String content) {
		this.author = author;
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}
}
