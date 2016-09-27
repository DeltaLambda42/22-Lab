public class Account{
  private int accountNumber;
  private double balance;

  public Account(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
  public Account(int accountNumber){
    this.accountNumber = accountNumber;
    this.balance = 0.0;
  }

  //break / getter segment / peter piper picked a peck of pickled peppers

  public int getAccountNumber(){
    return accountNumber;
  }
  public double getBalance(){
    return balance;
  }

  //break / setters segment / she sells seashells by the seashore

  public double setBalance(double balance){
    this.balance = balance;
  }

  //break / operations segment

  public void credit(double amount){
    balance += amount;
  }
  public void debit(double amount){
    if(balance < amount){
      throw new IllegalArgumentException("Amount withdrawn exceeds the current balance!");
    } else {
      balance -= amount;
    }
  }
  public String toString(){
    return String.format("A/C no:%03d, Balance = $%.2f", accountNumber, balance);
  }
}
