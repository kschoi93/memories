package hello.hellospring.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hello.hellospring.domain.entity.Member;
import hello.hellospring.domain.repository.MemberRepository;
import hello.hellospring.dto.posts.MemberSignDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MemberService {
    private MemberRepository memberRepository;

    @Transactional
    public Member ok(MemberSignDto dto) {
        return memberRepository.findMember(dto.getId(), dto.getPwd());
    }
}
