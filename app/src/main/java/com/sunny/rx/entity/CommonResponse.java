package com.sunny.rx.entity;

/**
 * CommonResponse 接收返回的错误信息
 */
public  class CommonResponse<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 错误ID
     */
    private int status = 0;
    /**
     * 错误信息
     */
    private String message = "";


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
