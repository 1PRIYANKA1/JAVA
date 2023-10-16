interface Shape {
    final static float pi = 3.14f;

    float area(float r);
}

class Circle implements Shape {
    public float area(float r) {
        return (3.14f * r * r);
    }
}

class Sphere implements Shape {
    public float area(float r) {
        return (2 * 3.14f * r * r);
    }
}

class Slip8B {
    public static void main(String args[]) {
        Circle cir = new Circle();
        Sphere sp = new Sphere();
        Shape s;
        s = cir;
        System.out.println("Area of Circle: " + s.area(3));
        s = sp;
        System.out.println("Area of Sphere: " + sp.area(5));
    }
}
