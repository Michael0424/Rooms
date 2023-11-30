package main.java.com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Sets up gotal with rooms
        // public Employee(String position, String id, int age, String sex, double
        // height, String name, double weight) {

        Employee brad = new Employee("Cleaning Lady", "123", 16, "female", 169.9, "brad", 90.0);
        System.out.println(brad.getheight());
        Person kerdis = new Person(3, "email", 200, "kerdis", 69.9);
        System.out.println(kerdis.getsex());
        Guest aaron = new Guest(17, "Gmail", 170, "aaron", 50, "123", true);
        System.out.println(aaron.getsex());

        Hotel pitbull = new Hotel("APCSA");
        Room economyRoom = new Room(2, 420, false);
        Room deluxeRoom = new Room(2, 6900, false);
        Room theBestRoom = new Room(2, 123456, false);
        ArrayList<Room> theBestList = new ArrayList<Room>();
        ArrayList<Employee> theAnotherList = new ArrayList<Employee>();

        pitbull.hireEmployee(brad);
        for (Employee employee : pitbull.getEmployee()) {
            System.out.println(employee.getname());
            System.out.println(employee.getsex());
        }
        // Adds the rooms to the hotel
        theBestList.add(economyRoom);
        theBestList.add(deluxeRoom);
        theBestList.add(theBestRoom);
        pitbull.setRoom(theBestList);

        // Printing stuff to make sure it works
        // System.out.println(pitbull.getName());
        // System.out.println(economyRoom.getPrice());
        Boolean bookingPossible = pitbull.book(4, 400000);
        // loop over bookedRooms
        int counter = 0;
        if (bookingPossible) {
            System.out.println("there is room avalible:");
            // get pitbull roomlist
            // loop over roomlist to make sure rooms were booked
            for (Room room : pitbull.getList()) {
                System.out.println("Room" + counter + ": " + room.getOccupancy());
                System.out.println("Room" + counter + ": " + room.getPrice());
                System.out.println("Room" + counter + ": " + room.getOccupied());
                counter++;
        
            }
        } else {
            System.out.println("There is no room for booking");
        }
        System.out.println("Hello world");

    }

}