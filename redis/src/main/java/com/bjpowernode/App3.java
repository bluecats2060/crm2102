package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;

import java.util.List;

public class App3
{
    public static void main( String[] args )
    {
        JedisPool pool=null;
       try{
           pool=RedisUtils.open("127.0.0.1",6379);
           Jedis jedis=pool.getResource();
           jedis.flushAll();
           Transaction tran=jedis.multi();
           tran.set("username","tom");
           tran.set("password","123");
           List<Object> oList=tran.exec();

           for(Object o:oList){
               System.out.println(o);
           }



       }catch (Exception e){
           e.printStackTrace();;
       }finally{
           RedisUtils.close();
       }
    }
}
