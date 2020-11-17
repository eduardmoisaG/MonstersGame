package MonstersGame;

public class Main {

    public static void main(String[] args) {
        Monster waterM = new WaterMonster("Morphling");
        Monster fireM = new FireMonster("Phoenix");
        Game game = new Game(waterM, fireM);
        game.startGame();
    }
}
