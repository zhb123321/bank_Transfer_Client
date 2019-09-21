package com.zl.bts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zl.bts.pojo.ActiveCollection;
import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.Currency;
import com.zl.bts.service.ActiveCollectionService;
import com.zl.bts.service.CrossBorderService;
import com.zl.bts.util.ConvertUpMoney;

@Controller
public class PageController {

	//跨境转账服务接口
	@Autowired
	private CrossBorderService  crossBorderService;
	
	//主动汇款服务接口
	@Autowired
	private ActiveCollectionService activeCollectionService;
	
	//跨境页面
	@RequestMapping("/showCrossBorder")
	public String showCrossBorderPage(Model model) {
		//币种查询
		List<Currency> currencylist = crossBorderService.findCurrency();
		model.addAttribute("currencylist", currencylist);
		System.out.println(currencylist.get(0).getCurrencyname());
		return "/bank/crossBorder";
	}
	
	//跨境页面跳转到短信验证页面
	@RequestMapping("/checkCrossBorder")
	public String checkInfo(Long max,Model model) {
		CrossborderTransfer entity = crossBorderService.findCurrentInfo(max);
		//将数字金钱转成中文
		Long moneynumber = entity.getMoneynumber();
		String money = moneynumber+"";
		
		model.addAttribute("entity", entity);
		model.addAttribute("money", ConvertUpMoney.toChinese(money));
		return "/bank/crossBorderCheck";
	}
	
	//跨境页面短信验证成功后，返回成功页面显示数据
	@RequestMapping("successTransfer")
	public String successInfo(String cid,Model model) {
		Long id = (long) Integer.parseInt(cid);
		CrossborderTransfer entity = crossBorderService.findCurrentInfo(id);
		//将数字金钱转成中文
		Long moneynumber = entity.getMoneynumber();
		String money = moneynumber+"";
		
		model.addAttribute("entity", entity);
		model.addAttribute("money", ConvertUpMoney.toChinese(money));
		return "/bank/crossBorderSucess";
	}
	
	//主动汇款页面跳转到短信验证页面
	@RequestMapping("/checkActive")
	public String checkActiveInfo(Long maxid,Model model) {
		System.out.println(maxid);
		
		ActiveCollection entity = activeCollectionService.findActiveInfo(maxid);
		System.out.println(entity.getUptime());
		
		//将数字金钱转成中文
		Long moneynumber = entity.getMoneynumber();
		String money = moneynumber+"";
		
		model.addAttribute("entity", entity);
		model.addAttribute("money", ConvertUpMoney.toChinese(money));
		return "/bank/activeCheck";
	}
	
	//主动汇款页面短信验证成功后，返回成功页面显示数据
	@RequestMapping("/successActive")
	public String successActiveInfo(String aid,Model model) {
		Long id = (long) Integer.parseInt(aid);
		ActiveCollection entity = activeCollectionService.findActiveInfo(id);
		//将数字金钱转成中文
		Long moneynumber = entity.getMoneynumber();
		String money = moneynumber+"";
		
		model.addAttribute("entity", entity);
		model.addAttribute("money", ConvertUpMoney.toChinese(money));
		return "/bank/activeSucess";
	}
	
	
}
