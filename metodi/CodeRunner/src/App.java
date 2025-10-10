public class App {
    public static void main(String[] args) throws Exception {

    calculate(2, 3, "subtraction");
    }
    public static void calculate(int n1, int n2, String s1)
    {
        if (s1.equals("sum"))
        {
            int vastaus = n1 + n2;
            System.out.println("The result is " + vastaus + ".");
        }
        if (s1.equals("multiplication"))
        {
            int vastaus = n1 * n2;
            System.out.println("The result is " + vastaus + ".");
        }
        if (s1.equals("subtraction"))
        {
            int vastaus = n1 - n2;
            System.out.println("The result is " + vastaus + ".");
        }
        
        
    }

}
