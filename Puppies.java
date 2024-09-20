
public class Puppies {
    String name;
    boolean isMale;
    int NumbersOfPuppies;
    String[] listOfPuppies;
    

public void setName(String thisname){
    name= thisname;
}
public String showName(){
    return name;
}
public static void bark(){
    System.out.println ("Woof Woof");
}
public void setNumbersOfPuppies(int numOfPuppies){
    NumbersOfPuppies = numOfPuppies;
}
public void setPuppies(String[] puppy){
    listOfPuppies = puppy;
}
public void showPuppies(){
    for (int i=0; i< listOfPuppies.length; i++){
     System.out.println("Puppie's Name:" + listOfPuppies.length);
}
}
}



