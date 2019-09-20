package com.zl.bts.dao;

import java.lang.Long;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.CrossborderTransferExample;
import com.zl.bts.pojo.Currency;

public interface CrossBorderDao {
	
    int countByExample(CrossborderTransferExample example);

    int deleteByExample(CrossborderTransferExample example);

    int deleteByPrimaryKey(Long cid);

    int insert(CrossborderTransfer record);
    //按条件查询插入（如果不存在就赋值为空）
    int insertSelective(CrossborderTransfer record);

    List<CrossborderTransfer> selectByExample(CrossborderTransferExample example);

    CrossborderTransfer selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") CrossborderTransfer record, @Param("example") CrossborderTransferExample example);

    int updateByExample(@Param("record") CrossborderTransfer record, @Param("example") CrossborderTransferExample example);

    int updateByPrimaryKeySelective(CrossborderTransfer record);

    int updateByPrimaryKey(CrossborderTransfer record);
   
    //查询币种
	List<Currency>  selectCurrency();
	//查询数据库中表的最大字段
	Long selectMaxCid();
	//根据id查询该条信息
	CrossborderTransfer selectByCid(Long max);
	
}
