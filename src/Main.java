import java.util.Random;

public class Main {
    static Player jim;
    static Player john;
    static Game pingPong;
    public static void main(String[] args) {
      System.out.println("Starting...");
      pingPong = new Game("pingPong",10,11);


      jim = new Player("Jim");
      john = new Player("John");
      pingPong.setUpPlayers(jim,john);
      pingPong.displayInfo();
      simulateGame();

    }

    private static void simulateGame() {
        System.out.println("Simulating Game.");
        for(int i = 0; i <10; i++){
            Random random = new Random();
            int ran = random.nextInt(2);
            if(ran == 0){
                jim.scorePoint();
            }
            else {
                john.scorePoint();
            }
        }
        pingPong.displayInfo();
    }
}
