package com.company;
import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("kishan kumar",420);
        hash.put("Saumya kumar", 1232);
        hash.put("Ankit Sharma",6548);
        System.out.println(hash.get("kishan kumar"));
        System.out.println(hash.size());
    }
}
