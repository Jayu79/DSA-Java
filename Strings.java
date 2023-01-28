import java.util.ArrayList;

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

    static ArrayList<Integer> vowels_consonants(String s){

        ArrayList<Integer> res = new ArrayList<Integer>();
        int n = s.length();
        int vowels = 0;
        int consonants = 0;
        for(int i=0;i<n;i++){

            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vowels++;
            }
            else{
                consonants++;
            }

        }
        res.add(vowels);
        res.add(consonants);
        return res;
    }

    public static void main(String[] args) {
        String s = new String();
        s = "interviewbit";
//        System.out.println(isPal(s));
        System.out.println(vowels_consonants(s));

    }
}
