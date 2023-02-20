import java.util.Scanner;
import GuessingGame.java;

public class Mars{

    public static void main(String[] args){
        String colonyName="Mira";
        int shipPopulation=300;
        double meals=4000.00;
        boolean landing=true;
        double consumedfood=foodafterlanding(shipPopulation,0.75,2);
        double mealsleft=mealsleft(consumedfood,meals);
        meals=1.5*meals;
        System.out.println("Now we have "+ meals+ " meals on board.");
        shipPopulation=5+shipPopulation;
        System.out.println("Now we have "+ shipPopulation+ " people on board.");
        Scanner scan= new Scanner(System.in);
        System.out.println("Choose where to land: a(The Hill), b(The Plain) or c(The Ocean)?");
        String landinglocation=scan.nextLine();
        if  (landinglocation.equals("a")){
            System.out.println("Bbzzz Landing on the Plain");
            }
        else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
             }
        scan.close();
  
        landing=landingCheck(10);
        System.out.println(landing);
        //GuessingGame.mainM();


    }

    public static double foodafterlanding(int shipPopulation, double dailyportion,int days){
        double consumedfood=shipPopulation*dailyportion*days;
        //double mealsleft=meals-consumedfood;
        System.out.println("Consumed food after landing:"+consumedfood);
        return consumedfood;
    }
    public static double mealsleft(double consumedfood, double meals){
        double mealsleft=meals-consumedfood;
        System.out.println("Meals left after landing:"+mealsleft);
        return mealsleft;
    }    
    public static boolean landingCheck(int minutesLeft){

        for (int minute = 0; minute <=minutesLeft; minute++) {
            

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
            
                e.printStackTrace();
            }

            if (minute%3==0&&minute%2==0) {
                System.out.println("Keep Center");
            }
            else {if (minute%2==0) {
                    System.out.println("Right");
                }
                if (minute%3==0) {
                    System.out.println("Left");}
                if (minute%3!=0&&minute%2!=0) {
                    System.out.println("Calculating");}
                    
                                   
            }
            
        }
        System.out.println("Landed");
        return false;
    
    };
               
    
}