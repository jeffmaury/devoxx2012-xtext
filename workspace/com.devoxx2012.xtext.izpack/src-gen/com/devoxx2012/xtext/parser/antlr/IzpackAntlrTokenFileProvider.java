/*
* generated by Xtext
*/
package com.devoxx2012.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class IzpackAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.tokens");
	}
}
