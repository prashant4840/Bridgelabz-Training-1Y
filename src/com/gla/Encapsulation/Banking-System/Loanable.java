 /**
 * Interface defining loan related behavior.
 */
interface Loanable {

    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}