package creacionais.builder;

class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    private Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    public static class CarBuilder {
        private String make;
        private String model;
        private int year;
        private String color;

        public CarBuilder setMake(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder setModel(String model) {
            if (model.isEmpty() || model.isBlank()) {
                model = "Não foi especificado";
            }
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format(
                "Carro: \n " +
                        "\tMarca: %s \n" +
                        "\tModelo: %s \n" +
                        "\tAno: %d \n" +
                        "\tCor: %s", make, model, year, color);
        }
}
