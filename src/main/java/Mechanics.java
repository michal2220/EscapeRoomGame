import Items.LightBulb;
import Items.Nail;
import Items.OldSock;

public class Mechanics {
    PickubleItems pickubleItems;
    Equipment equipment;
    OldSock oldSock = new OldSock();
    LightBulb lightBulb = new LightBulb();
    Nail nail = new Nail();

    public Mechanics(PickubleItems pickubleItems, Equipment equipment) {
        this.pickubleItems = pickubleItems;
        this.equipment = equipment;
    }

    public void getItemsFromDrawer() {
        pickubleItems.getItems().add(oldSock);
        pickubleItems.getItems().add(nail);
        pickubleItems.getItems().add(lightBulb);

    }

    public void getEquipement() {
        System.out.println(equipment.getEqu());
    }

    public void takeMechanics() {
        String word;
        System.out.println("co chesz zabrać?");
        System.out.println(pickubleItems.getItems());
        word = Input.getInput();
        switch (word) {
            case "gwóźdź" -> {
                pickubleItems.getItems().removeIf(item -> item instanceof Nail);
                System.out.println("Wziąłeś gwóźdź");
                equipment.getEqu().add(new Nail());
            }
            case "stara skarpeta" -> {
                pickubleItems.getItems().removeIf(item -> item instanceof OldSock);
                equipment.getEqu().add(new OldSock());
                System.out.println("Wziąłeś starą skarpetę");
            }
            case "żarówka" -> {
                pickubleItems.getItems().removeIf(item -> item instanceof LightBulb);
                System.out.println("Wziąłeś żarówkę");
                equipment.getEqu().add(new LightBulb());
            }
            default -> System.out.println("Nie mogę zabrać: " + word);
        }
    }
}
