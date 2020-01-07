package com.company;

import java.util.*;

public class WestminsterCarParkManager implements CarParkManager {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String id;
        String brand;
        String entry_time_date;
        int doors;
        String colour;
        int cargo_vol;
        int engine_size;
        int parkingSlots=20;
        int vehicles;
        String type;
        int cars;
        int vans;
        int motorbikes;
        String[] vehicle;
        Vehicle vehicle[]=new Vehicle[20];
        Car car=new Car();
        Van van=new Van();
        Motorbike motorbike=new Motorbike();

        System.out.println("What do you want to do?");
        System.out.println("1-Add a new vehical");
        System.out.println("2-Delete a vehicle");
        System.out.println("3-Print the list of vehicles");
        System.out.println("4-Percentage of vehicles");
        System.out.println("5-Vehicle parked for the longest time");
        System.out.println("6-Last vehicle parked");
        System.out.println("7-List of vehicle, which enter in the parking in a specified day");
        System.out.println("8-Parking charges ");

        int ans1=input.nextInt();

        switch (ans1){
            case 1:
                if (parkingSlots==20){
                    System.out.println("No free slots...");
                }else{
                    System.out.println("Select the vehicle type:");
                    System.out.println("1-Car");
                    System.out.println("2-Van");
                    System.out.println("3-Motorbike");
                    int ans2=input.nextInt();

                    switch (ans2){
                        case 1:
                            System.out.println("Vehicle id:");
                            id= input.nextLine();
                            System.out.println("brand:");
                            brand=input.nextLine();
                            System.out.println("entry_time_date:");
                            entry_time_date=input.nextLine();
                            System.out.println("No of doors:");
                            doors=input.nextInt();
                            System.out.println("Colour:");
                            colour=input.nextLine();
                            parkingSlots--;
                            cars++;
                            break ;
                        case 2:
                            System.out.println("Vehicle id:");
                            id=input.nextLine();
                            System.out.println("brand:");
                            brand=input.nextLine();
                            System.out.println("entry_time_date:");
                            entry_time_date=input.nextLine();
                            System.out.println("Cargo volume:");
                            cargo_vol=input.nextInt();
                            parkingSlots=parkingSlots-2;
                            vans++;

                            break ;
                        case 3:
                            System.out.println("Vehicle id:");
                            id=input.nextLine();
                            System.out.println("brand:");
                            brand=input.nextLine();
                            System.out.println("entry_time_date:");
                            entry_time_date=input.nextLine();
                            System.out.println("Engine size:");
                            engine_size=input.nextInt();
                            parkingSlots--;
                            motorbikes++;

                            break ;
                        default:
                            System.out.println("Invalid input....");
                    }
                }
                break;
            case 2:
                if (parkingSlots==0){
                    System.out.println("Parking is empty");
                }else{

                }

                break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            case 8:break;
            default:
        }


    }
}
