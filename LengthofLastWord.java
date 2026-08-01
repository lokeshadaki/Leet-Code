class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String word[]=s.split(" ");
        String lastWord=word[word.length-1];
        int lastwordlength=lastWord.length();
        return lastwordlength;
    }
}
