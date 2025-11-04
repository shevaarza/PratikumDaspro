package Jobsheet8;

public class Experiment4 {
    public static void main(String[] args) {
        
      
        String[] sports = {
            "Badminton", 
            "Table Tennis", 
            "Basketball", 
            "Volleyball"
        };

        
        String[][] athletes = {
            
            {"Anton", "Budi", "Citra", "Doni", "Eka"},
            
      
            {"Fajar", "Gita", "Hadi", "Indra", "Jeni"},
            

            {"Kiki", "Lina", "Mona", "Nino", "Omar"},
            
    
            {"Putra", "Qori", "Rina", "Sari", "Tono"}
        };

        System.out.println("=========================================");
        System.out.println("   Daftar Atlet Porseni 2024 - Polinema   ");
        System.out.println("=========================================");
        for (int i = 0; i < athletes.length; i++) {
            
           
            System.out.println("\n--- Cabang Olahraga: " + sports[i] + " ---");

           
            for (int j = 0; j < athletes[i].length; j++) {
                
              
                System.out.println("  Atlet " + (j + 1) + ": " + athletes[i][j]);
            }
        }
    }
}