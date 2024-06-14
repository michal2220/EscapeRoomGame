package Room;

public class Painting {

    private boolean skewed = true;
    private String status = " delikatnie przechylony.";

    public void fixPaintig() {
        skewed = false;
        status = " prosto.";
    }

    public boolean isSkewed() {
        return skewed;
    }

    public String getStatus() {
        return status;
    }
}

