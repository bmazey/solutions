package structures;

import java.util.LinkedList;
import java.util.Queue;

public class MovieQueue {

    public static void main (String[] args) {

    }

    public Queue<String> createMovieQueue() {
        Queue<String> myMovieQueue = new LinkedList<String>();
        myMovieQueue.add("Leonardo");
        myMovieQueue.add("Donatello");
        myMovieQueue.add("Raphael");
        myMovieQueue.add("Michelangelo");

        return myMovieQueue;
    }
}
