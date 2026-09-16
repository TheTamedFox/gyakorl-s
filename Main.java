/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rebeka
 */
public class Main {
    public static void main(String[] args){
        {
            String neve = "kunyus";
            int id = 15;
            int kor = 26;
            float pénze = 75.25f;
            char jegye = 'C';
            
            System.out.println("Student name: " + neve);
            System.out.println("Student id: " + id);
            System.out.println("Student age: " + kor);
            System.out.println("Student fee: " + pénze);
            System.out.println("Student grade: " + jegye);
            
            int hossz =5;
            int szél =8;
            int tere;
            tere = hossz * szél;
            System.out.println("a területe " + tere);
            
            int items =60;
            float costPitem = 9.99f;
            float total = items*costPitem;
            char currency = '$';
            System.out.println("számuk: " + items);
            System.out.println("áruk: " + costPitem + currency);
            System.out.println("teljes ár: " + total + currency);
            
            int maxSc = 400;
            int mySc = 320;
            double percent = (double) mySc / maxSc *100.0d;
            System.out.println("felhasználói százalék " + percent);
            
            String txt = "aerealk";
            System.out.println("hossza: " + txt.length());
            
            int votingAge =18;
            System.out.println(kor >= votingAge);
            
            int vage =20;
            if (kor >= vage){
                System.out.println("yep");
            } else {
                System.out.println("nop");
            }
            
            int choice = 1;
            switch (choice) {
                case 1:
                    System.out.println("You ordered Coffee");
		break;
                case 2:
                    System.out.println("You ordered Tea");
		break;
                default: 
                    System.out.println("Invalid choice");
                    }
            //int i = 1;
                //while (i <= 5);
                    //System.out.println(i);
                    //i++;
             
                    
            for (int i = 1; i <= 5; i++){
		System.out.println(i);
             }
            
            int[]numbers = {1,2,3};
            System.out.println(numbers[0]);
            
    
    

        }
    }
}
