package main.java.behavioral.chainofresponsibility;

public interface ApproveLoanChain {

	void setNext(ApproveLoanChain loan);

	ApproveLoanChain getNext();

	void creditCardRequest(int totalLoan);
}
