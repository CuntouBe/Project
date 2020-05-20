package com.ctb.listense;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ListenseTest implements HttpSessionListener, ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent){
        //获取application
        ServletContext servletContext = servletContextEvent.getServletContext();
        //设置网站的初始在线人数
        servletContext.setAttribute("count",0);
    }


    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent){
        System.out.println("执行contextDestroyed");
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent){
        //获取application对象
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        int count = (int) servletContext.getAttribute("count");
        servletContext.setAttribute("count",++count);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent){
        //获取application对象
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        int count = (int) servletContext.getAttribute("count");
        servletContext.setAttribute("count",--count);
    }
}
