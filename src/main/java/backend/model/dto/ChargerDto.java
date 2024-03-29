package backend.model.dto;

public class ChargerDto {
    private int chargerId;
    private int stationId;
    private int kwPrice;
    private int status;
    private String speed;

    ChargerDto(){};
    public ChargerDto(int kwPrice, String speed) {
        this.kwPrice = kwPrice;
        this.speed = speed;
    }

    public ChargerDto(int chargerId, int stationId, int kwPrice, int status, String speed) {
        this(kwPrice,speed);
        this.chargerId = chargerId;
        this.stationId = stationId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ChargerDto{" +
                "chargerId=" + chargerId +
                ", stationId=" + stationId +
                ", kwPrice=" + kwPrice +
                ", status=" + status +
                ", speed=" + speed +
                '}';
    }

    public int getChargerId() {
        return chargerId;
    }

    public void setChargerId(int chargerId) {
        this.chargerId = chargerId;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getKwPrice() {
        return kwPrice;
    }

    public void setKwPrice(int kwPrice) {
        this.kwPrice = kwPrice;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
