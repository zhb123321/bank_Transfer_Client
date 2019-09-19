package com.zl.bts.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.zl.bts.pojo.BankResult;
import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.Currency;
import com.zl.bts.pojo.ShowBody;
import com.zl.bts.service.CrossBorderService;
import com.zl.bts.util.BankUtil;

import lombok.val;
import oracle.sql.DATE;

@RestController
@RequestMapping("crossBorder")
public class CrossBorderController {
	@Autowired
	private CrossBorderService  crossBorderService;

		//查询收款账户信息
		@RequestMapping("checkreuser")
		@ResponseBody
		public BankResult checkInfo_1(String reusername,String reusernumber,String reuserphone,String reuseridcard) throws Exception {
			//调用银行接口
			/*String bankResult = BankUtil.BankResult(reusernumber,reusername,reuserphone,reuseridcard);
			System.out.println(bankResult+"bankResult");
			BankResult date = JSON.parseObject(bankResult, BankResult.class);
			System.out.println(date.getShowapi_res_body().getCode());*/
			//数据模拟
			BankResult result = new BankResult();
			result.setShowapi_res_code("0");
		
			return result;
		}
		
		//查询汇款账户信息
		@RequestMapping("checkuser")
		@ResponseBody
		public BankResult checkInfo_2(String username,String userid,String userphone,String useridcard) throws Exception {
			//调用银行接口
			/*String bankResult = BankUtil.BankResult(username,userid,userphone,useridcard);
			System.out.println(bankResult+"bankResult");
			BankResult date = JSON.parseObject(bankResult, BankResult.class);
			System.out.println(date.getShowapi_res_body().getCode());*/
			//数据模拟
			BankResult result = new BankResult();
			result.setShowapi_res_code("0");
		
			return result;
		}
		
		//将前台页面中的跨境转账信息插入到数据库
		@RequestMapping("insertCrossBorder")
		public void insertInfo(CrossborderTransfer crossborderTransfer) {
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//查询
			Long maxCid = crossBorderService.findMaxCid();
			Long max = maxCid+1;
			System.out.println(max);
		    String str = format.format(date);
		    crossborderTransfer.setCid(max);
			crossborderTransfer.setDatetime(str);
			crossborderTransfer.setUptime(str);
			crossBorderService.insertCrossborderInfo(crossborderTransfer);
		}

		//将插入到数据库中的信息重新展示到页面中
		@RequestMapping("checkCrossBorder")
		public String checkInfo() {
			
			
			return "/bank/crossBorderCheck";
		}
		
		
}
