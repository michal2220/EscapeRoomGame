import Items.LightBulb;
import Items.Nail;
import Items.OldSock;
import Room.ChestOfDrawers;
import Room.Wardrobe;

public class TextInfo {

    Wardrobe wardrobe;
    ChestOfDrawers chestOfDrawers;
    PickubleItems pickubleItems;

    public TextInfo(Wardrobe wardrobe, ChestOfDrawers chestOfDrawers, PickubleItems pickubleItems) {
        this.wardrobe = wardrobe;
        this.chestOfDrawers = chestOfDrawers;
        this.pickubleItems = pickubleItems;
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
                 |                                                                       |
                 |                                                                       |
                 |                                 |                                     |
                 |             Komoda              |                                     |
                 |  _________                      |  Lampa                              |
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
                -zbadaj....
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
                Szafa ma duże drzwi które są\040""" + wardrobe.getDoor() + """
                i szufladę która jest\040""" + wardrobe.getDrawer() + """
                .
                Obok szafy znajduje się komoda z trzema szufladami, ale w jednej z szuflad\040""" + chestOfDrawers.getDrawer() + """
                .
                Na ścianie wisi obraz. Obraz przedstawia człowieka który patrzy na drzwi.
                Obraz jest delikatnie przechylony.
                Na łóżku znajduje się kołdra oraz poduszka, a pod łóżkiem stoi pudełko na buty.
                """);
    }

    public void checkPainting() {
        System.out.println("""
                Dziwny obrazek... przedstawia mężczyznę który patrzy na dzrzwi, bardzo podobne do
                drzwi z tego pokoju. 
                Postanawiasz wyprosotwać obrazek.
                Podczas przesuwania obrazka, słyszysz kliknięcie dobiegające z szafy.""");
        wardrobe.openWardrobeDoor();
    }


    public void closedWardrobeDoor() {
        System.out.println("""
                Próbujesz otworzyć drzwi od szafy, ale są zamknięte. 
                Dziwnie, bo nie mają dziurki od klucza""");
    }

    public void openedWardrobeDoor() {
        System.out.println("""
                Otwierasz drzwi od szafy. W środku jest kilka starych płaszczy.
                Takich samych jak nosi ten dziwny mężczyzna z obrazka...
                Postanawiasz przeszukać płaszcze.
                Są puste.
                Podczas przesuwania płaszczy z powrotem zauważasz na dnie szafy małą dzwignię.
                Czy chesz za nią pociągnąć?
                
                
                tak/nie
                """);
        if (Input.getInput().equals("tak")){
            wardrobe.openWardrobeDrawer();
            System.out.println("Szuflada szafy lekko się wysunęła");
        } else {
            System.out.println("Nie robisz nic");
        }
    }

    public void openedWardrobeDrawer() {
        System.out.println("""
                Otwierasz szerzej szufladę.
                Cieżko się wysuwa, widać, że szafa jest już stara i wysłużona.
                W środku znajdujesz satarą skarpetkę, gwóźdź oraz żarówkę.
                """);

    }

    public void closedWardrobeDrawer() {
        System.out.println("Szuflada jest zablokowana");
    }
}
