package com.wdp.core.profile;

import com.wdp.core.profile.services.WDPThreadLocal;


public class BaseProfileThreadLocal {

	private static WDPThreadLocal threadLocal = new WDPThreadLocal();
	
	public static void setBaseProfile(BaseProfile baseProfile)
	{
		threadLocal.set(baseProfile);
	}
	
	
	public static BaseProfile getBaseProfile()
	{
		return (BaseProfile) threadLocal.get();
	}
}
