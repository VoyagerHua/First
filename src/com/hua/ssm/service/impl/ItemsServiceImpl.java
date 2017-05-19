package com.hua.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hua.ssm.mapper.ItemsMapperEx;
import com.hua.ssm.po.ItemsEx;
import com.hua.ssm.service.ItemsService;


//商品业务 
public class ItemsServiceImpl implements ItemsService {

	//注入DAO（mapper）
	@Autowired
	private ItemsMapperEx itemsmapperex;
	
	
	//查询所有
	@Override
		public List<ItemsEx> findItemsList(ItemsEx  itesmex) throws Exception {
		
		
		System.out.println("业务查询");
		return itemsmapperex.findItemsList(itesmex);
	}
	
	
}
