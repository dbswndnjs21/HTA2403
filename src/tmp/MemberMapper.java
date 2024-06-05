package com.earlyword.tmp;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int save(MemberJoinDTO memberJoinDTO);
    int update(MemberJoinDTO memberJoinDTO);
    MemberInfoDTO findById(String id);
}
