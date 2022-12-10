package day6;

import java.util.Date;

public class Car {

        private int yearOfCarManufacture;
        private String colorCar;
        private String modelOfCar;

        Date date = new Date();

        public int getYearOfCarManufacture() {
            return yearOfCarManufacture;
        }

        public void setYearOfCarManufacture(int yearOfCarManufacture) {
            this.yearOfCarManufacture = yearOfCarManufacture;
        }
        public void setColorCar(String colorCar) {
            this.colorCar = colorCar;
        }

        public String getColorCar() {
            return colorCar;
        }

        public void setModelOfCar(String modelOfCar) {
            this.modelOfCar = modelOfCar;
        }

        public String getModelOfCar() {
            return modelOfCar;
        }

        public String info() {
            return "This is a car";
        }

        public int yearDifference(int yearOfCarManufacture) {
            return date.getYear() + 1900 - yearOfCarManufacture;
        }
}

