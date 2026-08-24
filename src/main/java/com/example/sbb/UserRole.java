package com.example.sbb; // 패키지 위치 확인 (user 패키지 내부 권장)

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"), // EDMIN -> ADMIN 오타 수정
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private final String value;
}