public class Main {
    public static void main(String[] args) {
        drawLine(5, "horiz", '_');
        drawLine(3, "vert", '|');
    }

    public static void drawLine(int length, String dir, char symbol) {
        if (dir.equalsIgnoreCase("horiz")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (dir.equalsIgnoreCase("vert")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Invalid dir. Use 'horiz' or 'vert'.");
        }
    }
}
