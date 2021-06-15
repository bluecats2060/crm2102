package com.bjpowernode;

import redis.clients.jedis.Jedis;

public class App 
{
    public static void main( String[] args )
    {

         //创建连接，连接redis服务器
        Jedis jedis=new Jedis("127.0.0.1",6379);
        jedis.flushAll();
        jedis.set("username","tom");
        System.out.println(jedis.get("username"));

    }
}
