package Math;

import java.util.ArrayList;

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.isPalindrome(-121));// 101 eve 2002 madam 1 0 0 1  1234554321
        System.out.println(solution.isPalindrome(78586));
        System.out.println(solution.isPalindrome(26));
        System.out.println(solution.isPalindrome(9));
        System.out.println(solution.isPalindrome(100));
        System.out.println(solution.isPalindrome(2222));
        System.out.println(solution.isPalindrome(1234554321));//452ms
    }
    static class Solution {
        public boolean isPalindrome(int x) {
            ArrayList<Integer> arrayList=new ArrayList<>();
            // we have created array from number
            // 757 777 787 145
            Boolean minus=x<0;
            if (minus){
                x=x*-1;
            }
            while (x/10.0!=0){
                //x=187   x%10=7 x%5=2
                arrayList.add(x%10);
                //x=187 x/10=18
                x=x/10;
                //x=1  x/10=0
            }
            if (minus){
                arrayList.set(arrayList.size()-1,arrayList.get(arrayList.size()-1)*-1);
            }
            System.out.println(arrayList);

            for (int i = 0; i < arrayList.size(); i++) {
                if (i==arrayList.size()-1-i)
                    break;                  //true
                //arrayList=7,8,5,8,7 i=0   7 == 7              5-1-0=4
                if (!arrayList.get(i).equals(arrayList.get(arrayList.size()-1-i))){
                    return false;
                }
            }
            return true;
        }
    }
}
