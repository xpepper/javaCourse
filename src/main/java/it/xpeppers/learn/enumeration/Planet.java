package it.xpeppers.learn.enumeration;

public enum Planet {

    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    VENUS(4.869e+24, 6.0518e6);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public static final double G = 6.67300E-11;

    public double getSurfaceGravity() {
        return G * mass / (radius * radius);
    }

    public double getSurfaceWeight(double mass) {
        return mass * getSurfaceGravity();
    }

    public static void main(String[] args) {
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight/Planet.EARTH.getSurfaceGravity();
        for(Planet p : Planet.values()) {
            System.out.println("Your weight on " + p + " is " + p.getSurfaceWeight(mass));
        }
    }
}

