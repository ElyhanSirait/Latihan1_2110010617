package Hitung;

public class Matematika {
    //variabel
   double bil1, bil2; 
   
   //constructor
   public Matematika(double bil1, double bil2) {
       this.bil1 = bil1;
       this.bil2 = bil2;
       }
       //method setPenjumlahan
       public double setPenjumlahan(){
        return bil1 + bil2;
       }
       
       //method setPengurangan
       public double setPengurangan(){
        return bil1 - bil2;
       }
       
       //method setPerkalian
       public double setPerkalian(){
        return bil1 * bil2;
       }
       
        //method setPembagian
       public double setPembagian(){
        return bil1 / bil2;
       }
    }
