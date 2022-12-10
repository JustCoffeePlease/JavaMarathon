package day6;

import java.util.Date;

public class Motorbike {

        public Motorbike(String modelOfBike, String colorBike, int yearOfBikeManufacture) {
            this.yearOfBikeManufacture = yearOfBikeManufacture;
            this.modelOfBike = modelOfBike;
            this.colorBike = colorBike;
        }

        private int yearOfBikeManufacture;
        private String colorBike;
        private String modelOfBike;

        Date date = new Date();

        public int getYearOfBikeManufacture() {
            return yearOfBikeManufacture;
        }

        public String getColorBike() {
            return colorBike;
        }

        public String getModelOfBike() {
            return modelOfBike;
        }

        public String info() {
            return "This is a motorbike";
        }

        public int yearDifference(int yearOfCarManufacture) {
            return date.getYear() + 1900 - yearOfCarManufacture;
        }
}