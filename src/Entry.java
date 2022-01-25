import java.util.Scanner;

public class Entry {
    static Scanner sc = new Scanner(System.in);

    private void areaBaseHeight() {
        float base, height, area;
        System.out.println("Enter Base and Height ");
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = base * height / 2;

        System.out.println("Area of the triangle is " + area);
    }

    static private void areaSides() {

        int a, b ,c;
        float s;
        double area;

        System.out.println("Enter 3 sides of the triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s=(a+b+c)/2f;

        area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("Area of the triangle is: " + area);
    }

    static private void quadratic() {
        int a, b, c;
        double r1, r2;

        System.out.println("Enter a, b, c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = (-b + Math.sqrt((b*b) - 4*a*c)) / (2*a);
        System.out.println("r1 = " + r1);
        r2 = (-b - Math.sqrt((b*b) - 4*a*c)) / (2*a);
        System.out.println("r2 = " + r2);
    }

    static private void cuboid() {
        int length, breadth, height;
        int totalArea, volume;

        System.out.println("Enter length, breadth, height:");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        int fb = length * height;
        int lr = breadth * height;
        int bt = length * breadth;

        totalArea = 2 * (fb + lr + bt);
        volume = length*breadth*height;

        System.out.println("Total area: " + totalArea);
        System.out.println("Volume: " + volume);

    }

    public static void main (String[] args) {
        cuboid();
    }
}
