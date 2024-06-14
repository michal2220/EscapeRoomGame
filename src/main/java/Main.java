import Items.LightBulb;
import Items.Nail;
import Items.OldSock;
import Room.ChestOfDrawers;
import Room.Wardrobe;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        ChestOfDrawers chestOfDrawers = new ChestOfDrawers();
        PickubleItems pickubleItems = new PickubleItems();
        TextInfo textInfo = new TextInfo(wardrobe, chestOfDrawers, pickubleItems);
        GamePlay gamePlay = new GamePlay(textInfo, wardrobe, pickubleItems);
        while (!gamePlay.isFinished) {
            gamePlay.play();
        }


    }
}
