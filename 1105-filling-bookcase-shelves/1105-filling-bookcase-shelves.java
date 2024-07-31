
 class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int numOfBooks = books.length;
       
        int[] dp = new int[numOfBooks + 1];
      
        for (int i = 1; i <= numOfBooks; ++i) {
            // Initial width and height for the current book
            int currentWidth = books[i - 1][0];
            int currentHeight = books[i - 1][1];
          
            // Place current book on a new shelf
            dp[i] = dp[i - 1] + currentHeight;
          
            // Try placing previous books with the current one on the same shelf
            for (int j = i - 1; j > 0; --j) {
                currentWidth += books[j - 1][0]; // Accumulate width
              
                // If accumulated width exceeds shelfWidth, stop trying to place more books
                if (currentWidth > shelfWidth) {
                    break;
                }
              
                // Update the current height to be the tallest book in the current placement
                currentHeight = Math.max(currentHeight, books[j - 1][1]);
                // Calculate the minimum height if this set of books were on the same shelf,
                // comparing with the previous minimum height and updating it if necessary
                dp[i] = Math.min(dp[i], dp[j - 1] + currentHeight);
            }
        }
      
        // Return the minimum height to place all the books
        return dp[numOfBooks];
    }
}