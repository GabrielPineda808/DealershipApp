package com.pluralsight;

import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private  String phone;

    static List<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public static List<Vehicle> getVehiclesByPrice(double min, double max){
        return inventory;
    }

    public static List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return inventory;
    }

    public static List<Vehicle> getVehiclesByYear(int min, int max){
        return inventory;
    }

    public static List<Vehicle> getVehiclesByColor(String color){
        return inventory;
    }

    public static List<Vehicle> getVehiclesByMileage(int min, int max){
        return inventory;
    }

    public static List<Vehicle> getVehiclesByType(String vehicleType){
        return inventory;
    }

    public static List<Vehicle> getAllVehicles(){
        return inventory;
    }

    public static void addVehicle(Vehicle vehicle){

    }

    public static void removeVehicle(Vehicle vehicle){

    }

}
