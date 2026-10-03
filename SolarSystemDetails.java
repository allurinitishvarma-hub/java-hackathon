package hackathon;
public class SolarSystemDetails {
    public static void main(String[] args) {
       
        int panelId = 101;                      
        double energyGeneratedKwh = 1450.75;    
        int numberOfPanels = 24;               
        char systemStatus = 'A';                

        System.out.println("=== Rooftop Solar System Details ===");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGeneratedKwh + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}