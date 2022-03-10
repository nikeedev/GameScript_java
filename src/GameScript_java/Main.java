package GameScript_java;
import GameScript_java.Codes.*;

public class Main {
    public static void main(String[] args) {

        Vector2 worldSize = new Vector2(4, 4);
        Vector2 position = new Vector2(worldSize.x/2, worldSize.y/2);

        String player = "#";

        CreateGame.PaintGame(position, player, worldSize);

    }
}

