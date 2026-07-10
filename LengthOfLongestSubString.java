class LengthOfLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; // ASCII character set
        Arrays.fill(lastIndex, -1);
        
        int maxLength = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char currentChar = s.charAt(windowEnd);
            
            // If character was seen before AND is within current window,
            // move windowStart past its last occurrence
            if (lastIndex[currentChar] >= windowStart) {
                windowStart = lastIndex[currentChar] + 1;
            }
            
            lastIndex[currentChar] = windowEnd;
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        
        return maxLength;
    }
}
