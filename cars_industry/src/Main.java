public class Main {
    public static void main(String[] args) throws Exception {
        Engine m = new Engine();
        m.setNumCylinder(4);
        m.setPower(100);

        Cars c1 = new Cars();
        c1.setModel("Fusca");
        c1.setYear(1960);
        c1.setEngine(m);
        for (Tire tire : c1.tire) {
            System.out.println("The tire model " + tire + " is: " + tire.getModel() + ", the height is:"
                    + tire.getHeight() + " and the width is: " + tire.getWidth());
        }

    }
}
