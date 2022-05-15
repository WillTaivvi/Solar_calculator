
//  example solar calculator, program works but parameters are general and flawed, could be tuned for use


import java.util.Scanner;

public class solar_cal {

    public static void main(String[] args) { 

        String intro = new String("Welcome to the Solar Calculator. ");       // String examples
        String descript = "Answer questions. Enter 1 on Question 2 or Question 3. ";
        System.out.println(intro + descript + "What is your Daily Useage?");
        
        try (  
        Scanner peak = new Scanner(System.in)) {
                double useage = peak.nextDouble();
    
            System.out.println(" How many Batteries in the Bank? ");
                double batt = peak.nextDouble();

            System.out.println(" How many Panels in the Array? ");
                double panel = peak.nextDouble();

            double buffer=40;
            double total= (useage+((buffer/100)*useage))*1000;
            double battw = 2400, panelw = 1650;

            if 
                (batt == 1) {
                    double tpanel = (panel * panelw);
                    double tbatt = (total - tpanel);
                    double xbatt = (tbatt / battw);
                    batt = xbatt;
                }

            if 
                (panel == 1) {
                    double tbatt = (batt * battw);
                    double tpanel = (total - tbatt);
                    double xpanel = (tpanel / panelw);
                    panel = xpanel;
                }
            
        
            String kwh = ("Totals "+(total/1000)+" kwh "+batt+" Batteries "+panel+" Panels ");   

            System.out.println(kwh);
        }
           
    }
}