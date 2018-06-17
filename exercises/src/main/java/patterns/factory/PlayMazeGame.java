package patterns.factory;

public class PlayMazeGame {

    public static void main(String[] args) {
        MazeGame ordinaryMazeGame = new OrdinaryMazeGame();
        MazeGame magicMazeGame = new MagicMazeGame();

        Room ordinaryRoom = ordinaryMazeGame.makeRoom();
        Room magicRoom = magicMazeGame.makeRoom();

        System.out.println("ordinary room walls: " + ordinaryRoom.getNumberOfWalls());
        System.out.println("magic room color: " + magicRoom.getColor());

        //what next ... ?
    }
}
