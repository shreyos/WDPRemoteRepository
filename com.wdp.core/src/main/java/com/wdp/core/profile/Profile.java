package com.wdp.core.profile;

import java.io.Serializable;
import java.util.Collection;

/**
 * Description : Profile is a public abstract interface that extends java.io.Serializable interface.
 * It has five abstract methods 
 * <p>
 * i)public void setProperty(String propertyKey, Serializable propertyValue);
 * that sets a property value.
 * </p>
 * <p>
 * ii)public Serializable getProperty(String propertyKey);
 * that returns a particular property value. 
 * </p>
 * <p>
 * iii)public Serializable removeProperty(String propertyKey);
 * that removes a particular property value and returns that particular property value.
 * </p>
 * <p>
 * iv)public void removeAllProperties();
 *  that removes all properties.
 * </p>
 *  v)public Collection<Serializable> getAllProperties();
 *  that returns all properties.
 *  <pre> 
 *  Method Signature :
 *  
 *  public void setProperty(String propertyKey, Serializable propertyValue);
 *  
 *  public Serializable getProperty(String propertyKey);
 *  
 *  public Serializable removeProperty(String propertyKey);
 *  
 *  public void removeAllProperties();
 *  
 *  public Collection getAllProperties();
 *  
 *  </pre>
 * @author Shreyos
 *
 */
public abstract interface Profile extends Serializable{

	/**
	 * Description : It sets a property value.
	 * @param propertyKey
	 * @param propertyValue
	 * @author Shreyos
	 */
	public void setProperty(String propertyKey, Serializable propertyValue);
	
	/**
	 * Description : It returns a particular property value
	 * @param propertyKey
	 * @return {@link Serializable}
	 * @author Shreyos
	 */
	public Serializable getProperty(String propertyKey);
	
	/**
	 * Description : It removes a particular property value and returns that particular property value.
	 * @param propertyKey
	 * @return {@link Serializable}
	 * @author Shreyos
	 */
	public Serializable removeProperty(String propertyKey);
	
	/**
	 * Description : It removes all properties.
	 * @author Shreyos
	 */
	public void removeAllProperties();
	
	/**
	 * Description : It returns all properties.
	 * @return {@link Collection} of {@link Serializable}
	 * @author Shreyos
	 */
	public Collection<Serializable> getAllProperties();
	
	
}
