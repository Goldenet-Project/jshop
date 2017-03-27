package net.jeeshop.web.action.manage.data;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import net.jeeshop.core.Services;
import net.jeeshop.core.util.hadoop.hdfsUtils;
import net.jeeshop.services.common.Data;
import net.jeeshop.services.manage.data.DataService;
import net.jeeshop.web.action.BaseController;

/**
 * 数据管理
 * 
 * @author lin
 */
@Controller
@RequestMapping("/manage/data/")
public class DataAction extends BaseController<Data> {
	private static final long serialVersionUID = 1L;
	@Autowired
	private DataService dataService;
	private static final String page_toList = "/manage/data/dataList";
	private static final String page_toEdit = "/manage/data/dataEdit";

	private DataAction() {
		super.page_toList = page_toList;
		super.page_toAdd = page_toEdit;
		super.page_toEdit = page_toEdit;
	}

	@Override
	public Services<Data> getService() {
		return dataService;
	}

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	@RequestMapping(value = "/insertData", method = RequestMethod.POST)
	public String insert(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request,
			@ModelAttribute("e") Data e) {
		return "";
	}

}
