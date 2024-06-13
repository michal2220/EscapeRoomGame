package Room;

public class ChestOfDrawers {

    String drawer = "brakuje uchwytów";
    boolean canBeOpened = false;

    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    public void setCanBeOpened(boolean canBeOpened) {
        this.canBeOpened = canBeOpened;
    }

    public String getDrawer() {
        return drawer;
    }

    public boolean isCanBeOpened() {
        return canBeOpened;
    }
}
