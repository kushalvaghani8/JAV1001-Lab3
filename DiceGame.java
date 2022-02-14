/*
Name:               Kushal Vaghani
student number:     A00247163
JAV-1001 - 11329 -  App Development for Android - 202201 - 001
Lab 3 - classes/objects
*/
public class DiceGame {

public static void main(String[] args) {


System.out.println("\nCreating a default d6...");
Die d6 = new Die(); //d6 object from die class

System.out.println("Creating a d20...");
Die d20 = new Die("d20", 20); //d20 object

System.out.println("Creating percentile die (a special d10)...");
Die d10 = new Die(10); //d10 object

System.out.println("The current side up for d6 is " + d6.currentSideUp);
System.out.println("The current side up for d20 is " + d20.currentSideUp);
System.out.println("The current side up for Percentile is " + d10.currentSideUp + "\n");

System.out.println("Testing the rolling method\n");


System.out.println("Rolling the d6... " + "\n The new value is " + d6.roll());
System.out.println("Rolling the d20... " + "\n The new value is " + d20.roll());
System.out.println("Rolling the Percentile... " + "\n The new value is " + d10.roll());


d6.currentSideUp = 6; //setting the d6 to its highest value
System.out.println("\nSetting the d6 to show 6... \n The side up is now " + d6.currentSideUp + ". Finally.\n");

System.out.print("----- \nBONUS \n----- \n");
System.out.print("Creating 5 d6...");

int a = d6.roll();
int b = d6.roll();
int c = d6.roll();
int d = d6.roll();
int e = d6.roll();

    for (int i = 0; ; i++) {
        if (a != b ){
            a = d6.roll();
            b = d6.roll();
            c = d6.roll();
            d = d6.roll();
            e = d6.roll();
        i++;
        }
       else if (b != c ) {
            a = d6.roll();
            b = d6.roll();
            c = d6.roll();
            d = d6.roll();
            e = d6.roll();
        i++;
           }
           else if (c != d ) {
            a = d6.roll();
            b = d6.roll();
            c = d6.roll();
            d = d6.roll();
            e = d6.roll();
        i++;
           }
           else if (d != e ) {
            a = d6.roll();
            b = d6.roll();
            c = d6.roll();
            d = d6.roll();
            e = d6.roll();
            i++;
           }
        else {
            System.out.println("\nYAHTZEE! It took " + i + " rolls 😱 to get " + a + b + c + d + e) ;
            break;
        }
    }
}
   
  
 }