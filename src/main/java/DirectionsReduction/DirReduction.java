package DirectionsReduction;

import java.util.*;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {

        System.out.println("Original array: " + Arrays.asList(arr));

        Map<String, String> directions = new HashMap<>();
        directions.put("EAST", "WEST");
        directions.put("WEST", "EAST");
        directions.put("NORTH", "SOUTH");
        directions.put("SOUTH", "NORTH");

        int sum = 0;
        List<String> givenDirections = new LinkedList<>(Arrays.asList(arr));
        Integer[] dirNumbRep = new Integer[arr.length];

        while (true) {
            int initSize = givenDirections.size();
            if (initSize <= 1) return givenDirections.toArray(new String[givenDirections.size()]);
            for (int s = 0; s < givenDirections.size(); s++) {
                if (s == givenDirections.size() - 1) continue;
                if (givenDirections.get(s).equals(directions.get(givenDirections.get(s + 1)))) {
                    givenDirections.remove(s);
                    givenDirections.remove(s);
                    System.out.println(givenDirections);
                }
            }
            if(initSize == givenDirections.size()) return givenDirections.toArray(new String[givenDirections.size()]);
        }
    }
}
