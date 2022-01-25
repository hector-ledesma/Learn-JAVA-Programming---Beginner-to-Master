import java.util.Scanner;

public class Entry {

    private void areaBaseHeight() {
        float base, height, area;
        System.out.println("Enter Base and Height ");

        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = base * height / 2;

        System.out.println("Area of the triangle is " + area);
    }

    static private void areaSides() {
        Scanner sc = new Scanner(System.in);

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

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = (-b + Math.sqrt((b*b) - 4*a*c)) / (2*a);
        System.out.println("r1 = " + r1);
        r2 = (-b - Math.sqrt((b*b) - 4*a*c)) / (2*a);
        System.out.println("r2 = " + r2);
    }

    public static void main (String[] args) {
        quadratic();
    }
}
