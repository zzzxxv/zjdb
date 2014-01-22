package org.zz.zjdb.service;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * 载入模型类的属性
 * @author zz
 */
public class LoadClassProperties {

	/**
	 * 私有化其构造方法，不允许该类在外部进行实例化
	 */
	private LoadClassProperties(){
	}
	/**
	 * 使用静态内部类来进行单例实例化
	 * @author zz
	 */
	private static class LoadClassPropertiesFactory{
		private static LoadClassProperties instance = new LoadClassProperties();
	}
	
	/**
	 * 获得实例
	 * @return LoadClassProperties
	 */
	public static LoadClassProperties getInstance(){
		return LoadClassPropertiesFactory.instance;
	}
	
	
	public Map<Integer, String> load(Class<?> entityClass){
		getProperties(entityClass);
		
		return null;
	}
	
	private void getProperties(Class<?> modelClass){
		Field[] fields = modelClass.getDeclaredFields();
		if(fields != null && fields.length != 0){
			for(Field field : fields){
				System.out.println(field);
				getFieldType(field);
			}
		}
	}
	
	private Class<?> getFieldType(Field field){
		System.out.println("\t field.getType : " + field.getType().getName());
		
		return null;
	}
}
