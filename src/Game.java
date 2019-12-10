public class Game {
  private String name;
  private int numberOfPlayersPerTeam;
  private int scoreNeededToWin;
  private Player  player1;
  private Player player2;

  // This is a constructor.  You should see that it executes when the new command is ran.
  public Game() {
    System.out.println("Creating a brand new game.");
  }

  // This is another constructor.  This one takes input parameters to initialize the data.
  public Game(String newName, int newNumberOfPlayersPerTeam, int newScoreNeededToWin) {
    System.out.println("Creating a brand new game with initial data.");
    name = newName;
    numberOfPlayersPerTeam = newNumberOfPlayersPerTeam;
    scoreNeededToWin = newScoreNeededToWin;
  }

  public void displayInfo(){

    System.out.println(" Name: " + name + "\n Number of Players Per Team: " + numberOfPlayersPerTeam
    + "\n Score needed to win: " + scoreNeededToWin);
    System.out.println("Player 1: ");
    player1.displayInfo();
    System.out.println("Player 2: ");
    player2.displayInfo();
    //System.out.println("Number of Players Per Team: " + numberOfPlayersPerTeam);
    //System.out.println("Score needed to win: " + scoreNeededToWin);
    //System.out.println("Player 1: " + player1.getName());
    //System.out.println("Player 2: " + player2.getName());
  }

  public void setUpPlayers(Player player1, Player player2){
     this.player1 = player1;
     this.player2 = player2;
  }


}
