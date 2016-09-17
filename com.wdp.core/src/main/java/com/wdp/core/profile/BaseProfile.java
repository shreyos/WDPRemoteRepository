package com.wdp.core.profile;

import java.io.Serializable;

/**
 * @author Shreyos
 *
 */
public abstract interface BaseProfile extends Profile {
	
	public static final String BASE_PROFILE = "BASE_PROFILE";

	/**
	 * @param propertyKey
	 * @return {@link Boolean}
	 */
	public boolean containsKey(String propertyKey);

	/**
	 * @param propertyValue
	 * @return {@link Boolean}
	 */
	public boolean containsValue(Serializable propertyValue);

	/**
	 * @return {@link Boolean}
	 */
	public boolean isEmpty();

	/**
	 * @return {@link Integer}
	 */
	public int size();

}
