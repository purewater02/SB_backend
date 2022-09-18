package com.sb.api.repository;

import com.sb.api.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findById(String id);

    Boolean existsById(String id);

    Boolean existsByEmail(String email);
}
