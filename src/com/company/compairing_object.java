package com.company;
class name{
    String n;
    name(String s){
        this.n = s;
    }

}
/*Despite having two objects with the same name, the equality testing returns false,
 because we have two different objects (two different references or memory locations).
 */
public class compairing_object {
    private int a;
    public static void main(String[] args) {
        name n = new name("saumya");
        name n1 = new name("saumya");
        System.out.println(n.equals(n1)); // or (n == n1)
        compairing_object b = new compairing_object();
        b.a = 5;
        compairing_object c = new compairing_object();
        c.a = 5;
        System.out.println(b == c);
        System.out.println(b.a == c.a);
    }
}
