import java.util.Scanner;

public class Rectangle {
    public int lenght;
    public int width;
    public int perimeter;

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
        this.perimeter = perimeter;
    }

    public void calculatePerimeterOfRectangle() {
        perimeter = (lenght + width)*2;
    }

    @Override
    public String toString() {
        return String.format("%.2f", (double) perimeter);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dai: ");
        int lenght = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chiều rộng: ");
        int width = Integer.parseInt(scanner.nextLine());

        Rectangle Rectangle = new Rectangle(lenght, width);
        Rectangle.calculatePerimeterOfRectangle();

        System.out.println(Rectangle);
    }

}


