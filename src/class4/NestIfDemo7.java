package class4;

public class NestIfDemo7 {
    public static void main(String[] args) {


        boolean studyHard=false;
        int salary=12000;

        if(studyHard){

            System.out.println("We get the jobs");
            if(salary>100000){
                System.out.println("Lets buy a Tesla");
            }else{
                System.out.println("Lets buy toyota");
            }
        }else {
            System.out.println("It might take a little longer for us to get the jobs");
        }
    }
}