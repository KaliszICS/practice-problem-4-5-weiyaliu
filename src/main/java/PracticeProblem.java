public class PracticeProblem {

	public static void main(String args[]) {
    	System.out.println(triangle(3));
        System.out.println(pyramid(4));
        System.out.println(multiplicationTable(3));
	}

	// 1.
    public static String triangle(int n) {
        String accum = "";
        
        if (n == 0) {
            return "";
        }
        for (int i = 1; i <= n; i++) { 

            for (int j = 1; j <= i; j++) { 
                accum = accum + "*";
            }
            accum = accum + "\n"; 
        }
        return accum;
    }

		//2.
    public static String pyramid(int n) {
        String accum = "";
        
        if (n == 0) {
            return "";
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                accum = accum + " ";
            }
			for (int k = 1; k <= i; k++) {
                accum = accum + "*";
                
                if (k < i) {
                    accum = accum + " ";
                }
            }
            accum = accum + "\n";
        }
        return accum;
    }

// 3.
    public static String multiplicationTable(int n) {
        String accum = "";
        
        if (n == 0) {
            return "";
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                accum = accum + (i * j) + " ";
            }
            accum = accum + "\n";
        }
        return accum;
    }
}
