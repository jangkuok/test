/**
 * 
 */
package com.javateam.jpaDemo1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javateam.jpaDemo1.domain.DemoVo;
import com.javateam.jpaDemo1.service.JpaService;

/**
 * @author javateam
 *
 */
@RestController
public class HomeAction {
	
	private static final Logger log
		= LoggerFactory.getLogger(HomeAction.class);
	
	@Autowired
	private JpaService daoSvc;
	
	@RequestMapping("/")
	public String home() {
		
		log.info("home");
		
		return "index";
	} //
	
	@RequestMapping("save")
	public DemoVo save(DemoVo demoVo) {
		
		log.info("save");
		
		return daoSvc.save(demoVo);
	}
	
	@RequestMapping("listAll") 
	// public List<DemoVo> listAll() { // JpaRepository
	public Iterable<DemoVo> listAll() { // CrudRepository
		
		log.info("listAll");
		
		return daoSvc.findAll();
	}

} //