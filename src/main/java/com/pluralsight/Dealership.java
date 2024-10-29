package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private static String name;
    private static String address;
    private static   String phone;

   private static ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Dealership.name = name;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Dealership.address = address;
    }

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        Dealership.phone = phone;
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
