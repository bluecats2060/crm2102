package com.bjpowernode;

import redis.clients.jedis.Jedis;

public class App 
{
    public static void main( String[] args )
    {

         //1111创建连接，连接redis服务器111
        Jedis jedis=new Jedis("127.0.0.1",6379);
        jedis.flushAll();
        //ewwwweeedd
        jedis.set("username","tom");
        System.out.println(jedis.get("username"));

    }
}
