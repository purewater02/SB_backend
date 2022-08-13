package com.sb.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "pay")
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long payId;

    @ManyToOne
    @JoinColumn(name = "user_idx")
    private UserInfo userInfo;

    private String title;

    @Lob
    private String image;

    private int balance;

    private String barcodeNumber;

    private Boolean isPrimary; // true면 대표카드


}
