package login.oathtest.mapper;

import login.oathtest.Entity.Member;

public interface MemberMapper {

    Member login(Member member);

    Member findById(String memberId);
}
