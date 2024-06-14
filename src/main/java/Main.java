import Items.LightBulb;
import Items.Nail;
import Items.OldSock;
import Room.ChestOfDrawers;
import Room.Painting;
import Room.Wardrobe;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        Painting painting = new Painting();
        ChestOfDrawers chestOfDrawers = new ChestOfDrawers();
        PickubleItems pickubleItems = new PickubleItems();
        Equipment equipment = new Equipment();
        TextInfo textInfo = new TextInfo(wardrobe, painting, chestOfDrawers, pickubleItems);
        GamePlay gamePlay = new GamePlay(textInfo, wardrobe, pickubleItems, equipment);
        while (!gamePlay.isFinished) {
            gamePlay.play();
        }


    }
}
