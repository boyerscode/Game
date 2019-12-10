public class Player {
    private String name;
    private int score;


    public Player(String name){
        this.name = name;

        score = 0;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + "\nScore: " + score);
    }
    //remove below and inline
    public void scorePoint(){
        score++;
    }
}


