package com.njpkhuan.test.controller;


import com.njpkhuan.test.model.HtmlBean;
import com.njpkhuan.test.util.EsUtilTest;
import com.njpkhuan.test.util.PageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sxt
 */
@Controller
public class EsController {

    static final Logger logger = LoggerFactory.getLogger(EsController.class);

    private EsUtilTest esUtil = new EsUtilTest();

    /*
    默认每页显示10条数据，则每页显示的记录从(num-1)*10开始。
     */
    private int pagesize = 10;

    @RequestMapping("/search.do")
    public String search(String keywords, int num, Model model) throws Exception {
        //keywords = new String(keywords.getBytes(), "UTF-8");
        PageUtil<HtmlBean> page = esUtil.search(keywords, num, pagesize);
        model.addAttribute("page", page);
        model.addAttribute("keywords", keywords);
        return "index.jsp";
    }
}
