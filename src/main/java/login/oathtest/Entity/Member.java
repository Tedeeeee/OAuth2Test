package login.oathtest.Entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    private int memberSq;
    private String memberId;
    private String memberPw;
    private String memberNm;
    private int memberIsWithDraw;
    private Role memberRole;

    @Builder(builderMethodName = "memberBuilder", toBuilder = true)
    private Member(int memberSq, String memberId, String memberPw, String memberNm, int memberIsWithDraw, Role memberRole) {
        this.memberSq = memberSq;
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberNm = memberNm;
        this.memberIsWithDraw = memberIsWithDraw;
        this.memberRole = memberRole;
    }
}
