package com.min.edu.ctrl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.dto.Hospi_Dto;
import com.min.edu.dto.Obj_Dto;
import com.min.edu.dto.User_Dto;
import com.min.edu.model.Hospi.Hospi_IService;
import com.min.edu.model.Reserv.Reserv_IService;

@Controller
public class HospiController {
// 병원 Controller
	private Logger logger = LoggerFactory.getLogger(HospiController.class);
	
	@Autowired
	private Hospi_IService service;
	
	@Autowired
	private Reserv_IService serviceR;

	
	// 관리자 첫화면
	@RequestMapping(value = "/mainH.do", method = RequestMethod.GET)
	public String mainH() {
		logger.info("mainH 관리자 첫화면\t{}", new Date());
		return "HospiMain";
	}

	
	// 병원목록
	@RequestMapping(value = "/HospiList.do", method = RequestMethod.GET)
	public String HospiList(Model model) {
		logger.info("HospiList \t{}", new Date());
		List<Hospi_Dto> lists = service.selectAllHospital();
		model.addAttribute("lists", lists);
		return "HospiList";
	}

	
	// 병원목록 넘어가는 과정
	@RequestMapping(value = "/regist.do", method = RequestMethod.GET)
	public String HospiAwaitList(Model model) {
		logger.info("HospiAwaitList \t{}", new Date());
		List<Hospi_Dto> Alists = service.selectAllHospital();
		System.out.println();
		System.out.println(Alists);
		System.out.println();
		model.addAttribute("Alists", Alists);
		return "HospiAwaitList";
	}
	
	
	// 병원 상세조회로 이동
	@RequestMapping(value = "/detailHospital.do", method = RequestMethod.GET)
	public String detailHospital(Model model, String u_id, String h_regi) {
		logger.info("detailHospital 병원 상세조회 \t{}", u_id);
//		List<Hospi_Dto> oDto = serviceR.selectHObj(h_regi);
//		model.addAttribute("HObj", oDto);
		Hospi_Dto hDto = service.selectOneHospital(u_id);
		model.addAttribute("dto", hDto);
		return "HospiDetail";
	}
	
	
	// 병원상세 -> 병원 추가완료
	@RequestMapping(value = "/addHospital.do", method = RequestMethod.POST)
	public String addHospital(Hospi_Dto dto , String u_id) {
		logger.info("addHospital 병원 추가\t{}", u_id);
		
//		Hospi_Dto hdto = service.
//		model.addAttribute("hdto", dto);
//		Hospi_Dto dto = (Hospi_Dto)session.getAttribute("hDto");
		System.out.println(dto);
		boolean isc = service.insertHospital(dto);
		
		return isc?"redirect:/HospiList.do?u_id="+u_id:"redirect:/detailHospital.do";
	}
	
	
	// 병원추가

	
}
