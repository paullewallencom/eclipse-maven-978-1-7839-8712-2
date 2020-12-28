package com.packt.chpt5.mydistance.util;

/**
 * Utility class that converts distance between different units of measurement
 * @author 
 *
 */
public class ConversionUtil {
	
	/**
	 * Converts the given distance in Km to miles.
	 * @param distance  In km
	 * @return
	 */
	public double convertKMToMile(double distance){
		return (distance*0.62137);	
	}
	
	/**
	 * Converts the given distance in km to yard.
	 * @param distance In Km
	 * @return
	 */
	public double convertkmToYard(double distance){
		return distance*1093.6;
	}
	
	/**
	 * Converts the given distance in Meter to miles.
	 * @param distance  In Meter
	 * @return
	 */
	public double convertMToMile(double distance){
		return (distance/1000)*0.62137 ;
	}
	
	/**
	 * Converts the given distance in Meter to Yard.
	 * @param distance In Meter
	 * @return
	 */
	public double convertMtoYard(double distance){
		return (distance/1000)*1093.6;
	}

}
