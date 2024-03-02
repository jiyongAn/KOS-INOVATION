package backend.model.dao;

import backend.model.dto.UsersDto;

public interface UsersDao {
    /**
     * 회원가입
     * (사용자 아이디, 사용자 이름, 사용자 비밀번호)
     */
    void signUp(String userId, String userName, String password);

    /**
     * 이름 중복체크
     * @return 중복 여부
     * (사용자 아이디)
     */
    boolean duplicateCheck(String userId);

    /**
     * 로그인
     * @return 사용자 정보
     * (사용자 아이디, 사용자 비밀번호)
     */
    UsersDto login(String userId, String password);

    /**
     * 코인 충전
     * @return 잔액
     * (사용자 아이디, 잔액, 코인 충전량)
     */
    int buyCoin(String userId, int balance, int coinQuantity);
}
