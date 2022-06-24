import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1
//1.1
        int [] example = new int[3];
        example[0] = 1;
        example[1] = 2;
        example[2] = 3;

        for (int i = 0; i < example.length; i++) {
            if (i == example.length - 1) {
                System.out.println(example[i]);
                break;
            }
            System.out.print(example[i] + ", ");
        }

//1.2
        double[] realNum = {1.57, 7.654, 9,0};

        for (int i = 0; i < realNum.length-1; i++) {
            if (i == realNum.length ) {
                System.out.println(realNum[i]);
                break;
            }
            System.out.print(realNum[i] + ", ");
        }
        System.out.println(" ");
//1.3
        double [] aArray = {10.2, 1.42, 15.0};

        for (int i= 0; i < aArray.length; i++) {
            if (i == aArray.length - 1) {
                System.out.println(aArray[i]);
                break;
            }
            System.out.print(aArray[i] + ", ");
        }


        //Задание 3

        for (int i = example.length-1; i >= 0; i--) {
            System.out.print(example[i]);
            System.out.print(", ");
        }
        System.out.println(" ");

        for (int i = 3 - 1; i >= 0; i--) {
            System.out.print(realNum[i]);
            System.out.print(", ");
        }
        System.out.println(" ");

        for (int i = 3 - 1; i >= 0; i--) {
            System.out.print(aArray[i]);
            System.out.print(", ");
        }
        System.out.println("");


        System.out.println("Преобразованные нечетные числа из");
        for (int i = 0; i < example.length; i++) {
            if (i == example.length - 1) {
                System.out.println(example[i]);
                break;
            }
            System.out.print(example[i] + ", ");
        }
        System.out.println("В четные:");
        int i = 0;
        for(int x=0;x<example.length;x++)
        {
            if(example[x]%2==1){
                i = example[x];
                System.out.println(i + 1);

            }
        }


    }
}