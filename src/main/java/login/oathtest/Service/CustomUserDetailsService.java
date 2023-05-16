package login.oathtest.Service;

import login.oathtest.Entity.Member;
import login.oathtest.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final MemberMapper mapper;


    @Override
    public UserDetails loadUserByUsername(String memberId) throws UsernameNotFoundException {
        Member member = mapper.findById(memberId);
        if (member == null) {
            throw new UsernameNotFoundException("해당 유저는 존재하지 않습니다.");
        }

        return User.builder()
                .username(member.getMemberId())
                .password(member.getMemberPw())
                .roles(member.getMemberRole().name())
                .build();
    }
}
