package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    static Scanner s = new Scanner(System.in);
    Dealership dealership;

    public UserInterface() {

    }

    private void displayVehicles(List<Vehicle> vehicleList){
        for(Vehicle v : vehicleList){
            System.out.println(v);
        }
    }

    private void init() {
        this.dealership = DealershipFileManager.getDealership();
    }

    public void display(){
        init();
        System.out.println("What do you want to do?");

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

    public static void processGetByYearRequest (){

    }

    public void processGetByColorRequest (){

    }

    public void processGetByMileageRequest (){

    }

    public void processGetByVehicleTypeRequest (){

    }

    public void processGetAllVehiclesRequest (){

    }

    public void processAddVehicleRequest (){

    }

    public void processRemoveVehicleRequest(){

    }

    public static String strAns(String message){
        System.out.println(message);
        return s.nextLine();
    }



}
