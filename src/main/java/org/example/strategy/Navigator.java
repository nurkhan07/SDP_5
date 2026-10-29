//gives task to the strategy to build a route between two locations
package org.example.strategy;
import java.util.Objects;
/** Context: delegates to the currently selected strategy. */
public class Navigator {
    private RouteStrategy strategy;
    public Navigator(RouteStrategy strategy) { setStrategy(strategy); }
    public void setStrategy(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "Strategy must not be null.");
    }
    public RouteResult planRoute(String origin, String destination, double distanceKm) {
        return strategy.buildRoute(origin, destination, distanceKm);
    }
}
