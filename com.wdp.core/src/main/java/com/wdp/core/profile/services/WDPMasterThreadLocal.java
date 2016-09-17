package com.wdp.core.profile.services;

import java.util.HashMap;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class WDPMasterThreadLocal extends ThreadLocal{

	private static WDPMasterThreadLocal instance = new WDPMasterThreadLocal();
	
	private WDPMasterThreadLocal(){
		
	}
	
	public Object get() {
		Object obj = super.get();
		if (obj == null) {
			obj = new HashMap();
			set(obj);
		}
		return obj;
	}
	
	public static WDPMasterThreadLocal getInstance()
	{
		return instance;
	}
}