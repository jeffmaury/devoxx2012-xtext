package com.devoxx2012.xtext.demo1.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.devoxx2012.xtext.demo1.services.Demo1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemo1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'category'", "'else'", "'if'", "'then'", "'is'", "'ratio'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalDemo1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDemo1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDemo1Parser.tokenNames; }
    public String getGrammarFileName() { return "../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g"; }


     
     	private Demo1GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Demo1GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:61:1: ( ruleModel EOF )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:76:1: ( rule__Model__Group__0 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCategory"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:88:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:89:1: ( ruleCategory EOF )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:90:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory121);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:97:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:101:2: ( ( ( rule__Category__Group__0 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:102:1: ( ( rule__Category__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:102:1: ( ( rule__Category__Group__0 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:103:1: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:104:1: ( rule__Category__Group__0 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:104:2: rule__Category__Group__0
            {
            pushFollow(FOLLOW_rule__Category__Group__0_in_ruleCategory154);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleRule"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:116:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:117:1: ( ruleRule EOF )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:118:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule181);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:125:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:129:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:130:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:130:1: ( ( rule__Rule__Group__0 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:131:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:132:1: ( rule__Rule__Group__0 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:132:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule214);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleExpression"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:144:1: entryRuleRuleExpression : ruleRuleExpression EOF ;
    public final void entryRuleRuleExpression() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:145:1: ( ruleRuleExpression EOF )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:146:1: ruleRuleExpression EOF
            {
             before(grammarAccess.getRuleExpressionRule()); 
            pushFollow(FOLLOW_ruleRuleExpression_in_entryRuleRuleExpression241);
            ruleRuleExpression();

            state._fsp--;

             after(grammarAccess.getRuleExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleExpression248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleExpression"


    // $ANTLR start "ruleRuleExpression"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:153:1: ruleRuleExpression : ( ( rule__RuleExpression__Group__0 ) ) ;
    public final void ruleRuleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:157:2: ( ( ( rule__RuleExpression__Group__0 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:158:1: ( ( rule__RuleExpression__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:158:1: ( ( rule__RuleExpression__Group__0 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:159:1: ( rule__RuleExpression__Group__0 )
            {
             before(grammarAccess.getRuleExpressionAccess().getGroup()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:160:1: ( rule__RuleExpression__Group__0 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:160:2: rule__RuleExpression__Group__0
            {
            pushFollow(FOLLOW_rule__RuleExpression__Group__0_in_ruleRuleExpression274);
            rule__RuleExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleExpression"


    // $ANTLR start "entryRuleTestExpression"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:172:1: entryRuleTestExpression : ruleTestExpression EOF ;
    public final void entryRuleTestExpression() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:173:1: ( ruleTestExpression EOF )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:174:1: ruleTestExpression EOF
            {
             before(grammarAccess.getTestExpressionRule()); 
            pushFollow(FOLLOW_ruleTestExpression_in_entryRuleTestExpression301);
            ruleTestExpression();

            state._fsp--;

             after(grammarAccess.getTestExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestExpression308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestExpression"


    // $ANTLR start "ruleTestExpression"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:181:1: ruleTestExpression : ( ( rule__TestExpression__Group__0 ) ) ;
    public final void ruleTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:185:2: ( ( ( rule__TestExpression__Group__0 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:186:1: ( ( rule__TestExpression__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:186:1: ( ( rule__TestExpression__Group__0 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:187:1: ( rule__TestExpression__Group__0 )
            {
             before(grammarAccess.getTestExpressionAccess().getGroup()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:188:1: ( rule__TestExpression__Group__0 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:188:2: rule__TestExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TestExpression__Group__0_in_ruleTestExpression334);
            rule__TestExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestExpression"


    // $ANTLR start "entryRuleRatioExpression"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:200:1: entryRuleRatioExpression : ruleRatioExpression EOF ;
    public final void entryRuleRatioExpression() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:201:1: ( ruleRatioExpression EOF )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:202:1: ruleRatioExpression EOF
            {
             before(grammarAccess.getRatioExpressionRule()); 
            pushFollow(FOLLOW_ruleRatioExpression_in_entryRuleRatioExpression361);
            ruleRatioExpression();

            state._fsp--;

             after(grammarAccess.getRatioExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRatioExpression368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRatioExpression"


    // $ANTLR start "ruleRatioExpression"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:209:1: ruleRatioExpression : ( ( rule__RatioExpression__Group__0 ) ) ;
    public final void ruleRatioExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:213:2: ( ( ( rule__RatioExpression__Group__0 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:214:1: ( ( rule__RatioExpression__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:214:1: ( ( rule__RatioExpression__Group__0 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:215:1: ( rule__RatioExpression__Group__0 )
            {
             before(grammarAccess.getRatioExpressionAccess().getGroup()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:216:1: ( rule__RatioExpression__Group__0 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:216:2: rule__RatioExpression__Group__0
            {
            pushFollow(FOLLOW_rule__RatioExpression__Group__0_in_ruleRatioExpression394);
            rule__RatioExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRatioExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRatioExpression"


    // $ANTLR start "rule__Rule__NextAlternatives_1_1_0"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:228:1: rule__Rule__NextAlternatives_1_1_0 : ( ( ruleRule ) | ( ruleRatioExpression ) );
    public final void rule__Rule__NextAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:232:1: ( ( ruleRule ) | ( ruleRatioExpression ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:233:1: ( ruleRule )
                    {
                    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:233:1: ( ruleRule )
                    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:234:1: ruleRule
                    {
                     before(grammarAccess.getRuleAccess().getNextRuleParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__Rule__NextAlternatives_1_1_0430);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getNextRuleParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:239:6: ( ruleRatioExpression )
                    {
                    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:239:6: ( ruleRatioExpression )
                    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:240:1: ruleRatioExpression
                    {
                     before(grammarAccess.getRuleAccess().getNextRatioExpressionParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_ruleRatioExpression_in_rule__Rule__NextAlternatives_1_1_0447);
                    ruleRatioExpression();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getNextRatioExpressionParserRuleCall_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NextAlternatives_1_1_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:252:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:256:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:257:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0477);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0480);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:264:1: rule__Model__Group__0__Impl : ( ( ( rule__Model__CategoriesAssignment_0 ) ) ( ( rule__Model__CategoriesAssignment_0 )* ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:268:1: ( ( ( ( rule__Model__CategoriesAssignment_0 ) ) ( ( rule__Model__CategoriesAssignment_0 )* ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:269:1: ( ( ( rule__Model__CategoriesAssignment_0 ) ) ( ( rule__Model__CategoriesAssignment_0 )* ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:269:1: ( ( ( rule__Model__CategoriesAssignment_0 ) ) ( ( rule__Model__CategoriesAssignment_0 )* ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:270:1: ( ( rule__Model__CategoriesAssignment_0 ) ) ( ( rule__Model__CategoriesAssignment_0 )* )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:270:1: ( ( rule__Model__CategoriesAssignment_0 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:271:1: ( rule__Model__CategoriesAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getCategoriesAssignment_0()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:272:1: ( rule__Model__CategoriesAssignment_0 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:272:2: rule__Model__CategoriesAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__CategoriesAssignment_0_in_rule__Model__Group__0__Impl509);
            rule__Model__CategoriesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getCategoriesAssignment_0()); 

            }

            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:275:1: ( ( rule__Model__CategoriesAssignment_0 )* )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:276:1: ( rule__Model__CategoriesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getCategoriesAssignment_0()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:277:1: ( rule__Model__CategoriesAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:277:2: rule__Model__CategoriesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__CategoriesAssignment_0_in_rule__Model__Group__0__Impl521);
            	    rule__Model__CategoriesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCategoriesAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:288:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:292:1: ( rule__Model__Group__1__Impl )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:293:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1554);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:299:1: rule__Model__Group__1__Impl : ( ( rule__Model__RuleAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:303:1: ( ( ( rule__Model__RuleAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:304:1: ( ( rule__Model__RuleAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:304:1: ( ( rule__Model__RuleAssignment_1 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:305:1: ( rule__Model__RuleAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getRuleAssignment_1()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:306:1: ( rule__Model__RuleAssignment_1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:306:2: rule__Model__RuleAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__RuleAssignment_1_in_rule__Model__Group__1__Impl581);
            rule__Model__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:320:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:324:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:325:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__0615);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__1_in_rule__Category__Group__0618);
            rule__Category__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:332:1: rule__Category__Group__0__Impl : ( 'category' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:336:1: ( ( 'category' ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:337:1: ( 'category' )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:337:1: ( 'category' )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:338:1: 'category'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Category__Group__0__Impl646); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:351:1: rule__Category__Group__1 : rule__Category__Group__1__Impl ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:355:1: ( rule__Category__Group__1__Impl )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:356:2: rule__Category__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__1677);
            rule__Category__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:362:1: rule__Category__Group__1__Impl : ( ( rule__Category__NameAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:366:1: ( ( ( rule__Category__NameAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:367:1: ( ( rule__Category__NameAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:367:1: ( ( rule__Category__NameAssignment_1 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:368:1: ( rule__Category__NameAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:369:1: ( rule__Category__NameAssignment_1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:369:2: rule__Category__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_1_in_rule__Category__Group__1__Impl704);
            rule__Category__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:383:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:387:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:388:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__0738);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__0741);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:395:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__FirstAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:399:1: ( ( ( rule__Rule__FirstAssignment_0 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:400:1: ( ( rule__Rule__FirstAssignment_0 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:400:1: ( ( rule__Rule__FirstAssignment_0 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:401:1: ( rule__Rule__FirstAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getFirstAssignment_0()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:402:1: ( rule__Rule__FirstAssignment_0 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:402:2: rule__Rule__FirstAssignment_0
            {
            pushFollow(FOLLOW_rule__Rule__FirstAssignment_0_in_rule__Rule__Group__0__Impl768);
            rule__Rule__FirstAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getFirstAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:412:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:416:1: ( rule__Rule__Group__1__Impl )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:417:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__1798);
            rule__Rule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:423:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:427:1: ( ( ( rule__Rule__Group_1__0 )? ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:428:1: ( ( rule__Rule__Group_1__0 )? )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:428:1: ( ( rule__Rule__Group_1__0 )? )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:429:1: ( rule__Rule__Group_1__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:430:1: ( rule__Rule__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:430:2: rule__Rule__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Group__1__Impl825);
                    rule__Rule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group_1__0"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:444:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:448:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:449:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__0860);
            rule__Rule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__0863);
            rule__Rule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__0"


    // $ANTLR start "rule__Rule__Group_1__0__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:456:1: rule__Rule__Group_1__0__Impl : ( 'else' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:460:1: ( ( 'else' ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:461:1: ( 'else' )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:461:1: ( 'else' )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:462:1: 'else'
            {
             before(grammarAccess.getRuleAccess().getElseKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Rule__Group_1__0__Impl891); 
             after(grammarAccess.getRuleAccess().getElseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_1__1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:475:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:479:1: ( rule__Rule__Group_1__1__Impl )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:480:2: rule__Rule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__1922);
            rule__Rule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__1"


    // $ANTLR start "rule__Rule__Group_1__1__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:486:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__NextAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:490:1: ( ( ( rule__Rule__NextAssignment_1_1 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:491:1: ( ( rule__Rule__NextAssignment_1_1 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:491:1: ( ( rule__Rule__NextAssignment_1_1 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:492:1: ( rule__Rule__NextAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getNextAssignment_1_1()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:493:1: ( rule__Rule__NextAssignment_1_1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:493:2: rule__Rule__NextAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Rule__NextAssignment_1_1_in_rule__Rule__Group_1__1__Impl949);
            rule__Rule__NextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNextAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_1__1__Impl"


    // $ANTLR start "rule__RuleExpression__Group__0"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:507:1: rule__RuleExpression__Group__0 : rule__RuleExpression__Group__0__Impl rule__RuleExpression__Group__1 ;
    public final void rule__RuleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:511:1: ( rule__RuleExpression__Group__0__Impl rule__RuleExpression__Group__1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:512:2: rule__RuleExpression__Group__0__Impl rule__RuleExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RuleExpression__Group__0__Impl_in_rule__RuleExpression__Group__0983);
            rule__RuleExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleExpression__Group__1_in_rule__RuleExpression__Group__0986);
            rule__RuleExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleExpression__Group__0"


    // $ANTLR start "rule__RuleExpression__Group__0__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:519:1: rule__RuleExpression__Group__0__Impl : ( 'if' ) ;
    public final void rule__RuleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:523:1: ( ( 'if' ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:524:1: ( 'if' )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:524:1: ( 'if' )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:525:1: 'if'
            {
             before(grammarAccess.getRuleExpressionAccess().getIfKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__RuleExpression__Group__0__Impl1014); 
             after(grammarAccess.getRuleExpressionAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleExpression__Group__0__Impl"


    // $ANTLR start "rule__RuleExpression__Group__1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:538:1: rule__RuleExpression__Group__1 : rule__RuleExpression__Group__1__Impl rule__RuleExpression__Group__2 ;
    public final void rule__RuleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:542:1: ( rule__RuleExpression__Group__1__Impl rule__RuleExpression__Group__2 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:543:2: rule__RuleExpression__Group__1__Impl rule__RuleExpression__Group__2
            {
            pushFollow(FOLLOW_rule__RuleExpression__Group__1__Impl_in_rule__RuleExpression__Group__11045);
            rule__RuleExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleExpression__Group__2_in_rule__RuleExpression__Group__11048);
            rule__RuleExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleExpression__Group__1"


    // $ANTLR start "rule__RuleExpression__Group__1__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:550:1: rule__RuleExpression__Group__1__Impl : ( ( rule__RuleExpression__TestAssignment_1 ) ) ;
    public final void rule__RuleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:554:1: ( ( ( rule__RuleExpression__TestAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:555:1: ( ( rule__RuleExpression__TestAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:555:1: ( ( rule__RuleExpression__TestAssignment_1 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:556:1: ( rule__RuleExpression__TestAssignment_1 )
            {
             before(grammarAccess.getRuleExpressionAccess().getTestAssignment_1()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:557:1: ( rule__RuleExpression__TestAssignment_1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:557:2: rule__RuleExpression__TestAssignment_1
            {
            pushFollow(FOLLOW_rule__RuleExpression__TestAssignment_1_in_rule__RuleExpression__Group__1__Impl1075);
            rule__RuleExpression__TestAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleExpressionAccess().getTestAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleExpression__Group__1__Impl"


    // $ANTLR start "rule__RuleExpression__Group__2"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:567:1: rule__RuleExpression__Group__2 : rule__RuleExpression__Group__2__Impl rule__RuleExpression__Group__3 ;
    public final void rule__RuleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:571:1: ( rule__RuleExpression__Group__2__Impl rule__RuleExpression__Group__3 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:572:2: rule__RuleExpression__Group__2__Impl rule__RuleExpression__Group__3
            {
            pushFollow(FOLLOW_rule__RuleExpression__Group__2__Impl_in_rule__RuleExpression__Group__21105);
            rule__RuleExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleExpression__Group__3_in_rule__RuleExpression__Group__21108);
            rule__RuleExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleExpression__Group__2"


    // $ANTLR start "rule__RuleExpression__Group__2__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:579:1: rule__RuleExpression__Group__2__Impl : ( 'then' ) ;
    public final void rule__RuleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:583:1: ( ( 'then' ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:584:1: ( 'then' )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:584:1: ( 'then' )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:585:1: 'then'
            {
             before(grammarAccess.getRuleExpressionAccess().getThenKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__RuleExpression__Group__2__Impl1136); 
             after(grammarAccess.getRuleExpressionAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleExpression__Group__2__Impl"


    // $ANTLR start "rule__RuleExpression__Group__3"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:598:1: rule__RuleExpression__Group__3 : rule__RuleExpression__Group__3__Impl ;
    public final void rule__RuleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:602:1: ( rule__RuleExpression__Group__3__Impl )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:603:2: rule__RuleExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RuleExpression__Group__3__Impl_in_rule__RuleExpression__Group__31167);
            rule__RuleExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleExpression__Group__3"


    // $ANTLR start "rule__RuleExpression__Group__3__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:609:1: rule__RuleExpression__Group__3__Impl : ( ( rule__RuleExpression__RatioAssignment_3 ) ) ;
    public final void rule__RuleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:613:1: ( ( ( rule__RuleExpression__RatioAssignment_3 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:614:1: ( ( rule__RuleExpression__RatioAssignment_3 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:614:1: ( ( rule__RuleExpression__RatioAssignment_3 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:615:1: ( rule__RuleExpression__RatioAssignment_3 )
            {
             before(grammarAccess.getRuleExpressionAccess().getRatioAssignment_3()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:616:1: ( rule__RuleExpression__RatioAssignment_3 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:616:2: rule__RuleExpression__RatioAssignment_3
            {
            pushFollow(FOLLOW_rule__RuleExpression__RatioAssignment_3_in_rule__RuleExpression__Group__3__Impl1194);
            rule__RuleExpression__RatioAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleExpressionAccess().getRatioAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleExpression__Group__3__Impl"


    // $ANTLR start "rule__TestExpression__Group__0"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:634:1: rule__TestExpression__Group__0 : rule__TestExpression__Group__0__Impl rule__TestExpression__Group__1 ;
    public final void rule__TestExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:638:1: ( rule__TestExpression__Group__0__Impl rule__TestExpression__Group__1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:639:2: rule__TestExpression__Group__0__Impl rule__TestExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TestExpression__Group__0__Impl_in_rule__TestExpression__Group__01232);
            rule__TestExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestExpression__Group__1_in_rule__TestExpression__Group__01235);
            rule__TestExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestExpression__Group__0"


    // $ANTLR start "rule__TestExpression__Group__0__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:646:1: rule__TestExpression__Group__0__Impl : ( 'category' ) ;
    public final void rule__TestExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:650:1: ( ( 'category' ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:651:1: ( 'category' )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:651:1: ( 'category' )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:652:1: 'category'
            {
             before(grammarAccess.getTestExpressionAccess().getCategoryKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__TestExpression__Group__0__Impl1263); 
             after(grammarAccess.getTestExpressionAccess().getCategoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestExpression__Group__0__Impl"


    // $ANTLR start "rule__TestExpression__Group__1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:665:1: rule__TestExpression__Group__1 : rule__TestExpression__Group__1__Impl rule__TestExpression__Group__2 ;
    public final void rule__TestExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:669:1: ( rule__TestExpression__Group__1__Impl rule__TestExpression__Group__2 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:670:2: rule__TestExpression__Group__1__Impl rule__TestExpression__Group__2
            {
            pushFollow(FOLLOW_rule__TestExpression__Group__1__Impl_in_rule__TestExpression__Group__11294);
            rule__TestExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestExpression__Group__2_in_rule__TestExpression__Group__11297);
            rule__TestExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestExpression__Group__1"


    // $ANTLR start "rule__TestExpression__Group__1__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:677:1: rule__TestExpression__Group__1__Impl : ( 'is' ) ;
    public final void rule__TestExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:681:1: ( ( 'is' ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:682:1: ( 'is' )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:682:1: ( 'is' )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:683:1: 'is'
            {
             before(grammarAccess.getTestExpressionAccess().getIsKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__TestExpression__Group__1__Impl1325); 
             after(grammarAccess.getTestExpressionAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestExpression__Group__1__Impl"


    // $ANTLR start "rule__TestExpression__Group__2"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:696:1: rule__TestExpression__Group__2 : rule__TestExpression__Group__2__Impl ;
    public final void rule__TestExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:700:1: ( rule__TestExpression__Group__2__Impl )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:701:2: rule__TestExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TestExpression__Group__2__Impl_in_rule__TestExpression__Group__21356);
            rule__TestExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestExpression__Group__2"


    // $ANTLR start "rule__TestExpression__Group__2__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:707:1: rule__TestExpression__Group__2__Impl : ( ( rule__TestExpression__CategoryAssignment_2 ) ) ;
    public final void rule__TestExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:711:1: ( ( ( rule__TestExpression__CategoryAssignment_2 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:712:1: ( ( rule__TestExpression__CategoryAssignment_2 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:712:1: ( ( rule__TestExpression__CategoryAssignment_2 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:713:1: ( rule__TestExpression__CategoryAssignment_2 )
            {
             before(grammarAccess.getTestExpressionAccess().getCategoryAssignment_2()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:714:1: ( rule__TestExpression__CategoryAssignment_2 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:714:2: rule__TestExpression__CategoryAssignment_2
            {
            pushFollow(FOLLOW_rule__TestExpression__CategoryAssignment_2_in_rule__TestExpression__Group__2__Impl1383);
            rule__TestExpression__CategoryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTestExpressionAccess().getCategoryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestExpression__Group__2__Impl"


    // $ANTLR start "rule__RatioExpression__Group__0"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:730:1: rule__RatioExpression__Group__0 : rule__RatioExpression__Group__0__Impl rule__RatioExpression__Group__1 ;
    public final void rule__RatioExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:734:1: ( rule__RatioExpression__Group__0__Impl rule__RatioExpression__Group__1 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:735:2: rule__RatioExpression__Group__0__Impl rule__RatioExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RatioExpression__Group__0__Impl_in_rule__RatioExpression__Group__01419);
            rule__RatioExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RatioExpression__Group__1_in_rule__RatioExpression__Group__01422);
            rule__RatioExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioExpression__Group__0"


    // $ANTLR start "rule__RatioExpression__Group__0__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:742:1: rule__RatioExpression__Group__0__Impl : ( 'ratio' ) ;
    public final void rule__RatioExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:746:1: ( ( 'ratio' ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:747:1: ( 'ratio' )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:747:1: ( 'ratio' )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:748:1: 'ratio'
            {
             before(grammarAccess.getRatioExpressionAccess().getRatioKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__RatioExpression__Group__0__Impl1450); 
             after(grammarAccess.getRatioExpressionAccess().getRatioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioExpression__Group__0__Impl"


    // $ANTLR start "rule__RatioExpression__Group__1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:761:1: rule__RatioExpression__Group__1 : rule__RatioExpression__Group__1__Impl rule__RatioExpression__Group__2 ;
    public final void rule__RatioExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:765:1: ( rule__RatioExpression__Group__1__Impl rule__RatioExpression__Group__2 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:766:2: rule__RatioExpression__Group__1__Impl rule__RatioExpression__Group__2
            {
            pushFollow(FOLLOW_rule__RatioExpression__Group__1__Impl_in_rule__RatioExpression__Group__11481);
            rule__RatioExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RatioExpression__Group__2_in_rule__RatioExpression__Group__11484);
            rule__RatioExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioExpression__Group__1"


    // $ANTLR start "rule__RatioExpression__Group__1__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:773:1: rule__RatioExpression__Group__1__Impl : ( 'is' ) ;
    public final void rule__RatioExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:777:1: ( ( 'is' ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:778:1: ( 'is' )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:778:1: ( 'is' )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:779:1: 'is'
            {
             before(grammarAccess.getRatioExpressionAccess().getIsKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__RatioExpression__Group__1__Impl1512); 
             after(grammarAccess.getRatioExpressionAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioExpression__Group__1__Impl"


    // $ANTLR start "rule__RatioExpression__Group__2"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:792:1: rule__RatioExpression__Group__2 : rule__RatioExpression__Group__2__Impl ;
    public final void rule__RatioExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:796:1: ( rule__RatioExpression__Group__2__Impl )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:797:2: rule__RatioExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RatioExpression__Group__2__Impl_in_rule__RatioExpression__Group__21543);
            rule__RatioExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioExpression__Group__2"


    // $ANTLR start "rule__RatioExpression__Group__2__Impl"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:803:1: rule__RatioExpression__Group__2__Impl : ( ( rule__RatioExpression__RatioAssignment_2 ) ) ;
    public final void rule__RatioExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:807:1: ( ( ( rule__RatioExpression__RatioAssignment_2 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:808:1: ( ( rule__RatioExpression__RatioAssignment_2 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:808:1: ( ( rule__RatioExpression__RatioAssignment_2 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:809:1: ( rule__RatioExpression__RatioAssignment_2 )
            {
             before(grammarAccess.getRatioExpressionAccess().getRatioAssignment_2()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:810:1: ( rule__RatioExpression__RatioAssignment_2 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:810:2: rule__RatioExpression__RatioAssignment_2
            {
            pushFollow(FOLLOW_rule__RatioExpression__RatioAssignment_2_in_rule__RatioExpression__Group__2__Impl1570);
            rule__RatioExpression__RatioAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRatioExpressionAccess().getRatioAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioExpression__Group__2__Impl"


    // $ANTLR start "rule__Model__CategoriesAssignment_0"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:827:1: rule__Model__CategoriesAssignment_0 : ( ruleCategory ) ;
    public final void rule__Model__CategoriesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:831:1: ( ( ruleCategory ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:832:1: ( ruleCategory )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:832:1: ( ruleCategory )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:833:1: ruleCategory
            {
             before(grammarAccess.getModelAccess().getCategoriesCategoryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCategory_in_rule__Model__CategoriesAssignment_01611);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCategoriesCategoryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CategoriesAssignment_0"


    // $ANTLR start "rule__Model__RuleAssignment_1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:842:1: rule__Model__RuleAssignment_1 : ( ruleRule ) ;
    public final void rule__Model__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:846:1: ( ( ruleRule ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:847:1: ( ruleRule )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:847:1: ( ruleRule )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:848:1: ruleRule
            {
             before(grammarAccess.getModelAccess().getRuleRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Model__RuleAssignment_11642);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRuleRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RuleAssignment_1"


    // $ANTLR start "rule__Category__NameAssignment_1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:857:1: rule__Category__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:861:1: ( ( RULE_ID ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:862:1: ( RULE_ID )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:862:1: ( RULE_ID )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:863:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Category__NameAssignment_11673); 
             after(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__NameAssignment_1"


    // $ANTLR start "rule__Rule__FirstAssignment_0"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:872:1: rule__Rule__FirstAssignment_0 : ( ruleRuleExpression ) ;
    public final void rule__Rule__FirstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:876:1: ( ( ruleRuleExpression ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:877:1: ( ruleRuleExpression )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:877:1: ( ruleRuleExpression )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:878:1: ruleRuleExpression
            {
             before(grammarAccess.getRuleAccess().getFirstRuleExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRuleExpression_in_rule__Rule__FirstAssignment_01704);
            ruleRuleExpression();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getFirstRuleExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__FirstAssignment_0"


    // $ANTLR start "rule__Rule__NextAssignment_1_1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:887:1: rule__Rule__NextAssignment_1_1 : ( ( rule__Rule__NextAlternatives_1_1_0 ) ) ;
    public final void rule__Rule__NextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:891:1: ( ( ( rule__Rule__NextAlternatives_1_1_0 ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:892:1: ( ( rule__Rule__NextAlternatives_1_1_0 ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:892:1: ( ( rule__Rule__NextAlternatives_1_1_0 ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:893:1: ( rule__Rule__NextAlternatives_1_1_0 )
            {
             before(grammarAccess.getRuleAccess().getNextAlternatives_1_1_0()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:894:1: ( rule__Rule__NextAlternatives_1_1_0 )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:894:2: rule__Rule__NextAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Rule__NextAlternatives_1_1_0_in_rule__Rule__NextAssignment_1_11735);
            rule__Rule__NextAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNextAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NextAssignment_1_1"


    // $ANTLR start "rule__RuleExpression__TestAssignment_1"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:903:1: rule__RuleExpression__TestAssignment_1 : ( ruleTestExpression ) ;
    public final void rule__RuleExpression__TestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:907:1: ( ( ruleTestExpression ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:908:1: ( ruleTestExpression )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:908:1: ( ruleTestExpression )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:909:1: ruleTestExpression
            {
             before(grammarAccess.getRuleExpressionAccess().getTestTestExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTestExpression_in_rule__RuleExpression__TestAssignment_11768);
            ruleTestExpression();

            state._fsp--;

             after(grammarAccess.getRuleExpressionAccess().getTestTestExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleExpression__TestAssignment_1"


    // $ANTLR start "rule__RuleExpression__RatioAssignment_3"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:918:1: rule__RuleExpression__RatioAssignment_3 : ( ruleRatioExpression ) ;
    public final void rule__RuleExpression__RatioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:922:1: ( ( ruleRatioExpression ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:923:1: ( ruleRatioExpression )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:923:1: ( ruleRatioExpression )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:924:1: ruleRatioExpression
            {
             before(grammarAccess.getRuleExpressionAccess().getRatioRatioExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRatioExpression_in_rule__RuleExpression__RatioAssignment_31799);
            ruleRatioExpression();

            state._fsp--;

             after(grammarAccess.getRuleExpressionAccess().getRatioRatioExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleExpression__RatioAssignment_3"


    // $ANTLR start "rule__TestExpression__CategoryAssignment_2"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:933:1: rule__TestExpression__CategoryAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TestExpression__CategoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:937:1: ( ( ( RULE_ID ) ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:938:1: ( ( RULE_ID ) )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:938:1: ( ( RULE_ID ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:939:1: ( RULE_ID )
            {
             before(grammarAccess.getTestExpressionAccess().getCategoryCategoryCrossReference_2_0()); 
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:940:1: ( RULE_ID )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:941:1: RULE_ID
            {
             before(grammarAccess.getTestExpressionAccess().getCategoryCategoryIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TestExpression__CategoryAssignment_21834); 
             after(grammarAccess.getTestExpressionAccess().getCategoryCategoryIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTestExpressionAccess().getCategoryCategoryCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestExpression__CategoryAssignment_2"


    // $ANTLR start "rule__RatioExpression__RatioAssignment_2"
    // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:952:1: rule__RatioExpression__RatioAssignment_2 : ( RULE_INT ) ;
    public final void rule__RatioExpression__RatioAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:956:1: ( ( RULE_INT ) )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:957:1: ( RULE_INT )
            {
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:957:1: ( RULE_INT )
            // ../com.devoxx2012.xtext.demo1.ui/src-gen/com/devoxx2012/xtext/demo1/ui/contentassist/antlr/internal/InternalDemo1.g:958:1: RULE_INT
            {
             before(grammarAccess.getRatioExpressionAccess().getRatioINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RatioExpression__RatioAssignment_21869); 
             after(grammarAccess.getRatioExpressionAccess().getRatioINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioExpression__RatioAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0_in_ruleCategory154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleExpression_in_entryRuleRuleExpression241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleExpression248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleExpression__Group__0_in_ruleRuleExpression274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_entryRuleTestExpression301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestExpression308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestExpression__Group__0_in_ruleTestExpression334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatioExpression_in_entryRuleRatioExpression361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRatioExpression368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioExpression__Group__0_in_ruleRatioExpression394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Rule__NextAlternatives_1_1_0430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatioExpression_in_rule__Rule__NextAlternatives_1_1_0447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0477 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CategoriesAssignment_0_in_rule__Model__Group__0__Impl509 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__CategoriesAssignment_0_in_rule__Model__Group__0__Impl521 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RuleAssignment_1_in_rule__Model__Group__1__Impl581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__0615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Category__Group__1_in_rule__Category__Group__0618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Category__Group__0__Impl646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_1_in_rule__Category__Group__1__Impl704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__0738 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__0741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__FirstAssignment_0_in_rule__Rule__Group__0__Impl768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Group__1__Impl825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__0860 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__0863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Rule__Group_1__0__Impl891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NextAssignment_1_1_in_rule__Rule__Group_1__1__Impl949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleExpression__Group__0__Impl_in_rule__RuleExpression__Group__0983 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__RuleExpression__Group__1_in_rule__RuleExpression__Group__0986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RuleExpression__Group__0__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleExpression__Group__1__Impl_in_rule__RuleExpression__Group__11045 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RuleExpression__Group__2_in_rule__RuleExpression__Group__11048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleExpression__TestAssignment_1_in_rule__RuleExpression__Group__1__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleExpression__Group__2__Impl_in_rule__RuleExpression__Group__21105 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__RuleExpression__Group__3_in_rule__RuleExpression__Group__21108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RuleExpression__Group__2__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleExpression__Group__3__Impl_in_rule__RuleExpression__Group__31167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleExpression__RatioAssignment_3_in_rule__RuleExpression__Group__3__Impl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestExpression__Group__0__Impl_in_rule__TestExpression__Group__01232 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TestExpression__Group__1_in_rule__TestExpression__Group__01235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__TestExpression__Group__0__Impl1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestExpression__Group__1__Impl_in_rule__TestExpression__Group__11294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TestExpression__Group__2_in_rule__TestExpression__Group__11297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TestExpression__Group__1__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestExpression__Group__2__Impl_in_rule__TestExpression__Group__21356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestExpression__CategoryAssignment_2_in_rule__TestExpression__Group__2__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioExpression__Group__0__Impl_in_rule__RatioExpression__Group__01419 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RatioExpression__Group__1_in_rule__RatioExpression__Group__01422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RatioExpression__Group__0__Impl1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioExpression__Group__1__Impl_in_rule__RatioExpression__Group__11481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RatioExpression__Group__2_in_rule__RatioExpression__Group__11484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RatioExpression__Group__1__Impl1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioExpression__Group__2__Impl_in_rule__RatioExpression__Group__21543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioExpression__RatioAssignment_2_in_rule__RatioExpression__Group__2__Impl1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_rule__Model__CategoriesAssignment_01611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Model__RuleAssignment_11642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Category__NameAssignment_11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleExpression_in_rule__Rule__FirstAssignment_01704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NextAlternatives_1_1_0_in_rule__Rule__NextAssignment_1_11735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_rule__RuleExpression__TestAssignment_11768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatioExpression_in_rule__RuleExpression__RatioAssignment_31799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TestExpression__CategoryAssignment_21834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RatioExpression__RatioAssignment_21869 = new BitSet(new long[]{0x0000000000000002L});

}