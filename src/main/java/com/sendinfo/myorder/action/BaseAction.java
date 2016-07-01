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
}
