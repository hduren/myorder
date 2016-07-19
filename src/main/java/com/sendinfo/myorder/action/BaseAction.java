package com.sendinfo.myorder.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletResponseAware,
		ServletRequestAware {
	protected String portRequest;
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	protected String basePath;
	protected String base;

	public String getRequestBody() {

		StringBuilder sb = null;
		try {

			InputStreamReader inputReader = new InputStreamReader(
					request.getInputStream(), "UTF-8");
			BufferedReader bufferReader = new BufferedReader(inputReader);
			sb = new StringBuilder();
			String line = null;

			while ((line = bufferReader.readLine()) != null) {
				sb.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	/**
	 * @return the response
	 */
	public HttpServletResponse getResponse() {
		return response;
	}

	/**
	 * @return the portRequest
	 */
	public String getPortRequest() {
		return portRequest;
	}

	/**
	 * @param portRequest
	 *            the portRequest to set
	 */
	public void setPortRequest(String portRequest) {
		this.portRequest = portRequest;
	}

	public String execute() {

		return SUCCESS;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		response = arg0;

	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
	
	public String getBase() {
		if (null == base)
			base = getContextPath();
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}
	
	/**
	 * @return the request
	 */
	public HttpServletRequest getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * @return the basePath
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * @param basePath the basePath to set
	 */
	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	private String getContextPath() {
		if (this.getRequest() != null) {
			String p = this.getRequest().getScheme() + "://"
					+ this.getRequest().getServerName();
			if (this.getRequest().getServerPort() != 80)
				p = p + ":" + this.getRequest().getServerPort();
			p = p + this.getRequest().getContextPath();
			return p;
		} else
			return "";
	}

}
