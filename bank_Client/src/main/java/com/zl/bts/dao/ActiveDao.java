package com.zl.bts.dao;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.zl.bts.pojo.ActiveCollection;
import com.zl.bts.pojo.ActiveCollectionExample;

public interface ActiveDao {

	int countByExample(ActiveCollectionExample example);

    int deleteByExample(ActiveCollectionExample example);

    int deleteByPrimaryKey(Long aid);

    int insert(ActiveCollection record);

    int insertSelective(ActiveCollection record);

    List<ActiveCollection> selectByExample(ActiveCollectionExample example);

    ActiveCollection selectByPrimaryKey(Long aid);

    int updateByExampleSelective(@Param("record") ActiveCollection record, @Param("example") ActiveCollectionExample example);

    int updateByExample(@Param("record") ActiveCollection record, @Param("example") ActiveCollectionExample example);

    int updateByPrimaryKeySelective(ActiveCollection record);

    int updateByPrimaryKey(ActiveCollection record);

	Long selectMaxAid();
	
	
}
