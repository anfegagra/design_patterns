package main.java.behavioral.memento;

public class Article {

	private String author;
	private String content;

	public Article(String author, String content) {
		this.author = author;
		this.content = content;
	}

	public ArticleMemento createMemento() {
		return new ArticleMemento(author, content);
	}

	public void restoreMemento(ArticleMemento memento) {
		author = memento.getAuthor();
		content = memento.getContent();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
