package com.example.commonlibrary.dagger.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @ClassName: PerFragment
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerFragment {
}
