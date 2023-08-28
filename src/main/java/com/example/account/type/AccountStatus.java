package com.example.account.type;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AccountStatus {

    IN_USE("사용 중"),
    UNREGISTERED("사용 완료");

    private final String description;

}
