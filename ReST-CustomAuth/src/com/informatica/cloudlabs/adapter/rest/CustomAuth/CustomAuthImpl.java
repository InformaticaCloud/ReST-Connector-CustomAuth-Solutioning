package com.informatica.cloudlabs.adapter.rest.CustomAuth;

/**
 * Description : User can type in all the Import class and packages here.
 */

import java.util.List;
import java.util.Map;

import com.informatica.cloud.api.adapter.common.ELogMsgLevel;
import com.informatica.cloud.api.adapter.common.ILogger;
import com.informatica.cloudlabs.adapter.rest.client.RequestInfo;

public class CustomAuthImpl implements CustomAuth{

		private static String clazz_Name = "CustomAuthImpl";
	
	/**
	 * 
	 * @author        Informatica CloudART
	 * @category      Out-Of-Box Method. Comes with default Informatica CustomAuth Template. The User has to Implement this method
	 * Description	: If User selects "CUSTOMAUTH" as authentication type in ReST connection, then the below method - 'GetCustomAuthParams' will be executed. 
	 * 				  User needs to implement 'GetCustomAuthParams' method to solution ReST connectivity for his Integrating ReST endpoint.
	 * Parameters	: requestInfo	-	This Bean Consist of all Header, Url, Form parameters required to make a ReST request.
	 * 				  ILogger		-	Informatica Toolkit Logger instance; which would help user log the Info, Debug & Errors in the Session log.
	 *
	 */
	@Override
	public String GetCustomAuthParams(RequestInfo reqInfo,ILogger ilogger) throws Exception{
		
		String methodName = "GetCustomAuthParams";
		
		if (ilogger != null) {
			ilogger.logMessage(clazz_Name, methodName, ELogMsgLevel.INFO,"Inside Method GetCustomAuthParams");
		}
		
		/**
		 * Description	:	Below few lines are sketched out for your convenience.
		 */
		Map<String, String> mapURLRequestParams					=		reqInfo.getMapUrlRequestParams();
		Map<String, String> mapFormRequestParams				=		reqInfo.getMapFormRequestParams();
		Map<String, String> mapHeaderRequestParams				=		reqInfo.getMapHeaderRequestParams();
		

		String		sEndpointUrl			=	reqInfo.getBaseUrl();
		String sResponse					=	null;

		/**
		 * Custom Coding can be written here ....  
		 * User can write their ReST request and process the response received from endpoint. 
		 */
				
		return sResponse;
	}
	
	/**
	 * 
	 * @author Informatica CloudART
	 * @category Out-Of-Box Method. Comes with Default Informatica CustomAuth Template.
	 *
	 */
	public class CustomParams{
		
		public enumParamType		enParamsType;
		public String sCustomPropertyName;
		public String sCustomPropertyValue;
		public enumParamType getEnParamsType() {
			return enParamsType;
		}
		public void setEnParamsType(enumParamType enParamsType) {
			this.enParamsType = enParamsType;
		}
		public String getsCustomPropertyName() {
			return sCustomPropertyName;
		}
		public void setsCustomPropertyName(String sCustomPropertyName) {
			this.sCustomPropertyName = sCustomPropertyName;
		}
		public String getsCustomPropertyValue() {
			return sCustomPropertyValue;
		}
		public void setsCustomPropertyValue(String sCustomPropertyValue) {
			this.sCustomPropertyValue = sCustomPropertyValue;
		}
		
		
	}
	
	/**
	 * 
	 * @author Informatica CloudART
	 * @category Out-Of-Box Enum. Comes with Default Informatica CustomAuth Template.
	 *
	 */
	public enum enumParamType {
		
		URL(1), 
		FORM(2), 
		HEADER(3);
		
		private int value;
		private enumParamType(int value){
			this.value=value;
		}
		public int getValue(){
			return value;
		}
	}
	/**
	 * 
	 * @author Informatica CloudART
	 * @category Out-Of-Box custom auth additional config params.
	 *
	 */
	@Override
	public List<String> getCustomAuthAdditionalConfigParams(List<String> configParamsLst){
		return configParamsLst;
	}
}
