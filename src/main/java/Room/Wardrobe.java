package Room;

public class Wardrobe {
    private boolean doorExamined =false;
    private String door = "zamkniete";
    private boolean doorOpened = false;
    private String drawer = "zamknięta";
    private boolean isDrawerOpened = false;

    public void setDoor(String door) {
        this.door = door;
    }

    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    public String getDoor() {
        return door;
    }

    public void openWardrobeDoor() {
        setDoor("otwarte");
        doorOpened = true;
    }

    public String getDrawer() {
        return drawer;
    }

    public void openWardrobeDrawer() {
        setDrawer("otwarta");
        isDrawerOpened = true;
    }

    public boolean isDoorOpened() {
        return doorOpened;
    }
    public boolean isDoorExamined() {
        return doorExamined;
    }

    public void setDoorAlreadyExamined() {
        this.doorExamined = true;
    }

}
