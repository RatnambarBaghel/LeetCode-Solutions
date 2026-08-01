class Solution {
    private boolean isLetter(char c) {
        return Character.isLetter(c);
    }
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;

        while (l < r) {
            if (isLetter(arr[l]) && isLetter(arr[r])) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } else if (!isLetter(arr[l])) {
                l++;
            } else { 
                r--;
            }
        }
        return new String(arr);
    }
}