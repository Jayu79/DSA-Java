import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {

//    static ArrayList<ArrayList<Integer>> transpose(ArrayList<ArrayList<Integer>> mat1){
//
//        ArrayList<ArrayList<Integer>> transpose = new ArrayList<ArrayList<Integer>>();
//
//        int n = mat1.size();
//        int m = mat1.get(0).size();
//
//        for(int i =0;i<m;i++){
//            ArrayList<Integer> temp = new ArrayList<Integer>();
//            for(int j=0;j<n;j++){
//                int k = mat1.get(j).get(i);
//                temp.add(k);
//            }
//            transpose.add(temp);
//        }
//
//
//        return transpose;
//    }

    static ArrayList<ArrayList<Integer>> multiplication(ArrayList<ArrayList<Integer>> mat1, ArrayList<ArrayList<Integer>> mat2){

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int rows = mat1.size();
        int cols = mat2.get(0).size();
        System.out.println(rows+"&"+cols);

        for(int i =0;i<rows;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<cols;j++){
                int summ = 0;
                for(int k =0;k<mat2.size();k++){

                    summ += mat1.get(i).get(k)*mat2.get(k).get(j);
                }
                temp.add(summ);
            }
            res.add(temp);
        }
        return res;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mat1 = new ArrayList<ArrayList<Integer>>();

        mat1.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        mat1.add(new ArrayList<Integer>(Arrays.asList(4,5)));
        mat1.add(new ArrayList<Integer>(Arrays.asList(7,8)));

        ArrayList<ArrayList<Integer>> mat2 = new ArrayList<ArrayList<Integer>>();
        mat2.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        mat2.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));

        System.out.println(mat1);
        System.out.println(mat2);
        System.out.println(multiplication(mat1,mat2));

    }

}