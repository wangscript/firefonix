package com.firefonix.core.servlet;

import javax.servlet.http.HttpServlet;
import java.util.Map;

/**
 * Created by IceFonix on 2014/8/1.
 * 初始化整个环境
 * 准备好 ctrl,router,interceptors
 * 以及组合，通过chain方式组合
 * routerManager->interceptorStack->CtxManager
 */
public class StartServlet extends HttpServlet {
    /**
     * 初始化整个环境
     * @param fires String[] 初始化文件位置
     * @param extras Bundle 附加选项
     * */
    protected void initLoader(String []fires,Map<String,String> extras){}

}
