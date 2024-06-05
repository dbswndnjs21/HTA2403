package com.earlyword.tmp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    //http://localhost:8080/join
    @GetMapping("/join")
    @ResponseBody
    public void join(@RequestParam("id") String id, @RequestParam("password") String password) {
        //service 호출 로직
        //...
        MemberJoinDTO memberJoinDTO = new MemberJoinDTO();
        memberJoinDTO.setId(id);
        memberJoinDTO.setPassword(password);

        int result = memberService.saveMember(memberJoinDTO);
        System.out.println("result = " + result);
    }

    //http://localhost:8080/update
    @GetMapping("/update")
    @ResponseBody
    public void update(MemberJoinDTO memberJoinDTO) {
        //service 호출 로직
        //...
        int result = memberService.updateMember(memberJoinDTO);
        System.out.println("result = " + result);
    }

    @GetMapping("/find")
    @ResponseBody
    public MemberInfoDTO findById(@RequestParam("id") String id) {
        MemberInfoDTO member = memberService.findMember(id);
        return member;
    }
}
