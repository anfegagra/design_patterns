package main.java;

import main.java.behavioral.chainofresponsibility.LoanCard;
import main.java.behavioral.command.CreditCardActivateCommand;
import main.java.behavioral.command.CreditCardDeactivateCommand;
import main.java.behavioral.command.CreditCardInvoker;
import main.java.behavioral.interpreter.AndExpression;
import main.java.behavioral.interpreter.Expression;
import main.java.behavioral.interpreter.OrExpression;
import main.java.behavioral.interpreter.TerminalExpression;
import main.java.behavioral.iterator.CardList;
import main.java.behavioral.iterator.Iterator;
import main.java.behavioral.iterator.List;
import main.java.behavioral.mediator.ConcreteColleague1;
import main.java.behavioral.mediator.ConcreteColleague2;
import main.java.behavioral.mediator.ConcreteMediator;
import main.java.behavioral.memento.Article;
import main.java.behavioral.memento.ArticleMemento;
import main.java.behavioral.memento.CareTaker;
import main.java.behavioral.observer.Car;
import main.java.behavioral.observer.MessagePublisher;
import main.java.behavioral.observer.Pedestrian;
import main.java.behavioral.observer.TrafficLights;
import main.java.behavioral.observer.TrafficLights.Status;
import main.java.behavioral.state.MobileAlertStateContext;
import main.java.behavioral.state.Silent;
import main.java.behavioral.state.Vibration;
import main.java.behavioral.strategy.CapitalStrategyTextFormatter;
import main.java.behavioral.strategy.Context;
import main.java.behavioral.strategy.LowerStrategyTextFormatter;
import main.java.creational.abstractfactory.AbstractFactory;
import main.java.creational.abstractfactory.CreditCard;
import main.java.creational.abstractfactory.FactoryProvider;
import main.java.creational.builder.Card;
import main.java.creational.factorymethod.PaymentMethod;
import main.java.creational.factorymethod.PaymentMethodFactory;
import main.java.creational.factorymethod.PaymentMethodType;
import main.java.creational.prototype.PrototypeCard;
import main.java.creational.prototype.PrototypeFactory;
import main.java.creational.singleton.Singleton;

public class Main {

	public static void main(String[] args) {

		testFactoryMethod();
		testAbstractFactory();
		testBuilder();
		testPrototype();
		testSingleton();
		testChainOfResponsibility();
		testCommand();
		testIterator();
		testMediator();
		testMemento();
		testObserver();
		testState();
		testInterpreter();
		testStrategy();
	}

	private static void testFactoryMethod() {

		PaymentMethod paymentMethod = PaymentMethodFactory
			.buildPaymentMethod(PaymentMethodType.PAYPAL);
		paymentMethod.makePayment();
	}

	private static void testAbstractFactory() {

		AbstractFactory creditCardFactory = FactoryProvider.getFactory("CREDITCARD");
		CreditCard creditCard = (CreditCard) creditCardFactory.create("VISA");

		AbstractFactory paymentMethodFactory = FactoryProvider.getFactory("PAYMENTMETHOD");
		main.java.creational.abstractfactory.PaymentMethod paymentMethod = (main.java.creational.abstractfactory.PaymentMethod) paymentMethodFactory
			.create("DEBIT");

		System.out.println(
			paymentMethod.makePayment() + " with brand " + creditCard.getType() + " and number "
				+ creditCard.getNumber());
	}

	private static void testBuilder() {

		Card card = new Card.CardBuilder("VISA", "0000 1111 2222 3333")
			.name("Pipe")
			.expirationDate(2050)
			.isCredit(true)
			.build();

		System.out.println(card);

		Card card2 = new Card.CardBuilder("AMEX", "9999 9999 9999 9999").build();

		System.out.println(card2);

		Card card3 = Card.builder("MASTERCARD", "1234 5678 9012 3456").build();

		System.out.println(card3);
	}

