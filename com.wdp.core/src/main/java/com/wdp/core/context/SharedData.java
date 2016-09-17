package com.wdp.core.context;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Shreyos
 *
 * @param <K>
 * @param <V>
 */
 public class SharedData<K, V> implements Map<K, V>, Serializable{

	/**
	 * 
	 */
	public static final String SHARED_DATA = "SHARED_DATA";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1679800469238082613L;
	/**
	 * 
	 */
	private final Map<K, V> sharedData;
	
	/**
	 * 
	 */
	public SharedData() {
		this.sharedData = Collections.synchronizedMap(new HashMap<K, V>());
	}
	
	
	/* (non-Javadoc)
	 * @see java.util.Map#size()
	 */
	@Override
	public int size() {
		return this.sharedData.size();
	}

	
	/* (non-Javadoc)
	 * @see java.util.Map#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return this.sharedData.isEmpty();
	}

	
	/* (non-Javadoc)
	 * @see java.util.Map#containsKey(java.lang.Object)
	 */
	@Override
	public boolean containsKey(final Object key) {
		return this.sharedData.containsKey(key);
	}

	
	/* (non-Javadoc)
	 * @see java.util.Map#containsValue(java.lang.Object)
	 */
	@Override
	public boolean containsValue(final Object value) {
		return this.sharedData.containsValue(value);
	}

	
	/* (non-Javadoc)
	 * @see java.util.Map#get(java.lang.Object)
	 */
	@Override
	public V get(final Object key) {
		return this.sharedData.get(key);
	}

	
	/* (non-Javadoc)
	 * @see java.util.Map#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public V put(final K key, final V value) {
		return this.sharedData.put(key, value);
	}

	
	/* (non-Javadoc)
	 * @see java.util.Map#remove(java.lang.Object)
	 */
	@Override
	public V remove(final Object key) {
		return this.sharedData.remove(key);
	}

	/**
	 * @param key
	 * @return
	 */
	public V take(final Object key){
		return this.remove(key);
	}
	
	
	/* (non-Javadoc)
	 * @see java.util.Map#putAll(java.util.Map)
	 */
	@Override
	public void putAll(Map<? extends K, ? extends V> map) {
		this.sharedData.putAll(map);		
	}

	
	/* (non-Javadoc)
	 * @see java.util.Map#clear()
	 */
	@Override
	public void clear() {
		this.sharedData.clear();		
	}

	
	/* (non-Javadoc)
	 * @see java.util.Map#keySet()
	 */
	@Override
	public Set<K> keySet() {
		return this.sharedData.keySet();
	}

	
	/* (non-Javadoc)
	 * @see java.util.Map#values()
	 */
	@Override
	public Collection<V> values() {
		return this.sharedData.values();
	}

	
	/* (non-Javadoc)
	 * @see java.util.Map#entrySet()
	 */
	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		return this.sharedData.entrySet();
	}

}
