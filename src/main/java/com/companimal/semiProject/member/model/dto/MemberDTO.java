package com.companimal.semiProject.member.model.dto;

import com.companimal.semiProject.order.model.dto.OrderOptDTO;
import com.companimal.semiProject.order.model.dto.OrderPaymentDTO;
import com.companimal.semiProject.project.model.dto.ProjectDTO;

import java.sql.Timestamp;
import java.util.List;

public class MemberDTO {

    private String memberId;
    private String memberPwd;
    private String memberNickname;
    private String memberName;
    private String memberPhone;
    private String memberEmail;
    private String memberRole;

    public MemberDTO() {
    }

    public MemberDTO(String memberId, String memberPwd, String memberNickname, String memberName, String memberPhone, String memberEmail, String memberRole) {
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberNickname = memberNickname;
        this.memberName = memberName;
        this.memberPhone = memberPhone;
        this.memberEmail = memberEmail;
        this.memberRole = memberRole;
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

    public String getMemberNickname() {
        return memberNickname;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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

    public String getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberId='" + memberId + '\'' +
                ", memberPwd='" + memberPwd + '\'' +
                ", memberNickname='" + memberNickname + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberPhone='" + memberPhone + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberRole='" + memberRole + '\'' +
                '}';
    }
}
