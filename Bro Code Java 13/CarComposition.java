public class CarComposition {

    // Variables
    String model;
    int year;
    // Engine object
    Engine engine;

    CarComposition(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start() {
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}
