package com.sb.api.entity;

import com.sb.api.enums.CashRecieptType;
import com.sb.api.enums.RoleType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본전략 Sequence
    private Long userIdx;

    @Enumerated(EnumType.STRING)
    private RoleType role;

    @NotBlank
    @Size(max = 20)
    private String id;

    @NotBlank
    @Size(max = 100)
    private String password;

    private String nickname;

    @NotBlank
    private String realName;

    private String gender;

    @NotBlank
    @Size(max = 50)
    @Email
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

    @OneToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @OneToMany(mappedBy = "userInfo")
    private List<Pay> pays = new ArrayList<>();

    @OneToMany(mappedBy = "userInfo")
    private List<StarHistory> starHistories = new ArrayList<>();

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

}
