class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing whitespaces
        s = s.trim();
        
        // Split the string into words
        String[] words = s.split("\\s+");
        
        // Create a StringBuilder to store the reversed string
        StringBuilder reversed = new StringBuilder();
        
        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a space between words
            }
        }
        
        return reversed.toString();
    }
}
