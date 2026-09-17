class Solution {
    public boolean isPalindrome(String s) {
        
        String rev = new StringBuilder(s).reverse().toString().replaceAll("[^A-Za-z0-9]", " ").toLowerCase().replace(" ", "");

        String org = new StringBuilder(s).toString().replaceAll("[^A-Za-z0-9]", " ").toLowerCase().replace(" ", "");

        System.out.println(rev + " " + org);

        return rev.equals(org);
    }
}
