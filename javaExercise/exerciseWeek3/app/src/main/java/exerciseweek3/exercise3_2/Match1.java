package exerciseweek3.exercise3_2;

import exerciseweek3.exercise3_1.Player;

/*2. Create class Match that has:
- Two attributes of object type Player, player1 and player2, visibility private

2.1. Add method play, which has return value void, no parameters and visibility is public. This method calls the play()-method of both players. The method prints out the name of the winning player (developer can decide who wins.. ;-) using getter.  */
public class Match1 {
    private Player player1 = new Player("Kimi",100);
    private Player player2 = new Player("Mika",101);

    public void play1(){
        player1.play();
        player2.play();
        System.out.println(player1.getName());
    }
    

}
