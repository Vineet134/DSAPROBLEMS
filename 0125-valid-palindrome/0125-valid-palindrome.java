class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase
        s = s.toLowerCase();
        
        // Remove non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        
        // Check if the string is empty after removing non-alphanumeric characters
        if (s.isEmpty()) {
            return true; // An empty string is considered a palindrome
        }
        
        // Check for palindrome
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

    