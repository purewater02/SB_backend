package com.sb.api.entity;

import javax.persistence.*;


@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notificationId;

    private String category; //공지인지 이벤트인지

    private String title;

    private String description; // 제목 밑에 맛보기 내용이나 특이사항 기재하는 곳

    @Lob
    private String content; //내용은 이미지로 하는 편인듯



}
