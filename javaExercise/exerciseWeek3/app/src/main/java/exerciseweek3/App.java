/*
 * This source file was generated by the Gradle 'init' task
 */
package exerciseweek3;
import exerciseweek3.exercise3_1.*;
import exerciseweek3.exercise3_2.*;
import exerciseweek3.exercise3_3.BXM;
import exerciseweek3.exercise3_3.C;


public class App {

    public static void main(String[] args) {


    /* Exercise: 3_Object-oriented Java */ 
    /** exercise3_1 create class Player  **/ 
        // Player ply1 = new Player ("Tina", 87);
        // ply1.play();
        // System.out.println(ply1.toString());


    /**  exercise3_2 create class Match  **/
        Match match1 = new Match();

        Player ply1 = new Player ("Tina", 87);
        Player ply2 = new Player ("Sheldon", 187);
        
        match1.setPlayer1(ply1);
        match1.setPlayer2(ply2);
        match1.play1();
        System.out.println(ply1.getPoints());
        System.out.println(ply2.getPoints());
        //match1.play4();  returns Player, need to have a variable to store the result
        Player winner = match1.play4();
        System.out.println(winner.getName() + " wins!");

    /** exercise3_3 create class Bicycle*/
        BXM bxm = new BXM();
        bxm.info();

    /** exercise3_3_4 Modify classes A and C **/ 
        C c1 = new C(5);
        System.out.println(c1.sum());
         


    }

}
