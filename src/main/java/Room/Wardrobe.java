package Room;

public class Wardrobe {
    private String door = "zamkniete";
    private boolean isDoorOpened = false;
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
        isDoorOpened = true;
    }

    public String getDrawer() {
        return drawer;
    }

    public void openWardrobeDrawer() {
        setDrawer("otwarta");
        isDrawerOpened = true;
    }

    public boolean isDoorOpened() {
        return isDoorOpened;
    }

    public boolean isDrawerOpened() {
        return isDrawerOpened;
    }
}
