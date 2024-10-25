public class Lab3 {
    public static void main(String[] args) {
      String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      // Best case scenario 
      String bestCase = "A";
      // Initialize startTime here
      long startTime = System.nanoTime();
      int index = match(text, bestCase);
      // Initialize endTime here
      long endTime = System.nanoTime();
      // Calculate elapsedTime here
      long elapsedTime = endTime - startTime;
      System.out.println("Elapsed time for best case: " + elapsedTime + " ns");
  
      if (index >= 0)
        System.out.println("best-case input matched at index " + index);
      else
        System.out.println("best-case input unmatched");   
  
      // Worst case has longer string, unmatched

      String worstCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890";
  
      // Initialize startTime here
      startTime = System.nanoTime();
      index = match(text, worstCase);
      // Initialize endTime here
      endTime = System.nanoTime();
      // Calculate elapsedTime here
      elapsedTime = endTime - startTime;
      System.out.println("Elapsed time for worst case: " + elapsedTime + " ns");
      
      if (index >= 0)
        System.out.println("worst-case input matched at index " + index);
      else
        System.out.println("worst-case input unmatched");  
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

  // 1. According to the book, what is Big O for this algorithm?
  // We should analyze the match method and isMatched method. The Outer Loop, match, is observed as n - m + 1, (n is length of text and m is length of pattern). 
  // Inner Loop, isMatched, executes m times for each itereation of the outer loop. Our Big O for this algorithm is O((n - m + 1) * m) = O(n * m)

  // 2. Did your calculations of elapsedTime align with what the book said about Big O for this brute-force string matching algorithm?
  // Yes they did, brute-force algorithm is applied for finding a substring(pattern) within a larger string (text). 
  // The algorithm was simplified to O(n*m) with N as the length of text and m as the length of pattern.
  // The text and pattern increasing should relate directly to O(n*m). As the string becomes longer, the time increases as well, showing the algorithm can be less efficient for large datasets.

  // 3. Describe what you think the purpose of the exercise is?
  // This exercises purpose was to practice time complexity with a focus on brute-force string matching algorithm.
  // It also introduced performance measurment of programs we run, which i found interesting. 
  // We measured elapsed time for best-case and worst-case scenarios, while observing how input size influences execution time.

  // 4. Is this enough to calculate a best- and worst-case scenario?
  // The best-case is simple and searches for the first character of the text that should match quickest.
  // The worst-case scenario pattern has an added character so the program is required to search the text all the way through. 
  // After running the program a couple times I got different answers, so averaging the results of multiple tests could provide a totally accurate data representation.