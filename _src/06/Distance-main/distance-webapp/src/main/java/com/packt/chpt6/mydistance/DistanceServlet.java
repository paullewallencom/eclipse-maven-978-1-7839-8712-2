package com.packt.chpt6.mydistance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.packt.chpt6.mydistance.util.ConversionUtil;



public class DistanceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	static Logger log=Logger.getLogger(DistanceServlet.class);
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
		double convertVal = 0;
		double distanceProvided =Double.parseDouble(req.getParameter("distance"));
		String distanceIn=req.getParameter("distIn");
		String convertTo=req.getParameter("convert");
		log.debug("Request Parameters ==>"+"Distance-"+distanceProvided+distanceIn+" Conversion Unit- "+convertTo );
		ConversionUtil conversion= new ConversionUtil();
		if(distanceIn.equals("km") && convertTo.equals("yd")){
			convertVal=conversion.convertkmToYard(distanceProvided);
		}
		
		if(distanceIn.equals("m") && convertTo.equals("yd")){
			convertVal=conversion.convertMtoYard(distanceProvided);
		}
		
		if(distanceIn.equals("km") && convertTo.equals("mi")){
			convertVal=conversion.convertKMToMile(distanceProvided);
		}
		
		if(distanceIn.equals("m") && convertTo.equals("mi")){
			convertVal=conversion.convertMToMile(distanceProvided);
		}
		
		resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("The converted value is "+convertVal);
        out.flush();
        out.close();

    }
	

}
