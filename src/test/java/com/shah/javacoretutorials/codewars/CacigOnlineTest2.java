package com.shah.javacoretutorials.codewars;


import java.util.*;

class CacigOnlineTest2 {




    public static List<Integer> countRotations(int nCogwheels, List<List<Integer>> connections) {
        // Handle the case where there are no connections
        if (connections.isEmpty()) {
            return Arrays.asList(1, 0); // Only cogwheel 0 rotates clockwise
        }

        // Step 1: Create the graph (adjacency list)
        Map<Integer, List<Integer>> listHashMap = new HashMap<>();
        for (List<Integer> connection : connections) {
            int a = connection.get(0);
            int b = connection.get(1);
            listHashMap.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            listHashMap.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        // Step 2: Initialize the rotation array (0 means unvisited, 1 means clockwise, -1 means counter-clockwise)
        int[] wheelRotations = new int[nCogwheels];
        Arrays.fill(wheelRotations, 0);
        wheelRotations[0] = 1; // Cogwheel 0 rotates clockwise

        // Step 3: Perform BFS to determine the rotations
        Queue<Integer> determineRotations = new LinkedList<>();
        determineRotations.add(0);

        while (!determineRotations.isEmpty()) {
            int current = determineRotations.poll();
            int currentRotation = wheelRotations[current];

            // Traverse all connected cogwheels
            for (int nextWheels : listHashMap.get(current)) {
                if (wheelRotations[nextWheels] == 0) { // If not visited
                    wheelRotations[nextWheels] = -currentRotation; // Alternate the rotation direction
                    determineRotations.add(nextWheels);
                } else if (wheelRotations[nextWheels] == currentRotation) { // Conflict (deadlock)
                    return Arrays.asList(-1, -1); // Deadlock detected
                }
            }
        }

        // Step 4: Count clockwise and counter-clockwise rotations
        int cwCounter = 0, ccwCount = 0;
        for (int r : wheelRotations) {
            if (r == 1) {
                cwCounter++;
            } else if (r == -1) {
                ccwCount++;
            }
        }

        return Arrays.asList(cwCounter, ccwCount);
    }
}


	


