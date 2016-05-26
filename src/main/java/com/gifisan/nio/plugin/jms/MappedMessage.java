package com.gifisan.nio.plugin.jms;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public interface MappedMessage extends Message{
	
	public abstract void put(String key,Object value);
	
	public abstract void put(Map value);
	
}
