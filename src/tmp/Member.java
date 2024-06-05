package com.earlyword.tmp;

import lombok.AllArgsConstructor;

/**
 * 도메인 = DB테이블과 매핑
 */
@AllArgsConstructor
public class Member {
    private Long userId;
    private String id;
    private String password;
}
