package com.example.account.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AccountInfo {
    private String accountNumber;
    private Long balance;
}
