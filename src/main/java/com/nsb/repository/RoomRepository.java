package com.nsb.repository;

import com.nsb.domain.Room;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 弘樹 on 2016/06/16.
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

}
