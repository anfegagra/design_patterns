package main.java.behavioral.chainofresponsibility;

public class Black implements ApproveLoanChain {

	private ApproveLoanChain next;

	@Override
	public void setNext(ApproveLoanChain loan) {
		next = loan;
	}

	@Override
	public ApproveLoanChain getNext() {
		return next;
	}

	@Override
	public void creditCardRequest(int totalLoan) {

		if (totalLoan > 50000) {
			System.out.println("Loan handled by BLACK");
		} else {
			next.creditCardRequest(totalLoan);
		}
	}

}
