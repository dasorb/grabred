package com.grabred.config;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * @author chenjie
 * @date 2019/2/28 0028 - 15:37
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //ioc容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    //DispatcherServlet
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    //拦截请求管理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"*.do"};
    }

    //上传文件设置
    @Override
    protected void customizeRegistration(Dynamic dynamic) {
        //配置上传文件
        String filepath = "e:/uploads";
        //5Mb
        Long singleMax = (long) (5*Math.pow(2, 20));
        //10Mb
        Long totalMax = (long) (10*Math.pow(2,20));
        //上传文件配置
        dynamic.setMultipartConfig(new MultipartConfigElement(filepath,singleMax,totalMax,0));

    }
}
