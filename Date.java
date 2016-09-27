public class Date{
  private int year;
  private int month;
  private int day;

  public Date(int year, int month, int day){
    year = 1000;
    month = 1;
    day = 1;
  }

  //break / getter segment / peter piper picked a peck of pickled peppers

  public int getYear(){
    return year;
  }
  public int getMonth(){
    return month;
  }
  public int getDay(){
    return day;
  }

  //break / setters segment / she sells seashells by the seashore

  public void setYear(int year){
    if((year < 1000) || (year > 9999)){
      throw new IllegalArgumentException("Year is invalid");
    }
    this.year = year;
  }

  public void setMonth(int month){
    if((month < 1) || (month > 12)){
      throw new IllegalArgumentException("Month is invalid");
    }
    this.month = month;
  }

  public void setDay(int day){
    if((day < 1) || (day > 31)){
      throw new IllegalArgumentException("Day is invalid");
    }
    this.day= day;
  }


  //break / operations segment

  Date date = new Date(1000, 1, 1);
  public void setDate(int year, int month, int day){
    setYear(year);
    setMonth(month);
    setDay(day);
  }

  public String toString(){
    return String.format("%02d/%02d/%4d", month, day, year);
  }
}
