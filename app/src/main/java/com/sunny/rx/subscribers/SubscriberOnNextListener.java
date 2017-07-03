package com.sunny.rx.subscribers;

/**
 * 成功返回
 */
public interface SubscriberOnNextListener<T> {
    void onNext(T t);
}
