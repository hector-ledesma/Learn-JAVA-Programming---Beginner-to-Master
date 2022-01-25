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

    public static void main (String[] args) {
        areaSides();
    }
}
