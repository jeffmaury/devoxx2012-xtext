/*
* generated by Xtext
*/
package com.devoxx2012.xtext.demo1.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Demo1AntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.tokens");
	}
}