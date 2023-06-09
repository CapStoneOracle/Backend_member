package com.join.member.repository;

import com.join.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    // 이메일로 회원 정보 조회 (select * from member_table where member_email=?) 을 하고자 하는 코드
    Optional<MemberEntity> findByMemberEmail(String memberEmail);

}
