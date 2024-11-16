import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //        int amr = 24 ;
//
//        if(amr >= 24){
//            System.out.println("you adult");
//        }else if (amr < 24 ) {
//            System.out.println("you arenot adult yat");
//        }

//        int num = 6 ;
//
//        for (int i=0 ; i< num ; ++i){
//            System.out.println(i + " - Amr");
//        }


//        int num = 6 ;
//        int result = 0 ;
//
//        for (int i = 0 ; i<= num ; ++i ){
//            result += i ;
//        }
//        System.out.println("Final " + result);




//        int[] nums={1,2,3};
//        int result = 0;
//
//        for(int n: nums){
//            result += n;
//        }
//        System.out.print(result);


//        int num = 1 , num2 = 10 ;
//
//        while (num < num2){
//            System.out.println(num);
//            num++ ;
//        }





        int sum = 0 ;

        Scanner number = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int result = number.nextInt();

        while (result >= 0){
            sum += result ;
            System.out.print("Enter your number : ");
            result = number.nextInt();
        }

        System.out.println("this is wrong your final result : " + sum);
        number.close();








    }
}