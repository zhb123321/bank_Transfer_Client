package com.zl.bts.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.CrossborderTransferExample;
import com.zl.bts.pojo.Currency;

public interface CrossBorderDao {
	
    int countByExample(CrossborderTransferExample example);

    int deleteByExample(CrossborderTransferExample example);

    int deleteByPrimaryKey(BigDecimal cid);

    int insert(CrossborderTransfer record);

    int insertSelective(CrossborderTransfer record);

    List<CrossborderTransfer> selectByExample(CrossborderTransferExample example);

    CrossborderTransfer selectByPrimaryKey(BigDecimal cid);

    int updateByExampleSelective(@Param("record") CrossborderTransfer record, @Param("example") CrossborderTransferExample example);

    int updateByExample(@Param("record") CrossborderTransfer record, @Param("example") CrossborderTransferExample example);

    int updateByPrimaryKeySelective(CrossborderTransfer record);

    int updateByPrimaryKey(CrossborderTransfer record);
   
	List<Currency>  selectCurrency();

	Long selectMaxCid();
	
}
