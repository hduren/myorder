package com.sendinfo.myorder.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	
	



	public void getString(){
		
		System.out.println("requeststr:" + getRequestBody());
		System.out.println("portRequest:" + portRequest);
		System.out.println("" + portRequest);
		System.out.println("" + portRequest);
		System.out.println("" + portRequest);
		try {
			response.setContentType("text/javascript;charset=UTF-8");
			response.getWriter().write(" "+portRequest+"myorder1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
