package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    static Scanner s = new Scanner(System.in);
    Dealership dealership;

    public UserInterface() {
        display();
    }

    private void displayVehicles(List<Vehicle> vehicleList){
        System.out.println(dealership.getName() + "|" + dealership.getAddress() +"|" + dealership.getPhone() + '\n');

        for(Vehicle v : vehicleList){

            System.out.println(v.getVin() +"|"+ v.getYear()+"|"+v.getMake()+"|"+v.getModel()+"|"+ v.getVehicleType()+"|"+v.getColor()+"|"+v.getOdometer()+"|"+v.getPrice());
        }
    }

    private void init() {
        this.dealership = DealershipFileManager.getDealership();
    }

    public void display(){
        init();
        System.out.println("\nWelcome!");

        String choice = strAns("Please select options below : \n" +
                "1 - Find vehicles within price range \n" +
                "2 - Find vehicles by make / model \n" +
                "3 - Find vehicles by year range \n" +
                "4 - Find vehicles by color \n" +
                "5 - Find vehicles by mileage range \n" +
                "6 - Find vehicles by type(car, truck, SUV, van) \n" +
                "7 - List all vehicles \n" +
                "8 - Add a vehicle \n" +
                "9 - Remove a vehicle \n" +
                "99 - Quit \n" +
                "Enter: ");

        switch(choice) {
            case "1":
                processGetByPriceRequest();
                break;
            case "2":
                processGetByMakeModelRequest();
                break;
            case "3":
                processGetByYearRequest();
                break;
            case "4":
                processGetByColorRequest();
                break;
            case "5":
                processGetByMileageRequest();
                break;
            case "6":
                processGetByVehicleTypeRequest();
                break;
            case "7":
                processGetAllVehiclesRequest();
                break;
            case "8":
                processAddVehicleRequest();
                break;
            case "9":
                processRemoveVehicleRequest();
                break;
            case "99":
                System.out.println("Thank you for using our program!");
                System.exit(0);
                break;
        }
    }

    public void processGetByPriceRequest (){
        System.out.println("Please enter the information below to continue with your price range request.\n");
        double min = Double.parseDouble(strAns("What is your minimum price for a vehicle?\n"));
        double max = Double.parseDouble(strAns("What is your maximum price range for a vehicle?\n"));

        List<Vehicle> vehicleList = dealership.getVehiclesByPrice(min, max);
        displayVehicles(vehicleList);
    }

    public void processGetByMakeModelRequest (){
        System.out.println("Please enter the information below to continue with your make and model request.\n");
        String make = strAns("What the make of the vehicle you are looking for?\n");
        String model = strAns("What the model of the vehicle you are looking for?\n");

        List<Vehicle> vehicleList = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(vehicleList);
    }

    public void processGetByYearRequest (){
        System.out.println("Please enter the information below to continue with your year range request.\n");
        int min = Integer.parseInt(strAns("What is your minimum year for a vehicle?\n"));
        int max = Integer.parseInt(strAns("What is your maximum year for a vehicle?\n"));

        List<Vehicle> vehicleList = dealership.getVehiclesByYear(min, max);
        displayVehicles(vehicleList);
    }

    public void processGetByColorRequest (){
        System.out.println("Please enter the information below to continue with your color request.\n");
        String color = strAns("What the color of the vehicle you are looking for?\n");

        List<Vehicle> vehicleList = dealership.getVehiclesByColor(color);
        displayVehicles(vehicleList);
    }

    public void processGetByMileageRequest (){
        System.out.println("Please enter the information below to continue with your mileage range request.\n");
        int min = Integer.parseInt(strAns("What is your minimum mileage for a vehicle?\n"));
        int max = Integer.parseInt(strAns("What is your maximum mileage for a vehicle?\n"));

        List<Vehicle> vehicleList = dealership.getVehiclesByMileage(min, max);
        displayVehicles(vehicleList);
    }

    public void processGetByVehicleTypeRequest (){
        System.out.println("Please enter the information below to continue with your vehicle type request.\n");
        String vehicleType = strAns("What the vehicle type of the vehicle you are looking for?\n");

        List<Vehicle> vehicleList = dealership.getVehiclesByType(vehicleType);
        displayVehicles(vehicleList);
    }

    public void processGetAllVehiclesRequest (){
        List<Vehicle> vehicleList = dealership.getAllVehicles();
        displayVehicles(vehicleList);
    }

    public void processAddVehicleRequest (){

        int vin = Integer.parseInt(strAns("What is the vehicle's vin number? "));

        int year = Integer.parseInt(strAns("What is the vehicle's year? "));

        String make = strAns("What is the vehicle's make?");

        String model = strAns("What is the vehicle's model?");

        String vehicleType = strAns("What is the vehicle's type?");

        String color = strAns("What is the vehicle's color?");

        int odometer = Integer.parseInt(strAns("What is the vehicle's odometer mileage?"));

        double price = Double.parseDouble(strAns("What is the vehicle's price? "));

        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

        this.dealership.addVehicle(vehicle);

        DealershipFileManager.saveDealership(this.dealership);

        displayVehicles(this.dealership.getInventory());
    }

    public void processRemoveVehicleRequest(){
        int vin = Integer.parseInt(strAns("What is the vin of the vehicle you would like to remove?\n"));

        dealership.removeVehicle(vin);

        DealershipFileManager.saveDealership(this.dealership);
    }

    public static String strAns(String message){
        System.out.println(message);
        return s.nextLine().trim();
    }



}
