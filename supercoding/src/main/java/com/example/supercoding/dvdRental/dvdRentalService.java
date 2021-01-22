package com.example.supercoding.dvdRental;

import com.example.supercoding.dvdRental.VO.ActorVO;
import com.example.supercoding.dvdRental.mapper.ActorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dvdRentalService {

    @Autowired
    public ActorMapper mapper;

    public List<ActorVO> selectActor() throws Exception {
        return mapper.selectActor();
    }
}
