import Room.ChestOfDrawers;
import Room.Wardrobe;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        ChestOfDrawers chestOfDrawers = new ChestOfDrawers();
        TextInfo textInfo = new TextInfo(wardrobe, chestOfDrawers);
        GamePlay gamePlay = new GamePlay(textInfo);
        while (!gamePlay.isFinished) {
            gamePlay.play();
        }


    }
}
