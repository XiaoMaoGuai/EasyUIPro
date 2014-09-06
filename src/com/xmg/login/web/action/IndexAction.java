package com.xmg.login.web.action;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @Description :
 * @FileName: IndexAction.java
 * @Author :WeiHui.Zhang
 * @Data : 2014年8月21日 下午8:50:49
 * @Version:1.0.0
 */

@Controller
public class IndexAction {

	private final static Logger logger = Logger.getLogger(IndexAction.class);

	@RequestMapping("index.xhtml")
	public String index() {

		logger.info("index--->进入首页中");

		return "index";
	}

	@RequestMapping("include.xhtml")
	public String include() {

		logger.info("include--->引入EasyUI..JS..CSS");

		return "include";
	}
}
