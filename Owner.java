
package javaapplication2;

public class Owner {
    private String name;
    private String ic;
    
    public Owner(String name, String ic){
        this.name = name;
        this.ic = ic;
    }
    
    public String toString() {
        return String.format ("%-15s %-15s", name , ic);
    }
}
