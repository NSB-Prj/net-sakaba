package com.nsb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by 弘樹 on 2016/06/16.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="room")
public class Room {
    @Id
    @GeneratedValue
    private Integer roomNum;
    @Column
    private String roomName;
}
