/*
Name:               Kushal Vaghani
student number:     A00247163
JAV-1001 - 11329 -  App Development for Android - 202201 - 001
Lab 3 - classes/objects
*/

import java.util.*;

public class Die {

  String name;
  int noOfSides;
  int currentSideUp;


  public Die() { //0 arg - constructor / special method
    this.name = "d6";
    this.noOfSides = 6;
   roll();

 }

    public Die(int noOfSides) { // 1 arg constructor
      this.name = "d" + noOfSides;
      this.noOfSides = noOfSides;
      roll();
  }

  public Die(String name, int noOfSides) { //2 args constructor
    this.name = name;
    this.noOfSides = noOfSides;
    roll();
 }


  public int roll() { // roll method generating random number based on number of sides a dice has
    Random ran = new Random();
     this.currentSideUp = ran.nextInt(noOfSides) + 1;
    return currentSideUp;
  }



 }



