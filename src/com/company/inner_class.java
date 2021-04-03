package com.company;
// brain is inner class
// robot is constructor
class robot{
    int id;
    robot(int a){
        this.id = a;
        brain b = new brain();
        b.think(id);
    }
    private static class brain{
        void think(int a){
            System.out.println(a + " is thinking");
        }
    }
}

public class inner_class {
    public static void main(String[] args) {
        robot r = new robot(12);
    }

}
