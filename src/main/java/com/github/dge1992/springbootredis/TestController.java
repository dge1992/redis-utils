package com.github.dge1992.springbootredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * @Author dongganene
 * @Description
 * @Date 2019/4/29
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private CatchManage catchManage;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/test")
    public Object test(){
//        return catchManage.incrementHash(CatchConstant.HASHRANDOMKEY, CatchConstant.ID, 5l);
//        Map<String, Object> map1 = new HashMap<>();
//        map1.put("age", "23");
//        map1.put("name", "dge");
//        map1.put("address", "宁波");
//        map1.put("sex", "男");
//        Map<String, Object> map2 = new HashMap<>();
//        map2.put("age", "23");
//        map2.put("name", "fnn");
//        map2.put("address", "上海");
//        map2.put("tel", "110");
//        return catchManage.unionMap(map1, map2);
//        redisTemplate.multi();
//        redisTemplate.opsForValue().set("test", "test");
//        redisTemplate.delete("test");
//        redisTemplate.exec();
//        return "";

//        for (int i = 0; i < 100000000; i++){
//            /*try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }*/
//            if(i % 2 == 0){
//                catchManage.set("hello:" + i, "hahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahaha");
//            }else{
//                catchManage.set("hi:" + i, "hahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahaha", TimeEnum.ONE_MONTH.getKey());
//            }
//        }
//        return "";
//        long start = System.currentTimeMillis();
//        Set<Object> execute = (Set<Object>) redisTemplate.execute(new RedisCallback<Set<Object>>() {
//
//            @Override
//            public Set<Object> doInRedis(RedisConnection connection) throws DataAccessException {
//
//                Set<Object> binaryKeys = new HashSet<>();
//
//                Cursor<byte[]> cursor = connection.scan( new ScanOptions.ScanOptionsBuilder().match("hello:*").count(1000).build());
////                System.out.println(cursor.getPosition());
////                System.out.println(cursor.getCursorId());
//                int i = 0;
//
//                while (cursor.hasNext()) {
//                    binaryKeys.add(new String(cursor.next()));
//                    i++;
//                    if(i> 10){
//                        break;
//                    }
//                }
////                System.out.println(binaryKeys);
//                return binaryKeys;
//            }
//        });
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println(execute.size());
//        System.out.println(execute);


//        Cursor<byte[]> cursor2 = (Cursor<byte[]>)redisTemplate.execute((RedisCallback) connection -> {
//            Set<Object> binaryKeys = new HashSet<>();
//            Cursor<byte[]> cursor = connection.scan(new ScanOptions.ScanOptionsBuilder().match("hello:*").count(20).build());
//            while (cursor.hasNext()) {
//                binaryKeys.add(new String(cursor.next()));
//            }
//            return cursor;
//        });

//        Set scan = catchManage.scan("hello:*", null);
//        System.out.println(scan.size());
//        System.out.println(scan);

//        long start = System.currentTimeMillis();

//        Map<String, Object> map = new HashMap();
//        for (int i = 0; i < 50000; i++){
//            map.put(i + "", "hahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahaha" + i);
//        }
//        catchManage.hmset("hello:",map);
//        for (int i = 0; i < 10; i++){
//            Map<String, Object> map = new HashMap();
//            for (int j = 0; j < 10000; j++){
//                map.put("00" + j, "hahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahaha");
//            }
//            catchManage.mset(map);
//        }
//        Set hscan = catchManage.hscan("hello:","*", 5000);
//        System.out.println(hscan.size());
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//        Map<String, Object> map = new HashMap();
//        catchManage.mset(map);

        return null;
    }
}
