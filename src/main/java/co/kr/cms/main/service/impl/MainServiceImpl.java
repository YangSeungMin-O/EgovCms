package co.kr.cms.main.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.cms.main.service.MainService;

@Service("mainService")
public class MainServiceImpl implements MainService {

	@Resource(name = "mainMapper")
	private MainMapper mapper;
}
