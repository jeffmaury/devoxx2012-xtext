package com.devoxx2012.xtext.demo1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.devoxx2012.xtext.demo1.services.Demo1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemo1Parser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g"; }



     	private Demo1GrammarAccess grammarAccess;
     	
        public InternalDemo1Parser(TokenStream input, Demo1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected Demo1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_categories_0_0= ruleCategory ) )+ ( (lv_rule_1_0= ruleRule ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_categories_0_0 = null;

        EObject lv_rule_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:79:28: ( ( ( (lv_categories_0_0= ruleCategory ) )+ ( (lv_rule_1_0= ruleRule ) ) ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:80:1: ( ( (lv_categories_0_0= ruleCategory ) )+ ( (lv_rule_1_0= ruleRule ) ) )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:80:1: ( ( (lv_categories_0_0= ruleCategory ) )+ ( (lv_rule_1_0= ruleRule ) ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:80:2: ( (lv_categories_0_0= ruleCategory ) )+ ( (lv_rule_1_0= ruleRule ) )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:80:2: ( (lv_categories_0_0= ruleCategory ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:81:1: (lv_categories_0_0= ruleCategory )
            	    {
            	    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:81:1: (lv_categories_0_0= ruleCategory )
            	    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:82:3: lv_categories_0_0= ruleCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getCategoriesCategoryParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCategory_in_ruleModel131);
            	    lv_categories_0_0=ruleCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"categories",
            	            		lv_categories_0_0, 
            	            		"Category");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:98:3: ( (lv_rule_1_0= ruleRule ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:99:1: (lv_rule_1_0= ruleRule )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:99:1: (lv_rule_1_0= ruleRule )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:100:3: lv_rule_1_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getRuleRuleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleModel153);
            lv_rule_1_0=ruleRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"rule",
                    		lv_rule_1_0, 
                    		"Rule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCategory"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:124:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:125:2: (iv_ruleCategory= ruleCategory EOF )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:126:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory189);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:133:1: ruleCategory returns [EObject current=null] : (otherlv_0= 'category' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:136:28: ( (otherlv_0= 'category' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:137:1: (otherlv_0= 'category' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:137:1: (otherlv_0= 'category' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:137:3: otherlv_0= 'category' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCategory236); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
                
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:141:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:142:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:142:1: (lv_name_1_0= RULE_ID )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:143:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCategory253); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleRule"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:167:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:168:2: (iv_ruleRule= ruleRule EOF )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:169:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule294);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:176:1: ruleRule returns [EObject current=null] : ( ( (lv_first_0_0= ruleRuleExpression ) ) (otherlv_1= 'else' ( ( (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression ) ) ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_first_0_0 = null;

        EObject lv_next_2_1 = null;

        EObject lv_next_2_2 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:179:28: ( ( ( (lv_first_0_0= ruleRuleExpression ) ) (otherlv_1= 'else' ( ( (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression ) ) ) )? ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:180:1: ( ( (lv_first_0_0= ruleRuleExpression ) ) (otherlv_1= 'else' ( ( (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression ) ) ) )? )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:180:1: ( ( (lv_first_0_0= ruleRuleExpression ) ) (otherlv_1= 'else' ( ( (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression ) ) ) )? )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:180:2: ( (lv_first_0_0= ruleRuleExpression ) ) (otherlv_1= 'else' ( ( (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression ) ) ) )?
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:180:2: ( (lv_first_0_0= ruleRuleExpression ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:181:1: (lv_first_0_0= ruleRuleExpression )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:181:1: (lv_first_0_0= ruleRuleExpression )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:182:3: lv_first_0_0= ruleRuleExpression
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getFirstRuleExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleExpression_in_ruleRule350);
            lv_first_0_0=ruleRuleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"first",
                    		lv_first_0_0, 
                    		"RuleExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:198:2: (otherlv_1= 'else' ( ( (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression ) ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:198:4: otherlv_1= 'else' ( ( (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression ) ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleRule363); 

                        	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getElseKeyword_1_0());
                        
                    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:202:1: ( ( (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression ) ) )
                    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:203:1: ( (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression ) )
                    {
                    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:203:1: ( (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression ) )
                    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:204:1: (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression )
                    {
                    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:204:1: (lv_next_2_1= ruleRule | lv_next_2_2= ruleRatioExpression )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==13) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==16) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:205:3: lv_next_2_1= ruleRule
                            {
                             
                            	        newCompositeNode(grammarAccess.getRuleAccess().getNextRuleParserRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRule_in_ruleRule386);
                            lv_next_2_1=ruleRule();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRuleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"next",
                                    		lv_next_2_1, 
                                    		"Rule");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:220:8: lv_next_2_2= ruleRatioExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getRuleAccess().getNextRatioExpressionParserRuleCall_1_1_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleRatioExpression_in_ruleRule405);
                            lv_next_2_2=ruleRatioExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRuleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"next",
                                    		lv_next_2_2, 
                                    		"RatioExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleExpression"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:246:1: entryRuleRuleExpression returns [EObject current=null] : iv_ruleRuleExpression= ruleRuleExpression EOF ;
    public final EObject entryRuleRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleExpression = null;


        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:247:2: (iv_ruleRuleExpression= ruleRuleExpression EOF )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:248:2: iv_ruleRuleExpression= ruleRuleExpression EOF
            {
             newCompositeNode(grammarAccess.getRuleExpressionRule()); 
            pushFollow(FOLLOW_ruleRuleExpression_in_entryRuleRuleExpression446);
            iv_ruleRuleExpression=ruleRuleExpression();

            state._fsp--;

             current =iv_ruleRuleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleExpression456); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleExpression"


    // $ANTLR start "ruleRuleExpression"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:255:1: ruleRuleExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_test_1_0= ruleTestExpression ) ) otherlv_2= 'then' ( (lv_ratio_3_0= ruleRatioExpression ) ) ) ;
    public final EObject ruleRuleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_test_1_0 = null;

        EObject lv_ratio_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:258:28: ( (otherlv_0= 'if' ( (lv_test_1_0= ruleTestExpression ) ) otherlv_2= 'then' ( (lv_ratio_3_0= ruleRatioExpression ) ) ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:259:1: (otherlv_0= 'if' ( (lv_test_1_0= ruleTestExpression ) ) otherlv_2= 'then' ( (lv_ratio_3_0= ruleRatioExpression ) ) )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:259:1: (otherlv_0= 'if' ( (lv_test_1_0= ruleTestExpression ) ) otherlv_2= 'then' ( (lv_ratio_3_0= ruleRatioExpression ) ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:259:3: otherlv_0= 'if' ( (lv_test_1_0= ruleTestExpression ) ) otherlv_2= 'then' ( (lv_ratio_3_0= ruleRatioExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRuleExpression493); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleExpressionAccess().getIfKeyword_0());
                
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:263:1: ( (lv_test_1_0= ruleTestExpression ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:264:1: (lv_test_1_0= ruleTestExpression )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:264:1: (lv_test_1_0= ruleTestExpression )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:265:3: lv_test_1_0= ruleTestExpression
            {
             
            	        newCompositeNode(grammarAccess.getRuleExpressionAccess().getTestTestExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTestExpression_in_ruleRuleExpression514);
            lv_test_1_0=ruleTestExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"test",
                    		lv_test_1_0, 
                    		"TestExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleRuleExpression526); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleExpressionAccess().getThenKeyword_2());
                
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:285:1: ( (lv_ratio_3_0= ruleRatioExpression ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:286:1: (lv_ratio_3_0= ruleRatioExpression )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:286:1: (lv_ratio_3_0= ruleRatioExpression )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:287:3: lv_ratio_3_0= ruleRatioExpression
            {
             
            	        newCompositeNode(grammarAccess.getRuleExpressionAccess().getRatioRatioExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRatioExpression_in_ruleRuleExpression547);
            lv_ratio_3_0=ruleRatioExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"ratio",
                    		lv_ratio_3_0, 
                    		"RatioExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleExpression"


    // $ANTLR start "entryRuleTestExpression"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:311:1: entryRuleTestExpression returns [EObject current=null] : iv_ruleTestExpression= ruleTestExpression EOF ;
    public final EObject entryRuleTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestExpression = null;


        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:312:2: (iv_ruleTestExpression= ruleTestExpression EOF )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:313:2: iv_ruleTestExpression= ruleTestExpression EOF
            {
             newCompositeNode(grammarAccess.getTestExpressionRule()); 
            pushFollow(FOLLOW_ruleTestExpression_in_entryRuleTestExpression583);
            iv_ruleTestExpression=ruleTestExpression();

            state._fsp--;

             current =iv_ruleTestExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestExpression593); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestExpression"


    // $ANTLR start "ruleTestExpression"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:320:1: ruleTestExpression returns [EObject current=null] : (otherlv_0= 'category' otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:323:28: ( (otherlv_0= 'category' otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:324:1: (otherlv_0= 'category' otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:324:1: (otherlv_0= 'category' otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:324:3: otherlv_0= 'category' otherlv_1= 'is' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleTestExpression630); 

                	newLeafNode(otherlv_0, grammarAccess.getTestExpressionAccess().getCategoryKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleTestExpression642); 

                	newLeafNode(otherlv_1, grammarAccess.getTestExpressionAccess().getIsKeyword_1());
                
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:332:1: ( (otherlv_2= RULE_ID ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:333:1: (otherlv_2= RULE_ID )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:333:1: (otherlv_2= RULE_ID )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:334:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTestExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestExpression662); 

            		newLeafNode(otherlv_2, grammarAccess.getTestExpressionAccess().getCategoryCategoryCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestExpression"


    // $ANTLR start "entryRuleRatioExpression"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:353:1: entryRuleRatioExpression returns [EObject current=null] : iv_ruleRatioExpression= ruleRatioExpression EOF ;
    public final EObject entryRuleRatioExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatioExpression = null;


        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:354:2: (iv_ruleRatioExpression= ruleRatioExpression EOF )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:355:2: iv_ruleRatioExpression= ruleRatioExpression EOF
            {
             newCompositeNode(grammarAccess.getRatioExpressionRule()); 
            pushFollow(FOLLOW_ruleRatioExpression_in_entryRuleRatioExpression698);
            iv_ruleRatioExpression=ruleRatioExpression();

            state._fsp--;

             current =iv_ruleRatioExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRatioExpression708); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRatioExpression"


    // $ANTLR start "ruleRatioExpression"
    // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:362:1: ruleRatioExpression returns [EObject current=null] : (otherlv_0= 'ratio' otherlv_1= 'is' ( (lv_ratio_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRatioExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ratio_2_0=null;

         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:365:28: ( (otherlv_0= 'ratio' otherlv_1= 'is' ( (lv_ratio_2_0= RULE_INT ) ) ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:366:1: (otherlv_0= 'ratio' otherlv_1= 'is' ( (lv_ratio_2_0= RULE_INT ) ) )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:366:1: (otherlv_0= 'ratio' otherlv_1= 'is' ( (lv_ratio_2_0= RULE_INT ) ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:366:3: otherlv_0= 'ratio' otherlv_1= 'is' ( (lv_ratio_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleRatioExpression745); 

                	newLeafNode(otherlv_0, grammarAccess.getRatioExpressionAccess().getRatioKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleRatioExpression757); 

                	newLeafNode(otherlv_1, grammarAccess.getRatioExpressionAccess().getIsKeyword_1());
                
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:374:1: ( (lv_ratio_2_0= RULE_INT ) )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:375:1: (lv_ratio_2_0= RULE_INT )
            {
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:375:1: (lv_ratio_2_0= RULE_INT )
            // ../com.devoxx2012.xtext.demo1/src-gen/com/devoxx2012/xtext/demo1/parser/antlr/internal/InternalDemo1.g:376:3: lv_ratio_2_0= RULE_INT
            {
            lv_ratio_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRatioExpression774); 

            			newLeafNode(lv_ratio_2_0, grammarAccess.getRatioExpressionAccess().getRatioINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRatioExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ratio",
                    		lv_ratio_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRatioExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_ruleModel131 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCategory236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCategory253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleExpression_in_ruleRule350 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleRule363 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRule386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatioExpression_in_ruleRule405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleExpression_in_entryRuleRuleExpression446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleExpression456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRuleExpression493 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleTestExpression_in_ruleRuleExpression514 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRuleExpression526 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_ruleRatioExpression_in_ruleRuleExpression547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_entryRuleTestExpression583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestExpression593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTestExpression630 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTestExpression642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestExpression662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatioExpression_in_entryRuleRatioExpression698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRatioExpression708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRatioExpression745 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRatioExpression757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRatioExpression774 = new BitSet(new long[]{0x0000000000000002L});

}