package exerciseweek3.exercise3_2;

import exerciseweek3.exercise3_1.Player;

public class Match {
    
    //Two attributes of object type Player, player1 and player2, visibility private
    // private Player player1 = new Player("Musti", 98);
    // private Player player2 = new Player("Vääinö", 98);

    public Player getPlayer2() {
        return player2;
    }
    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
    public Player getPlayer1() {
        return player1;
    }
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }


    //2.1. Add method play, which has return value void, no parameters and visibility is public. This method calls the play()-method of both players. The method prints out the name of the winning player (developer can decide who wins.. ;-) using getter. 
    public void play1(){
        player1.play();
        player2.play();
        System.out.println(player2.getName() + " wins.");
    }

    //2.2. Modify play()-method to check which player has more points and print out the name winning of the winning player object. If points are equal, print out "Tie!". 
    public void play2(){
        //player1.play();
        //player2.play();
        System.out.println(player1.toString());
        System.out.println(player2.toString());
        if (player1.getPoints() > player2.getPoints()){
            System.out.println(player1.getName() + " win!");
        } else if (player1.getPoints() < player2.getPoints()) {
             System.out.println(player1.getName() + " win!");
        } else{
             System.out.println("Tie!");
        }
    }

    //2.3. In class Match, create getter and setter methods for both players 18 and 2). Also declare both player objects in the class Match as empty this way "private Player player1 = null;". 
        private Player player1 = null;
        private Player player2 = null;


    //2.4. In class Match, modify the method play() followingly:
    //- Modify the method play() signature to "public Player play()", so it now returns object type Player. 
    //- Modify the play() method to check which player has more points and return him/her object. So, if player1 has more points, you now "return player1;" from the if statement. 
    //- If the points of players are equal, return empty object (i.e. null) this way "return null;"

    public Player play4(){
        if (player1.getPoints() > player2.getPoints()){
            return player1;
        } else if (player1.getPoints() < player2.getPoints()) {
             return player2;
        } else {
            return null;
        }

    }
    
}
