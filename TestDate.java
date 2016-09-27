public class TestDate{
  public static void main(Sting args[]){
    // Test constructor and toString()

    Date d1 = new Date(2016, 4, 6);
    Date d2 = new Date(1998, 6, 11);

    System.out.println(d1);  // toString()
    System.out.println(d2);

    // Test Setters and Getters

    d1.setYear(2012);
    d1.setMonth(12);
    d1.setDay(23);
    d2.setYear(0);
    d2.setMonth(0);
    d2.setDay(0);

    System.out.println(d1);  // run toString() to inspect the modified instance
    System.out.println(d2);
    d2.setDate(1998, 6, 11);


    System.out.println("Year is: " + d1.getYear());
    System.out.println("Month is: " + d1.getMonth());
    System.out.println("Day is: " + d1.getDay());
    System.out.println("Year is: " + d2.getYear());
    System.out.println("Month is: " + d2.getMonth());
    System.out.println("Day is: " + d2.getDay());

    // Test setDate()

    d1.setDate(2988, 1, 2);

    System.out.println(d1);  // toString()
    System.out.println(d2);
  }
}
