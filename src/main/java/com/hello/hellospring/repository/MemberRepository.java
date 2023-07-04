package com.hello.hellospring.repository;

import com.hello.hellospring.domain.Member;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Optional 은 JDK8 부터 지원되는 null 처리 기법
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
