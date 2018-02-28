package com.linying.common;

import java.io.Serializable;

/**
 * @author 创建人：linying
 * @description 类描述：返回对象
 * @date 创建时间：2017年12月7日 下午1:52:37
 */
public class ResultInfo implements Serializable {
    private static final long serialVersionUID = -6328296769272568906L;

    /**
     * 成功的消息代码
     */
    public static final int CODE_SUCCESS = 10000;

    /**
     * 失败的消息代码
     */
    public static final int CODE_FAILURE = 10001;

    /**
     * 系统异常代码
     */
    public static final int CODE_EXCETPION = 10002;

    /**
     * 请求被拒绝代码
     */
    public static final int CODE_REFUSE = 10004;

    /**
     * 消息代码
     */
    private int code;

    /**
     * 消息
     */
    private String msg;

    /**
     * 消息携带的数据
     */
    private Object data;

    /**
     * @param msg 消息
     * @return 消息
     * @description 成功的消息
     */
    public static ResultInfo success(String msg) {
        ResultInfo ResultInfo = new ResultInfo();
        ResultInfo.setCode(CODE_SUCCESS);
        ResultInfo.setMsg(msg);
        return ResultInfo;
    }

    /**
     * @param msg  消息
     * @param data 消息携带的数据
     * @return 消息
     * @description 成功的消息
     */
    public static ResultInfo success(String msg, Object data) {
        ResultInfo ResultInfo = new ResultInfo();
        ResultInfo.setCode(CODE_SUCCESS);
        ResultInfo.setMsg(msg);
        ResultInfo.setData(data);
        return ResultInfo;
    }

    /**
     * @param msg 消息
     * @return 消息
     * @description 失败的消息
     */
    public static ResultInfo failure(String msg) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(CODE_FAILURE);
        resultInfo.setMsg(msg);
        return resultInfo;
    }

    /**
     * @param code 返回代码
     * @param msg  描述
     * @param data 返回对象
     * @return Message
     * @description webApi接口请求返回信息
     */
    public static ResultInfo message(int code, String msg, Object data) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(code);
        resultInfo.setMsg(msg);
        resultInfo.setData(data);
        return resultInfo;
    }

    /**
     * @return 消息代码
     * @description 消息代码
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code 消息代码
     * @description 消息代码
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return 消息
     * @description 消息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg 消息
     * @description 消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return 消息携带的数据
     * @description 消息携带的数据
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data 消息携带的数据
     * @description 消息携带的数据
     */
    public void setData(Object data) {
        this.data = data;
    }

}
