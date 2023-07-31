import java.util.Arrays;

public class task2 {
    public static void main(String[] args){

           int[] num ={3,4,-1,2,1,6};
           int n = 0;
        System.out.println(find(num ,n));
        ;



    }
    static int find(int[] num, int n){
//        int isExist = 0;
//        for (int i = 0; i < n; i++) {
//            if (num[i] == 1){
//                isExist ++;
//                break;
//            }
//
//        }
        boolean[] found = new boolean[n + 2];
        for (int x: num) {
            if (x > 0 && x <= n) {
                found[x] = true;
            }
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!found[i]) {
                return i;
            }
        }
        return n + 1;


    }
}
