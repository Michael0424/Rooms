package main.java.com.example;

// public Employee(String position, String id, int age, String sex, double height, String name, double weight) {
//     super(age, sex, height, name, weight);
//     this.position = position;
//     this.id = id;

//Guest aaron = new Guest(17,"Gmail",170,"aaron",50,123,true);

public class Guest extends Person {
    private boolean breakfast;
    private String id;

public Guest(int age, String sex, double height, String name, double weight,String id,boolean breakfast){
    super(age, sex, height, name, weight);
    this.breakfast = breakfast;
    this.id=id;
}

    public boolean getbreakfast() {
        return this.breakfast;
    }
    public String getid(){
        return this.id;
    }
    public void setbreakfast(boolean newbreakfast) {
        this.breakfast = newbreakfast;
    }
    public void setid(String newid){
        this.id=newid;
    }
    //public void setid(String newid){
    //    this.id=newid;
  //  }


}

    


