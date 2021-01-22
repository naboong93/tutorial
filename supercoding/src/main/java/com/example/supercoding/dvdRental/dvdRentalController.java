package com.example.supercoding.dvdRental;

import com.example.supercoding.dvdRental.VO.ActorVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class dvdRentalController {

    @Autowired
    dvdRentalService dvdRentalSvc;

    @GetMapping("/actor11")
    public String selectActor(Model model) throws Exception {
        List<ActorVO> actorList = dvdRentalSvc.selectActor();
        ActorVO actorVO = actorList.get(0);

        model.addAttribute("actor", actorList.get(0));
        //model.addAttribute("actorFirstNm", actorVO.getFirstName());
        //model.addAttribute("actorLastNm", actorVO.getLastName());

        return "test";
    }
}
