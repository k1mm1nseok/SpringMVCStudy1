package hello.servlet.domain.member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void save() {
        Member member = new Member("kimminseok", 23);
        Member save = memberRepository.save(member);

        Member findmember = memberRepository.findById(save.getId());

        assertThat(findmember).isEqualTo(save);
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
        Member member1 = new Member("kimminseok", 23);
        Member member2 = new Member("kimmin", 22);
        Member member3 = new Member("kim", 24);

        memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);

        List<Member> all = memberRepository.findAll();
        assertThat(all.size()).isEqualTo(3);
        assertThat(all).contains(member1, member2, member3);

    }

    @Test
    void clearStore() {
    }
}