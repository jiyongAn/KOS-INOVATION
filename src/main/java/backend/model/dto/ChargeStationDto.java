package backend.model.dto;

public class ChargeStationDto {
private int stationId;
private String organization;
private String location;
private String phone;
private String stationName;

public  ChargeStationDto (){};



    public ChargeStationDto(int stationId, String organization, String location, String phone, String stationName) {
        this.stationId = stationId;
        this.organization=organization;
        this.location = location;
        this.phone = phone;
        this.stationName = stationName;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public String toString() {
        return "ChargeStationDto{" +
                "stationId=" + stationId +
                ", organization='" + organization + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", stationName='" + stationName + '\'' +
                '}';
    }
}
