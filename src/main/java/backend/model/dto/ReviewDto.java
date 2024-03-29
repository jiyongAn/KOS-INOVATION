package backend.model.dto;

import java.util.Date;

public class ReviewDto {
    private int reviewId;
    private int userNum;
    private int stationId;
    private String content;
    private int rate;
    private String createDate;
    private String fixDate;

    public ReviewDto(){};

    public ReviewDto(int reviewId, int userNum, int stationId, String content, int rate, String createDate, String fixDate) {
        this(stationId,content,rate,createDate,fixDate);
        this.reviewId = reviewId;
        this.userNum = userNum;
    }

    public ReviewDto(int stationId, String content, int rate, String createDate,String fixDate) {
        this.stationId = stationId;
        this.content = content;
        this.rate = rate;
        this.createDate = createDate;
        this.fixDate = fixDate;
    }

    @Override
    public String toString() {
        return "  ┌============= "+"reviewId : " + reviewId +" =============┐\n" +
                "            userNum : " + userNum +"        \n"+
                "            stationId : " + stationId +"        \n"+
                "            content : '" + content + '\'' +"        \n"+
                "            rate : " + "⭐\uFE0F".repeat(rate) +"        \n"+
                "            createDate : " + createDate +"        \n"+
                "            fixDate : " + fixDate +"        \n"+
                "  └===========================================┘\n";


    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getFixDate() {
        return fixDate;
    }

    public void setFixDate(String fixDate) {
        this.fixDate = fixDate;
    }
}
