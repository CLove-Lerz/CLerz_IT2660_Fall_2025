public class Main {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    String bestCase = text;

    // * Initialize startTime here
    long startTimebestCase = System.nanoTime();
    int indexbestCase = match(text, bestCase);
    // * Initialize endTime here
    long endTimebestCase = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTimebestCase = endTimebestCase-startTimebestCase;
    
    if (indexbestCase >= 0)
      System.out.println("best-case input matched at index " + indexbestCase);
    else
      System.out.println("best-case input unmatched");   
    System.out.println("Best-case elapsed time: " + elapsedTimebestCase + " nanoseconds");	

    String worstCase = text;
    
    // * Initialize startTime here
    long startTimeworstCase = System.nanoTime();
    int indexworstCase = match(text, worstCase);
    // * Initialize endTime here
     long endTimeworstCase = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTimeworstCase = endTimeworstCase-startTimeworstCase;
    
    if (indexworstCase >= 0)
      System.out.println("worst-case input matched at index " + indexworstCase);
    else
      System.out.println("worst-case input unmatched"); 
    System.out.println("Worst-case elapsed time: " + elapsedTimeworstCase + "nanoseconds"); 	 
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}

//Java