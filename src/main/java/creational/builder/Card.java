package main.java.creational.builder;

public class Card {

	private final String type;
	private final String number;
	private final String name;
	private final int expirationDate;
	private final boolean isCredit;

	private Card(CardBuilder cardBuilder) {
		this.type = cardBuilder.type;
		this.number = cardBuilder.number;
		this.name = cardBuilder.name;
		this.expirationDate = cardBuilder.expirationDate;
		this.isCredit = cardBuilder.isCredit;
	}

	public String getType() {
		return type;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getExpirationDate() {
		return expirationDate;
	}

	public boolean isCredit() {
		return isCredit;
	}

	@Override
	public String toString() {
		return "Card{" +
			"type='" + type + '\'' +
			", number='" + number + '\'' +
			", name='" + name + '\'' +
			", expirationDate=" + expirationDate +
			", isCredit=" + isCredit +
			'}';
	}

	public static class CardBuilder {

		private String type;
		private String number;
		private String name;
		private int expirationDate;
		private boolean isCredit;

		public CardBuilder(String type, String number) {
			this.type = type;
			this.number = number;
		}

		public CardBuilder name(String name) {
			this.name = name;
			return this;
		}

		public CardBuilder expirationDate(int expirationDate) {
			this.expirationDate = expirationDate;
			return this;
		}

		public CardBuilder isCredit(boolean isCredit) {
			this.isCredit = isCredit;
			return this;
		}

		public Card build() {
			return new Card(this);
		}
	}

}
