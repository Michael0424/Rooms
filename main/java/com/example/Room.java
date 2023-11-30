package main.java.com.example;
import java.util.ArrayList;

public class Room {
    private int occupancy;
    private double price;
    private boolean occupied;
    private ArrayList<Guest> guest_list;
    private int guest;

    public Room(int occupancy, double price, boolean occupied){
        this.occupancy = occupancy;
        this.price = price;
        this.occupied = occupied;
        this.guest_list = new ArrayList<Guest>();
        this.guest=guest;
       
    }
    public ArrayList<Guest> getGuest() {
        return this.guest_list;
    }
    public int getOccupancy(){
        return this.occupancy;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean getOccupied(){
        return this.occupied;
    }
    public void setOccupancy(int newOccupancy){
        this.occupancy = newOccupancy;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void setoccupied(boolean newOccupied){
        this.occupied = newOccupied;
    }
    // public void guest(Guest guest) {
    //     this.guest_list.remove(guest);
    // }
    public void addguests(Guest guest) {
    }

    //add guest
    //remove guest

}




