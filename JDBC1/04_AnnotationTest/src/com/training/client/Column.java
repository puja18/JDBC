package com.training.client;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE.CLASS.RUNTIME)
public @interface Column {
	String name();
	int size();
	boolean notNull();
	

}
