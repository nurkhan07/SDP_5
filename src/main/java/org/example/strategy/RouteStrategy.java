package org.example.strategy;
public interface RouteStrategy {
    RouteResult buildRoute(String origin, String destination, double distanceKm);
}
