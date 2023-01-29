import java.util.ArrayList;

import static java.lang.Math.min;

public class Strings {

//    static boolean isPal(String s){
//
//        int n = s.length();
//        int start = 0;
//        int end = n-1;
//        while(start<end){
//            if(s.charAt(start)==s.charAt(end)){
//                start++;
//                end--;
//            }
//            else{
//                return false;
//            }
//
//        }
//        return true;
//
//    }

//    static ArrayList<Integer> vowels_consonants(String s){
//
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        int n = s.length();
//        int vowels = 0;
//        int consonants = 0;
//        for(int i=0;i<n;i++){
//
//            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
//                vowels++;
//            }
//            else{
//                consonants++;
//            }
//
//        }
//        res.add(vowels);
//        res.add(consonants);
//        return res;
//    }

//    static String copy(String S){
//
//        int n = S.length();
//        String res = S.substring(0,n-1);
//        return res;
//    }

//    static int compare(String s1, String s2){
//
//        if(s1.compareTo(s1)>0){
//            return 1;
//        }
//        else if(s1.compareTo(s2)==0){
//            return 0;
//        }
//        else{
//            return 1;
//        }
//    }

    static String reverse(String s1){

        char[] ch = s1.toCharArray();
        int n = s1.length();

        int p1 = 0;
        int p2 = n-1;
        while(p1<p2){
            char t = ch[p1];
            ch[p1] = ch[p2];
            ch[p2] = t;
            p1++;
            p2--;

        }

        s1 = String.valueOf(ch);
        return s1;
    }
    public static void main(String[] args) {
        String s = new String();
        s = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        s = s.trim();
//        System.out.println(isPal(s));
//        System.out.println(copy(s));
//        System.out.println(reverse(s));
        String s2 = reverse(s);
        System.out.println(s2);
        int n = s2.length();
        int start = 0;
        String ans = "";
        for(int i=0;i<n;i++){

            if(s2.charAt(i)==' '){
                ans += reverse(s2.substring(start,i)) + " ";
                start = i+1;
            }

        }
//        System.out.println(reverse(s2.substring(start,n)));
        ans += reverse(s2.substring(start,n));
        System.out.println(ans);

    }
}
