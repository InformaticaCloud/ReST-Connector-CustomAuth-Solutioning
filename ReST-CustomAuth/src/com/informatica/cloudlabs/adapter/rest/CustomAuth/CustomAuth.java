/**
 * 
 */
package com.informatica.cloudlabs.adapter.rest.CustomAuth;

import java.util.List;

import com.informatica.cloud.api.adapter.common.ILogger;
import com.informatica.cloudlabs.adapter.rest.client.RequestInfo;

/**
 * @author Administrator
 *
 */
public interface CustomAuth {
	public List<String> getCustomAuthAdditionalConfigParams(List<String> configParamsLst);
	public String GetCustomAuthParams(RequestInfo reqInfo, ILogger ilogger)
			throws Exception;
}