	private static void testPrototype() {

		PrototypeFactory.loadCards();

		try {

			PrototypeCard visa = PrototypeFactory.getInstance(PrototypeFactory.VISA);
			visa.getType();

			PrototypeCard amex = PrototypeFactory.getInstance(PrototypeFactory.AMEX);
			amex.getType();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

	private static void testSingleton() {

		Singleton singleton = Singleton.getInstance();
		singleton.setValue("1234-1234-1234-1234");
		System.out.println(singleton.getValue());
	}

	private static void testChainOfResponsibility() {

		LoanCard loanCard = new LoanCard();
		loanCard.creditCardRequest(1000);
	}

	private static void testCommand() {

		main.java.behavioral.command.CreditCard creditCard = new main.java.behavioral.command.CreditCard();
		main.java.behavioral.command.CreditCard creditCardDeactivate = new main.java.behavioral.command.CreditCard();

		CreditCardInvoker creditCardInvoker = new CreditCardInvoker();

		creditCardInvoker.setCommand(new CreditCardActivateCommand(creditCard));
		creditCardInvoker.run();

		System.out.println("--------------------------------------------------------------------");

		creditCardInvoker.setCommand(new CreditCardDeactivateCommand(creditCardDeactivate));
		creditCardInvoker.run();
	}

	private static void testIterator() {

		main.java.behavioral.iterator.Card[] cards = new main.java.behavioral.iterator.Card[3];
		cards[0] = new main.java.behavioral.iterator.Card("VISA");
		cards[1] = new main.java.behavioral.iterator.Card("AMEX");
		cards[2] = new main.java.behavioral.iterator.Card("MASTERCARD");

		List list = new CardList(cards);
		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {
			main.java.behavioral.iterator.Card card = (main.java.behavioral.iterator.Card) iterator
				.next();
			System.out.println(card.getType());
		}
	}

	public static void testMediator() {

		ConcreteMediator mediator = new ConcreteMediator();

		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

		mediator.setUser1(colleague1);
		mediator.setUser2(colleague2);

		colleague1.sendMessage("Hi I'm user1");
		colleague2.sendMessage("Hi I'm user2");
	}

	private static void testMemento() {

		CareTaker careTaker = new CareTaker();

		Article article = new Article("Pipe", "Memento is a movie of Nolan");
		System.out.println(article.getContent());
		careTaker.addMemento(article.createMemento());

		article.setContent(article.getContent() + " performed by Guy Pearce");
		System.out.println(article.getContent());
		careTaker.addMemento(article.createMemento());

		article.setContent(article.getContent() + " and Leonardo Dicaprio");
		System.out.println(article.getContent());

		ArticleMemento memento1 = careTaker.getMemento(0);
		ArticleMemento memento2 = careTaker.getMemento(1);

		article.restoreMemento(memento1);
		System.out.println(article.getContent());

		article.restoreMemento(memento2);
		System.out.println(article.getContent());

		article.setContent(article.getContent() + " from year...");
	}

	private static void testObserver() {

		Pedestrian pedestrian = new Pedestrian();
		Car car = new Car();

		MessagePublisher messagePublisher = new MessagePublisher();
		messagePublisher.attach(pedestrian);
		messagePublisher.attach(car);
		messagePublisher.notifyUpdate(new TrafficLights(Status.RED));

		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		messagePublisher.notifyUpdate(new TrafficLights(Status.GREEN));
	}

	private static void testState() {

		MobileAlertStateContext mobileAlertStateContext = new MobileAlertStateContext();
		mobileAlertStateContext.alert();
		mobileAlertStateContext.alert();
		mobileAlertStateContext.setState(new Vibration());
		mobileAlertStateContext.alert();
		mobileAlertStateContext.alert();
		mobileAlertStateContext.setState(new Silent());
		mobileAlertStateContext.alert();
		mobileAlertStateContext.alert();
	}

	private static void testInterpreter() {

		Expression zero = new TerminalExpression("0");
		Expression one = new TerminalExpression("1");

		Expression containsZeroOrOne = new OrExpression(zero, one);
		Expression containsZeroAndOne = new AndExpression(zero, one);

		System.out.println(containsZeroOrOne.interpret("zero"));
		System.out.println(containsZeroOrOne.interpret("0"));
		System.out.println(containsZeroAndOne.interpret("one"));
		System.out.println(containsZeroAndOne.interpret("0, 1"));
	}

	public static void testStrategy() {

		Context context = new Context(new LowerStrategyTextFormatter());
		context.publishText("TEXT TO BE CONVERTED TO LOWER CASE");

		context = new Context(new CapitalStrategyTextFormatter());
		context.publishText("text to be converted to upper case");
	}
}
