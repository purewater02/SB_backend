package com.sb.api.service;

import com.sb.api.entity.UserInfo;
import com.sb.api.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserInfoRepository userInfoRepository;

    public Optional<UserInfo> findByIdPwd(String id) {
        return
    }
}
