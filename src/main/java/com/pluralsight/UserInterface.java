package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    Scanner s = new Scanner(System.in);
    Dealership dealership;

    public UserInterface() {

    }

    private void displayVehicles(Dealership dealership){
        
    }

    private void init() {
        this.dealership = DealershipFileManager.getDealership();
    }

    public void display(){
        init();
        System.out.println("What do you want to do?");
        System.out.println("Please select options below : \n" +
            "1 - Find vehicles within price range \n" +
            "2 - Find vehicles by make / model \n" +
            "3 - Find vehicles by year range \n" +
            "4 - Find vehicles by color \n" +
            "5 - Find vehicles by mileage range \n" +
            "6 - Find vehicles by type(car, truck, SUV, van) \n" +
            "7 - List all vehicles \n" +
            "8 - Add a vehicle \n" +
            "9 - Remove a vehicle \n" +
            "99 - Quit \n"
        );

        String choice = s.nextLine();

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

    }

    public void processGetByMakeModelRequest (){

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



}
