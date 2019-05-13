package com.example.client.hytrix;

import com.example.client.utils.UserContext;
import com.example.client.utils.UserContextHolder;

import java.util.concurrent.Callable;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/5/5
 */
public final class DelegatingUserContextCallable<V> implements Callable<V> {
    private final Callable<V> delegate;
    private UserContext originalUserContext;
    public DelegatingUserContextCallable(Callable<V> delegate, UserContext userContext) {
        this.delegate=delegate;
        this.originalUserContext=userContext;
    }

    @Override
    public V call() throws Exception {
        UserContextHolder.setContext(originalUserContext);
        try {
            return delegate.call();
        }
        finally {
            this.originalUserContext = null;
        }
    }
    public static <V> Callable<V> create(Callable<V> delegate,
                                         UserContext userContext) {
        return new DelegatingUserContextCallable<V>(delegate, userContext);
    }
}
