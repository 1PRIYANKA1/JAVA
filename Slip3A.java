// Define an abstract class Shape with abstract methods area () and volume (). Derive 
// abstract class Shape into two classes Cone and Cylinder. Write a java Program to 
// calculate area and volume of Cone and Cylinder.(Use Super Keyword.) 

import java.util.*;

abstract class Shape {
    final float pi = 3.14f;

    abstract void area();

    abstract void volume();
}

class Cone extends Shape {
    int rd, sh, hi;

    Cone(int r, int s, int h) {
        rd = r;
        sh = s;
        hi = h;
    }

    @Override
    void area() {
        float a = pi * rd * sh;
        System.out.println("Area of cone: " + a);
    }

    @Override
    void volume() {
        float v = (pi * (rd * rd) * hi) / 3;
        System.out.println("Volume of cone: " + v);
    }
}

class Cylinder extends Shape {
    int rd, hi;

    Cylinder(int r, int h) {
        rd = r;
        hi = h;
    }

    @Override
    void area() {
        float cl = 2 * pi * rd * hi + 2 * pi * rd * rd;
        System.out.println("Area of cylinder: " + cl);
    }

    @Override
    void volume() {
        float vl = pi * rd * rd * hi;
        System.out.println("Volume of cylinder: " + vl);
    }
}

public class Slip3A {
    public static void main(String[] arg) {
        int r, s, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius, side, and height of cone & cylinder");
        r = sc.nextInt();
        s = sc.nextInt();
        h = sc.nextInt();

        Cone c1 = new Cone(r, s, h);
        c1.area();
        c1.volume();

        Cylinder c2 = new Cylinder(r, h);
        c2.area();
        c2.volume();

        sc.close();
    }
}
