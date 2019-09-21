package com.zl.bts.controller;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.page;
import com.zl.bts.pojo.layuiResult;
import com.zl.bts.service.ClientInfoService;

@Controller
@RequestMapping("clientInfo")
public class ClientInfoController {

	@Autowired
	private ClientInfoService clientInfoService;
	//查询分页
	@RequestMapping("pageInfo")
	@ResponseBody
	public layuiResult<PageInfo<Account>> findClientInfo(page qc,@RequestParam("limit") int limit) {

		PageHelper.startPage(qc.getPage(), limit);
		PageInfo<Account> page =new PageInfo<>(clientInfoService.pageClientInfo(qc)) ;
		return new layuiResult<PageInfo<Account>>("",page.getList(), 0, page.getTotal());
		
	}
	//删除
			@RequestMapping("delMore")
			@ResponseBody
			public void del(Integer[] ids) {
				System.out.println(ids);
				for (Integer id : ids) {
				clientInfoService.delById(id);
				}
	
			}
	//修改
			//根据gid查询物资
			@RequestMapping("queryAll")
			public String queryAll(Integer uid,Model model) {
				System.err.println(uid);
				Account account = clientInfoService.queryById(uid);
				model.addAttribute("account", account);
				return "/bank/client_edit";
			}
		
		//修改	
		@RequestMapping("/updateInfo")
			public void update(Account account,Model model) {
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
			account.setUptime(dateFormat.format(date)); 
			
			if (account.getDeletetype().equals("3")) {
				account.setDeletetype("0");
			}
				clientInfoService.updateAc(account);				
			}

			
}
