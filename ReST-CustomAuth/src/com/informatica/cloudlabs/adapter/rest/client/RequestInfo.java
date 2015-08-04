package com.informatica.cloudlabs.adapter.rest.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestInfo {

	String sAuthType;
	String sMediaType;
	String sRequestType;
	String sBaseUrl;
	String sOutputFileName;
	
	String sXmlPath;
	String sResponseFilePath;
	
	String sPayload_FilePath;
	String sIsBaseUrl;
	
	String sURLRequestParams;
	String sFormRequestParams;
	String sHeaderRequestParams;
	
	String sHeaderConfigFilePath; 
	String sURLConfigFilePath;
	String sFORMConfigFilePath;
	
	String sAuthUserId;
	String sAuthPassword;
	
	String sOAuthConsumerKey;
	String sOAuthConsumerSecret;
	String sOAuthToken;
	String sOAuthTokenSecret;
	String sAdditionalCustomAuthParam;
	String configKeyOrPrivateKeyFileName;
	
	List<String> lstUrlParamKey					=	new ArrayList<String>();
	List<String> lstFormParamKey				=	new ArrayList<String>();
	List<String> lstHeaderParamKey				=	new ArrayList<String>();
	
	Map<String, String>  mapAuthDetails			=	new HashMap<String, String>();
	
	Map<String, String> mapUrlRequestParams		=	new HashMap<String, String>();
	Map<String, String> mapFormRequestParams	=	new HashMap<String, String>();
	Map<String, String> mapHeaderRequestParams	=	new HashMap<String, String>();
	
	public String getPayload_FilePath() {
		return sPayload_FilePath;
	}

	public void setPayload_FilePath(String sPayload_FilePath) {
		this.sPayload_FilePath = sPayload_FilePath;
	}

	public String getIsDynamicBaseUrl() {
		return sIsBaseUrl;
	}

	public void setIsDynamicBaseUrl(String sIsBaseUrl) {
		this.sIsBaseUrl = sIsBaseUrl;
	}
	
	public String getHeaderRequestParams() {
		return sHeaderRequestParams;
	}

	public void setHeaderRequestParams(String sHeaderRequestParams) {
		this.sHeaderRequestParams = sHeaderRequestParams;
	}

	public String getHeaderConfigFilePath() {
		return sHeaderConfigFilePath;
	}
	
	public void setHeaderConfigFilePath(String sHeaderConfigFilePath) {
		this.sHeaderConfigFilePath = sHeaderConfigFilePath;
	}
	
	public String getsFormRequestParams() {
		return sFormRequestParams;
	}
	
	public void setsFormRequestParams(String sFormRequestParams) {
		this.sFormRequestParams = sFormRequestParams;
	}
	
	public String getsFORMConfigFilePath() {
		return sFORMConfigFilePath;
	}
	
	public void setsFORMConfigFilePath(String sFORMConfigFilePath) {
		this.sFORMConfigFilePath = sFORMConfigFilePath;
	}

	public String getConfigFilePath() {
		return sURLConfigFilePath;
	}

	public void setConfigFilePath(String sConfigFilePath) {
		this.sURLConfigFilePath = sConfigFilePath;
	}

	
	
	public List<String> getUrlParamsKeyList() {
		return lstUrlParamKey;
	}

	public void setUrlParamsKeyList(List<String> urlParamsKeyList) {
		this.lstUrlParamKey = urlParamsKeyList;
	}
	
	public List<String> getFormParamKeyList() {
		return lstFormParamKey;
	}

	public void setFormParamKeyList(List<String> lstFormParamKey) {
		this.lstFormParamKey = lstFormParamKey;
	}

	public List<String> getHeaderParamKeyList() {
		return lstHeaderParamKey;
	}

	public void setHeaderParamKeyList(List<String> lstHeaderParamKey) {
		this.lstHeaderParamKey = lstHeaderParamKey;
	}
	
	

	public String getOutputFileName() {
		return sOutputFileName;
	}

	public void setOutputFileName(String sOutputFileName) {
		this.sOutputFileName = sOutputFileName;
	}

	
	public String getResponseFilePath() {
		return sResponseFilePath;
	}

	public void setResponseFilePath(String sResponseFilePath) {
		this.sResponseFilePath = sResponseFilePath;
	}

	public String getXmlPath() {
		return sXmlPath;
	}

	public void setXmlPath(String sXmlPath) {
		this.sXmlPath = sXmlPath;
	}

	public Map<String, String> getAuthDetails() {
		return mapAuthDetails;
	}

	public void setAuthDetails(Map<String, String> mapAuthDetails) {
		this.mapAuthDetails = mapAuthDetails;
	}

	public String getReqType() {
		return sRequestType;
	}

	public void setReqType(String sRequestType) {
		this.sRequestType = sRequestType;
	}

	public String getBaseUrl() {
		return sBaseUrl;
	}

	public void setBaseUrl(String sBaseUrl) {
		this.sBaseUrl = sBaseUrl;
	}

	public String getReqParams() {
		return sURLRequestParams;
	}

	public void setReqParams(String sRequestParams) {
		this.sURLRequestParams = sRequestParams;
	}

	public String getMediaType() {
		return sMediaType;
	}

	public void setMediaType(String sMediaType) {
		this.sMediaType = sMediaType;
	}

	public String getAuthType() {
		return sAuthType;
	}

	public void setAuthType(String sAuthType) {
		this.sAuthType = sAuthType;
	}
	
	
	public String getsAuthType() {
		return sAuthType;
	}

	public void setsAuthType(String sAuthType) {
		this.sAuthType = sAuthType;
	}

	public String getsAuthUserId() {
		return sAuthUserId;
	}

	public void setsAuthUserId(String sAuthUserId) {
		this.sAuthUserId = sAuthUserId;
	}

	public String getsOAuthConsumerKey() {
		return sOAuthConsumerKey;
	}

	public void setsOAuthConsumerKey(String sOAuthConsumerKey) {
		this.sOAuthConsumerKey = sOAuthConsumerKey;
	}

	public String getsOAuthConsumerSecret() {
		return sOAuthConsumerSecret;
	}

	public void setsOAuthConsumerSecret(String sOAuthConsumerSecret) {
		this.sOAuthConsumerSecret = sOAuthConsumerSecret;
	}

	public String getsOAuthToken() {
		return sOAuthToken;
	}

	public void setsOAuthToken(String sOAuthToken) {
		this.sOAuthToken = sOAuthToken;
	}

	public String getsOAuthTokenSecret() {
		return sOAuthTokenSecret;
	}

	public void setsOAuthTokenSecret(String sOAuthTokenSecret) {
		this.sOAuthTokenSecret = sOAuthTokenSecret;
	}
	
	public String getsAuthPassword() {
		return sAuthPassword;
	}

	public void setsAuthPassword(String sAuthPassword) {
		this.sAuthPassword = sAuthPassword;
	}

	
	/**
	 * UrlParams Bean Methods - get, set & add
	 * @return
	 */
	
	public Map<String, String> getMapUrlRequestParams() {
		return mapUrlRequestParams;
	}

	public void setMapUrlRequestParams(Map<String, String> mapUrlRequestParams) {
		this.mapUrlRequestParams = mapUrlRequestParams;
	}

	public void addMapUrlRequestParams(Map<String, String> mapUrlRequestParams) {
		this.mapUrlRequestParams.putAll(mapUrlRequestParams);
	}
	
	public void cleanUrlMapParams(){
		this.mapUrlRequestParams.clear();
	}
	
	/**
	 * FormParams Bean Methods - get, set & add
	 * @return
	 */
	
	
	public Map<String, String> getMapFormRequestParams() {
		return mapFormRequestParams;
	}

	public void setMapFormRequestParams(Map<String, String> mapFormRequestParams) {
		this.mapFormRequestParams = mapFormRequestParams;
	}
	
	public void addMapFormRequestParams(Map<String, String> mapFormRequestParams) {
		this.mapFormRequestParams.putAll(mapFormRequestParams);
	}
	
	public void cleanFormMapParams(){
		this.mapFormRequestParams.clear();
	}


	/**
	 * HeaderParams Bean Methods - get, set & add
	 * @return
	 */
	
	public Map<String, String> getMapHeaderRequestParams() {
		return mapHeaderRequestParams;
	}

	public void setMapHeaderRequestParams(Map<String, String> mapHeaderRequestParams) {
		this.mapHeaderRequestParams = mapHeaderRequestParams;
	}
	
	public void addMapHeaderRequestParams(Map<String, String> mapHeaderRequestParams) {
		this.mapHeaderRequestParams.putAll(mapHeaderRequestParams);
	}

	public void cleanHeaderMapParams(){
		this.mapHeaderRequestParams.clear();
	}
	
	/**
	 * @return the sAdditionalCustomAuthParam
	 */
	public String getsAdditionalCustomAuthParam() {
		return sAdditionalCustomAuthParam;
	}

	/**
	 * @param sAdditionalCustomAuthParam the sAdditionalCustomAuthParam to set
	 */
	public void setsAdditionalCustomAuthParam(String sAdditionalCustomAuthParam) {
		this.sAdditionalCustomAuthParam = sAdditionalCustomAuthParam;
	}

	/**
	 * @return the configKeyOrPrivateKeyFileName
	 */
	public String getConfigKeyOrPrivateKeyFileName() {
		return configKeyOrPrivateKeyFileName;
	}

	/**
	 * @param configKeyOrPrivateKeyFileName the configKeyOrPrivateKeyFileName to set
	 */
	public void setConfigKeyOrPrivateKeyFileName(
			String configKeyOrPrivateKeyFileName) {
		this.configKeyOrPrivateKeyFileName = configKeyOrPrivateKeyFileName;
	}
}
