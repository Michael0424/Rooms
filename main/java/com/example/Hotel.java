package main.java.com.example;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> room_list;
    private String name;
    private ArrayList<Employee> employee_list;

    public Hotel(String name) {
        this.name = name;
        this.room_list = new ArrayList<Room>();
        this.employee_list = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployee() {
        return this.employee_list;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Room> getList() {
        return this.room_list;
    }

    public void setemployee(ArrayList<Employee> employee) {
        this.employee_list = employee;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setRoom(ArrayList<Room> room) {
        this.room_list = room;
    }

    public void hireEmployee(Employee employee) {
        this.employee_list.add(employee);
    }

    public void fireEmployee(Employee employee) {
        this.employee_list.remove(employee);
    }

    // public boolean book(int number_of_people, double budget) {
    // ArrayList<Room> addordable=new Arraylist<Room>();
    public boolean book(ArrayList<Guest> guests, double budget) {
        ArrayList<Room> available_rooms = new ArrayList<Room>();
        // get all available rooms
        for (Room room : this.room_list) {
            if (room.getOccupied() == false) {
                available_rooms.add(room);
            }
        }

        // sort rooms from lowest to highest price
        for (int i = 0; i < available_rooms.size(); i++) {
            for (int x = 0; x < available_rooms.size() - 1 - x; x++) {
                if (available_rooms.get(x).getPrice() > available_rooms.get(x + 1).getPrice()) {
                    // save x into a temp variable
                    Room temp = available_rooms.get(x);
                    available_rooms.set(x, available_rooms.get(x + 1));
                    // save temp into x + 1
                    available_rooms.set(x + 1, temp);
                }
            }
        }
        ArrayList<Room> Booked = new ArrayList<Room>();
        int people_accomodated = 0;
        int guestIndex;
        // get all the rooms required for booking
        for (Room room : available_rooms) {
            if (people_accomodated < guests.size()) {
                Booked.add(room);
                people_accomodated = people_accomodated + room.getOccupancy();
            }
        }

        if (people_accomodated < guests.size()) {
            return false;
        }
        double total_Cost = 0;

        for (Room room : Booked) {
            total_Cost = total_Cost + room.getPrice();
        }
        if (total_Cost > budget) {
            return false;
        }
        int guestInrooms = 0;
        for (Room room : Booked) {
            room.setoccupied(true);
            for (int i = 0; i < getOccupancy(); i++) {
                // if (guests.contains(guests.get(guestInrooms + i))) {
                // room.addguests(guests.get(guestInrooms +i));
                // }
                // room.addguests(guests.get(i));
                // guests.remove(i);

            }

        }
        guestInrooms = 0;
        // loop through booking rooms, add guests inside the booked room according to
        // the people it can allow, use .addGuest()
        return true;
        // loop over the rooms in rooms for booking and set each room to occupied
        // create counter variable for how many ppl you already have a room for
        // initialize this to 0

        // loop over
        // check all the condition where booking is not possible
        // if ant conditions not possible than return false
    }

    private int getOccupancy() {
        return 0;
    }

    public Boolean book(int i, int budget) {
        return null;
    }

}
