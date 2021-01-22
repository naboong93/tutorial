package com.example.supercoding.dvdRental.mapper;

import com.example.supercoding.dvdRental.VO.ActorVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ActorMapper {
    public List<ActorVO> selectActor();
}
