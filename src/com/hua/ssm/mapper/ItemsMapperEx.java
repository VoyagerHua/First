package com.hua.ssm.mapper;

import java.util.List;

import com.hua.ssm.po.ItemsEx;

//ItemsMapper 的扩展 提供自定的数据库操作
public interface ItemsMapperEx {

	
	//查询所有商品
	public List<ItemsEx> findItemsList(ItemsEx itesmex) throws Exception;
	
	//在itemsmapperex.xml 中编写对应语句。  名字要对应
	
	
}
