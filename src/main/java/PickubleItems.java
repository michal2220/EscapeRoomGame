import Items.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickubleItems {

    private List<Items> items = new ArrayList<>();

    public List<Items> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Rzeczy które można podnieść:" + items;
    }
}
