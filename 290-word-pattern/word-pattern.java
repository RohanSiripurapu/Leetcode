class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        String[] map = new String[26];

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            // Check if character already has a mapping
            if (map[ch - 'a'] != null) {
                if (!map[ch - 'a'].equals(word)) {
                    return false;
                }
            } 
            else {
                // Check if this word is already mapped to another character
                for (int j = 0; j < 26; j++) {
                    if (word.equals(map[j])) {
                        return false;
                    }
                }

                map[ch - 'a'] = word;
            }
        }

        return true;
    }
}