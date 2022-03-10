package GameScript_java.Codes;


public class CreateGame
{
    public static String VersionNow = "0.0.4";

    public static void PaintGame(Vector2 Position, String Player, Vector2 WorldSize) {
        System.out.println("------------------------------------------------------");
        System.out.println(" GameScript GamePainter: v" + VersionNow);
        System.out.println("------------------------------------------------------");
        for (int j=0; j < WorldSize.y; j++) {
            for (int i=0; i < WorldSize.x; i++) {
                System.out.print("  ");
                if (i == Position.x - 1) {
                    if (j == Position.y) {
                        System.out.print(Player + " ");
                        i += 1;
                    }
                }
            }
            System.out.println("");

        }
    }
}