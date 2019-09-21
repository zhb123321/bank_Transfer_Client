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
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.zl.bts.pojo.BankResult;
import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.Currency;
import com.zl.bts.pojo.ShowBody;
import com.zl.bts.service.CrossBorderService;
import com.zl.bts.util.BankUtil;
import com.zl.bts.util.MessageResult;

import lombok.val;
//import oracle.sql.DATE;

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
		public ModelAndView insertInfo(CrossborderTransfer crossborderTransfer) {
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//查询数据库中表的最大字段
			Long maxCid = crossBorderService.findMaxCid();
			Long max = maxCid+1;
		    String str = format.format(date);
		    //设置默认字段
		    crossborderTransfer.setCid(max);
		    crossborderTransfer.setInaccount(crossborderTransfer.getUserid());
			crossborderTransfer.setDatetime(str);
			crossborderTransfer.setUptime(str);
			crossborderTransfer.setStatus((long) 1);
			crossborderTransfer.setFee((long) 12);
			crossborderTransfer.setService((long) 1);
			crossborderTransfer.setDeletetype("0");
			crossBorderService.insertCrossborderInfo(crossborderTransfer);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("redirect:/checkCrossBorder?max="+max);
			return modelAndView;
		}

		
		//短信验证模拟
		@RequestMapping("checkMessage")
		@ResponseBody
		public MessageResult checkMessage(String message) {
			return new MessageResult("0");
		}
		

		
		
		
}
