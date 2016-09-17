package com.wdp.core.profile.services;
import java.util.Map;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class WDPThreadLocal extends ThreadLocal{

	public Object get()
	   {
	     Map map = (Map)WDPMasterThreadLocal.getInstance().get();
	     Object value = map.get(this);
	     if (value == null)
	     {
	       value = initialValue();
	       if (value != null)
	         set(value);
	     }
	     return value;
	   }
	
	  
	public void set(Object value)
	{
		Map map = (Map)WDPMasterThreadLocal.getInstance().get();
	    map.put(this, value);
	}
}
