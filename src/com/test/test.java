package com.test;

import redis.clients.jedis.Jedis;

public class test {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.101.15"); 
	      System.out.println("Connection to server sucessfully"); 
	      //check whether server is running or not 
	      jedis.auth("123456");
	      jedis.set("jasonwu", "1234");
	      System.out.println("Server is running: "+jedis.ping()); 
	      jedis.get("jason");
	      System.out.println(jedis.get("jasonwu"));
	      
	}
}
