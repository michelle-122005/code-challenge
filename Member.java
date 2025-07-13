// Member.java

// Member class
class Member {
    private int memberId;
    private String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}

// Account class
class Account {
    private int accountId;
    private Member member;
    private double balance;

    public Account(int accountId, Member member, double balance) {
        this.accountId = accountId;
        this.member = member;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public Member getMember() {
        return member;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

// Loan class
class Loan {
    private int loanId;
    private Account account;
    private double amount;
    private double interestRate;

    public Loan(int loanId, Account account, double amount, double interestRate) {
        this.loanId = loanId;
        this.account = account;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public int getLoanId() {
        return loanId;
    }

    public Account getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

// Transaction class
class Transaction {
    private int transactionId;
    private Account account;
    private String type; // "Deposit" or "Withdrawal"
    private double amount;

    public Transaction(int transactionId, Account account, String type, double amount) {
        this.transactionId = transactionId;
        this.account = account;
        this.type = type;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Account getAccount() {
        return account;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

// Main application class
class SaccoApp {
    public static void main(String[] args) {
        // Create a member
        Member member1 = new Member(1, "John Doe");

        // Create an account with an initial balance
        Account account1 = new Account(101, member1, 1000.0);

        // Create a loan associated with the account
        Loan loan1 = new Loan(201, account1, 500.0, 0.05);

        // Perform a transaction (deposit)
        Transaction transaction1 = new Transaction(301, account1, "Deposit", 200.0);
        account1.deposit(transaction1.getAmount());

        // Display data
        System.out.println("Member Name: " + member1.getName());
        System.out.println("Account Balance after Deposit: " + account1.getBalance());
        System.out.println("Loan Amount: " + loan1.getAmount());
        System.out.println("Transaction Type: " + transaction1.getType());
        System.out.println("Transaction Amount: " + transaction1.getAmount());
    }
}
