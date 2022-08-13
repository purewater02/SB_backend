package com.sb.api.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "star_history")
public class StarHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long starHistoryId;

    @ManyToOne
    @JoinColumn(name = "user_idx")
    private UserInfo userInfo;

    private String note; // 적립 사유

    private int addedStar;

    private int totalStar;

    private Date expireAt; // expireAt은 ccreatedAt +1년

    private Timestamp createdAt;

    private Timestamp updatedAt;

}
