package com.sb.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pay_id")
    private Long payId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx")
    private UserInfo userInfo;

    private String title;

    @Lob
    private String image;

    private int balance;

    private String barcodeNumber;

    private Boolean isPrimary; // true면 대표카드


}
