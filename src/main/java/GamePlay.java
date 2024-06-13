public class GamePlay {

    TextInfo textInfo;
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
            }
        }
    }

    public GamePlay(TextInfo textInfo) {
        this.textInfo = textInfo;
    }
}
