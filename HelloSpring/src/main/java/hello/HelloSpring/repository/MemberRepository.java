package hello.HelloSpring.repository;

import hello.HelloSpring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findId(Long id);

    Optional<Member> findByName(String name);

    List<Member> findAll();
}