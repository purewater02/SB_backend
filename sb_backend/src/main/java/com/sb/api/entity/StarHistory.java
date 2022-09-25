package com.sb.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "star_history")
public class StarHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long starHistoryId;

    @ManyToOne
    @JoinColumn(name = "user_idx")
    private UserInfo userInfo;

    private String note; // 적립 사유

    private int addedStar;

    private int totalStar;

    private Date expireAt; // expireAt은 ccreatedAt +1년

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

}
