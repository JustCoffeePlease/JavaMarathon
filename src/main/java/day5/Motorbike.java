package day5;

public class Motorbike {

        public Motorbike(String modelOfBike, String colorBike, int yearOfBikeManufacture) {
            this.yearOfBikeManufacture = yearOfBikeManufacture;
            this.modelOfBike = modelOfBike;
            this.colorBike = colorBike;
        }

        private int yearOfBikeManufacture;
        private String colorBike;
        private String modelOfBike;

        public int getYearOfBikeManufacture() {
            return yearOfBikeManufacture;
        }

        public String getColorBike() {
            return colorBike;
        }

        public String getModelOfBike() {
            return modelOfBike;
        }
    }