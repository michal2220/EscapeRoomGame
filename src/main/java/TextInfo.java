import Room.ChestOfDrawers;
import Room.Wardrobe;

public class TextInfo {

    Wardrobe wardrobe;
    ChestOfDrawers chestOfDrawers;

    public TextInfo(Wardrobe wardrobe, ChestOfDrawers chestOfDrawers) {
        this.wardrobe = wardrobe;
        this.chestOfDrawers = chestOfDrawers;
    }

    public void getKomendy() {
        System.out.println("""
                Dostepne komendy:
                -opisz pokoj
                -otworz ....
                -wez ....
                -uzyj ....
                -ekwipunek ....
                -ogladaj ....
                -pomoc
                -komendy""");
    }

    public void startingInfo() {
        System.out.println("""
                Znajdujesz się w pokoju.
                  _______________________________________________________________________
                 |                             |         |                               |
                 |                             |  Obraz  |                               |
                 |                             |_________|                               |
                 |     Szafa                                                             |
                 |   _______                        _________                            |
                 |  |   |    |                     |         |                           |
                 |  |   |    |                     |         |                           |
                 |  |__.|.___|                     |  Lóżko  |                           |
                 |  |_.____._|                     |         |                           |
                 |  |_.____._|                     |_________|                           |
                 |                                                                       |
                 |  _________                                                            |
                 | |         |                                                           |
                 | |         |                     |                                     |
                 | |         | Komoda              |                                     |
                 | |         |                     |  Lampa                              |
                 | | [___]   |                   {---}                                   |
                 | | [___]   |                                                           |
                 | | [___]   |                                                        __ |D
                 | |_________|                                                       |  ||R
                 |                                                                   |  ||Z
                 |                                                                   |  ||W
                 |                                                                   |__||I
                 |_______________________________________________________________________|
                 
                Na środku pokoju znajduje się lampa.
                Szafa ma duże drzwi i dwie szuflady.
                Obok szafy znajduje się komoda z trzema szufladami, ale w jednej z szuflad brakuje uchwytów.
                Na ścianie wisi obraz. Obraz przedstawia człowieka który patrzy na drzwi.
                Obraz jest delikatnie przechylony.
                Na łóżku znajduje się kołdra oraz poduszka, a pod łóżkiem stoi pudełko na buty.
                                
                Spróbuj się wydostać!
                                
                **************
                Dostepne komendy:
                -opisz pokoj
                -otworz ....
                -wez ....
                -uzyj ....
                -ekwipunek ....
                -ogladaj ....
                -pomoc
                -komendy
                                
                """);
    }

    public void roomDesc() {
        System.out.println("""
                Na środku pokoju znajduje się lampa.
                Szafa ma duże drzwi które są """ + wardrobe.getDoor() + """
                 i dwie szuflady.
                Obok szafy znajduje się komoda z trzema szufladami, ale w jednej z szuflad\040""" + chestOfDrawers.getDrawer() + """
                .
                Na ścianie wisi obraz. Obraz przedstawia człowieka który patrzy na drzwi.
                Obraz jest delikatnie przechylony.
                Na łóżku znajduje się kołdra oraz poduszka, a pod łóżkiem stoi pudełko na buty.
                """);
    }

}
