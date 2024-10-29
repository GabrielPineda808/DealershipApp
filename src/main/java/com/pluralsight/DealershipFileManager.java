package com.pluralsight;

import java.io.*;

public class DealershipFileManager {

    public static Dealership getDealership(){

        Dealership dealership;

        try {

            BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));

            String line;

            String[] dealer = br.readLine().split("\\|");;

            dealership = new Dealership(dealer[0],dealer[1],dealer[2]);

            while ((line = br.readLine())!= null){
                String[] data = line.split("\\|");
                Vehicle vehicle = new Vehicle(Integer.parseInt(data[0]),Integer.parseInt(data[1]),data[2],data[3],data[4],data[5],Integer.parseInt(data[6]), Double.parseDouble(data[7]));
                dealership.addVehicle(vehicle);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  dealership;
    }

    public static void saveDealership(Dealership dealership){
    }
}
