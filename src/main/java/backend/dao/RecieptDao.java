package backend.dao;

public interface RecieptDao {
    /**
     * 결제 내역 조회
     * @return 결제 아이디
     * (사용자 아이디, 충전소 이름)
     */
    int SearchReceipt(int userId, String stationName);

    /**
     * 잔액과 사전계산으로 결제 금액 계산
     * @return 잔액
     * (사용자 아이디, 잔액, 예상 비용)
     */
    int payCost(int userId, int balance, int expectCost);
}
