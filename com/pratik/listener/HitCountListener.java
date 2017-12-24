package com.pratik.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class HitCountListener implements ServletRequestListener {
	int count = 0;
	//destroy the request
	public void requestDestroyed(ServletRequestEvent e) { 
	
			System.out.println("Request Destroyed");
		}//requestDestroyed() close
	
	
//initialised the request
	
	public void requestInitialized(ServletRequestEvent e) { 
			count = count + 1;
				ServletContext context = e.getServletContext();
					context.setAttribute("count",count);
						System.out.println("Request Created");
		}//requestInitialized() close

	}//class close
