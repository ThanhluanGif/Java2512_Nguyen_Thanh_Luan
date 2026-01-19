package Bai1.btvn;

public class b3 {
    public static void main(String[] args) {
        Car car1 = new Car("VinFast VF8", 1_000_000_000);
        Car car2 = new Car("Toyota Vios", 500_000_000);

        car1 = car2;

        car1.setModel("Mazda 3");
        System.out.println("car2.model = " + car2.getModel());
    }

    public static class Car {
        private String model;
        private double price;

        public Car(String model, double price) {
            this.model = model;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public double getPrice() {
            return price;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}