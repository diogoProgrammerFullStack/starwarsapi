package br.com.starwars.service;

import org.json.simple.JSONObject;

/**
 * 
 * @author Diogo Oliveira
 *
 * @param <T>
 */
public abstract class Http<T> {
	
	
	public T getMapping() {
		return null;
	}
	
	public T postMapping(JSONObject product) {
		return null;
	}
	
	public T deleteMapping() {
		return null;
	}
	
	public T putMapping() {
		return null;
	}

}
