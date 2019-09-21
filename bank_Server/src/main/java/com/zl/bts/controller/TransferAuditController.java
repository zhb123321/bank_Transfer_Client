package com.zl.bts.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.InterbankTransfer;
import com.zl.bts.pojo.layuiResult;
import com.zl.bts.pojo.page;
import com.zl.bts.service.TransferAuditService;

@Controller
@RequestMapping("TransferAudit")
public class TransferAuditController {
	
	@Autowired
	private TransferAuditService transferAuditService;
	//查询行内
	@RequestMapping("InerbankAudit")
	@ResponseBody
	public layuiResult<PageInfo<InerbankTransfer>>  transferInfo(page qc,@RequestParam("limit") int limit){
		PageHelper.startPage(qc.getPage(), limit);
		PageInfo<InerbankTransfer> page =new PageInfo<>(transferAuditService.InerbankInfo(qc)) ;
		return new layuiResult<PageInfo<InerbankTransfer>>("",page.getList(), 0, page.getTotal());
	}
	//查询跨境
	@RequestMapping("CrossborderAudit")
	@ResponseBody
	public layuiResult<PageInfo<CrossborderTransfer>>  CrossborderInfo(page qc,@RequestParam("limit") int limit){
		PageHelper.startPage(qc.getPage(), limit);
		PageInfo<CrossborderTransfer> page =new PageInfo<>(transferAuditService.CrossborderInfo(qc)) ;
		return new layuiResult<PageInfo<CrossborderTransfer>>("",page.getList(), 0, page.getTotal());
	}
	
	//查询跨行
	@RequestMapping("InterbankAudit")
	@ResponseBody
	public layuiResult<PageInfo<InterbankTransfer>> InterbankInfo(page qc,@RequestParam("limit") int limit){
		PageHelper.startPage(qc.getPage(), limit);
		PageInfo<InterbankTransfer> page =new PageInfo<>(transferAuditService.InterbankInfo(qc)) ;
		return new layuiResult<PageInfo<InterbankTransfer>>("",page.getList(), 0, page.getTotal());
	}
	
	//修改
	//根据Cid查询跨境
	@RequestMapping("/updateCrossborder")
	public void updateCrossborder(CrossborderTransfer ct,Model model) {
		System.err.println(ct.toString());
	Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
		ct.setUptime(dateFormat.format(date));
		Long  money=transferAuditService.selectMoney(ct.getUserid());
		if (ct.getStatus()==3) {
			transferAuditService.updateCt(ct,money);
		}else  if (ct.getStatus()==4) {
			transferAuditService.updateStatus(ct);
		}
						
	}
	
	
	@RequestMapping("queryByCid")
	public String queryAll(Integer cid,Model model) {
		CrossborderTransfer ct= transferAuditService.queryByCId(cid);
		model.addAttribute("ct", ct);
		return "/bank/Caudit_edit";
	}

	//修改
	//根据nid查询行内
	@RequestMapping("/updateInerbank")
	public void updateInerbank(InerbankTransfer it,Model model) {
		
	Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
		it.setUptime(dateFormat.format(date));
		Long  money=transferAuditService.selectMoney(it.getUserid());
		if (it.getStatus()!=null || it.getStatus()!=(-1)) {
			System.err.println(it.getStatus());
			if (it.getStatus()==3) {
				transferAuditService.updateIt(it,money);
			}else  if (it.getStatus()==4) {
				transferAuditService.updateStatus(it);
			}
		}
						
	}

	@RequestMapping("queryByNid")
	public String queryByNid(Integer nid,Model model) {
		InerbankTransfer it= transferAuditService.queryByNId(nid);
		model.addAttribute("it", it);
		return "/bank/Naudit_edit";
	}

	//修改
		//根据iid查询跨行
		@RequestMapping("/updateInterbank")
		public void updateInterbank(InterbankTransfer iit,Model model) {
			
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
			iit.setUptime(dateFormat.format(date));
			Long  money=transferAuditService.selectMoney(iit.getUserid());
			if (iit.getStatus()!=null || iit.getStatus()!=(-1)) {
				System.err.println(iit.getStatus());
				if (iit.getStatus()==3) {
					transferAuditService.updateIit(iit,money);
				}else  if (iit.getStatus()==4) {
					transferAuditService.updateStatus(iit);
				}
			}					
		}

		@RequestMapping("queryByIid")
		public String queryByIid(Integer iid,Model model) {
			InterbankTransfer iit= transferAuditService.queryByIId(iid);
			model.addAttribute("iit", iit);
			return "/bank/Iaudit_edit";
		}

}
