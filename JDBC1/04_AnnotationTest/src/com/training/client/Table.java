package com.training.client;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE.CLASS.RUNTIME)
public @interface Table {
	String name();
	

}
