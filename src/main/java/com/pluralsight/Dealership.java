package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

   private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max){
        List<Vehicle> vehicleList = new ArrayList<>();
        for(Vehicle v: inventory) {
            if(v.getPrice() >= min && v.getPrice() <= max) {
                vehicleList.add(v);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        List<Vehicle> vehicleList = new ArrayList<>();
        for(Vehicle v: inventory) {
            if(v.getMake().equalsIgnoreCase(make) || v.getModel().equalsIgnoreCase(model)) {
                vehicleList.add(v);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max){
        List<Vehicle> vehicleList = new ArrayList<>();
        for(Vehicle v: inventory) {
            if(v.getYear() >= min && v.getYear() <= max) {
                vehicleList.add(v);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        List<Vehicle> vehicleList = new ArrayList<>();
        for(Vehicle v: inventory) {
            if(v.getColor().equalsIgnoreCase(color)) {
                vehicleList.add(v);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max){
        List<Vehicle> vehicleList = new ArrayList<>();
        for(Vehicle v: inventory) {
            if(v.getOdometer() >= min && v.getOdometer() <= max) {
                vehicleList.add(v);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType){
        List<Vehicle> vehicleList = new ArrayList<>();
        for(Vehicle v: inventory) {
            if(v.getVehicleType().equalsIgnoreCase(vehicleType)) {
                vehicleList.add(v);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
       inventory.add(vehicle);
    }

    public void removeVehicle(int vin){
        for(Vehicle v: inventory) {
            if(v.getVin() == vin) {
                inventory.remove(v);
            }
        }
    }

}
