public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println(rectangle.toString());

        rectangle.resize(3);
        System.out.println(rectangle.toString());
    }
}