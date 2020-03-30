package com.yc.service;

import java.util.List;

import com.yc.domain.Good;
import com.yc.domain.Shop;

public interface SGService {
	List<Shop> getList(String keyword);

	List<Good> getGoods();

	boolean addSG(Shop shop, int[] idss);

	Shop Shopdetails(Integer sid);

	boolean delete(int[] ids);
}
