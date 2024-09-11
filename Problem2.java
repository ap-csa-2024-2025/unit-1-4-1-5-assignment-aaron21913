public class Problem2
{
  public static void main(String[] args)
  {
    final int num = 456;
    int first = num/100;
    int last = num % 10;
    int second = (num - (first*100) - last)/10;

    System.out.println("Three digit number is " + num);
    System.out.println(first);
    System.out.println(second);
    System.out.println(last);

  }
}
