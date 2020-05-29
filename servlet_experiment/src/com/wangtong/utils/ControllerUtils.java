package com.wangtong.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

public class ControllerUtils extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	
	/*
	 * ���ñ���
	 */
	public static void setCharEncoding(HttpServletRequest request, HttpServletResponse response){
		
			try {
				request.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	/*
	 * ����Cookie�����û���¼��Ϣ
	 */
	public static void setCookie(String key,String str, HttpServletResponse response){
		Cookie cookie = new Cookie(key, str);
		cookie.setMaxAge(1*60*60*24*7);//��������
		response.addCookie(cookie);
	}
	
	
	/*
	 * ��װJson
	 */
	public static String setJson(Object object){
		JSONObject jsonObject = new JSONObject();
		return jsonObject.toJSONString(object);
	}
	
	/*
	 * ��װPrintWriter����
	 */
	public static void getPrintWriter(HttpServletResponse response, String str){
		
		try {
			PrintWriter printWriter = response.getWriter();
			printWriter.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * ���ý��ַ���ת����int����
	 */
	public static int StringToInt(String str){
		return Integer.parseInt(str); 
	}
	
	/*
	 * �ж��û��Ƿ��¼
	 */
	public static boolean LoginUser(HttpServletRequest request){
		
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if("LOGIN_USER".equals(cookie.getName())){
					return true;
				}
			}
		}
		
		return false;
	}
	
}
