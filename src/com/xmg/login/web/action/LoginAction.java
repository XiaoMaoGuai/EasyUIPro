package com.xmg.login.web.action;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.xmg.model.User;
import com.xmg.webkit.form.EasyUIDataGridOutputModel;
import com.xmg.webkit.form.MessageModel;

/*
 * @Description :
 * @FileName: LoginAction.java
 * @Author :WeiHui.Zhang
 * @Data : 2014年8月21日 下午9:16:42
 * @Version:1.0.0
 */
@Controller
public class LoginAction {

	private Logger logger = LoggerFactory.getLogger(LoginAction.class);

	@RequestMapping("login.xhtml")
	@ResponseBody
	public MessageModel login(String userName, String password) {
		MessageModel model = null;

		if (userName.equals("admin") && password.equals("123")) {
			model = new MessageModel(true);
			logger.info(userName + "login success!");
		} else {
			model = new MessageModel(false);
		}
		return model;
	}

//	@RequestMapping("login.xhtml")
//	public String login(String userName, String password) {
//
//		System.out.println("userName-->" + userName + "password-->" + password);
//		return "login";
//	}

	@RequestMapping("query.xhtml")
	@ResponseBody
	public EasyUIDataGridOutputModel<User> queryPagedList() {
		EasyUIDataGridOutputModel<User> model = new EasyUIDataGridOutputModel<User>();

		List<User> users = new ArrayList<User>();
		users.add(new User(1, "test1", "123"));
		users.add(new User(2, "test2", "123"));
		users.add(new User(3, "test3", "123"));
		users.add(new User(4, "test4", "123"));
		users.add(new User(5, "test5", "123"));
		model.setRows(users);
		model.setTotal(users.size());

		System.out.println(model);
		logger.info(model.toString());

		String jsonString = JSON.toJSONString(users);

		System.out.println(jsonString);

		return model;
	}
}
