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
            if (i < example.length - 1) {
                System.out.print(example[i] + ", ");
            } else
                System.out.print(example[i]);
        }
        System.out.println();
//1.2
        double[] realNum = {1.57, 7.654, 9,986};

        for (int i = 0; i < realNum.length; i++) {
            if (i < realNum.length - 1) {
                System.out.print(realNum[i] + ", ");
            } else
                System.out.print(realNum[i]);
        }
        System.out.println();
//1.3
        double [] aArray = {10.2, 1.42, 15.0};

        for (int i = 0; i < aArray.length; i++) {
            if (i < aArray.length - 1) {
                System.out.print(aArray[i] + ", ");
            } else
                System.out.print(aArray[i]);
        }
        System.out.println();
        //Задание 3

        for (int i = example.length-1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(example[i] + ", ");
            } else
                System.out.print(example[i]);
        }
        System.out.println();



        for (int i = realNum.length-1; i >= 0; i--) {
            if (i >0) {
                System.out.print(realNum[i] + ", ");
            } else
                System.out.print(realNum[i]);
        }
        System.out.println();

        for (int i = aArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(aArray[i]);
                System.out.print(", ");
            } else
                System.out.println(realNum[i]);
        }


//Задание 4
        for (int i = 0; i < example.length; i++) {
            if (example[i]%2==1) {
                example[i]++;
            }
            if (i<example.length-1){
                System.out.print(example[i]+ ", ");
            }else
                System.out.print(example[i]);

        }

    }
}