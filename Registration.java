
package javaapplication2;

public class Registration {
    private static int count = 1001;
    
    private int registration;
    private Owner owner;
    private Car car;

    public Registration(Owner owner, Car car){
        this.owner = owner;
        this.car = car;
        this.registration = count;
        count ++;
    }
    
    public String toString(){
        return String.format ("%-10d %s %s", registration, owner.toString(), car.toString());
    }

    public static int getCount() {
        return count;
    }
    
    
    
}
