# Assignment #5 — Strategy Pattern

## Overview
Java 17 demonstration of the Strategy behavioral design pattern using route planning. `Navigator` delegates to a selected strategy and supports switching strategies at runtime.

## Roles
- **Strategy:** `RouteStrategy`
- **Concrete Strategies:** `CarStrategy`, `WalkStrategy`, `CycleStrategy`
- **Context:** `Navigator`
- **Client:** `Main`
- **Result model:** `RouteResult`

## How it works
Each strategy estimates travel time using illustrative average speeds: car 40 km/h, walking 5 km/h, and bicycle 18 km/h. These are educational estimates, not live navigation data.

```java
Navigator navigator = new Navigator(new CarStrategy());
navigator.planRoute("AITU", "Baiterek", 6.0);
navigator.setStrategy(new WalkStrategy());
navigator.planRoute("AITU", "Baiterek", 6.0);
```

## Project structure
```text
Assignment5_Strategy/
├── src/main/java/org/example/strategy/
│   ├── CarStrategy.java
│   ├── CycleStrategy.java
│   ├── Main.java
│   ├── Navigator.java
│   ├── RouteResult.java
│   ├── RouteStrategy.java
│   └── WalkStrategy.java
├── UML/strategy.puml
├── README.md
├── REPORT.md
└── pom.xml
```

## How to run
1. Install JDK 17.
2. Open in IntelliJ IDEA and set Project SDK to Java 17.
3. Run `Main.java`.

## Clean Code principles
1. **Polymorphism instead of conditionals:** `Navigator` delegates through `RouteStrategy` and has no strategy-type `if/switch`.
2. **Meaningful names:** strategy and method names reveal intent.
3. **Single Responsibility:** each concrete strategy implements one algorithm.
4. **Algorithm-agnostic Context:** `Navigator` depends on the interface, not concrete strategies.
5. **Extensibility / Open-Closed Principle:** add a new `RouteStrategy` implementation without changing `Navigator`.
6. **Input validation:** invalid locations and distances are rejected.

## UML
See `UML/strategy.puml`.

**Note:** This is a route-planning simulation, not a real GPS service.
