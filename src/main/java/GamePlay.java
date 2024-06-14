import Items.LightBulb;
import Items.Nail;
import Items.OldSock;
import Room.Wardrobe;

public class GamePlay {

    TextInfo textInfo;
    Wardrobe wardrobe;
    PickubleItems pickubleItems;
    Nail nail;
    OldSock oldSock;
    LightBulb lightBulb;
    boolean isFinished = false;

    public void play() {
        textInfo.startingInfo();
        while (!isFinished) {
            String word = Input.getInput();
            switch (word) {
                case "komendy":
                    textInfo.getKomendy();
                    break;
                case "opisz pokoj":
                    textInfo.roomDesc();
                    break;
                case "zbadaj obraz":
                    textInfo.checkPainting();
                    break;
                case "zbadaj szafę":
                    if (!wardrobe.isDoorOpened()) {
                        textInfo.closedWardrobeDoor();
                    } else {
                        textInfo.openedWardrobeDoor();
                    }
                    break;
                case "zbadaj szufladę szafy":
                    if (wardrobe.getDrawer().equals("otwarta")){
                        textInfo.openedWardrobeDrawer();
                    } else {
                        textInfo.closedWardrobeDrawer();
                    }
                    break;
                case "weź":
                    System.out.println("co chesz zabrać?");
                    System.out.println(pickubleItems.getItems());
                    word = Input.getInput();
                    if (word.equals("gwóźdź")){
                        pickubleItems.getItems().remove(nail);
                    }

                    break;
                default:
                    System.out.println("Nieznana komedna");
            }
        }
    }


    public GamePlay(TextInfo textInfo, Wardrobe wardrobe, PickubleItems pickubleItems) {
        this.textInfo = textInfo;
        this.wardrobe = wardrobe;
        this.pickubleItems = pickubleItems;
    }



}
