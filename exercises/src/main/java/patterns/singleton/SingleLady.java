package patterns.singleton;

public final class SingleLady {

    private static SingleLady INSTANCE;
    private String info = "All my single ladies! ... All my single ladies!";

    private SingleLady() {
    }

    public static SingleLady getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingleLady();
        }

        return INSTANCE;
    }

    // getters and setters
}
