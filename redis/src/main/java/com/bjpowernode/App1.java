package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class App1
{
    public static void main( String[] args )
    {
        JedisPool pool=null;
        try{
            //获取到连接池
            pool=RedisUtils.open("127.0.0.1",6379);
            //获取连接
            Jedis jedis=pool.getResource();
            jedis.flushAll();
            jedis.set("password","123");
            System.out.println(jedis.get("password"));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            RedisUtils.close();
        }

    }
}
