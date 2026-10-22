package org.example.strategy;
/** Client: selects strategies and demonstrates runtime switching. */
public class Main {
    public static void main(String[] args) {
        String origin = "Astana IT University";
        String destination = "Baiterek";
        double distanceKm = 6.0;
        Navigator navigator = new Navigator(new CarStrategy());
        System.out.println("=== Car strategy ===");
        System.out.println(navigator.planRoute(origin, destination, distanceKm));
        navigator.setStrategy(new WalkStrategy());
        System.out.println("\\n=== Walking strategy ===");
        System.out.println(navigator.planRoute(origin, destination, distanceKm));
        navigator.setStrategy(new CycleStrategy());
        System.out.println("\\n=== Bicycle strategy ===");
        System.out.println(navigator.planRoute(origin, destination, distanceKm));
    }
}
