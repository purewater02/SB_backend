package com.sb.api.entity;

import com.sb.api.enums.CashRecieptType;
import com.sb.api.enums.RoleType;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "sb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 기본전략 Sequence
    private Long idx;

    @Enumerated(EnumType.STRING)
    private RoleType role;

    private String id;

    private String password;

    private String nickname;

    private String realName;

    private String gender;

    private String email;

    private Boolean emailAdAgree;

    private Date birthday;

    private String phone;

    private Boolean phoneAdAgree;

    @Enumerated(EnumType.STRING)
    private CashRecieptType cashRecieptType;

    private String receiptPhone;

    private String companyNum;

    private Boolean receiptNoneType; // True 면 발행x, 묻기x  / False면 필요시 요청.

    private Boolean personalCupReward; // True 면 적립  False면 할인

    private String employeeCode;

    private Timestamp createdAt;

    private Timestamp updatedAt;



}
