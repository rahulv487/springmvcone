package com.cg.springmvcone.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcone.dao.IMobileDao;
import com.cg.springmvcone.dto.Mobile;

@Service("mobileservice")
@Transactional
public class MobileServiceImpl implements IMobileService {

	@Autowired
	IMobileDao mobiledao;
	@Override
	public void addMobile(Mobile mobile) {
		mobiledao.addMobile(mobile);
		
	}

	@Override
	public List<Mobile> showAllMobile() {
		// TODO Auto-generated method stub
		return mobiledao.showAllMobile();
	}

	@Override
	public void deleteMobile(int mobId) {
		mobiledao.deleteMobile(mobId);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		return mobiledao.searchMobile(mobId);
	}
   @Override
    public void updateMobile(int mobId, double mobPrice){
		mobiledao.updateMobile(mobId, mobPrice);
	   
   }

}
