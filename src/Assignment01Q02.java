public class Assignment01Q02 {
    public static void main(String[] args) {
        double PI = Math.PI;
        double almostPI = 0;
        double term = 0;
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) 
        {
            term = 1.0 / ((2 * i) + 1);

            if (i % 2 == 0) 
            {
                almostPI += term;
            }
            else    
            {
                almostPI -= term;
            }
        }

        almostPI *= 4;

        System.out.println(almostPI + " " + PI);
    }
}
