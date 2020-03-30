package com.yc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yc.dao.SGMapper;
import com.yc.domain.Good;
import com.yc.domain.Shop;
import com.yc.service.SGService;

@Service
public class SGServiceImpl implements SGService{
	@Autowired
	private SGMapper mapper;

	@Override
	public List<Shop> getList(String keyword) {
		// TODO Auto-generated method stub
		return mapper.getList(keyword);
	}

	@Override
	public List<Good> getGoods() {
		// TODO Auto-generated method stub
		return mapper.getGoods();
	}

	@Override
	public boolean addSG(Shop shop, int[] idss) {
		// TODO Auto-generated method stub
		try {
			mapper.addShop(shop);
			mapper.addCenter(shop.getSid(),idss);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Shop Shopdetails(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.Shopdetails(sid);
	}

	@Override
	public boolean delete(int[] ids) {
		// TODO Auto-generated method stub
		try {
			
			for (int i : ids) {
				mapper.delCenter(i);
				mapper.delShop(i);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
}
