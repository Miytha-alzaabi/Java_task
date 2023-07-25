import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        Scanner read = new Scanner(System.in);

//        System.out.println("Please Enter Your First Number:");
//        int numb1 = read.nextInt();
//        System.out.println("Please Enter Your 2nd Number:");
//        int numb2 = read.nextInt();
//        System.out.println("Please Enter Your 3rd Number:");
//        int numb3 = read.nextInt();
//        if(numb1 > numb2 && numb1 > numb3){
//            System.out.println("The First Number is Larger Than Others");
//        }else if(numb2 > numb3 && numb2 > numb3){
//            System.out.println("The Second Number is Larger Than Others");
//        }else{
//            System.out.println("The Third Number is Larger Than Others");
//        }

//        System.out.println("Please Enter Your First Course");
//        int course1 = read.nextInt();
//        System.out.println("Please Enter Your First Course");
//        int course2 = read.nextInt();
//        System.out.println("Please Enter Your First Course");
//        int course3 = read.nextInt();
//        System.out.println("Please Enter Your First Course");
//        int course4 = read.nextInt();
//        System.out.println("Please Enter Your First Course");
//        int course5 = read.nextInt();
//        int total = (course1+course2+course3+course4+course5)/5;
//        System.out.println("Your Total Grade is:" + total);
//        if(total >=90){
//            System.out.println("Your Grade is A");
//        }else if(total >= 70 && total <=80){
//            System.out.println("Your Grade is B");
//        }else if(total >= 60 && total <=70){
//            System.out.println("Your Grade is C");
//        }else{
//            System.out.println("You Failed");
//        }
        System.out.println("Please Enter Your First Number");
        int numb1 = read.nextInt();
        System.out.println("Please Enter Your 2nd Number");
        int numb2 = read.nextInt();
        System.out.println("Please Enter The Operation");
        String operation = read.next();
        if(operation.equals("+")){
            System.out.println("Answer: "+ (numb1 + numb2));
        }else if(operation.equals("-")){
            System.out.println("Answer: "+ (numb1 - numb2));
        } else if(operation.equals("*")){
            System.out.println("Answer: "+ (numb1 * numb2));
        }else if(operation.equals("/")){
            System.out.println("Answer: "+ (numb1 / numb2));
        }else{
            System.out.println("Error");
        }


       





//
}
}