package com.companimal.semiProject.member.model.dto;

import com.companimal.semiProject.common.MemberRole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginMemberDTO implements java.io.Serializable{

    private String memberId;
    private String memberPwd;
    private String memberNickname;
    private String memberName;
    private String memberPhone;
    private String memberEmail;
    private MemberRole memberRole;

    public LoginMemberDTO() {
    }

    public LoginMemberDTO(String memberId, String memberPwd, String memberName, String memberNickname, String memberPhone, String memberEmail, MemberRole memberRole) {
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberNickname = memberNickname;
        this.memberName = memberName;
        this.memberPhone = memberPhone;
        this.memberEmail = memberEmail;
        this.memberRole = memberRole;
    }

    public List<String> getRole() {
        if (this.memberRole.getRole().length() > 0) {
            return Arrays.asList(this.memberRole.getRole().split(","));
        }

        return new ArrayList<>();
    }


    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public MemberRole getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(MemberRole memberRole) {
        this.memberRole = memberRole;
    }

    @Override
    public String toString() {
        return "LoginMemberDTO{" +
                "memberId='" + memberId + '\'' +
                ", memberPWD='" + memberPwd + '\'' +
                ", memberNickname='" + memberNickname + '\'' +
                ", memberPhone='" + memberPhone + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberRole=" + memberRole +
                '}';
    }
}
