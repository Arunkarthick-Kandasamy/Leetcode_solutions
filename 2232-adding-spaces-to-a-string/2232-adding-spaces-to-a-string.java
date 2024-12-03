class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int j = 0;

        for (int i : spaces) {
            result.append(s.substring(j, i));
            result.append(" ");
            j = i;
        }

        result.append(s.substring(j));
        return result.toString();
    }
}
