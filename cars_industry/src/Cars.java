import java.util.*;

public class Cars {
    String model;
    Integer year;
    Engine engine;
    public ArrayList<Tire> tire = new ArrayList<>(4);

    public Cars() {

        for (int i = 0; i < 2; i++) {
            this.tire.add(new Tire("Pirelli", 70, 195));
        }
        for (int i = 0; i < 2; i++) {
            this.tire.add(new Tire("Michelin", 70, 195));
        }
    }

    public String getModel() {

        return this.model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public Integer getYear() {

        return this.year;
    }

    public void setYear(Integer year) {

        this.year = year;
    }

    public Engine getEngine() {

        return this.engine;
    }

    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public List<Tire> getTires() {

        return this.tire;
    }
}
