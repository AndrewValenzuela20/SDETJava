package class5;

public class LogicalOperators {
    public static void main(String[] args) {


        System.out.println(!true);
        System.out.println(!false);
        boolean rich=true;
        System.out.println(!rich);
        int number=9;
        if(number==9)
        { System.out.println("hello Java");
        }else{
            System.out.println("Hellow word");
        }
        String country="Bad Country";
        if(!country.equals("BadCountry")){
            System.out.println("You are welcome");
        }

        if(country.equals("China")){
            System.out.println("You are welcome");
        }
        if(country.equals("Nepal")){
            System.out.println("You are welcome");
        }
        if(country.equals("Pakistan")){
            System.out.println("You are welcome");
        }


    }
}