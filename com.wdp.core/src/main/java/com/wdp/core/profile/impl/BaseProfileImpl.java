package com.wdp.core.profile.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.wdp.core.profile.BaseProfile;

/**
 * @author Shreyos
 *
 */
public class BaseProfileImpl implements BaseProfile{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8435077224489699252L;
	
	public Map<String,Serializable> profileProperties;
	
	public BaseProfileImpl()
	{
		profileProperties = new HashMap<String, Serializable>();
	}

	/* (non-Javadoc)
	 * @see com.wdp.core.profile.Profile#getProperty(java.lang.String)
	 */
	@Override
	public Serializable getProperty(String propertyKey) {
		
		if(null != propertyKey)
		{
			return profileProperties.get(propertyKey);
		}
		else
			return null;
		
	}

	/* (non-Javadoc)
	 * @see com.wdp.core.profile.Profile#removeAllProperties()
	 */
	@Override
	public void removeAllProperties() {
		
		profileProperties.clear();
	}

	/* (non-Javadoc)
	 * @see com.wdp.core.profile.Profile#removeProperty(java.lang.String)
	 */
	@Override
	public Serializable removeProperty(String propertyKey) {
		
		Serializable propertyValue = null;
		
		if(null != propertyKey)
		{
			propertyValue = this.getProperty(propertyKey);
			profileProperties.remove(propertyKey);

		}
		
		return propertyValue;
	}

	/* (non-Javadoc)
	 * @see com.wdp.core.profile.Profile#setProperty(java.lang.String, java.io.Serializable)
	 */
	@Override
	public void setProperty(String propertyKey, Serializable propertyValue) {
		
		if(null != propertyKey && null!= propertyValue)
		{
			profileProperties.put(propertyKey, propertyValue);
		}
	}

	/* (non-Javadoc)
	 * @see com.wdp.core.profile.BaseProfile#containsKey(java.lang.String)
	 */
	@Override
	public boolean containsKey(String propertyKey) {
		
		if(null != propertyKey)
		{
			return profileProperties.containsKey(propertyKey);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.wdp.core.profile.BaseProfile#containsValue(java.io.Serializable)
	 */
	@Override
	public boolean containsValue(Serializable propertyValue) {
		
		if(null != propertyValue)
		{
			return profileProperties.containsValue(propertyValue);
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see com.wdp.core.profile.BaseProfile#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		
		return profileProperties.isEmpty();
	}

	/* (non-Javadoc)
	 * @see com.wdp.core.profile.BaseProfile#size()
	 */
	@Override
	public int size() {
		
		return profileProperties.size();
	}

	/* (non-Javadoc)
	 * @see com.wdp.core.profile.Profile#getAllProperties()
	 */
	@Override
	public Collection<Serializable> getAllProperties() {
		
		return profileProperties.values();
	}
	
}
