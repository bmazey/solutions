package patterns.factory;

public class PlayMazeGames {

    public static void main(String[] args) {
        MazeGame ordinaryMazeGame = new OrdinaryMazeGame();
        MazeGame magicMazeGame = new MagicMazeGame();

        Room room = ordinaryMazeGame.makeRoom();

        System.out.println("number of walls: " + room.getNumberOfWalls());

        //what next ... ?
    }
}
