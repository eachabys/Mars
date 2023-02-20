import java.util.Scanner;

public class MarsExpedition {
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String userName=scan.nextLine();
        System.out.println("Welcome aboard "+userName+".Expedition prep program starting.");
        System.out.println("Booting up...");
        System.out.println(userName+"!Are you ready to head out into the new world? Type Y or N");
        String ready=scan.nextLine();
        System.out.println(ready);
        if (ready.equals("Y")||ready.equals("y")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } 
        else {
            System.out.println("Too bad you are team leader. You have to go.");
        }
        System.out.println("How many extra team members would you like in your mission? Please enter a number");
       
        int team=scan.nextInt();
        if (team<0||team>2){
            System.out.println("We can only send 2 more members.");
            team=2;
        }
        Scanner scanN = new Scanner(System.in);
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack=scanN.nextLine();
        System.out.println("Nice choice, you will be bringing "+snack+" with you.");
        System.out.println("Choose a vehicle for the mission: a(Honda Civic), b(Maserati MC20) or c(Unicycle)?");
        String vehicle=scanN.nextLine();
        
        String vehicleType="a";
        switch(vehicle) {
            case "a":
              vehicleType="Honda Civic";
              break;
            case "b":
              vehicleType="Maserati MC20";
              break;
            case "c":
              vehicleType="Unicycle";
              break;
            default:
              vehicleType="Unicycle";
              System.out.println("Oops, you picked a wrong vehicle. You're assigned a unicycle");
            break;
          }

        System.out.println(userName+ " you are set for the mission. Good luck with your team of " +team+". You will be provided with "+snack+" and "+vehicleType +".");
        scan.close();
        scanN.close();
    }
}
