class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List <String>> mapping=new HashMap<>();

        for(String word : strs)
        {
            char[] strch=word.toCharArray();
            Arrays.sort(strch);
            String key=new String(strch);
            if (!mapping.containsKey(key))
            {
                mapping.put(key,new ArrayList<>());
            }
            mapping.get(key).add(word);
        }
        return new ArrayList<>(mapping.values());
    }
}
