package com.ibm.smartcloud.core.util;

public class PowerTools {
	
	public static int resultSum(String TypeOfMaxorMin,int LimitValue, int value){
		if (TypeOfMaxorMin == "MAX"){
			if(value < LimitValue){
				return value;
			}else if(value >= LimitValue){
				return LimitValue;
			}
		}else if(TypeOfMaxorMin == "MIN"){
			if(value > LimitValue){
				return value;
			}else if(value <= LimitValue ){
				return LimitValue;
			}
		}
		return 0;
	}
	
	public static Double resultDoubleSum(String TypeOfMaxorMin2,Double LimitValue2, Double value2){
		if (TypeOfMaxorMin2 == "MAX"){
			if(value2 < LimitValue2){
				return value2;
			}else if(value2 >= LimitValue2){
				return LimitValue2;
			}
		}else if(TypeOfMaxorMin2 == "MIN"){
			if(value2 > LimitValue2){
				return value2;
			}else if(value2 <= LimitValue2 ){
				return LimitValue2;
			}
		}
		return 0.0;
	}
	
 
}
