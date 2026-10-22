package org.example.strategy;
public record RouteResult(String origin, String destination, String transportMode,
                          double distanceKm, int estimatedMinutes, String description) {
    @Override public String toString() {
        return String.format("%s route: %s -> %s | %.1f km | about %d minutes | %s",
                transportMode, origin, destination, distanceKm, estimatedMinutes, description);
    }
}
