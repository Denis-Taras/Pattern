package flyweight.legoBox;

public class Main {
    static int CANVAS_SIZE = 500;
    static int LEGO_BRICKS_TO_DRAW = 1000;
    static int LEGO_TYPES = 3;

    public static void main(String[] args) {
        LegoBox legoBox = new LegoBox();
        for (int i = 0; i < Math.floor(LEGO_BRICKS_TO_DRAW / LEGO_TYPES); i++) {
            legoBox.dropLegoBrick(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Green brick", Colors.GREEN, "six dots brick");
            legoBox.dropLegoBrick(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Red brick", Colors.RED, "four dots brick");
            legoBox.dropLegoBrick(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Blue brick", Colors.BLUE, "eight dots brick");
        }
        legoBox.setSize(CANVAS_SIZE, CANVAS_SIZE);
        legoBox.setVisible(true);

        System.out.println(LEGO_BRICKS_TO_DRAW + " lego bricks drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("LegoBrick size (4700 bytes) * " + LEGO_BRICKS_TO_DRAW);
        System.out.println("+ LegoTypes size (~30 bytes) * " + LEGO_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((LEGO_BRICKS_TO_DRAW * 4700 + LEGO_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((LEGO_BRICKS_TO_DRAW * 4730) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}