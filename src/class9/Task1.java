package class9;

public class Task1 {
    public static void main(String[] args) {

        // task 1: Print numbers from 1 to 50 execept those that divisble bny 3

        for (int i = 1; i<=50; i++) {
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
