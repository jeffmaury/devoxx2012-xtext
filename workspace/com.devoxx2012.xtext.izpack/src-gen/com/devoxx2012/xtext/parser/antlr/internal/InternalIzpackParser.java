package com.devoxx2012.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.devoxx2012.xtext.services.IzpackGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIzpackParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'installer'", "'by'", "'constraints'", "'uninstall'", "'no'", "'log on'", "'write installation info'", "'display'", "'locale'", "'for'", "'site'", "'webroot'", "'with jdk'", "'packed'", "'named'", "'path'", "'='", "'packaging'", "'options'", "'val'", "'var'", "'pack'", "'optional'", "'loose'", "'keep'", "'on'", "'as'", "'to'", "'override'", "'['", "']'", "'('", "','", "')'", "'=>'", "'<'", "'>'", "'?'", "'extends'", "'&'", "'super'", "'.'", "'Catalunyan'", "'Chinese'", "'Czech'", "'Danish'", "'Galician'", "'German'", "'English'", "'Basque'", "'Finnish'", "'French'", "'Hungarian'", "'Italian'", "'Japanese'", "'Malaysian'", "'Nederlands'", "'Norwegian'", "'Polnish'", "'Portuguese (Brazilian)'", "'Portuguese (European)'", "'Romanian'", "'Russian'", "'Serbian'", "'Spanish'", "'Slovakian'", "'Swedish'", "'Ukrainian'", "'all'", "'unix'", "'windows'", "'mac'", "'true'", "'false'", "'asktrue'", "'askfalse'", "'update'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalIzpackParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIzpackParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIzpackParser.tokenNames; }
    public String getGrammarFileName() { return "../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g"; }



     	private IzpackGrammarAccess grammarAccess;
     	
        public InternalIzpackParser(TokenStream input, IzpackGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Installer";	
       	}
       	
       	@Override
       	protected IzpackGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleInstaller"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:68:1: entryRuleInstaller returns [EObject current=null] : iv_ruleInstaller= ruleInstaller EOF ;
    public final EObject entryRuleInstaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstaller = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:69:2: (iv_ruleInstaller= ruleInstaller EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:70:2: iv_ruleInstaller= ruleInstaller EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstallerRule()); 
            }
            pushFollow(FOLLOW_ruleInstaller_in_entryRuleInstaller75);
            iv_ruleInstaller=ruleInstaller();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstaller; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstaller85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstaller"


    // $ANTLR start "ruleInstaller"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:77:1: ruleInstaller returns [EObject current=null] : (otherlv_0= 'installer' ( (lv_identification_1_0= ruleIdentification ) ) (otherlv_2= 'by' ( (lv_authors_3_0= ruleAuthor ) )* )? (otherlv_4= 'constraints' ( (lv_constraint_5_0= ruleConstraint ) ) )? (otherlv_6= 'uninstall' (otherlv_7= 'no' | ( (lv_uninstall_8_0= ruleUninstall ) ) ) )? (otherlv_9= 'log on' ( (lv_summarylog_10_0= RULE_STRING ) ) ( (lv_installation_11_0= 'write installation info' ) )? )? ( (lv_packaging_12_0= rulePackaging ) )? ( (lv_variables_13_0= ruleVariable ) )* ( (lv_packs_14_0= rulePack ) )+ ( (lv_locale_15_0= ruleLocale ) ) otherlv_16= 'display' ( (lv_panels_17_0= rulePanel ) )+ ) ;
    public final EObject ruleInstaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_summarylog_10_0=null;
        Token lv_installation_11_0=null;
        Token otherlv_16=null;
        EObject lv_identification_1_0 = null;

        EObject lv_authors_3_0 = null;

        EObject lv_constraint_5_0 = null;

        EObject lv_uninstall_8_0 = null;

        EObject lv_packaging_12_0 = null;

        EObject lv_variables_13_0 = null;

        EObject lv_packs_14_0 = null;

        EObject lv_locale_15_0 = null;

        EObject lv_panels_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:80:28: ( (otherlv_0= 'installer' ( (lv_identification_1_0= ruleIdentification ) ) (otherlv_2= 'by' ( (lv_authors_3_0= ruleAuthor ) )* )? (otherlv_4= 'constraints' ( (lv_constraint_5_0= ruleConstraint ) ) )? (otherlv_6= 'uninstall' (otherlv_7= 'no' | ( (lv_uninstall_8_0= ruleUninstall ) ) ) )? (otherlv_9= 'log on' ( (lv_summarylog_10_0= RULE_STRING ) ) ( (lv_installation_11_0= 'write installation info' ) )? )? ( (lv_packaging_12_0= rulePackaging ) )? ( (lv_variables_13_0= ruleVariable ) )* ( (lv_packs_14_0= rulePack ) )+ ( (lv_locale_15_0= ruleLocale ) ) otherlv_16= 'display' ( (lv_panels_17_0= rulePanel ) )+ ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:81:1: (otherlv_0= 'installer' ( (lv_identification_1_0= ruleIdentification ) ) (otherlv_2= 'by' ( (lv_authors_3_0= ruleAuthor ) )* )? (otherlv_4= 'constraints' ( (lv_constraint_5_0= ruleConstraint ) ) )? (otherlv_6= 'uninstall' (otherlv_7= 'no' | ( (lv_uninstall_8_0= ruleUninstall ) ) ) )? (otherlv_9= 'log on' ( (lv_summarylog_10_0= RULE_STRING ) ) ( (lv_installation_11_0= 'write installation info' ) )? )? ( (lv_packaging_12_0= rulePackaging ) )? ( (lv_variables_13_0= ruleVariable ) )* ( (lv_packs_14_0= rulePack ) )+ ( (lv_locale_15_0= ruleLocale ) ) otherlv_16= 'display' ( (lv_panels_17_0= rulePanel ) )+ )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:81:1: (otherlv_0= 'installer' ( (lv_identification_1_0= ruleIdentification ) ) (otherlv_2= 'by' ( (lv_authors_3_0= ruleAuthor ) )* )? (otherlv_4= 'constraints' ( (lv_constraint_5_0= ruleConstraint ) ) )? (otherlv_6= 'uninstall' (otherlv_7= 'no' | ( (lv_uninstall_8_0= ruleUninstall ) ) ) )? (otherlv_9= 'log on' ( (lv_summarylog_10_0= RULE_STRING ) ) ( (lv_installation_11_0= 'write installation info' ) )? )? ( (lv_packaging_12_0= rulePackaging ) )? ( (lv_variables_13_0= ruleVariable ) )* ( (lv_packs_14_0= rulePack ) )+ ( (lv_locale_15_0= ruleLocale ) ) otherlv_16= 'display' ( (lv_panels_17_0= rulePanel ) )+ )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:81:3: otherlv_0= 'installer' ( (lv_identification_1_0= ruleIdentification ) ) (otherlv_2= 'by' ( (lv_authors_3_0= ruleAuthor ) )* )? (otherlv_4= 'constraints' ( (lv_constraint_5_0= ruleConstraint ) ) )? (otherlv_6= 'uninstall' (otherlv_7= 'no' | ( (lv_uninstall_8_0= ruleUninstall ) ) ) )? (otherlv_9= 'log on' ( (lv_summarylog_10_0= RULE_STRING ) ) ( (lv_installation_11_0= 'write installation info' ) )? )? ( (lv_packaging_12_0= rulePackaging ) )? ( (lv_variables_13_0= ruleVariable ) )* ( (lv_packs_14_0= rulePack ) )+ ( (lv_locale_15_0= ruleLocale ) ) otherlv_16= 'display' ( (lv_panels_17_0= rulePanel ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInstaller122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstallerAccess().getInstallerKeyword_0());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:85:1: ( (lv_identification_1_0= ruleIdentification ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:86:1: (lv_identification_1_0= ruleIdentification )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:86:1: (lv_identification_1_0= ruleIdentification )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:87:3: lv_identification_1_0= ruleIdentification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstallerAccess().getIdentificationIdentificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentification_in_ruleInstaller143);
            lv_identification_1_0=ruleIdentification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstallerRule());
              	        }
                     		set(
                     			current, 
                     			"identification",
                      		lv_identification_1_0, 
                      		"Identification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:103:2: (otherlv_2= 'by' ( (lv_authors_3_0= ruleAuthor ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:103:4: otherlv_2= 'by' ( (lv_authors_3_0= ruleAuthor ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInstaller156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInstallerAccess().getByKeyword_2_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:107:1: ( (lv_authors_3_0= ruleAuthor ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_STRING) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:108:1: (lv_authors_3_0= ruleAuthor )
                    	    {
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:108:1: (lv_authors_3_0= ruleAuthor )
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:109:3: lv_authors_3_0= ruleAuthor
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInstallerAccess().getAuthorsAuthorParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAuthor_in_ruleInstaller177);
                    	    lv_authors_3_0=ruleAuthor();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInstallerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"authors",
                    	              		lv_authors_3_0, 
                    	              		"Author");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:125:5: (otherlv_4= 'constraints' ( (lv_constraint_5_0= ruleConstraint ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:125:7: otherlv_4= 'constraints' ( (lv_constraint_5_0= ruleConstraint ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleInstaller193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInstallerAccess().getConstraintsKeyword_3_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:129:1: ( (lv_constraint_5_0= ruleConstraint ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:130:1: (lv_constraint_5_0= ruleConstraint )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:130:1: (lv_constraint_5_0= ruleConstraint )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:131:3: lv_constraint_5_0= ruleConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstallerAccess().getConstraintConstraintParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstraint_in_ruleInstaller214);
                    lv_constraint_5_0=ruleConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstallerRule());
                      	        }
                             		set(
                             			current, 
                             			"constraint",
                              		lv_constraint_5_0, 
                              		"Constraint");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:147:4: (otherlv_6= 'uninstall' (otherlv_7= 'no' | ( (lv_uninstall_8_0= ruleUninstall ) ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:147:6: otherlv_6= 'uninstall' (otherlv_7= 'no' | ( (lv_uninstall_8_0= ruleUninstall ) ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleInstaller229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInstallerAccess().getUninstallKeyword_4_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:151:1: (otherlv_7= 'no' | ( (lv_uninstall_8_0= ruleUninstall ) ) )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==EOF||LA4_0==16||(LA4_0>=25 && LA4_0<=26)||LA4_0==28||(LA4_0>=30 && LA4_0<=32)) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:151:3: otherlv_7= 'no'
                            {
                            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleInstaller242); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getInstallerAccess().getNoKeyword_4_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:156:6: ( (lv_uninstall_8_0= ruleUninstall ) )
                            {
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:156:6: ( (lv_uninstall_8_0= ruleUninstall ) )
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:157:1: (lv_uninstall_8_0= ruleUninstall )
                            {
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:157:1: (lv_uninstall_8_0= ruleUninstall )
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:158:3: lv_uninstall_8_0= ruleUninstall
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInstallerAccess().getUninstallUninstallParserRuleCall_4_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUninstall_in_ruleInstaller269);
                            lv_uninstall_8_0=ruleUninstall();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInstallerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"uninstall",
                                      		lv_uninstall_8_0, 
                                      		"Uninstall");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:174:5: (otherlv_9= 'log on' ( (lv_summarylog_10_0= RULE_STRING ) ) ( (lv_installation_11_0= 'write installation info' ) )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:174:7: otherlv_9= 'log on' ( (lv_summarylog_10_0= RULE_STRING ) ) ( (lv_installation_11_0= 'write installation info' ) )?
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleInstaller285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getInstallerAccess().getLogOnKeyword_5_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:178:1: ( (lv_summarylog_10_0= RULE_STRING ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:179:1: (lv_summarylog_10_0= RULE_STRING )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:179:1: (lv_summarylog_10_0= RULE_STRING )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:180:3: lv_summarylog_10_0= RULE_STRING
                    {
                    lv_summarylog_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInstaller302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_summarylog_10_0, grammarAccess.getInstallerAccess().getSummarylogSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInstallerRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"summarylog",
                              		lv_summarylog_10_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:196:2: ( (lv_installation_11_0= 'write installation info' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:197:1: (lv_installation_11_0= 'write installation info' )
                            {
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:197:1: (lv_installation_11_0= 'write installation info' )
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:198:3: lv_installation_11_0= 'write installation info'
                            {
                            lv_installation_11_0=(Token)match(input,17,FOLLOW_17_in_ruleInstaller325); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_installation_11_0, grammarAccess.getInstallerAccess().getInstallationWriteInstallationInfoKeyword_5_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInstallerRule());
                              	        }
                                     		setWithLastConsumed(current, "installation", true, "write installation info");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:211:5: ( (lv_packaging_12_0= rulePackaging ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:212:1: (lv_packaging_12_0= rulePackaging )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:212:1: (lv_packaging_12_0= rulePackaging )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:213:3: lv_packaging_12_0= rulePackaging
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstallerAccess().getPackagingPackagingParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackaging_in_ruleInstaller362);
                    lv_packaging_12_0=rulePackaging();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstallerRule());
                      	        }
                             		set(
                             			current, 
                             			"packaging",
                              		lv_packaging_12_0, 
                              		"Packaging");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:229:3: ( (lv_variables_13_0= ruleVariable ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=30 && LA9_0<=31)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:230:1: (lv_variables_13_0= ruleVariable )
            	    {
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:230:1: (lv_variables_13_0= ruleVariable )
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:231:3: lv_variables_13_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstallerAccess().getVariablesVariableParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleInstaller384);
            	    lv_variables_13_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstallerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_13_0, 
            	              		"Variable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:247:3: ( (lv_packs_14_0= rulePack ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:248:1: (lv_packs_14_0= rulePack )
            	    {
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:248:1: (lv_packs_14_0= rulePack )
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:249:3: lv_packs_14_0= rulePack
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstallerAccess().getPacksPackParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePack_in_ruleInstaller406);
            	    lv_packs_14_0=rulePack();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstallerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"packs",
            	              		lv_packs_14_0, 
            	              		"Pack");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:265:3: ( (lv_locale_15_0= ruleLocale ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:266:1: (lv_locale_15_0= ruleLocale )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:266:1: (lv_locale_15_0= ruleLocale )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:267:3: lv_locale_15_0= ruleLocale
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstallerAccess().getLocaleLocaleParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocale_in_ruleInstaller428);
            lv_locale_15_0=ruleLocale();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstallerRule());
              	        }
                     		set(
                     			current, 
                     			"locale",
                      		lv_locale_15_0, 
                      		"Locale");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleInstaller440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getInstallerAccess().getDisplayKeyword_10());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:287:1: ( (lv_panels_17_0= rulePanel ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:288:1: (lv_panels_17_0= rulePanel )
            	    {
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:288:1: (lv_panels_17_0= rulePanel )
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:289:3: lv_panels_17_0= rulePanel
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstallerAccess().getPanelsPanelParserRuleCall_11_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePanel_in_ruleInstaller461);
            	    lv_panels_17_0=rulePanel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstallerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"panels",
            	              		lv_panels_17_0, 
            	              		"Panel");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInstaller"


    // $ANTLR start "entryRuleLocale"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:313:1: entryRuleLocale returns [EObject current=null] : iv_ruleLocale= ruleLocale EOF ;
    public final EObject entryRuleLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocale = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:314:2: (iv_ruleLocale= ruleLocale EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:315:2: iv_ruleLocale= ruleLocale EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocaleRule()); 
            }
            pushFollow(FOLLOW_ruleLocale_in_entryRuleLocale498);
            iv_ruleLocale=ruleLocale();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocale; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocale508); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocale"


    // $ANTLR start "ruleLocale"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:322:1: ruleLocale returns [EObject current=null] : (otherlv_0= 'locale' ( (lv_isocodes_1_0= ruleISO3Code ) )+ ) ;
    public final EObject ruleLocale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_isocodes_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:325:28: ( (otherlv_0= 'locale' ( (lv_isocodes_1_0= ruleISO3Code ) )+ ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:326:1: (otherlv_0= 'locale' ( (lv_isocodes_1_0= ruleISO3Code ) )+ )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:326:1: (otherlv_0= 'locale' ( (lv_isocodes_1_0= ruleISO3Code ) )+ )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:326:3: otherlv_0= 'locale' ( (lv_isocodes_1_0= ruleISO3Code ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleLocale545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocaleAccess().getLocaleKeyword_0());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:330:1: ( (lv_isocodes_1_0= ruleISO3Code ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=53 && LA12_0<=78)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:331:1: (lv_isocodes_1_0= ruleISO3Code )
            	    {
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:331:1: (lv_isocodes_1_0= ruleISO3Code )
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:332:3: lv_isocodes_1_0= ruleISO3Code
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocaleAccess().getIsocodesISO3CodeEnumRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleISO3Code_in_ruleLocale566);
            	    lv_isocodes_1_0=ruleISO3Code();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocaleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"isocodes",
            	              		lv_isocodes_1_0, 
            	              		"ISO3Code");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLocale"


    // $ANTLR start "entryRuleIdentification"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:356:1: entryRuleIdentification returns [EObject current=null] : iv_ruleIdentification= ruleIdentification EOF ;
    public final EObject entryRuleIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentification = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:357:2: (iv_ruleIdentification= ruleIdentification EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:358:2: iv_ruleIdentification= ruleIdentification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentificationRule()); 
            }
            pushFollow(FOLLOW_ruleIdentification_in_entryRuleIdentification603);
            iv_ruleIdentification=ruleIdentification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentification613); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentification"


    // $ANTLR start "ruleIdentification"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:365:1: ruleIdentification returns [EObject current=null] : (otherlv_0= 'for' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= RULE_STRING ) ) (otherlv_3= 'site' ( (lv_url_4_0= RULE_STRING ) ) )? (otherlv_5= 'webroot' ( (lv_webdir_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleIdentification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token lv_url_4_0=null;
        Token otherlv_5=null;
        Token lv_webdir_6_0=null;

         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:368:28: ( (otherlv_0= 'for' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= RULE_STRING ) ) (otherlv_3= 'site' ( (lv_url_4_0= RULE_STRING ) ) )? (otherlv_5= 'webroot' ( (lv_webdir_6_0= RULE_STRING ) ) )? ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:369:1: (otherlv_0= 'for' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= RULE_STRING ) ) (otherlv_3= 'site' ( (lv_url_4_0= RULE_STRING ) ) )? (otherlv_5= 'webroot' ( (lv_webdir_6_0= RULE_STRING ) ) )? )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:369:1: (otherlv_0= 'for' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= RULE_STRING ) ) (otherlv_3= 'site' ( (lv_url_4_0= RULE_STRING ) ) )? (otherlv_5= 'webroot' ( (lv_webdir_6_0= RULE_STRING ) ) )? )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:369:3: otherlv_0= 'for' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= RULE_STRING ) ) (otherlv_3= 'site' ( (lv_url_4_0= RULE_STRING ) ) )? (otherlv_5= 'webroot' ( (lv_webdir_6_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleIdentification650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIdentificationAccess().getForKeyword_0());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:373:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:374:1: (lv_name_1_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:374:1: (lv_name_1_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:375:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdentification667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getIdentificationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentificationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:391:2: ( (lv_version_2_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:392:1: (lv_version_2_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:392:1: (lv_version_2_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:393:3: lv_version_2_0= RULE_STRING
            {
            lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdentification689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_version_2_0, grammarAccess.getIdentificationAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentificationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"version",
                      		lv_version_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:409:2: (otherlv_3= 'site' ( (lv_url_4_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:409:4: otherlv_3= 'site' ( (lv_url_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleIdentification707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIdentificationAccess().getSiteKeyword_3_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:413:1: ( (lv_url_4_0= RULE_STRING ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:414:1: (lv_url_4_0= RULE_STRING )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:414:1: (lv_url_4_0= RULE_STRING )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:415:3: lv_url_4_0= RULE_STRING
                    {
                    lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdentification724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_url_4_0, grammarAccess.getIdentificationAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIdentificationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"url",
                              		lv_url_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:431:4: (otherlv_5= 'webroot' ( (lv_webdir_6_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:431:6: otherlv_5= 'webroot' ( (lv_webdir_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleIdentification744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIdentificationAccess().getWebrootKeyword_4_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:435:1: ( (lv_webdir_6_0= RULE_STRING ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:436:1: (lv_webdir_6_0= RULE_STRING )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:436:1: (lv_webdir_6_0= RULE_STRING )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:437:3: lv_webdir_6_0= RULE_STRING
                    {
                    lv_webdir_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdentification761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_webdir_6_0, grammarAccess.getIdentificationAccess().getWebdirSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIdentificationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"webdir",
                              		lv_webdir_6_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdentification"


    // $ANTLR start "entryRuleAuthor"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:461:1: entryRuleAuthor returns [EObject current=null] : iv_ruleAuthor= ruleAuthor EOF ;
    public final EObject entryRuleAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthor = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:462:2: (iv_ruleAuthor= ruleAuthor EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:463:2: iv_ruleAuthor= ruleAuthor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuthorRule()); 
            }
            pushFollow(FOLLOW_ruleAuthor_in_entryRuleAuthor804);
            iv_ruleAuthor=ruleAuthor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAuthor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthor814); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAuthor"


    // $ANTLR start "ruleAuthor"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:470:1: ruleAuthor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_email_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAuthor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_email_1_0=null;

         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:473:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_email_1_0= RULE_STRING ) ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:474:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_email_1_0= RULE_STRING ) ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:474:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_email_1_0= RULE_STRING ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:474:2: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_email_1_0= RULE_STRING ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:474:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:475:1: (lv_name_0_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:475:1: (lv_name_0_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:476:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAuthor856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAuthorAccess().getNameSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAuthorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:492:2: ( (lv_email_1_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:493:1: (lv_email_1_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:493:1: (lv_email_1_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:494:3: lv_email_1_0= RULE_STRING
            {
            lv_email_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAuthor878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_email_1_0, grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAuthorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"email",
                      		lv_email_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleConstraint"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:518:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:519:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:520:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint919);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint929); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:527:1: ruleConstraint returns [EObject current=null] : ( ( (lv_javaversion_0_0= RULE_STRING ) ) ( (lv_requiredJdk_1_0= 'with jdk' ) )? ( (lv_packed_2_0= 'packed' ) )? ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_javaversion_0_0=null;
        Token lv_requiredJdk_1_0=null;
        Token lv_packed_2_0=null;

         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:530:28: ( ( ( (lv_javaversion_0_0= RULE_STRING ) ) ( (lv_requiredJdk_1_0= 'with jdk' ) )? ( (lv_packed_2_0= 'packed' ) )? ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:531:1: ( ( (lv_javaversion_0_0= RULE_STRING ) ) ( (lv_requiredJdk_1_0= 'with jdk' ) )? ( (lv_packed_2_0= 'packed' ) )? )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:531:1: ( ( (lv_javaversion_0_0= RULE_STRING ) ) ( (lv_requiredJdk_1_0= 'with jdk' ) )? ( (lv_packed_2_0= 'packed' ) )? )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:531:2: ( (lv_javaversion_0_0= RULE_STRING ) ) ( (lv_requiredJdk_1_0= 'with jdk' ) )? ( (lv_packed_2_0= 'packed' ) )?
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:531:2: ( (lv_javaversion_0_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:532:1: (lv_javaversion_0_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:532:1: (lv_javaversion_0_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:533:3: lv_javaversion_0_0= RULE_STRING
            {
            lv_javaversion_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_javaversion_0_0, grammarAccess.getConstraintAccess().getJavaversionSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"javaversion",
                      		lv_javaversion_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:549:2: ( (lv_requiredJdk_1_0= 'with jdk' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:550:1: (lv_requiredJdk_1_0= 'with jdk' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:550:1: (lv_requiredJdk_1_0= 'with jdk' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:551:3: lv_requiredJdk_1_0= 'with jdk'
                    {
                    lv_requiredJdk_1_0=(Token)match(input,23,FOLLOW_23_in_ruleConstraint994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_requiredJdk_1_0, grammarAccess.getConstraintAccess().getRequiredJdkWithJdkKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstraintRule());
                      	        }
                             		setWithLastConsumed(current, "requiredJdk", true, "with jdk");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:564:3: ( (lv_packed_2_0= 'packed' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:565:1: (lv_packed_2_0= 'packed' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:565:1: (lv_packed_2_0= 'packed' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:566:3: lv_packed_2_0= 'packed'
                    {
                    lv_packed_2_0=(Token)match(input,24,FOLLOW_24_in_ruleConstraint1026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_packed_2_0, grammarAccess.getConstraintAccess().getPackedPackedKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstraintRule());
                      	        }
                             		setWithLastConsumed(current, "packed", true, "packed");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleUninstall"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:587:1: entryRuleUninstall returns [EObject current=null] : iv_ruleUninstall= ruleUninstall EOF ;
    public final EObject entryRuleUninstall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUninstall = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:588:2: (iv_ruleUninstall= ruleUninstall EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:589:2: iv_ruleUninstall= ruleUninstall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUninstallRule()); 
            }
            pushFollow(FOLLOW_ruleUninstall_in_entryRuleUninstall1076);
            iv_ruleUninstall=ruleUninstall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUninstall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUninstall1086); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUninstall"


    // $ANTLR start "ruleUninstall"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:596:1: ruleUninstall returns [EObject current=null] : ( (otherlv_0= 'named' ( (lv_name_1_0= RULE_STRING ) ) )? (otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleUninstall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;

         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:599:28: ( ( (otherlv_0= 'named' ( (lv_name_1_0= RULE_STRING ) ) )? (otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) )? ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:600:1: ( (otherlv_0= 'named' ( (lv_name_1_0= RULE_STRING ) ) )? (otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) )? )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:600:1: ( (otherlv_0= 'named' ( (lv_name_1_0= RULE_STRING ) ) )? (otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) )? )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:600:2: (otherlv_0= 'named' ( (lv_name_1_0= RULE_STRING ) ) )? (otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) )?
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:600:2: (otherlv_0= 'named' ( (lv_name_1_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:600:4: otherlv_0= 'named' ( (lv_name_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleUninstall1124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUninstallAccess().getNamedKeyword_0_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:604:1: ( (lv_name_1_0= RULE_STRING ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:605:1: (lv_name_1_0= RULE_STRING )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:605:1: (lv_name_1_0= RULE_STRING )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:606:3: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUninstall1141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getUninstallAccess().getNameSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUninstallRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:622:4: (otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:622:6: otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleUninstall1161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getUninstallAccess().getPathKeyword_1_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:626:1: ( (lv_path_3_0= RULE_STRING ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:627:1: (lv_path_3_0= RULE_STRING )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:627:1: (lv_path_3_0= RULE_STRING )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:628:3: lv_path_3_0= RULE_STRING
                    {
                    lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUninstall1178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_path_3_0, grammarAccess.getUninstallAccess().getPathSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUninstallRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"path",
                              		lv_path_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUninstall"


    // $ANTLR start "entryRuleOption"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:652:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:653:2: (iv_ruleOption= ruleOption EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:654:2: iv_ruleOption= ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionRule()); 
            }
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption1221);
            iv_ruleOption=ruleOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption1231); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:661:1: ruleOption returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:664:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:665:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:665:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:665:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:665:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:666:1: (lv_name_0_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:666:1: (lv_name_0_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:667:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOption1273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getOptionAccess().getNameSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleOption1290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:687:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:688:1: (lv_value_2_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:688:1: (lv_value_2_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:689:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOption1307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getOptionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRulePackaging"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:713:1: entryRulePackaging returns [EObject current=null] : iv_rulePackaging= rulePackaging EOF ;
    public final EObject entryRulePackaging() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackaging = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:714:2: (iv_rulePackaging= rulePackaging EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:715:2: iv_rulePackaging= rulePackaging EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackagingRule()); 
            }
            pushFollow(FOLLOW_rulePackaging_in_entryRulePackaging1348);
            iv_rulePackaging=rulePackaging();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackaging; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackaging1358); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackaging"


    // $ANTLR start "rulePackaging"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:722:1: rulePackaging returns [EObject current=null] : (otherlv_0= 'packaging' ( (lv_class_1_0= ruleJvmTypeReference ) ) (otherlv_2= 'options' ( (lv_options_3_0= ruleOption ) )* )? ) ;
    public final EObject rulePackaging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_class_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:725:28: ( (otherlv_0= 'packaging' ( (lv_class_1_0= ruleJvmTypeReference ) ) (otherlv_2= 'options' ( (lv_options_3_0= ruleOption ) )* )? ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:726:1: (otherlv_0= 'packaging' ( (lv_class_1_0= ruleJvmTypeReference ) ) (otherlv_2= 'options' ( (lv_options_3_0= ruleOption ) )* )? )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:726:1: (otherlv_0= 'packaging' ( (lv_class_1_0= ruleJvmTypeReference ) ) (otherlv_2= 'options' ( (lv_options_3_0= ruleOption ) )* )? )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:726:3: otherlv_0= 'packaging' ( (lv_class_1_0= ruleJvmTypeReference ) ) (otherlv_2= 'options' ( (lv_options_3_0= ruleOption ) )* )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePackaging1395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackagingAccess().getPackagingKeyword_0());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:730:1: ( (lv_class_1_0= ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:731:1: (lv_class_1_0= ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:731:1: (lv_class_1_0= ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:732:3: lv_class_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackagingAccess().getClassJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_rulePackaging1416);
            lv_class_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackagingRule());
              	        }
                     		set(
                     			current, 
                     			"class",
                      		lv_class_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:748:2: (otherlv_2= 'options' ( (lv_options_3_0= ruleOption ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:748:4: otherlv_2= 'options' ( (lv_options_3_0= ruleOption ) )*
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePackaging1429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPackagingAccess().getOptionsKeyword_2_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:752:1: ( (lv_options_3_0= ruleOption ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_STRING) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:753:1: (lv_options_3_0= ruleOption )
                    	    {
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:753:1: (lv_options_3_0= ruleOption )
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:754:3: lv_options_3_0= ruleOption
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPackagingAccess().getOptionsOptionParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOption_in_rulePackaging1450);
                    	    lv_options_3_0=ruleOption();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPackagingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"options",
                    	              		lv_options_3_0, 
                    	              		"Option");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackaging"


    // $ANTLR start "entryRuleVariable"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:778:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:779:2: (iv_ruleVariable= ruleVariable EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:780:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1489);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1499); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:787:1: ruleVariable returns [EObject current=null] : ( (otherlv_0= 'val' | ( (lv_isDynamic_1_0= 'var' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDynamic_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:790:28: ( ( (otherlv_0= 'val' | ( (lv_isDynamic_1_0= 'var' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:791:1: ( (otherlv_0= 'val' | ( (lv_isDynamic_1_0= 'var' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:791:1: ( (otherlv_0= 'val' | ( (lv_isDynamic_1_0= 'var' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:791:2: (otherlv_0= 'val' | ( (lv_isDynamic_1_0= 'var' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:791:2: (otherlv_0= 'val' | ( (lv_isDynamic_1_0= 'var' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            else if ( (LA21_0==31) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:791:4: otherlv_0= 'val'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleVariable1537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getValKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:796:6: ( (lv_isDynamic_1_0= 'var' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:796:6: ( (lv_isDynamic_1_0= 'var' ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:797:1: (lv_isDynamic_1_0= 'var' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:797:1: (lv_isDynamic_1_0= 'var' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:798:3: lv_isDynamic_1_0= 'var'
                    {
                    lv_isDynamic_1_0=(Token)match(input,31,FOLLOW_31_in_ruleVariable1561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDynamic_1_0, grammarAccess.getVariableAccess().getIsDynamicVarKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableRule());
                      	        }
                             		setWithLastConsumed(current, "isDynamic", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:811:3: ( (lv_name_2_0= RULE_ID ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:812:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:812:1: (lv_name_2_0= RULE_ID )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:813:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleVariable1609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:833:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:834:1: (lv_value_4_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:834:1: (lv_value_4_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:835:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable1626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_4_0, grammarAccess.getVariableAccess().getValueSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRulePack"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:859:1: entryRulePack returns [EObject current=null] : iv_rulePack= rulePack EOF ;
    public final EObject entryRulePack() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePack = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:860:2: (iv_rulePack= rulePack EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:861:2: iv_rulePack= rulePack EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackRule()); 
            }
            pushFollow(FOLLOW_rulePack_in_entryRulePack1667);
            iv_rulePack=rulePack();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePack; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePack1677); if (state.failed) return current;

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
    // $ANTLR end "entryRulePack"


    // $ANTLR start "rulePack"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:868:1: rulePack returns [EObject current=null] : (otherlv_0= 'pack' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_optional_3_0= 'optional' ) )? ( (lv_loose_4_0= 'loose' ) )? ( (lv_keep_5_0= 'keep' ) )? ( (otherlv_6= RULE_ID ) )? ( (lv_files_7_0= ruleFile ) )* (otherlv_8= 'on' ( (lv_os_9_0= ruleOS ) ) )? ) ;
    public final EObject rulePack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_label_2_0=null;
        Token lv_optional_3_0=null;
        Token lv_loose_4_0=null;
        Token lv_keep_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_files_7_0 = null;

        Enumerator lv_os_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:871:28: ( (otherlv_0= 'pack' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_optional_3_0= 'optional' ) )? ( (lv_loose_4_0= 'loose' ) )? ( (lv_keep_5_0= 'keep' ) )? ( (otherlv_6= RULE_ID ) )? ( (lv_files_7_0= ruleFile ) )* (otherlv_8= 'on' ( (lv_os_9_0= ruleOS ) ) )? ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:872:1: (otherlv_0= 'pack' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_optional_3_0= 'optional' ) )? ( (lv_loose_4_0= 'loose' ) )? ( (lv_keep_5_0= 'keep' ) )? ( (otherlv_6= RULE_ID ) )? ( (lv_files_7_0= ruleFile ) )* (otherlv_8= 'on' ( (lv_os_9_0= ruleOS ) ) )? )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:872:1: (otherlv_0= 'pack' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_optional_3_0= 'optional' ) )? ( (lv_loose_4_0= 'loose' ) )? ( (lv_keep_5_0= 'keep' ) )? ( (otherlv_6= RULE_ID ) )? ( (lv_files_7_0= ruleFile ) )* (otherlv_8= 'on' ( (lv_os_9_0= ruleOS ) ) )? )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:872:3: otherlv_0= 'pack' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_optional_3_0= 'optional' ) )? ( (lv_loose_4_0= 'loose' ) )? ( (lv_keep_5_0= 'keep' ) )? ( (otherlv_6= RULE_ID ) )? ( (lv_files_7_0= ruleFile ) )* (otherlv_8= 'on' ( (lv_os_9_0= ruleOS ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePack1714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackAccess().getPackKeyword_0());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:876:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:877:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:877:1: (lv_name_1_0= RULE_ID )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:878:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePack1731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPackAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPackRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:894:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:895:1: (lv_label_2_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:895:1: (lv_label_2_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:896:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePack1753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getPackAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPackRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:912:2: ( (lv_optional_3_0= 'optional' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:913:1: (lv_optional_3_0= 'optional' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:913:1: (lv_optional_3_0= 'optional' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:914:3: lv_optional_3_0= 'optional'
                    {
                    lv_optional_3_0=(Token)match(input,33,FOLLOW_33_in_rulePack1776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_3_0, grammarAccess.getPackAccess().getOptionalOptionalKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPackRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "optional");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:927:3: ( (lv_loose_4_0= 'loose' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:928:1: (lv_loose_4_0= 'loose' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:928:1: (lv_loose_4_0= 'loose' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:929:3: lv_loose_4_0= 'loose'
                    {
                    lv_loose_4_0=(Token)match(input,34,FOLLOW_34_in_rulePack1808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_loose_4_0, grammarAccess.getPackAccess().getLooseLooseKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPackRule());
                      	        }
                             		setWithLastConsumed(current, "loose", true, "loose");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:942:3: ( (lv_keep_5_0= 'keep' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:943:1: (lv_keep_5_0= 'keep' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:943:1: (lv_keep_5_0= 'keep' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:944:3: lv_keep_5_0= 'keep'
                    {
                    lv_keep_5_0=(Token)match(input,35,FOLLOW_35_in_rulePack1840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keep_5_0, grammarAccess.getPackAccess().getKeepKeepKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPackRule());
                      	        }
                             		setWithLastConsumed(current, "keep", true, "keep");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:957:3: ( (otherlv_6= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:958:1: (otherlv_6= RULE_ID )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:958:1: (otherlv_6= RULE_ID )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:959:3: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPackRule());
                      	        }
                              
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePack1874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_6, grammarAccess.getPackAccess().getParentPackCrossReference_6_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:970:3: ( (lv_files_7_0= ruleFile ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:971:1: (lv_files_7_0= ruleFile )
            	    {
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:971:1: (lv_files_7_0= ruleFile )
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:972:3: lv_files_7_0= ruleFile
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackAccess().getFilesFileParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFile_in_rulePack1896);
            	    lv_files_7_0=ruleFile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"files",
            	              		lv_files_7_0, 
            	              		"File");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:988:3: (otherlv_8= 'on' ( (lv_os_9_0= ruleOS ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:988:5: otherlv_8= 'on' ( (lv_os_9_0= ruleOS ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_rulePack1910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getPackAccess().getOnKeyword_8_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:992:1: ( (lv_os_9_0= ruleOS ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:993:1: (lv_os_9_0= ruleOS )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:993:1: (lv_os_9_0= ruleOS )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:994:3: lv_os_9_0= ruleOS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPackAccess().getOsOSEnumRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOS_in_rulePack1931);
                    lv_os_9_0=ruleOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPackRule());
                      	        }
                             		set(
                             			current, 
                             			"os",
                              		lv_os_9_0, 
                              		"OS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePack"


    // $ANTLR start "entryRuleFile"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1018:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1019:2: (iv_ruleFile= ruleFile EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1020:2: iv_ruleFile= ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile1969);
            iv_ruleFile=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile1979); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1027:1: ruleFile returns [EObject current=null] : ( ( (lv_path_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_STRING ) ) )? otherlv_3= 'to' ( (lv_destination_4_0= RULE_STRING ) ) (otherlv_5= 'override' ( (lv_override_6_0= ruleOverrideFlag ) ) )? ( ( ( 'on' ( ( ruleOS ) ) ) )=> (otherlv_7= 'on' ( (lv_os_8_0= ruleOS ) ) ) )? ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token lv_path_0_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token lv_destination_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_override_6_0 = null;

        Enumerator lv_os_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1030:28: ( ( ( (lv_path_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_STRING ) ) )? otherlv_3= 'to' ( (lv_destination_4_0= RULE_STRING ) ) (otherlv_5= 'override' ( (lv_override_6_0= ruleOverrideFlag ) ) )? ( ( ( 'on' ( ( ruleOS ) ) ) )=> (otherlv_7= 'on' ( (lv_os_8_0= ruleOS ) ) ) )? ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1031:1: ( ( (lv_path_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_STRING ) ) )? otherlv_3= 'to' ( (lv_destination_4_0= RULE_STRING ) ) (otherlv_5= 'override' ( (lv_override_6_0= ruleOverrideFlag ) ) )? ( ( ( 'on' ( ( ruleOS ) ) ) )=> (otherlv_7= 'on' ( (lv_os_8_0= ruleOS ) ) ) )? )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1031:1: ( ( (lv_path_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_STRING ) ) )? otherlv_3= 'to' ( (lv_destination_4_0= RULE_STRING ) ) (otherlv_5= 'override' ( (lv_override_6_0= ruleOverrideFlag ) ) )? ( ( ( 'on' ( ( ruleOS ) ) ) )=> (otherlv_7= 'on' ( (lv_os_8_0= ruleOS ) ) ) )? )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1031:2: ( (lv_path_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_STRING ) ) )? otherlv_3= 'to' ( (lv_destination_4_0= RULE_STRING ) ) (otherlv_5= 'override' ( (lv_override_6_0= ruleOverrideFlag ) ) )? ( ( ( 'on' ( ( ruleOS ) ) ) )=> (otherlv_7= 'on' ( (lv_os_8_0= ruleOS ) ) ) )?
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1031:2: ( (lv_path_0_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1032:1: (lv_path_0_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1032:1: (lv_path_0_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1033:3: lv_path_0_0= RULE_STRING
            {
            lv_path_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFile2021); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_path_0_0, grammarAccess.getFileAccess().getPathSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFileRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"path",
                      		lv_path_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1049:2: (otherlv_1= 'as' ( (lv_alias_2_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1049:4: otherlv_1= 'as' ( (lv_alias_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleFile2039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFileAccess().getAsKeyword_1_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1053:1: ( (lv_alias_2_0= RULE_STRING ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1054:1: (lv_alias_2_0= RULE_STRING )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1054:1: (lv_alias_2_0= RULE_STRING )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1055:3: lv_alias_2_0= RULE_STRING
                    {
                    lv_alias_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFile2056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_alias_2_0, grammarAccess.getFileAccess().getAliasSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFileRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"alias",
                              		lv_alias_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleFile2075); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFileAccess().getToKeyword_2());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1075:1: ( (lv_destination_4_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1076:1: (lv_destination_4_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1076:1: (lv_destination_4_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1077:3: lv_destination_4_0= RULE_STRING
            {
            lv_destination_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFile2092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_destination_4_0, grammarAccess.getFileAccess().getDestinationSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFileRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"destination",
                      		lv_destination_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1093:2: (otherlv_5= 'override' ( (lv_override_6_0= ruleOverrideFlag ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1093:4: otherlv_5= 'override' ( (lv_override_6_0= ruleOverrideFlag ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleFile2110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFileAccess().getOverrideKeyword_4_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1097:1: ( (lv_override_6_0= ruleOverrideFlag ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1098:1: (lv_override_6_0= ruleOverrideFlag )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1098:1: (lv_override_6_0= ruleOverrideFlag )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1099:3: lv_override_6_0= ruleOverrideFlag
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFileAccess().getOverrideOverrideFlagEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOverrideFlag_in_ruleFile2131);
                    lv_override_6_0=ruleOverrideFlag();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFileRule());
                      	        }
                             		set(
                             			current, 
                             			"override",
                              		lv_override_6_0, 
                              		"OverrideFlag");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1115:4: ( ( ( 'on' ( ( ruleOS ) ) ) )=> (otherlv_7= 'on' ( (lv_os_8_0= ruleOS ) ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                switch ( input.LA(2) ) {
                    case 79:
                        {
                        int LA30_3 = input.LA(3);

                        if ( (synpred1_InternalIzpack()) ) {
                            alt30=1;
                        }
                        }
                        break;
                    case 80:
                        {
                        int LA30_4 = input.LA(3);

                        if ( (synpred1_InternalIzpack()) ) {
                            alt30=1;
                        }
                        }
                        break;
                    case 81:
                        {
                        int LA30_5 = input.LA(3);

                        if ( (synpred1_InternalIzpack()) ) {
                            alt30=1;
                        }
                        }
                        break;
                    case 82:
                        {
                        int LA30_6 = input.LA(3);

                        if ( (synpred1_InternalIzpack()) ) {
                            alt30=1;
                        }
                        }
                        break;
                }

            }
            switch (alt30) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1115:5: ( ( 'on' ( ( ruleOS ) ) ) )=> (otherlv_7= 'on' ( (lv_os_8_0= ruleOS ) ) )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1120:6: (otherlv_7= 'on' ( (lv_os_8_0= ruleOS ) ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1120:8: otherlv_7= 'on' ( (lv_os_8_0= ruleOS ) )
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleFile2165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFileAccess().getOnKeyword_5_0_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1124:1: ( (lv_os_8_0= ruleOS ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1125:1: (lv_os_8_0= ruleOS )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1125:1: (lv_os_8_0= ruleOS )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1126:3: lv_os_8_0= ruleOS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFileAccess().getOsOSEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOS_in_ruleFile2186);
                    lv_os_8_0=ruleOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFileRule());
                      	        }
                             		set(
                             			current, 
                             			"os",
                              		lv_os_8_0, 
                              		"OS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRulePanel"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1150:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1151:2: (iv_rulePanel= rulePanel EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1152:2: iv_rulePanel= rulePanel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPanelRule()); 
            }
            pushFollow(FOLLOW_rulePanel_in_entryRulePanel2225);
            iv_rulePanel=rulePanel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePanel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePanel2235); if (state.failed) return current;

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
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1159:1: rulePanel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_classname_1_0= ruleJvmTypeReference ) ) ( (lv_jar_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_jar_2_0=null;
        EObject lv_classname_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1162:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_classname_1_0= ruleJvmTypeReference ) ) ( (lv_jar_2_0= RULE_STRING ) ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1163:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_classname_1_0= ruleJvmTypeReference ) ) ( (lv_jar_2_0= RULE_STRING ) ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1163:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_classname_1_0= ruleJvmTypeReference ) ) ( (lv_jar_2_0= RULE_STRING ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1163:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_classname_1_0= ruleJvmTypeReference ) ) ( (lv_jar_2_0= RULE_STRING ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1163:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1164:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1164:1: (lv_name_0_0= RULE_ID )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1165:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePanel2277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPanelAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPanelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1181:2: ( (lv_classname_1_0= ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1182:1: (lv_classname_1_0= ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1182:1: (lv_classname_1_0= ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1183:3: lv_classname_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPanelAccess().getClassnameJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_rulePanel2303);
            lv_classname_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPanelRule());
              	        }
                     		set(
                     			current, 
                     			"classname",
                      		lv_classname_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1199:2: ( (lv_jar_2_0= RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1200:1: (lv_jar_2_0= RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1200:1: (lv_jar_2_0= RULE_STRING )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1201:3: lv_jar_2_0= RULE_STRING
            {
            lv_jar_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePanel2320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_jar_2_0, grammarAccess.getPanelAccess().getJarSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPanelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"jar",
                      		lv_jar_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1225:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1226:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1227:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference2361);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference2371); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1234:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1237:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1238:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1238:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==42||LA32_0==45) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1238:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1238:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1239:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference2419);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1247:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==40) && (synpred2_InternalIzpack())) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1247:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1250:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1250:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1250:6: ()
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1251:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleJvmTypeReference2457); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleJvmTypeReference2469); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1266:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference2501);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1282:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1283:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1284:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef2536);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef2546); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1291:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1294:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1295:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1295:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1295:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1295:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1295:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef2584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1299:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==42||LA34_0==45) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1299:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1299:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1300:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1300:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1301:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef2606);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1317:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==43) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1317:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef2619); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1321:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1322:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1322:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1323:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef2640);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef2656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef2670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1347:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1348:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1348:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1349:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef2691);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1373:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1374:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1375:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference2727);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference2737); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1382:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1385:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1386:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1386:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1386:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1386:2: ( ( ruleQualifiedName ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1387:1: ( ruleQualifiedName )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1387:1: ( ruleQualifiedName )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1388:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference2785);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1401:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) && (synpred3_InternalIzpack())) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1401:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1401:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1401:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleJvmParameterizedTypeReference2806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1406:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1407:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1407:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1408:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference2828);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1424:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==43) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1424:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleJvmParameterizedTypeReference2841); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1428:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1429:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1429:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1430:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference2862);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleJvmParameterizedTypeReference2876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1458:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1459:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1460:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference2914);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference2924); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1467:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1470:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1471:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1471:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==42||LA38_0==45) ) {
                alt38=1;
            }
            else if ( (LA38_0==48) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1472:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference2971);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1482:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference2998);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1498:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1499:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1500:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference3033);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference3043); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1507:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1510:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1511:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1511:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1511:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1511:2: ()
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1512:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleJvmWildcardTypeReference3089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1521:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            else if ( (LA39_0==51) ) {
                alt39=2;
            }
            switch (alt39) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1521:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1521:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1522:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1522:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1523:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference3111);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1540:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1540:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1541:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1541:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1542:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference3138);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1566:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1567:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1568:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound3176);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound3186); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1575:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1578:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1579:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1579:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1579:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleJvmUpperBound3223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1583:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1584:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1584:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1585:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound3244);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1609:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1610:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1611:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded3280);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded3290); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1618:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1621:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1622:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1622:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1622:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleJvmUpperBoundAnded3327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1626:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1627:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1627:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1628:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded3348);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1652:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1653:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1654:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound3384);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound3394); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1661:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1664:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1665:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1665:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1665:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleJvmLowerBound3431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1669:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1670:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1670:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1671:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound3452);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1697:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1698:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1699:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3491);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3502); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1706:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1709:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1710:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1710:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1711:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName3549);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1721:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==52) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1722:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,52,FOLLOW_52_in_ruleQualifiedName3568); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName3590);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1746:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1747:2: (iv_ruleValidID= ruleValidID EOF )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1748:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID3638);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID3649); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1755:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1758:28: (this_ID_0= RULE_ID )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1759:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID3688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleISO3Code"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1774:1: ruleISO3Code returns [Enumerator current=null] : ( (enumLiteral_0= 'Catalunyan' ) | (enumLiteral_1= 'Chinese' ) | (enumLiteral_2= 'Czech' ) | (enumLiteral_3= 'Danish' ) | (enumLiteral_4= 'Galician' ) | (enumLiteral_5= 'German' ) | (enumLiteral_6= 'English' ) | (enumLiteral_7= 'Basque' ) | (enumLiteral_8= 'Finnish' ) | (enumLiteral_9= 'French' ) | (enumLiteral_10= 'Hungarian' ) | (enumLiteral_11= 'Italian' ) | (enumLiteral_12= 'Japanese' ) | (enumLiteral_13= 'Malaysian' ) | (enumLiteral_14= 'Nederlands' ) | (enumLiteral_15= 'Norwegian' ) | (enumLiteral_16= 'Polnish' ) | (enumLiteral_17= 'Portuguese (Brazilian)' ) | (enumLiteral_18= 'Portuguese (European)' ) | (enumLiteral_19= 'Romanian' ) | (enumLiteral_20= 'Russian' ) | (enumLiteral_21= 'Serbian' ) | (enumLiteral_22= 'Spanish' ) | (enumLiteral_23= 'Slovakian' ) | (enumLiteral_24= 'Swedish' ) | (enumLiteral_25= 'Ukrainian' ) ) ;
    public final Enumerator ruleISO3Code() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;

         enterRule(); 
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1776:28: ( ( (enumLiteral_0= 'Catalunyan' ) | (enumLiteral_1= 'Chinese' ) | (enumLiteral_2= 'Czech' ) | (enumLiteral_3= 'Danish' ) | (enumLiteral_4= 'Galician' ) | (enumLiteral_5= 'German' ) | (enumLiteral_6= 'English' ) | (enumLiteral_7= 'Basque' ) | (enumLiteral_8= 'Finnish' ) | (enumLiteral_9= 'French' ) | (enumLiteral_10= 'Hungarian' ) | (enumLiteral_11= 'Italian' ) | (enumLiteral_12= 'Japanese' ) | (enumLiteral_13= 'Malaysian' ) | (enumLiteral_14= 'Nederlands' ) | (enumLiteral_15= 'Norwegian' ) | (enumLiteral_16= 'Polnish' ) | (enumLiteral_17= 'Portuguese (Brazilian)' ) | (enumLiteral_18= 'Portuguese (European)' ) | (enumLiteral_19= 'Romanian' ) | (enumLiteral_20= 'Russian' ) | (enumLiteral_21= 'Serbian' ) | (enumLiteral_22= 'Spanish' ) | (enumLiteral_23= 'Slovakian' ) | (enumLiteral_24= 'Swedish' ) | (enumLiteral_25= 'Ukrainian' ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1777:1: ( (enumLiteral_0= 'Catalunyan' ) | (enumLiteral_1= 'Chinese' ) | (enumLiteral_2= 'Czech' ) | (enumLiteral_3= 'Danish' ) | (enumLiteral_4= 'Galician' ) | (enumLiteral_5= 'German' ) | (enumLiteral_6= 'English' ) | (enumLiteral_7= 'Basque' ) | (enumLiteral_8= 'Finnish' ) | (enumLiteral_9= 'French' ) | (enumLiteral_10= 'Hungarian' ) | (enumLiteral_11= 'Italian' ) | (enumLiteral_12= 'Japanese' ) | (enumLiteral_13= 'Malaysian' ) | (enumLiteral_14= 'Nederlands' ) | (enumLiteral_15= 'Norwegian' ) | (enumLiteral_16= 'Polnish' ) | (enumLiteral_17= 'Portuguese (Brazilian)' ) | (enumLiteral_18= 'Portuguese (European)' ) | (enumLiteral_19= 'Romanian' ) | (enumLiteral_20= 'Russian' ) | (enumLiteral_21= 'Serbian' ) | (enumLiteral_22= 'Spanish' ) | (enumLiteral_23= 'Slovakian' ) | (enumLiteral_24= 'Swedish' ) | (enumLiteral_25= 'Ukrainian' ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1777:1: ( (enumLiteral_0= 'Catalunyan' ) | (enumLiteral_1= 'Chinese' ) | (enumLiteral_2= 'Czech' ) | (enumLiteral_3= 'Danish' ) | (enumLiteral_4= 'Galician' ) | (enumLiteral_5= 'German' ) | (enumLiteral_6= 'English' ) | (enumLiteral_7= 'Basque' ) | (enumLiteral_8= 'Finnish' ) | (enumLiteral_9= 'French' ) | (enumLiteral_10= 'Hungarian' ) | (enumLiteral_11= 'Italian' ) | (enumLiteral_12= 'Japanese' ) | (enumLiteral_13= 'Malaysian' ) | (enumLiteral_14= 'Nederlands' ) | (enumLiteral_15= 'Norwegian' ) | (enumLiteral_16= 'Polnish' ) | (enumLiteral_17= 'Portuguese (Brazilian)' ) | (enumLiteral_18= 'Portuguese (European)' ) | (enumLiteral_19= 'Romanian' ) | (enumLiteral_20= 'Russian' ) | (enumLiteral_21= 'Serbian' ) | (enumLiteral_22= 'Spanish' ) | (enumLiteral_23= 'Slovakian' ) | (enumLiteral_24= 'Swedish' ) | (enumLiteral_25= 'Ukrainian' ) )
            int alt41=26;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt41=1;
                }
                break;
            case 54:
                {
                alt41=2;
                }
                break;
            case 55:
                {
                alt41=3;
                }
                break;
            case 56:
                {
                alt41=4;
                }
                break;
            case 57:
                {
                alt41=5;
                }
                break;
            case 58:
                {
                alt41=6;
                }
                break;
            case 59:
                {
                alt41=7;
                }
                break;
            case 60:
                {
                alt41=8;
                }
                break;
            case 61:
                {
                alt41=9;
                }
                break;
            case 62:
                {
                alt41=10;
                }
                break;
            case 63:
                {
                alt41=11;
                }
                break;
            case 64:
                {
                alt41=12;
                }
                break;
            case 65:
                {
                alt41=13;
                }
                break;
            case 66:
                {
                alt41=14;
                }
                break;
            case 67:
                {
                alt41=15;
                }
                break;
            case 68:
                {
                alt41=16;
                }
                break;
            case 69:
                {
                alt41=17;
                }
                break;
            case 70:
                {
                alt41=18;
                }
                break;
            case 71:
                {
                alt41=19;
                }
                break;
            case 72:
                {
                alt41=20;
                }
                break;
            case 73:
                {
                alt41=21;
                }
                break;
            case 74:
                {
                alt41=22;
                }
                break;
            case 75:
                {
                alt41=23;
                }
                break;
            case 76:
                {
                alt41=24;
                }
                break;
            case 77:
                {
                alt41=25;
                }
                break;
            case 78:
                {
                alt41=26;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1777:2: (enumLiteral_0= 'Catalunyan' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1777:2: (enumLiteral_0= 'Catalunyan' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1777:4: enumLiteral_0= 'Catalunyan'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleISO3Code3746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getCatEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getISO3CodeAccess().getCatEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1783:6: (enumLiteral_1= 'Chinese' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1783:6: (enumLiteral_1= 'Chinese' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1783:8: enumLiteral_1= 'Chinese'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleISO3Code3763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getChnEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getISO3CodeAccess().getChnEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1789:6: (enumLiteral_2= 'Czech' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1789:6: (enumLiteral_2= 'Czech' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1789:8: enumLiteral_2= 'Czech'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_ruleISO3Code3780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getCzeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getISO3CodeAccess().getCzeEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1795:6: (enumLiteral_3= 'Danish' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1795:6: (enumLiteral_3= 'Danish' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1795:8: enumLiteral_3= 'Danish'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_56_in_ruleISO3Code3797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getDanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getISO3CodeAccess().getDanEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1801:6: (enumLiteral_4= 'Galician' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1801:6: (enumLiteral_4= 'Galician' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1801:8: enumLiteral_4= 'Galician'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_57_in_ruleISO3Code3814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getGlgEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getISO3CodeAccess().getGlgEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1807:6: (enumLiteral_5= 'German' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1807:6: (enumLiteral_5= 'German' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1807:8: enumLiteral_5= 'German'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_58_in_ruleISO3Code3831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getDeuEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getISO3CodeAccess().getDeuEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1813:6: (enumLiteral_6= 'English' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1813:6: (enumLiteral_6= 'English' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1813:8: enumLiteral_6= 'English'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_59_in_ruleISO3Code3848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getEngEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getISO3CodeAccess().getEngEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1819:6: (enumLiteral_7= 'Basque' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1819:6: (enumLiteral_7= 'Basque' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1819:8: enumLiteral_7= 'Basque'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_60_in_ruleISO3Code3865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getEusEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getISO3CodeAccess().getEusEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1825:6: (enumLiteral_8= 'Finnish' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1825:6: (enumLiteral_8= 'Finnish' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1825:8: enumLiteral_8= 'Finnish'
                    {
                    enumLiteral_8=(Token)match(input,61,FOLLOW_61_in_ruleISO3Code3882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getFinEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getISO3CodeAccess().getFinEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1831:6: (enumLiteral_9= 'French' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1831:6: (enumLiteral_9= 'French' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1831:8: enumLiteral_9= 'French'
                    {
                    enumLiteral_9=(Token)match(input,62,FOLLOW_62_in_ruleISO3Code3899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getFraEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getISO3CodeAccess().getFraEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1837:6: (enumLiteral_10= 'Hungarian' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1837:6: (enumLiteral_10= 'Hungarian' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1837:8: enumLiteral_10= 'Hungarian'
                    {
                    enumLiteral_10=(Token)match(input,63,FOLLOW_63_in_ruleISO3Code3916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getHunEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getISO3CodeAccess().getHunEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1843:6: (enumLiteral_11= 'Italian' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1843:6: (enumLiteral_11= 'Italian' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1843:8: enumLiteral_11= 'Italian'
                    {
                    enumLiteral_11=(Token)match(input,64,FOLLOW_64_in_ruleISO3Code3933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getItaEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getISO3CodeAccess().getItaEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1849:6: (enumLiteral_12= 'Japanese' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1849:6: (enumLiteral_12= 'Japanese' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1849:8: enumLiteral_12= 'Japanese'
                    {
                    enumLiteral_12=(Token)match(input,65,FOLLOW_65_in_ruleISO3Code3950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getJpnEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getISO3CodeAccess().getJpnEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1855:6: (enumLiteral_13= 'Malaysian' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1855:6: (enumLiteral_13= 'Malaysian' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1855:8: enumLiteral_13= 'Malaysian'
                    {
                    enumLiteral_13=(Token)match(input,66,FOLLOW_66_in_ruleISO3Code3967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getMysEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getISO3CodeAccess().getMysEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1861:6: (enumLiteral_14= 'Nederlands' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1861:6: (enumLiteral_14= 'Nederlands' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1861:8: enumLiteral_14= 'Nederlands'
                    {
                    enumLiteral_14=(Token)match(input,67,FOLLOW_67_in_ruleISO3Code3984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getNedEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getISO3CodeAccess().getNedEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1867:6: (enumLiteral_15= 'Norwegian' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1867:6: (enumLiteral_15= 'Norwegian' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1867:8: enumLiteral_15= 'Norwegian'
                    {
                    enumLiteral_15=(Token)match(input,68,FOLLOW_68_in_ruleISO3Code4001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getNorEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getISO3CodeAccess().getNorEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1873:6: (enumLiteral_16= 'Polnish' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1873:6: (enumLiteral_16= 'Polnish' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1873:8: enumLiteral_16= 'Polnish'
                    {
                    enumLiteral_16=(Token)match(input,69,FOLLOW_69_in_ruleISO3Code4018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getPolEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getISO3CodeAccess().getPolEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1879:6: (enumLiteral_17= 'Portuguese (Brazilian)' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1879:6: (enumLiteral_17= 'Portuguese (Brazilian)' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1879:8: enumLiteral_17= 'Portuguese (Brazilian)'
                    {
                    enumLiteral_17=(Token)match(input,70,FOLLOW_70_in_ruleISO3Code4035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getPorEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getISO3CodeAccess().getPorEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1885:6: (enumLiteral_18= 'Portuguese (European)' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1885:6: (enumLiteral_18= 'Portuguese (European)' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1885:8: enumLiteral_18= 'Portuguese (European)'
                    {
                    enumLiteral_18=(Token)match(input,71,FOLLOW_71_in_ruleISO3Code4052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getPrtEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getISO3CodeAccess().getPrtEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1891:6: (enumLiteral_19= 'Romanian' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1891:6: (enumLiteral_19= 'Romanian' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1891:8: enumLiteral_19= 'Romanian'
                    {
                    enumLiteral_19=(Token)match(input,72,FOLLOW_72_in_ruleISO3Code4069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getRomEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getISO3CodeAccess().getRomEnumLiteralDeclaration_19()); 
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1897:6: (enumLiteral_20= 'Russian' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1897:6: (enumLiteral_20= 'Russian' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1897:8: enumLiteral_20= 'Russian'
                    {
                    enumLiteral_20=(Token)match(input,73,FOLLOW_73_in_ruleISO3Code4086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getRusEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_20, grammarAccess.getISO3CodeAccess().getRusEnumLiteralDeclaration_20()); 
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1903:6: (enumLiteral_21= 'Serbian' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1903:6: (enumLiteral_21= 'Serbian' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1903:8: enumLiteral_21= 'Serbian'
                    {
                    enumLiteral_21=(Token)match(input,74,FOLLOW_74_in_ruleISO3Code4103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getScgEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_21, grammarAccess.getISO3CodeAccess().getScgEnumLiteralDeclaration_21()); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1909:6: (enumLiteral_22= 'Spanish' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1909:6: (enumLiteral_22= 'Spanish' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1909:8: enumLiteral_22= 'Spanish'
                    {
                    enumLiteral_22=(Token)match(input,75,FOLLOW_75_in_ruleISO3Code4120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getSpaEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_22, grammarAccess.getISO3CodeAccess().getSpaEnumLiteralDeclaration_22()); 
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1915:6: (enumLiteral_23= 'Slovakian' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1915:6: (enumLiteral_23= 'Slovakian' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1915:8: enumLiteral_23= 'Slovakian'
                    {
                    enumLiteral_23=(Token)match(input,76,FOLLOW_76_in_ruleISO3Code4137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getSvkEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_23, grammarAccess.getISO3CodeAccess().getSvkEnumLiteralDeclaration_23()); 
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1921:6: (enumLiteral_24= 'Swedish' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1921:6: (enumLiteral_24= 'Swedish' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1921:8: enumLiteral_24= 'Swedish'
                    {
                    enumLiteral_24=(Token)match(input,77,FOLLOW_77_in_ruleISO3Code4154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getSweEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_24, grammarAccess.getISO3CodeAccess().getSweEnumLiteralDeclaration_24()); 
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1927:6: (enumLiteral_25= 'Ukrainian' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1927:6: (enumLiteral_25= 'Ukrainian' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1927:8: enumLiteral_25= 'Ukrainian'
                    {
                    enumLiteral_25=(Token)match(input,78,FOLLOW_78_in_ruleISO3Code4171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getISO3CodeAccess().getUkrEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_25, grammarAccess.getISO3CodeAccess().getUkrEnumLiteralDeclaration_25()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleISO3Code"


    // $ANTLR start "ruleOS"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1937:1: ruleOS returns [Enumerator current=null] : ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'unix' ) | (enumLiteral_2= 'windows' ) | (enumLiteral_3= 'mac' ) ) ;
    public final Enumerator ruleOS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1939:28: ( ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'unix' ) | (enumLiteral_2= 'windows' ) | (enumLiteral_3= 'mac' ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1940:1: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'unix' ) | (enumLiteral_2= 'windows' ) | (enumLiteral_3= 'mac' ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1940:1: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'unix' ) | (enumLiteral_2= 'windows' ) | (enumLiteral_3= 'mac' ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt42=1;
                }
                break;
            case 80:
                {
                alt42=2;
                }
                break;
            case 81:
                {
                alt42=3;
                }
                break;
            case 82:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1940:2: (enumLiteral_0= 'all' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1940:2: (enumLiteral_0= 'all' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1940:4: enumLiteral_0= 'all'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_79_in_ruleOS4216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOSAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOSAccess().getALLEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1946:6: (enumLiteral_1= 'unix' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1946:6: (enumLiteral_1= 'unix' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1946:8: enumLiteral_1= 'unix'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_80_in_ruleOS4233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOSAccess().getUNIXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOSAccess().getUNIXEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1952:6: (enumLiteral_2= 'windows' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1952:6: (enumLiteral_2= 'windows' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1952:8: enumLiteral_2= 'windows'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_81_in_ruleOS4250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOSAccess().getWINDOWSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOSAccess().getWINDOWSEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1958:6: (enumLiteral_3= 'mac' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1958:6: (enumLiteral_3= 'mac' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1958:8: enumLiteral_3= 'mac'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_82_in_ruleOS4267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOSAccess().getMACEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOSAccess().getMACEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOS"


    // $ANTLR start "ruleOverrideFlag"
    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1968:1: ruleOverrideFlag returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'asktrue' ) | (enumLiteral_3= 'askfalse' ) | (enumLiteral_4= 'update' ) ) ;
    public final Enumerator ruleOverrideFlag() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1970:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'asktrue' ) | (enumLiteral_3= 'askfalse' ) | (enumLiteral_4= 'update' ) ) )
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1971:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'asktrue' ) | (enumLiteral_3= 'askfalse' ) | (enumLiteral_4= 'update' ) )
            {
            // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1971:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'asktrue' ) | (enumLiteral_3= 'askfalse' ) | (enumLiteral_4= 'update' ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt43=1;
                }
                break;
            case 84:
                {
                alt43=2;
                }
                break;
            case 85:
                {
                alt43=3;
                }
                break;
            case 86:
                {
                alt43=4;
                }
                break;
            case 87:
                {
                alt43=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1971:2: (enumLiteral_0= 'true' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1971:2: (enumLiteral_0= 'true' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1971:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleOverrideFlag4312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOverrideFlagAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOverrideFlagAccess().getTRUEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1977:6: (enumLiteral_1= 'false' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1977:6: (enumLiteral_1= 'false' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1977:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleOverrideFlag4329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOverrideFlagAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOverrideFlagAccess().getFALSEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1983:6: (enumLiteral_2= 'asktrue' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1983:6: (enumLiteral_2= 'asktrue' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1983:8: enumLiteral_2= 'asktrue'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_85_in_ruleOverrideFlag4346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOverrideFlagAccess().getASKTRUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOverrideFlagAccess().getASKTRUEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1989:6: (enumLiteral_3= 'askfalse' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1989:6: (enumLiteral_3= 'askfalse' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1989:8: enumLiteral_3= 'askfalse'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_86_in_ruleOverrideFlag4363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOverrideFlagAccess().getASKFALSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOverrideFlagAccess().getASKFALSEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1995:6: (enumLiteral_4= 'update' )
                    {
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1995:6: (enumLiteral_4= 'update' )
                    // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1995:8: enumLiteral_4= 'update'
                    {
                    enumLiteral_4=(Token)match(input,87,FOLLOW_87_in_ruleOverrideFlag4380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOverrideFlagAccess().getUpdateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOverrideFlagAccess().getUpdateEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOverrideFlag"

    // $ANTLR start synpred1_InternalIzpack
    public final void synpred1_InternalIzpack_fragment() throws RecognitionException {   
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1115:5: ( ( 'on' ( ( ruleOS ) ) ) )
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1115:6: ( 'on' ( ( ruleOS ) ) )
        {
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1115:6: ( 'on' ( ( ruleOS ) ) )
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1115:8: 'on' ( ( ruleOS ) )
        {
        match(input,36,FOLLOW_36_in_synpred1_InternalIzpack2146); if (state.failed) return ;
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1116:1: ( ( ruleOS ) )
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1117:1: ( ruleOS )
        {
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1117:1: ( ruleOS )
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1118:1: ruleOS
        {
        pushFollow(FOLLOW_ruleOS_in_synpred1_InternalIzpack2153);
        ruleOS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalIzpack

    // $ANTLR start synpred2_InternalIzpack
    public final void synpred2_InternalIzpack_fragment() throws RecognitionException {   
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1247:2: ( ( () '[' ']' ) )
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1247:3: ( () '[' ']' )
        {
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1247:3: ( () '[' ']' )
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1247:4: () '[' ']'
        {
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1247:4: ()
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1248:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred2_InternalIzpack2434); if (state.failed) return ;
        match(input,41,FOLLOW_41_in_synpred2_InternalIzpack2438); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalIzpack

    // $ANTLR start synpred3_InternalIzpack
    public final void synpred3_InternalIzpack_fragment() throws RecognitionException {   
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1401:4: ( '<' )
        // ../com.devoxx2012.xtext.izpack/src-gen/com/devoxx2012/xtext/parser/antlr/internal/InternalIzpack.g:1401:6: '<'
        {
        match(input,46,FOLLOW_46_in_synpred3_InternalIzpack2798); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalIzpack

    // Delegated rules

    public final boolean synpred2_InternalIzpack() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalIzpack_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalIzpack() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalIzpack_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalIzpack() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalIzpack_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleInstaller_in_entryRuleInstaller75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstaller85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInstaller122 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleIdentification_in_ruleInstaller143 = new BitSet(new long[]{0x00000001D0017000L});
    public static final BitSet FOLLOW_12_in_ruleInstaller156 = new BitSet(new long[]{0x00000001D0017010L});
    public static final BitSet FOLLOW_ruleAuthor_in_ruleInstaller177 = new BitSet(new long[]{0x00000001D0017010L});
    public static final BitSet FOLLOW_13_in_ruleInstaller193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleInstaller214 = new BitSet(new long[]{0x00000001D0017000L});
    public static final BitSet FOLLOW_14_in_ruleInstaller229 = new BitSet(new long[]{0x00000001D601F000L});
    public static final BitSet FOLLOW_15_in_ruleInstaller242 = new BitSet(new long[]{0x00000001D0017000L});
    public static final BitSet FOLLOW_ruleUninstall_in_ruleInstaller269 = new BitSet(new long[]{0x00000001D0017000L});
    public static final BitSet FOLLOW_16_in_ruleInstaller285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInstaller302 = new BitSet(new long[]{0x00000001D0037000L});
    public static final BitSet FOLLOW_17_in_ruleInstaller325 = new BitSet(new long[]{0x00000001D0017000L});
    public static final BitSet FOLLOW_rulePackaging_in_ruleInstaller362 = new BitSet(new long[]{0x00000001D0017000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInstaller384 = new BitSet(new long[]{0x00000001D0017000L});
    public static final BitSet FOLLOW_rulePack_in_ruleInstaller406 = new BitSet(new long[]{0x00000001D0097000L});
    public static final BitSet FOLLOW_ruleLocale_in_ruleInstaller428 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInstaller440 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePanel_in_ruleInstaller461 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleLocale_in_entryRuleLocale498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocale508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleLocale545 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_ruleISO3Code_in_ruleLocale566 = new BitSet(new long[]{0xFFE0000000000002L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_ruleIdentification_in_entryRuleIdentification603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentification613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleIdentification650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdentification667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdentification689 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleIdentification707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdentification724 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleIdentification744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdentification761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthor_in_entryRuleAuthor804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthor814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAuthor856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAuthor878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint971 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleConstraint994 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleConstraint1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUninstall_in_entryRuleUninstall1076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUninstall1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUninstall1124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUninstall1141 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleUninstall1161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUninstall1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOption1273 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOption1290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOption1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackaging_in_entryRulePackaging1348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackaging1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePackaging1395 = new BitSet(new long[]{0x0000240000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rulePackaging1416 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePackaging1429 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleOption_in_rulePackaging1450 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVariable1537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31_in_ruleVariable1561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1592 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleVariable1609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePack_in_entryRulePack1667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePack1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePack1714 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePack1731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePack1753 = new BitSet(new long[]{0x0000001E00000032L});
    public static final BitSet FOLLOW_33_in_rulePack1776 = new BitSet(new long[]{0x0000001C00000032L});
    public static final BitSet FOLLOW_34_in_rulePack1808 = new BitSet(new long[]{0x0000001800000032L});
    public static final BitSet FOLLOW_35_in_rulePack1840 = new BitSet(new long[]{0x0000001000000032L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePack1874 = new BitSet(new long[]{0x0000001000000012L});
    public static final BitSet FOLLOW_ruleFile_in_rulePack1896 = new BitSet(new long[]{0x0000001000000012L});
    public static final BitSet FOLLOW_36_in_rulePack1910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleOS_in_rulePack1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFile2021 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_ruleFile2039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFile2056 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFile2075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFile2092 = new BitSet(new long[]{0x0000009000000002L});
    public static final BitSet FOLLOW_39_in_ruleFile2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_ruleOverrideFlag_in_ruleFile2131 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleFile2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleOS_in_ruleFile2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePanel_in_entryRulePanel2225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePanel2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePanel2277 = new BitSet(new long[]{0x0000240000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rulePanel2303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePanel2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference2361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference2419 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleJvmTypeReference2457 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleJvmTypeReference2469 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef2536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef2584 = new BitSet(new long[]{0x0000340000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef2606 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef2619 = new BitSet(new long[]{0x0000240000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef2640 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef2656 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef2670 = new BitSet(new long[]{0x0000240000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference2727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference2785 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleJvmParameterizedTypeReference2806 = new BitSet(new long[]{0x0001240000000020L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference2828 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleJvmParameterizedTypeReference2841 = new BitSet(new long[]{0x0001240000000020L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference2862 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleJvmParameterizedTypeReference2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference2914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference3033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleJvmWildcardTypeReference3089 = new BitSet(new long[]{0x000A000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound3176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleJvmUpperBound3223 = new BitSet(new long[]{0x0000240000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded3280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleJvmUpperBoundAnded3327 = new BitSet(new long[]{0x0000240000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound3384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleJvmLowerBound3431 = new BitSet(new long[]{0x0000240000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName3549 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleQualifiedName3568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName3590 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID3638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleISO3Code3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleISO3Code3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleISO3Code3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleISO3Code3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleISO3Code3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleISO3Code3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleISO3Code3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleISO3Code3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleISO3Code3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleISO3Code3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleISO3Code3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleISO3Code3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleISO3Code3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleISO3Code3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleISO3Code3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleISO3Code4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleISO3Code4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleISO3Code4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleISO3Code4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleISO3Code4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleISO3Code4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleISO3Code4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleISO3Code4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleISO3Code4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleISO3Code4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleISO3Code4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOS4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOS4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOS4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOS4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOverrideFlag4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOverrideFlag4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOverrideFlag4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOverrideFlag4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOverrideFlag4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred1_InternalIzpack2146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleOS_in_synpred1_InternalIzpack2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred2_InternalIzpack2434 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred2_InternalIzpack2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred3_InternalIzpack2798 = new BitSet(new long[]{0x0000000000000002L});

}