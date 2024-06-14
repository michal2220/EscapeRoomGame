import Room.Wardrobe;

public class GamePlay {

    TextInfo textInfo;
    Wardrobe wardrobe;
    PickubleItems pickubleItems;
    Equipment equipment;
    Mechanics mechanics;
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
                        mechanics.getItemsFromDrawer();
                        wardrobe.setDrawer("zbadana");
                    } else {
                        textInfo.closedWardrobeDrawer();
                    }
                    break;
                case "weź":
                    mechanics.takeMechanics();
                    break;
                case "ekwipunek":
                    mechanics.getEquipement();
                    break;
                default:
                    System.out.println("Nieznana komedna");
            }
        }
    }



    public GamePlay(TextInfo textInfo, Wardrobe wardrobe, PickubleItems pickubleItems, Equipment equipment) {
        this.textInfo = textInfo;
        this.wardrobe = wardrobe;
        this.pickubleItems = pickubleItems;
        this.equipment = equipment;
        this.mechanics = new Mechanics(pickubleItems, equipment);
    }



}
