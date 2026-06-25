class Solution {
    private void generateHappyStrings(
        int n,
        int k,
        StringBuilder currentString,
        int[] indexInSortedList,
        String[] result
    ) {
        if (currentString.length() == n) {
            indexInSortedList[0]++;
            if (indexInSortedList[0] == k) result[0] = currentString.toString();
            return;
        }
        for (char currentChar = 'a'; currentChar <= 'c'; currentChar++) {
            if (
                currentString.length() > 0 &&
                currentString.charAt(currentString.length() - 1) == currentChar
            ) continue;
            currentString.append(currentChar);
            generateHappyStrings(
                n,
                k,
                currentString,
                indexInSortedList,
                result
            );
            if (result[0] != null) return;
            currentString.deleteCharAt(currentString.length() - 1);
        }
    }
    public String getHappyString(int n, int k) {
        StringBuilder currentString = new StringBuilder();
        String[] result = new String[1];
        int[] indexInSortedList = new int[1];
        generateHappyStrings(n, k, currentString, indexInSortedList, result);
        return result[0] == null ? "" : result[0];
    }
}