class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        // creating frequency map
        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        int maxFreq = 0;
        for(char c : hm.keySet()) {
            if(hm.get(c) > maxFreq) maxFreq = hm.get(c);
        }
        
        //array -> arraylist
        ArrayList<Character>[] arr = new ArrayList[maxFreq + 1];
        for(char c : hm.keySet()) {
            int freq = hm.get(c);
            if(arr[freq] == null) {
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(c);
        }
        
        StringBuilder ans = new StringBuilder();
        for(int i = arr.length - 1; i > 0; i --) {
            if(arr[i] != null) {
                for(char c : arr[i]) {
                    for(int j = 0; j < i; j ++) ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}