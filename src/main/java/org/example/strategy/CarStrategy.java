package org.example.strategy;
public class CarStrategy implements RouteStrategy {
    private static final double AVERAGE_SPEED_KMH = 40.0;
    @Override public RouteResult buildRoute(String origin, String destination, double distanceKm) {
        validate(origin, destination, distanceKm);
        return new RouteResult(origin, destination, "Car", distanceKm,
                (int)Math.ceil(distanceKm / AVERAGE_SPEED_KMH * 60), "Uses roads suitable for cars");
    }
    private void validate(String origin, String destination, double distanceKm) {
        if (origin == null || origin.isBlank()) throw new IllegalArgumentException("Origin must not be blank.");
        if (destination == null || destination.isBlank()) throw new IllegalArgumentException("Destination must not be blank.");
        if (!Double.isFinite(distanceKm) || distanceKm <= 0) throw new IllegalArgumentException("Distance must be a positive finite number.");
    }
}
