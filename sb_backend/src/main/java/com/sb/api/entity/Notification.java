package com.sb.api.entity;

import javax.persistence.*;


@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notificationId;
}
