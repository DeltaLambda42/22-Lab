public class TestAccount{
  public static void main(String args[]){
    Account a1 = new Account(143, 199.99);
    Account a2 = new Account(42, 1.764);

    System.out.println(a1);
    System.out.println(a2);

    a1.setBalance(1764);
    a2.setBalance(10);
    System.out.println(a1);
    System.out.println(a2);

    a1.credit(0);
    a2.credit(99);
    System.out.println(a1);
    System.out.println(a2);
    a1.debit(5);
    a2.debit(1000.59);
    System.out.println(a1);
    System.out.println(a2);

    System.out.println("Account number is:" + a1.getAccountNumber());
    System.out.println("Account number is:" + a2.getAccountNumber());
    System.out.println("Account number is:" + a1.getBalance());
    System.out.println("Account number is:" + a2.getBalance());

  }
}
