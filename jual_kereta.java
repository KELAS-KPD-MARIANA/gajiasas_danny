
package pembahagianduanombor;
import java.util.Scanner;
public class jual_kereta {
public static void main (String[]args){
    
    Scanner input= new Scanner (System.in);
    
    double gajiasas = 1800.00;
    double komisyen;
    int bil;
    
    System.out.println("Masukkan bilangan kereta=");
    bil = input.nextInt();
    
    if(bil >=10){
        komisyen = 10000.00;
    }
    else if(bil>=5 && bil <=9){
        komisyen = 6000.00;
    }
    else if(bil>=1 && bil<=4){
        komisyen = 3000.00;
    }
    else{
        komisyen = 0;
    }
       
    double jumlahgaji = gajiasas + komisyen;
    
    System.out.println("Jumlah kereta dijual :" +bil);
    System.out.println("Jumlah komisyen :RM" +komisyen);
    System.out.println("Jumlah gaji:RM" +jumlahgaji);
} 
    
}
