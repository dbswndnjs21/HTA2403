package com.earlyword.tmp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public int saveMember(MemberJoinDTO memberJoinDTO) {
        //mapper 호출 로직...
        return memberMapper.save(memberJoinDTO);
    }

    public int updateMember(MemberJoinDTO memberJoinDTO) {
        //mapper 호출 로직...
        return memberMapper.update(memberJoinDTO);
    }

    public MemberInfoDTO findMember(String id) {
        MemberInfoDTO memberInfoDTO = memberMapper.findById(id);
        return memberInfoDTO;
    }
}

