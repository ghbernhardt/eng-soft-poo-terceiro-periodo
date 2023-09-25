package Stephanie_Lima_Ho;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example {

    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap<>();

        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        // Iterando Map
        for (String chave : vehicles.keySet()) {
            System.out.println("Valor chave: " + chave);
        }

    }

}
