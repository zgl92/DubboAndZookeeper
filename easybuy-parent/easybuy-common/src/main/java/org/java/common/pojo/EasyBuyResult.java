package org.java.common.pojo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

public class EasyBuyResult implements Serializable {
    /**
     *  全局定义返回对象
     */

    private static final long serialVersionUID=1L;

    //定义json对象
    private static final ObjectMapper MAPPER=new ObjectMapper();

    //响应业务状态
    private Integer status;

    //响应消息
    private String msg;

    //响应中的数据
    private Object data;



    public static EasyBuyResult build(Integer status, String msg, Object data){
        return  new EasyBuyResult(status,msg,data);
    }

    public static EasyBuyResult ok(Object data) {
        return  new EasyBuyResult(data);
    }

    public static EasyBuyResult ok() {
        return  new EasyBuyResult(null);
    }

    public  EasyBuyResult( ) {
    }

    public static EasyBuyResult build(Integer status, String msg){
        return  new EasyBuyResult(status,msg,null);
    }

    public EasyBuyResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
}
