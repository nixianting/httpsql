package com.abc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SqlController {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
    @GetMapping("/run")
    public @ResponseBody List getMethod(@RequestParam(value="sql") String sql) throws Exception {
    	return jdbcTemplate.queryForList(sql);
    }
    
    @PostMapping("/run")
    public @ResponseBody List postMethod(@RequestParam(value="sql") String sql) throws Exception {
    	return jdbcTemplate.queryForList(sql);
    }
}