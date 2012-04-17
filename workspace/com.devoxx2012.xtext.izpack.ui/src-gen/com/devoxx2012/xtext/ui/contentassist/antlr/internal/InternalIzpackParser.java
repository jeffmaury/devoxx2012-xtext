package com.devoxx2012.xtext.ui.contentassist.antlr.internal; 

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
import com.devoxx2012.xtext.services.IzpackGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIzpackParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'no'", "'val'", "'Catalunyan'", "'Chinese'", "'Czech'", "'Danish'", "'Galician'", "'German'", "'English'", "'Basque'", "'Finnish'", "'French'", "'Hungarian'", "'Italian'", "'Japanese'", "'Malaysian'", "'Nederlands'", "'Norwegian'", "'Polnish'", "'Portuguese (Brazilian)'", "'Portuguese (European)'", "'Romanian'", "'Russian'", "'Serbian'", "'Spanish'", "'Slovakian'", "'Swedish'", "'Ukrainian'", "'all'", "'unix'", "'windows'", "'mac'", "'true'", "'false'", "'asktrue'", "'askfalse'", "'update'", "'installer'", "'display'", "'by'", "'constraints'", "'uninstall'", "'log on'", "'locale'", "'for'", "'site'", "'webroot'", "'named'", "'path'", "'='", "'packaging'", "'options'", "'pack'", "'on'", "'to'", "'as'", "'override'", "'['", "']'", "'=>'", "'('", "')'", "','", "'<'", "'>'", "'?'", "'extends'", "'&'", "'super'", "'.'", "'write installation info'", "'with jdk'", "'packed'", "'var'", "'optional'", "'loose'", "'keep'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g"; }


     
     	private IzpackGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IzpackGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleInstaller"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:61:1: entryRuleInstaller : ruleInstaller EOF ;
    public final void entryRuleInstaller() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:62:1: ( ruleInstaller EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:63:1: ruleInstaller EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerRule()); 
            }
            pushFollow(FOLLOW_ruleInstaller_in_entryRuleInstaller67);
            ruleInstaller();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstaller74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInstaller"


    // $ANTLR start "ruleInstaller"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:70:1: ruleInstaller : ( ( rule__Installer__Group__0 ) ) ;
    public final void ruleInstaller() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:74:2: ( ( ( rule__Installer__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:75:1: ( ( rule__Installer__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:75:1: ( ( rule__Installer__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:76:1: ( rule__Installer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:77:1: ( rule__Installer__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:77:2: rule__Installer__Group__0
            {
            pushFollow(FOLLOW_rule__Installer__Group__0_in_ruleInstaller100);
            rule__Installer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getGroup()); 
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
    // $ANTLR end "ruleInstaller"


    // $ANTLR start "entryRuleLocale"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:89:1: entryRuleLocale : ruleLocale EOF ;
    public final void entryRuleLocale() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:90:1: ( ruleLocale EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:91:1: ruleLocale EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleRule()); 
            }
            pushFollow(FOLLOW_ruleLocale_in_entryRuleLocale127);
            ruleLocale();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocale134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLocale"


    // $ANTLR start "ruleLocale"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:98:1: ruleLocale : ( ( rule__Locale__Group__0 ) ) ;
    public final void ruleLocale() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:102:2: ( ( ( rule__Locale__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:103:1: ( ( rule__Locale__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:103:1: ( ( rule__Locale__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:104:1: ( rule__Locale__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:105:1: ( rule__Locale__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:105:2: rule__Locale__Group__0
            {
            pushFollow(FOLLOW_rule__Locale__Group__0_in_ruleLocale160);
            rule__Locale__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getGroup()); 
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
    // $ANTLR end "ruleLocale"


    // $ANTLR start "entryRuleIdentification"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:117:1: entryRuleIdentification : ruleIdentification EOF ;
    public final void entryRuleIdentification() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:118:1: ( ruleIdentification EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:119:1: ruleIdentification EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationRule()); 
            }
            pushFollow(FOLLOW_ruleIdentification_in_entryRuleIdentification187);
            ruleIdentification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentification194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIdentification"


    // $ANTLR start "ruleIdentification"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:126:1: ruleIdentification : ( ( rule__Identification__Group__0 ) ) ;
    public final void ruleIdentification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:130:2: ( ( ( rule__Identification__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:131:1: ( ( rule__Identification__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:131:1: ( ( rule__Identification__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:132:1: ( rule__Identification__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:133:1: ( rule__Identification__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:133:2: rule__Identification__Group__0
            {
            pushFollow(FOLLOW_rule__Identification__Group__0_in_ruleIdentification220);
            rule__Identification__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getGroup()); 
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
    // $ANTLR end "ruleIdentification"


    // $ANTLR start "entryRuleAuthor"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:145:1: entryRuleAuthor : ruleAuthor EOF ;
    public final void entryRuleAuthor() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:146:1: ( ruleAuthor EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:147:1: ruleAuthor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorRule()); 
            }
            pushFollow(FOLLOW_ruleAuthor_in_entryRuleAuthor247);
            ruleAuthor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthor254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAuthor"


    // $ANTLR start "ruleAuthor"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:154:1: ruleAuthor : ( ( rule__Author__Group__0 ) ) ;
    public final void ruleAuthor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:158:2: ( ( ( rule__Author__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:159:1: ( ( rule__Author__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:159:1: ( ( rule__Author__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:160:1: ( rule__Author__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:161:1: ( rule__Author__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:161:2: rule__Author__Group__0
            {
            pushFollow(FOLLOW_rule__Author__Group__0_in_ruleAuthor280);
            rule__Author__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorAccess().getGroup()); 
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
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleConstraint"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:173:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:174:1: ( ruleConstraint EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:175:1: ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint307);
            ruleConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:182:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:186:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:187:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:187:1: ( ( rule__Constraint__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:188:1: ( rule__Constraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:189:1: ( rule__Constraint__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:189:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint340);
            rule__Constraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getGroup()); 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleUninstall"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:201:1: entryRuleUninstall : ruleUninstall EOF ;
    public final void entryRuleUninstall() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:202:1: ( ruleUninstall EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:203:1: ruleUninstall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUninstallRule()); 
            }
            pushFollow(FOLLOW_ruleUninstall_in_entryRuleUninstall367);
            ruleUninstall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUninstallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUninstall374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUninstall"


    // $ANTLR start "ruleUninstall"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:210:1: ruleUninstall : ( ( rule__Uninstall__Group__0 ) ) ;
    public final void ruleUninstall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:214:2: ( ( ( rule__Uninstall__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:215:1: ( ( rule__Uninstall__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:215:1: ( ( rule__Uninstall__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:216:1: ( rule__Uninstall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUninstallAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:217:1: ( rule__Uninstall__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:217:2: rule__Uninstall__Group__0
            {
            pushFollow(FOLLOW_rule__Uninstall__Group__0_in_ruleUninstall400);
            rule__Uninstall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUninstallAccess().getGroup()); 
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
    // $ANTLR end "ruleUninstall"


    // $ANTLR start "entryRuleOption"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:229:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:230:1: ( ruleOption EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:231:1: ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionRule()); 
            }
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption427);
            ruleOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:238:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:242:2: ( ( ( rule__Option__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:243:1: ( ( rule__Option__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:243:1: ( ( rule__Option__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:244:1: ( rule__Option__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:245:1: ( rule__Option__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:245:2: rule__Option__Group__0
            {
            pushFollow(FOLLOW_rule__Option__Group__0_in_ruleOption460);
            rule__Option__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getGroup()); 
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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRulePackaging"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:257:1: entryRulePackaging : rulePackaging EOF ;
    public final void entryRulePackaging() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:258:1: ( rulePackaging EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:259:1: rulePackaging EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackagingRule()); 
            }
            pushFollow(FOLLOW_rulePackaging_in_entryRulePackaging487);
            rulePackaging();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackagingRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackaging494); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackaging"


    // $ANTLR start "rulePackaging"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:266:1: rulePackaging : ( ( rule__Packaging__Group__0 ) ) ;
    public final void rulePackaging() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:270:2: ( ( ( rule__Packaging__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:271:1: ( ( rule__Packaging__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:271:1: ( ( rule__Packaging__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:272:1: ( rule__Packaging__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackagingAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:273:1: ( rule__Packaging__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:273:2: rule__Packaging__Group__0
            {
            pushFollow(FOLLOW_rule__Packaging__Group__0_in_rulePackaging520);
            rule__Packaging__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackagingAccess().getGroup()); 
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
    // $ANTLR end "rulePackaging"


    // $ANTLR start "entryRuleVariable"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:285:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:286:1: ( ruleVariable EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:287:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable547);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:294:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:298:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:299:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:299:1: ( ( rule__Variable__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:300:1: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:301:1: ( rule__Variable__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:301:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable580);
            rule__Variable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getGroup()); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRulePack"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:313:1: entryRulePack : rulePack EOF ;
    public final void entryRulePack() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:314:1: ( rulePack EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:315:1: rulePack EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackRule()); 
            }
            pushFollow(FOLLOW_rulePack_in_entryRulePack607);
            rulePack();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePack614); if (state.failed) return ;

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
    // $ANTLR end "entryRulePack"


    // $ANTLR start "rulePack"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:322:1: rulePack : ( ( rule__Pack__Group__0 ) ) ;
    public final void rulePack() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:326:2: ( ( ( rule__Pack__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:327:1: ( ( rule__Pack__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:327:1: ( ( rule__Pack__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:328:1: ( rule__Pack__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:329:1: ( rule__Pack__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:329:2: rule__Pack__Group__0
            {
            pushFollow(FOLLOW_rule__Pack__Group__0_in_rulePack640);
            rule__Pack__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getGroup()); 
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
    // $ANTLR end "rulePack"


    // $ANTLR start "entryRuleFile"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:341:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:342:1: ( ruleFile EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:343:1: ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile667);
            ruleFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:350:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:354:2: ( ( ( rule__File__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:355:1: ( ( rule__File__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:355:1: ( ( rule__File__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:356:1: ( rule__File__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:357:1: ( rule__File__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:357:2: rule__File__Group__0
            {
            pushFollow(FOLLOW_rule__File__Group__0_in_ruleFile700);
            rule__File__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getGroup()); 
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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRulePanel"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:369:1: entryRulePanel : rulePanel EOF ;
    public final void entryRulePanel() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:370:1: ( rulePanel EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:371:1: rulePanel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPanelRule()); 
            }
            pushFollow(FOLLOW_rulePanel_in_entryRulePanel727);
            rulePanel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPanelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePanel734); if (state.failed) return ;

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
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:378:1: rulePanel : ( ( rule__Panel__Group__0 ) ) ;
    public final void rulePanel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:382:2: ( ( ( rule__Panel__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:383:1: ( ( rule__Panel__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:383:1: ( ( rule__Panel__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:384:1: ( rule__Panel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPanelAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:385:1: ( rule__Panel__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:385:2: rule__Panel__Group__0
            {
            pushFollow(FOLLOW_rule__Panel__Group__0_in_rulePanel760);
            rule__Panel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPanelAccess().getGroup()); 
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
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:397:1: entryRuleJvmTypeReference : ruleJvmTypeReference EOF ;
    public final void entryRuleJvmTypeReference() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:398:1: ( ruleJvmTypeReference EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:399:1: ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference787);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:406:1: ruleJvmTypeReference : ( ( rule__JvmTypeReference__Alternatives ) ) ;
    public final void ruleJvmTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:410:2: ( ( ( rule__JvmTypeReference__Alternatives ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:411:1: ( ( rule__JvmTypeReference__Alternatives ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:411:1: ( ( rule__JvmTypeReference__Alternatives ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:412:1: ( rule__JvmTypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getAlternatives()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:413:1: ( rule__JvmTypeReference__Alternatives )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:413:2: rule__JvmTypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__JvmTypeReference__Alternatives_in_ruleJvmTypeReference820);
            rule__JvmTypeReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getAlternatives()); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:425:1: entryRuleXFunctionTypeRef : ruleXFunctionTypeRef EOF ;
    public final void entryRuleXFunctionTypeRef() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:426:1: ( ruleXFunctionTypeRef EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:427:1: ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef847);
            ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:434:1: ruleXFunctionTypeRef : ( ( rule__XFunctionTypeRef__Group__0 ) ) ;
    public final void ruleXFunctionTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:438:2: ( ( ( rule__XFunctionTypeRef__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:439:1: ( ( rule__XFunctionTypeRef__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:439:1: ( ( rule__XFunctionTypeRef__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:440:1: ( rule__XFunctionTypeRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:441:1: ( rule__XFunctionTypeRef__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:441:2: rule__XFunctionTypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group__0_in_ruleXFunctionTypeRef880);
            rule__XFunctionTypeRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup()); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:453:1: entryRuleJvmParameterizedTypeReference : ruleJvmParameterizedTypeReference EOF ;
    public final void entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:454:1: ( ruleJvmParameterizedTypeReference EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:455:1: ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference907);
            ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:462:1: ruleJvmParameterizedTypeReference : ( ( rule__JvmParameterizedTypeReference__Group__0 ) ) ;
    public final void ruleJvmParameterizedTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:466:2: ( ( ( rule__JvmParameterizedTypeReference__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:467:1: ( ( rule__JvmParameterizedTypeReference__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:467:1: ( ( rule__JvmParameterizedTypeReference__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:468:1: ( rule__JvmParameterizedTypeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:469:1: ( rule__JvmParameterizedTypeReference__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:469:2: rule__JvmParameterizedTypeReference__Group__0
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group__0_in_ruleJvmParameterizedTypeReference940);
            rule__JvmParameterizedTypeReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup()); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:481:1: entryRuleJvmArgumentTypeReference : ruleJvmArgumentTypeReference EOF ;
    public final void entryRuleJvmArgumentTypeReference() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:482:1: ( ruleJvmArgumentTypeReference EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:483:1: ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference967);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:490:1: ruleJvmArgumentTypeReference : ( ( rule__JvmArgumentTypeReference__Alternatives ) ) ;
    public final void ruleJvmArgumentTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:494:2: ( ( ( rule__JvmArgumentTypeReference__Alternatives ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:495:1: ( ( rule__JvmArgumentTypeReference__Alternatives ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:495:1: ( ( rule__JvmArgumentTypeReference__Alternatives ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:496:1: ( rule__JvmArgumentTypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmArgumentTypeReferenceAccess().getAlternatives()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:497:1: ( rule__JvmArgumentTypeReference__Alternatives )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:497:2: rule__JvmArgumentTypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__JvmArgumentTypeReference__Alternatives_in_ruleJvmArgumentTypeReference1000);
            rule__JvmArgumentTypeReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmArgumentTypeReferenceAccess().getAlternatives()); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:509:1: entryRuleJvmWildcardTypeReference : ruleJvmWildcardTypeReference EOF ;
    public final void entryRuleJvmWildcardTypeReference() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:510:1: ( ruleJvmWildcardTypeReference EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:511:1: ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference1027);
            ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference1034); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:518:1: ruleJvmWildcardTypeReference : ( ( rule__JvmWildcardTypeReference__Group__0 ) ) ;
    public final void ruleJvmWildcardTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:522:2: ( ( ( rule__JvmWildcardTypeReference__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:523:1: ( ( rule__JvmWildcardTypeReference__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:523:1: ( ( rule__JvmWildcardTypeReference__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:524:1: ( rule__JvmWildcardTypeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:525:1: ( rule__JvmWildcardTypeReference__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:525:2: rule__JvmWildcardTypeReference__Group__0
            {
            pushFollow(FOLLOW_rule__JvmWildcardTypeReference__Group__0_in_ruleJvmWildcardTypeReference1060);
            rule__JvmWildcardTypeReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup()); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:537:1: entryRuleJvmUpperBound : ruleJvmUpperBound EOF ;
    public final void entryRuleJvmUpperBound() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:538:1: ( ruleJvmUpperBound EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:539:1: ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound1087);
            ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:546:1: ruleJvmUpperBound : ( ( rule__JvmUpperBound__Group__0 ) ) ;
    public final void ruleJvmUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:550:2: ( ( ( rule__JvmUpperBound__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:551:1: ( ( rule__JvmUpperBound__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:551:1: ( ( rule__JvmUpperBound__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:552:1: ( rule__JvmUpperBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:553:1: ( rule__JvmUpperBound__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:553:2: rule__JvmUpperBound__Group__0
            {
            pushFollow(FOLLOW_rule__JvmUpperBound__Group__0_in_ruleJvmUpperBound1120);
            rule__JvmUpperBound__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getGroup()); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:565:1: entryRuleJvmUpperBoundAnded : ruleJvmUpperBoundAnded EOF ;
    public final void entryRuleJvmUpperBoundAnded() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:566:1: ( ruleJvmUpperBoundAnded EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:567:1: ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded1147);
            ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:574:1: ruleJvmUpperBoundAnded : ( ( rule__JvmUpperBoundAnded__Group__0 ) ) ;
    public final void ruleJvmUpperBoundAnded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:578:2: ( ( ( rule__JvmUpperBoundAnded__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:579:1: ( ( rule__JvmUpperBoundAnded__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:579:1: ( ( rule__JvmUpperBoundAnded__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:580:1: ( rule__JvmUpperBoundAnded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:581:1: ( rule__JvmUpperBoundAnded__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:581:2: rule__JvmUpperBoundAnded__Group__0
            {
            pushFollow(FOLLOW_rule__JvmUpperBoundAnded__Group__0_in_ruleJvmUpperBoundAnded1180);
            rule__JvmUpperBoundAnded__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getGroup()); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:593:1: entryRuleJvmLowerBound : ruleJvmLowerBound EOF ;
    public final void entryRuleJvmLowerBound() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:594:1: ( ruleJvmLowerBound EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:595:1: ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound1207);
            ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:602:1: ruleJvmLowerBound : ( ( rule__JvmLowerBound__Group__0 ) ) ;
    public final void ruleJvmLowerBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:606:2: ( ( ( rule__JvmLowerBound__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:607:1: ( ( rule__JvmLowerBound__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:607:1: ( ( rule__JvmLowerBound__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:608:1: ( rule__JvmLowerBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:609:1: ( rule__JvmLowerBound__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:609:2: rule__JvmLowerBound__Group__0
            {
            pushFollow(FOLLOW_rule__JvmLowerBound__Group__0_in_ruleJvmLowerBound1240);
            rule__JvmLowerBound__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getGroup()); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:623:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:624:1: ( ruleQualifiedName EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:625:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1269);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1276); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:632:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:636:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:637:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:637:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:638:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:639:1: ( rule__QualifiedName__Group__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:639:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1302);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:651:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:652:1: ( ruleValidID EOF )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:653:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1329);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1336); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:660:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:664:2: ( ( RULE_ID ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:665:1: ( RULE_ID )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:665:1: ( RULE_ID )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:666:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID1362); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleISO3Code"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:680:1: ruleISO3Code : ( ( rule__ISO3Code__Alternatives ) ) ;
    public final void ruleISO3Code() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:684:1: ( ( ( rule__ISO3Code__Alternatives ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:685:1: ( ( rule__ISO3Code__Alternatives ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:685:1: ( ( rule__ISO3Code__Alternatives ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:686:1: ( rule__ISO3Code__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISO3CodeAccess().getAlternatives()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:687:1: ( rule__ISO3Code__Alternatives )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:687:2: rule__ISO3Code__Alternatives
            {
            pushFollow(FOLLOW_rule__ISO3Code__Alternatives_in_ruleISO3Code1398);
            rule__ISO3Code__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getISO3CodeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleISO3Code"


    // $ANTLR start "ruleOS"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:699:1: ruleOS : ( ( rule__OS__Alternatives ) ) ;
    public final void ruleOS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:703:1: ( ( ( rule__OS__Alternatives ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:704:1: ( ( rule__OS__Alternatives ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:704:1: ( ( rule__OS__Alternatives ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:705:1: ( rule__OS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOSAccess().getAlternatives()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:706:1: ( rule__OS__Alternatives )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:706:2: rule__OS__Alternatives
            {
            pushFollow(FOLLOW_rule__OS__Alternatives_in_ruleOS1434);
            rule__OS__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOSAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOS"


    // $ANTLR start "ruleOverrideFlag"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:718:1: ruleOverrideFlag : ( ( rule__OverrideFlag__Alternatives ) ) ;
    public final void ruleOverrideFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:722:1: ( ( ( rule__OverrideFlag__Alternatives ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:723:1: ( ( rule__OverrideFlag__Alternatives ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:723:1: ( ( rule__OverrideFlag__Alternatives ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:724:1: ( rule__OverrideFlag__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideFlagAccess().getAlternatives()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:725:1: ( rule__OverrideFlag__Alternatives )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:725:2: rule__OverrideFlag__Alternatives
            {
            pushFollow(FOLLOW_rule__OverrideFlag__Alternatives_in_ruleOverrideFlag1470);
            rule__OverrideFlag__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideFlagAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOverrideFlag"


    // $ANTLR start "rule__Installer__Alternatives_4_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:736:1: rule__Installer__Alternatives_4_1 : ( ( 'no' ) | ( ( rule__Installer__UninstallAssignment_4_1_1 ) ) );
    public final void rule__Installer__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:740:1: ( ( 'no' ) | ( ( rule__Installer__UninstallAssignment_4_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF||LA1_0==12||LA1_0==53||(LA1_0>=58 && LA1_0<=59)||LA1_0==61||LA1_0==63||LA1_0==84) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:741:1: ( 'no' )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:741:1: ( 'no' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:742:1: 'no'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstallerAccess().getNoKeyword_4_1_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Installer__Alternatives_4_11506); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstallerAccess().getNoKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:749:6: ( ( rule__Installer__UninstallAssignment_4_1_1 ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:749:6: ( ( rule__Installer__UninstallAssignment_4_1_1 ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:750:1: ( rule__Installer__UninstallAssignment_4_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstallerAccess().getUninstallAssignment_4_1_1()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:751:1: ( rule__Installer__UninstallAssignment_4_1_1 )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:751:2: rule__Installer__UninstallAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_rule__Installer__UninstallAssignment_4_1_1_in_rule__Installer__Alternatives_4_11525);
                    rule__Installer__UninstallAssignment_4_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstallerAccess().getUninstallAssignment_4_1_1()); 
                    }

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
    // $ANTLR end "rule__Installer__Alternatives_4_1"


    // $ANTLR start "rule__Variable__Alternatives_0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:760:1: rule__Variable__Alternatives_0 : ( ( 'val' ) | ( ( rule__Variable__IsDynamicAssignment_0_1 ) ) );
    public final void rule__Variable__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:764:1: ( ( 'val' ) | ( ( rule__Variable__IsDynamicAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==84) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:765:1: ( 'val' )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:765:1: ( 'val' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:766:1: 'val'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getValKeyword_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Variable__Alternatives_01559); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getValKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:773:6: ( ( rule__Variable__IsDynamicAssignment_0_1 ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:773:6: ( ( rule__Variable__IsDynamicAssignment_0_1 ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:774:1: ( rule__Variable__IsDynamicAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getIsDynamicAssignment_0_1()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:775:1: ( rule__Variable__IsDynamicAssignment_0_1 )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:775:2: rule__Variable__IsDynamicAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Variable__IsDynamicAssignment_0_1_in_rule__Variable__Alternatives_01578);
                    rule__Variable__IsDynamicAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getIsDynamicAssignment_0_1()); 
                    }

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
    // $ANTLR end "rule__Variable__Alternatives_0"


    // $ANTLR start "rule__JvmTypeReference__Alternatives"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:784:1: rule__JvmTypeReference__Alternatives : ( ( ( rule__JvmTypeReference__Group_0__0 ) ) | ( ruleXFunctionTypeRef ) );
    public final void rule__JvmTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:788:1: ( ( ( rule__JvmTypeReference__Group_0__0 ) ) | ( ruleXFunctionTypeRef ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=70 && LA3_0<=71)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:789:1: ( ( rule__JvmTypeReference__Group_0__0 ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:789:1: ( ( rule__JvmTypeReference__Group_0__0 ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:790:1: ( rule__JvmTypeReference__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:791:1: ( rule__JvmTypeReference__Group_0__0 )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:791:2: rule__JvmTypeReference__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JvmTypeReference__Group_0__0_in_rule__JvmTypeReference__Alternatives1611);
                    rule__JvmTypeReference__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmTypeReferenceAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:795:6: ( ruleXFunctionTypeRef )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:795:6: ( ruleXFunctionTypeRef )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:796:1: ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_rule__JvmTypeReference__Alternatives1629);
                    ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__JvmTypeReference__Alternatives"


    // $ANTLR start "rule__JvmArgumentTypeReference__Alternatives"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:806:1: rule__JvmArgumentTypeReference__Alternatives : ( ( ruleJvmTypeReference ) | ( ruleJvmWildcardTypeReference ) );
    public final void rule__JvmArgumentTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:810:1: ( ( ruleJvmTypeReference ) | ( ruleJvmWildcardTypeReference ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=70 && LA4_0<=71)) ) {
                alt4=1;
            }
            else if ( (LA4_0==76) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:811:1: ( ruleJvmTypeReference )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:811:1: ( ruleJvmTypeReference )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:812:1: ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_rule__JvmArgumentTypeReference__Alternatives1661);
                    ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:817:6: ( ruleJvmWildcardTypeReference )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:817:6: ( ruleJvmWildcardTypeReference )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:818:1: ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_rule__JvmArgumentTypeReference__Alternatives1678);
                    ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__JvmArgumentTypeReference__Alternatives"


    // $ANTLR start "rule__JvmWildcardTypeReference__Alternatives_2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:828:1: rule__JvmWildcardTypeReference__Alternatives_2 : ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0 ) ) | ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1 ) ) );
    public final void rule__JvmWildcardTypeReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:832:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0 ) ) | ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==77) ) {
                alt5=1;
            }
            else if ( (LA5_0==79) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:833:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0 ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:833:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0 ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:834:1: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:835:1: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0 )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:835:2: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_in_rule__JvmWildcardTypeReference__Alternatives_21710);
                    rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:839:6: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1 ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:839:6: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1 ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:840:1: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:841:1: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1 )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:841:2: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_in_rule__JvmWildcardTypeReference__Alternatives_21728);
                    rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1()); 
                    }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Alternatives_2"


    // $ANTLR start "rule__ISO3Code__Alternatives"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:851:1: rule__ISO3Code__Alternatives : ( ( ( 'Catalunyan' ) ) | ( ( 'Chinese' ) ) | ( ( 'Czech' ) ) | ( ( 'Danish' ) ) | ( ( 'Galician' ) ) | ( ( 'German' ) ) | ( ( 'English' ) ) | ( ( 'Basque' ) ) | ( ( 'Finnish' ) ) | ( ( 'French' ) ) | ( ( 'Hungarian' ) ) | ( ( 'Italian' ) ) | ( ( 'Japanese' ) ) | ( ( 'Malaysian' ) ) | ( ( 'Nederlands' ) ) | ( ( 'Norwegian' ) ) | ( ( 'Polnish' ) ) | ( ( 'Portuguese (Brazilian)' ) ) | ( ( 'Portuguese (European)' ) ) | ( ( 'Romanian' ) ) | ( ( 'Russian' ) ) | ( ( 'Serbian' ) ) | ( ( 'Spanish' ) ) | ( ( 'Slovakian' ) ) | ( ( 'Swedish' ) ) | ( ( 'Ukrainian' ) ) );
    public final void rule__ISO3Code__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:855:1: ( ( ( 'Catalunyan' ) ) | ( ( 'Chinese' ) ) | ( ( 'Czech' ) ) | ( ( 'Danish' ) ) | ( ( 'Galician' ) ) | ( ( 'German' ) ) | ( ( 'English' ) ) | ( ( 'Basque' ) ) | ( ( 'Finnish' ) ) | ( ( 'French' ) ) | ( ( 'Hungarian' ) ) | ( ( 'Italian' ) ) | ( ( 'Japanese' ) ) | ( ( 'Malaysian' ) ) | ( ( 'Nederlands' ) ) | ( ( 'Norwegian' ) ) | ( ( 'Polnish' ) ) | ( ( 'Portuguese (Brazilian)' ) ) | ( ( 'Portuguese (European)' ) ) | ( ( 'Romanian' ) ) | ( ( 'Russian' ) ) | ( ( 'Serbian' ) ) | ( ( 'Spanish' ) ) | ( ( 'Slovakian' ) ) | ( ( 'Swedish' ) ) | ( ( 'Ukrainian' ) ) )
            int alt6=26;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            case 19:
                {
                alt6=7;
                }
                break;
            case 20:
                {
                alt6=8;
                }
                break;
            case 21:
                {
                alt6=9;
                }
                break;
            case 22:
                {
                alt6=10;
                }
                break;
            case 23:
                {
                alt6=11;
                }
                break;
            case 24:
                {
                alt6=12;
                }
                break;
            case 25:
                {
                alt6=13;
                }
                break;
            case 26:
                {
                alt6=14;
                }
                break;
            case 27:
                {
                alt6=15;
                }
                break;
            case 28:
                {
                alt6=16;
                }
                break;
            case 29:
                {
                alt6=17;
                }
                break;
            case 30:
                {
                alt6=18;
                }
                break;
            case 31:
                {
                alt6=19;
                }
                break;
            case 32:
                {
                alt6=20;
                }
                break;
            case 33:
                {
                alt6=21;
                }
                break;
            case 34:
                {
                alt6=22;
                }
                break;
            case 35:
                {
                alt6=23;
                }
                break;
            case 36:
                {
                alt6=24;
                }
                break;
            case 37:
                {
                alt6=25;
                }
                break;
            case 38:
                {
                alt6=26;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:856:1: ( ( 'Catalunyan' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:856:1: ( ( 'Catalunyan' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:857:1: ( 'Catalunyan' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getCatEnumLiteralDeclaration_0()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:858:1: ( 'Catalunyan' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:858:3: 'Catalunyan'
                    {
                    match(input,13,FOLLOW_13_in_rule__ISO3Code__Alternatives1763); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getCatEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:863:6: ( ( 'Chinese' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:863:6: ( ( 'Chinese' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:864:1: ( 'Chinese' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getChnEnumLiteralDeclaration_1()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:865:1: ( 'Chinese' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:865:3: 'Chinese'
                    {
                    match(input,14,FOLLOW_14_in_rule__ISO3Code__Alternatives1784); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getChnEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:870:6: ( ( 'Czech' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:870:6: ( ( 'Czech' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:871:1: ( 'Czech' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getCzeEnumLiteralDeclaration_2()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:872:1: ( 'Czech' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:872:3: 'Czech'
                    {
                    match(input,15,FOLLOW_15_in_rule__ISO3Code__Alternatives1805); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getCzeEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:877:6: ( ( 'Danish' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:877:6: ( ( 'Danish' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:878:1: ( 'Danish' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getDanEnumLiteralDeclaration_3()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:879:1: ( 'Danish' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:879:3: 'Danish'
                    {
                    match(input,16,FOLLOW_16_in_rule__ISO3Code__Alternatives1826); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getDanEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:884:6: ( ( 'Galician' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:884:6: ( ( 'Galician' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:885:1: ( 'Galician' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getGlgEnumLiteralDeclaration_4()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:886:1: ( 'Galician' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:886:3: 'Galician'
                    {
                    match(input,17,FOLLOW_17_in_rule__ISO3Code__Alternatives1847); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getGlgEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:891:6: ( ( 'German' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:891:6: ( ( 'German' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:892:1: ( 'German' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getDeuEnumLiteralDeclaration_5()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:893:1: ( 'German' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:893:3: 'German'
                    {
                    match(input,18,FOLLOW_18_in_rule__ISO3Code__Alternatives1868); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getDeuEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:898:6: ( ( 'English' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:898:6: ( ( 'English' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:899:1: ( 'English' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getEngEnumLiteralDeclaration_6()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:900:1: ( 'English' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:900:3: 'English'
                    {
                    match(input,19,FOLLOW_19_in_rule__ISO3Code__Alternatives1889); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getEngEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:905:6: ( ( 'Basque' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:905:6: ( ( 'Basque' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:906:1: ( 'Basque' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getEusEnumLiteralDeclaration_7()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:907:1: ( 'Basque' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:907:3: 'Basque'
                    {
                    match(input,20,FOLLOW_20_in_rule__ISO3Code__Alternatives1910); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getEusEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:912:6: ( ( 'Finnish' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:912:6: ( ( 'Finnish' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:913:1: ( 'Finnish' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getFinEnumLiteralDeclaration_8()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:914:1: ( 'Finnish' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:914:3: 'Finnish'
                    {
                    match(input,21,FOLLOW_21_in_rule__ISO3Code__Alternatives1931); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getFinEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:919:6: ( ( 'French' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:919:6: ( ( 'French' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:920:1: ( 'French' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getFraEnumLiteralDeclaration_9()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:921:1: ( 'French' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:921:3: 'French'
                    {
                    match(input,22,FOLLOW_22_in_rule__ISO3Code__Alternatives1952); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getFraEnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:926:6: ( ( 'Hungarian' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:926:6: ( ( 'Hungarian' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:927:1: ( 'Hungarian' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getHunEnumLiteralDeclaration_10()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:928:1: ( 'Hungarian' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:928:3: 'Hungarian'
                    {
                    match(input,23,FOLLOW_23_in_rule__ISO3Code__Alternatives1973); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getHunEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:933:6: ( ( 'Italian' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:933:6: ( ( 'Italian' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:934:1: ( 'Italian' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getItaEnumLiteralDeclaration_11()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:935:1: ( 'Italian' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:935:3: 'Italian'
                    {
                    match(input,24,FOLLOW_24_in_rule__ISO3Code__Alternatives1994); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getItaEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:940:6: ( ( 'Japanese' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:940:6: ( ( 'Japanese' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:941:1: ( 'Japanese' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getJpnEnumLiteralDeclaration_12()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:942:1: ( 'Japanese' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:942:3: 'Japanese'
                    {
                    match(input,25,FOLLOW_25_in_rule__ISO3Code__Alternatives2015); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getJpnEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:947:6: ( ( 'Malaysian' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:947:6: ( ( 'Malaysian' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:948:1: ( 'Malaysian' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getMysEnumLiteralDeclaration_13()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:949:1: ( 'Malaysian' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:949:3: 'Malaysian'
                    {
                    match(input,26,FOLLOW_26_in_rule__ISO3Code__Alternatives2036); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getMysEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:954:6: ( ( 'Nederlands' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:954:6: ( ( 'Nederlands' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:955:1: ( 'Nederlands' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getNedEnumLiteralDeclaration_14()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:956:1: ( 'Nederlands' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:956:3: 'Nederlands'
                    {
                    match(input,27,FOLLOW_27_in_rule__ISO3Code__Alternatives2057); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getNedEnumLiteralDeclaration_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:961:6: ( ( 'Norwegian' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:961:6: ( ( 'Norwegian' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:962:1: ( 'Norwegian' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getNorEnumLiteralDeclaration_15()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:963:1: ( 'Norwegian' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:963:3: 'Norwegian'
                    {
                    match(input,28,FOLLOW_28_in_rule__ISO3Code__Alternatives2078); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getNorEnumLiteralDeclaration_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:968:6: ( ( 'Polnish' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:968:6: ( ( 'Polnish' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:969:1: ( 'Polnish' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getPolEnumLiteralDeclaration_16()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:970:1: ( 'Polnish' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:970:3: 'Polnish'
                    {
                    match(input,29,FOLLOW_29_in_rule__ISO3Code__Alternatives2099); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getPolEnumLiteralDeclaration_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:975:6: ( ( 'Portuguese (Brazilian)' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:975:6: ( ( 'Portuguese (Brazilian)' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:976:1: ( 'Portuguese (Brazilian)' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getPorEnumLiteralDeclaration_17()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:977:1: ( 'Portuguese (Brazilian)' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:977:3: 'Portuguese (Brazilian)'
                    {
                    match(input,30,FOLLOW_30_in_rule__ISO3Code__Alternatives2120); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getPorEnumLiteralDeclaration_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:982:6: ( ( 'Portuguese (European)' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:982:6: ( ( 'Portuguese (European)' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:983:1: ( 'Portuguese (European)' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getPrtEnumLiteralDeclaration_18()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:984:1: ( 'Portuguese (European)' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:984:3: 'Portuguese (European)'
                    {
                    match(input,31,FOLLOW_31_in_rule__ISO3Code__Alternatives2141); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getPrtEnumLiteralDeclaration_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:989:6: ( ( 'Romanian' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:989:6: ( ( 'Romanian' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:990:1: ( 'Romanian' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getRomEnumLiteralDeclaration_19()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:991:1: ( 'Romanian' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:991:3: 'Romanian'
                    {
                    match(input,32,FOLLOW_32_in_rule__ISO3Code__Alternatives2162); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getRomEnumLiteralDeclaration_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:996:6: ( ( 'Russian' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:996:6: ( ( 'Russian' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:997:1: ( 'Russian' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getRusEnumLiteralDeclaration_20()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:998:1: ( 'Russian' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:998:3: 'Russian'
                    {
                    match(input,33,FOLLOW_33_in_rule__ISO3Code__Alternatives2183); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getRusEnumLiteralDeclaration_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1003:6: ( ( 'Serbian' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1003:6: ( ( 'Serbian' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1004:1: ( 'Serbian' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getScgEnumLiteralDeclaration_21()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1005:1: ( 'Serbian' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1005:3: 'Serbian'
                    {
                    match(input,34,FOLLOW_34_in_rule__ISO3Code__Alternatives2204); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getScgEnumLiteralDeclaration_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1010:6: ( ( 'Spanish' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1010:6: ( ( 'Spanish' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1011:1: ( 'Spanish' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getSpaEnumLiteralDeclaration_22()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1012:1: ( 'Spanish' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1012:3: 'Spanish'
                    {
                    match(input,35,FOLLOW_35_in_rule__ISO3Code__Alternatives2225); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getSpaEnumLiteralDeclaration_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1017:6: ( ( 'Slovakian' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1017:6: ( ( 'Slovakian' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1018:1: ( 'Slovakian' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getSvkEnumLiteralDeclaration_23()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1019:1: ( 'Slovakian' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1019:3: 'Slovakian'
                    {
                    match(input,36,FOLLOW_36_in_rule__ISO3Code__Alternatives2246); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getSvkEnumLiteralDeclaration_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1024:6: ( ( 'Swedish' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1024:6: ( ( 'Swedish' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1025:1: ( 'Swedish' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getSweEnumLiteralDeclaration_24()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1026:1: ( 'Swedish' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1026:3: 'Swedish'
                    {
                    match(input,37,FOLLOW_37_in_rule__ISO3Code__Alternatives2267); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getSweEnumLiteralDeclaration_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1031:6: ( ( 'Ukrainian' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1031:6: ( ( 'Ukrainian' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1032:1: ( 'Ukrainian' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getISO3CodeAccess().getUkrEnumLiteralDeclaration_25()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1033:1: ( 'Ukrainian' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1033:3: 'Ukrainian'
                    {
                    match(input,38,FOLLOW_38_in_rule__ISO3Code__Alternatives2288); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getISO3CodeAccess().getUkrEnumLiteralDeclaration_25()); 
                    }

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
    // $ANTLR end "rule__ISO3Code__Alternatives"


    // $ANTLR start "rule__OS__Alternatives"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1043:1: rule__OS__Alternatives : ( ( ( 'all' ) ) | ( ( 'unix' ) ) | ( ( 'windows' ) ) | ( ( 'mac' ) ) );
    public final void rule__OS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1047:1: ( ( ( 'all' ) ) | ( ( 'unix' ) ) | ( ( 'windows' ) ) | ( ( 'mac' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt7=1;
                }
                break;
            case 40:
                {
                alt7=2;
                }
                break;
            case 41:
                {
                alt7=3;
                }
                break;
            case 42:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1048:1: ( ( 'all' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1048:1: ( ( 'all' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1049:1: ( 'all' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOSAccess().getALLEnumLiteralDeclaration_0()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1050:1: ( 'all' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1050:3: 'all'
                    {
                    match(input,39,FOLLOW_39_in_rule__OS__Alternatives2324); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOSAccess().getALLEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1055:6: ( ( 'unix' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1055:6: ( ( 'unix' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1056:1: ( 'unix' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOSAccess().getUNIXEnumLiteralDeclaration_1()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1057:1: ( 'unix' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1057:3: 'unix'
                    {
                    match(input,40,FOLLOW_40_in_rule__OS__Alternatives2345); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOSAccess().getUNIXEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1062:6: ( ( 'windows' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1062:6: ( ( 'windows' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1063:1: ( 'windows' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOSAccess().getWINDOWSEnumLiteralDeclaration_2()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1064:1: ( 'windows' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1064:3: 'windows'
                    {
                    match(input,41,FOLLOW_41_in_rule__OS__Alternatives2366); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOSAccess().getWINDOWSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1069:6: ( ( 'mac' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1069:6: ( ( 'mac' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1070:1: ( 'mac' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOSAccess().getMACEnumLiteralDeclaration_3()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1071:1: ( 'mac' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1071:3: 'mac'
                    {
                    match(input,42,FOLLOW_42_in_rule__OS__Alternatives2387); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOSAccess().getMACEnumLiteralDeclaration_3()); 
                    }

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
    // $ANTLR end "rule__OS__Alternatives"


    // $ANTLR start "rule__OverrideFlag__Alternatives"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1081:1: rule__OverrideFlag__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'asktrue' ) ) | ( ( 'askfalse' ) ) | ( ( 'update' ) ) );
    public final void rule__OverrideFlag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1085:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'asktrue' ) ) | ( ( 'askfalse' ) ) | ( ( 'update' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt8=1;
                }
                break;
            case 44:
                {
                alt8=2;
                }
                break;
            case 45:
                {
                alt8=3;
                }
                break;
            case 46:
                {
                alt8=4;
                }
                break;
            case 47:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1086:1: ( ( 'true' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1086:1: ( ( 'true' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1087:1: ( 'true' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOverrideFlagAccess().getTRUEEnumLiteralDeclaration_0()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1088:1: ( 'true' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1088:3: 'true'
                    {
                    match(input,43,FOLLOW_43_in_rule__OverrideFlag__Alternatives2423); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOverrideFlagAccess().getTRUEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1093:6: ( ( 'false' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1093:6: ( ( 'false' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1094:1: ( 'false' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOverrideFlagAccess().getFALSEEnumLiteralDeclaration_1()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1095:1: ( 'false' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1095:3: 'false'
                    {
                    match(input,44,FOLLOW_44_in_rule__OverrideFlag__Alternatives2444); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOverrideFlagAccess().getFALSEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1100:6: ( ( 'asktrue' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1100:6: ( ( 'asktrue' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1101:1: ( 'asktrue' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOverrideFlagAccess().getASKTRUEEnumLiteralDeclaration_2()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1102:1: ( 'asktrue' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1102:3: 'asktrue'
                    {
                    match(input,45,FOLLOW_45_in_rule__OverrideFlag__Alternatives2465); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOverrideFlagAccess().getASKTRUEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1107:6: ( ( 'askfalse' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1107:6: ( ( 'askfalse' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1108:1: ( 'askfalse' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOverrideFlagAccess().getASKFALSEEnumLiteralDeclaration_3()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1109:1: ( 'askfalse' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1109:3: 'askfalse'
                    {
                    match(input,46,FOLLOW_46_in_rule__OverrideFlag__Alternatives2486); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOverrideFlagAccess().getASKFALSEEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1114:6: ( ( 'update' ) )
                    {
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1114:6: ( ( 'update' ) )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1115:1: ( 'update' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOverrideFlagAccess().getUpdateEnumLiteralDeclaration_4()); 
                    }
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1116:1: ( 'update' )
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1116:3: 'update'
                    {
                    match(input,47,FOLLOW_47_in_rule__OverrideFlag__Alternatives2507); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOverrideFlagAccess().getUpdateEnumLiteralDeclaration_4()); 
                    }

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
    // $ANTLR end "rule__OverrideFlag__Alternatives"


    // $ANTLR start "rule__Installer__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1128:1: rule__Installer__Group__0 : rule__Installer__Group__0__Impl rule__Installer__Group__1 ;
    public final void rule__Installer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1132:1: ( rule__Installer__Group__0__Impl rule__Installer__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1133:2: rule__Installer__Group__0__Impl rule__Installer__Group__1
            {
            pushFollow(FOLLOW_rule__Installer__Group__0__Impl_in_rule__Installer__Group__02540);
            rule__Installer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__1_in_rule__Installer__Group__02543);
            rule__Installer__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__0"


    // $ANTLR start "rule__Installer__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1140:1: rule__Installer__Group__0__Impl : ( 'installer' ) ;
    public final void rule__Installer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1144:1: ( ( 'installer' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1145:1: ( 'installer' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1145:1: ( 'installer' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1146:1: 'installer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getInstallerKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Installer__Group__0__Impl2571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getInstallerKeyword_0()); 
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
    // $ANTLR end "rule__Installer__Group__0__Impl"


    // $ANTLR start "rule__Installer__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1159:1: rule__Installer__Group__1 : rule__Installer__Group__1__Impl rule__Installer__Group__2 ;
    public final void rule__Installer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1163:1: ( rule__Installer__Group__1__Impl rule__Installer__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1164:2: rule__Installer__Group__1__Impl rule__Installer__Group__2
            {
            pushFollow(FOLLOW_rule__Installer__Group__1__Impl_in_rule__Installer__Group__12602);
            rule__Installer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__2_in_rule__Installer__Group__12605);
            rule__Installer__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__1"


    // $ANTLR start "rule__Installer__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1171:1: rule__Installer__Group__1__Impl : ( ( rule__Installer__IdentificationAssignment_1 ) ) ;
    public final void rule__Installer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1175:1: ( ( ( rule__Installer__IdentificationAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1176:1: ( ( rule__Installer__IdentificationAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1176:1: ( ( rule__Installer__IdentificationAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1177:1: ( rule__Installer__IdentificationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getIdentificationAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1178:1: ( rule__Installer__IdentificationAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1178:2: rule__Installer__IdentificationAssignment_1
            {
            pushFollow(FOLLOW_rule__Installer__IdentificationAssignment_1_in_rule__Installer__Group__1__Impl2632);
            rule__Installer__IdentificationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getIdentificationAssignment_1()); 
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
    // $ANTLR end "rule__Installer__Group__1__Impl"


    // $ANTLR start "rule__Installer__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1188:1: rule__Installer__Group__2 : rule__Installer__Group__2__Impl rule__Installer__Group__3 ;
    public final void rule__Installer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1192:1: ( rule__Installer__Group__2__Impl rule__Installer__Group__3 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1193:2: rule__Installer__Group__2__Impl rule__Installer__Group__3
            {
            pushFollow(FOLLOW_rule__Installer__Group__2__Impl_in_rule__Installer__Group__22662);
            rule__Installer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__3_in_rule__Installer__Group__22665);
            rule__Installer__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__2"


    // $ANTLR start "rule__Installer__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1200:1: rule__Installer__Group__2__Impl : ( ( rule__Installer__Group_2__0 )? ) ;
    public final void rule__Installer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1204:1: ( ( ( rule__Installer__Group_2__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1205:1: ( ( rule__Installer__Group_2__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1205:1: ( ( rule__Installer__Group_2__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1206:1: ( rule__Installer__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getGroup_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1207:1: ( rule__Installer__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==50) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1207:2: rule__Installer__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Installer__Group_2__0_in_rule__Installer__Group__2__Impl2692);
                    rule__Installer__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Installer__Group__2__Impl"


    // $ANTLR start "rule__Installer__Group__3"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1217:1: rule__Installer__Group__3 : rule__Installer__Group__3__Impl rule__Installer__Group__4 ;
    public final void rule__Installer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1221:1: ( rule__Installer__Group__3__Impl rule__Installer__Group__4 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1222:2: rule__Installer__Group__3__Impl rule__Installer__Group__4
            {
            pushFollow(FOLLOW_rule__Installer__Group__3__Impl_in_rule__Installer__Group__32723);
            rule__Installer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__4_in_rule__Installer__Group__32726);
            rule__Installer__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__3"


    // $ANTLR start "rule__Installer__Group__3__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1229:1: rule__Installer__Group__3__Impl : ( ( rule__Installer__Group_3__0 )? ) ;
    public final void rule__Installer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1233:1: ( ( ( rule__Installer__Group_3__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1234:1: ( ( rule__Installer__Group_3__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1234:1: ( ( rule__Installer__Group_3__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1235:1: ( rule__Installer__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getGroup_3()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1236:1: ( rule__Installer__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1236:2: rule__Installer__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Installer__Group_3__0_in_rule__Installer__Group__3__Impl2753);
                    rule__Installer__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Installer__Group__3__Impl"


    // $ANTLR start "rule__Installer__Group__4"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1246:1: rule__Installer__Group__4 : rule__Installer__Group__4__Impl rule__Installer__Group__5 ;
    public final void rule__Installer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1250:1: ( rule__Installer__Group__4__Impl rule__Installer__Group__5 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1251:2: rule__Installer__Group__4__Impl rule__Installer__Group__5
            {
            pushFollow(FOLLOW_rule__Installer__Group__4__Impl_in_rule__Installer__Group__42784);
            rule__Installer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__5_in_rule__Installer__Group__42787);
            rule__Installer__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__4"


    // $ANTLR start "rule__Installer__Group__4__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1258:1: rule__Installer__Group__4__Impl : ( ( rule__Installer__Group_4__0 )? ) ;
    public final void rule__Installer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1262:1: ( ( ( rule__Installer__Group_4__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1263:1: ( ( rule__Installer__Group_4__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1263:1: ( ( rule__Installer__Group_4__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1264:1: ( rule__Installer__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getGroup_4()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1265:1: ( rule__Installer__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==52) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1265:2: rule__Installer__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Installer__Group_4__0_in_rule__Installer__Group__4__Impl2814);
                    rule__Installer__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Installer__Group__4__Impl"


    // $ANTLR start "rule__Installer__Group__5"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1275:1: rule__Installer__Group__5 : rule__Installer__Group__5__Impl rule__Installer__Group__6 ;
    public final void rule__Installer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1279:1: ( rule__Installer__Group__5__Impl rule__Installer__Group__6 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1280:2: rule__Installer__Group__5__Impl rule__Installer__Group__6
            {
            pushFollow(FOLLOW_rule__Installer__Group__5__Impl_in_rule__Installer__Group__52845);
            rule__Installer__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__6_in_rule__Installer__Group__52848);
            rule__Installer__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__5"


    // $ANTLR start "rule__Installer__Group__5__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1287:1: rule__Installer__Group__5__Impl : ( ( rule__Installer__Group_5__0 )? ) ;
    public final void rule__Installer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1291:1: ( ( ( rule__Installer__Group_5__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1292:1: ( ( rule__Installer__Group_5__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1292:1: ( ( rule__Installer__Group_5__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1293:1: ( rule__Installer__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getGroup_5()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1294:1: ( rule__Installer__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==53) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1294:2: rule__Installer__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Installer__Group_5__0_in_rule__Installer__Group__5__Impl2875);
                    rule__Installer__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Installer__Group__5__Impl"


    // $ANTLR start "rule__Installer__Group__6"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1304:1: rule__Installer__Group__6 : rule__Installer__Group__6__Impl rule__Installer__Group__7 ;
    public final void rule__Installer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1308:1: ( rule__Installer__Group__6__Impl rule__Installer__Group__7 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1309:2: rule__Installer__Group__6__Impl rule__Installer__Group__7
            {
            pushFollow(FOLLOW_rule__Installer__Group__6__Impl_in_rule__Installer__Group__62906);
            rule__Installer__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__7_in_rule__Installer__Group__62909);
            rule__Installer__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__6"


    // $ANTLR start "rule__Installer__Group__6__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1316:1: rule__Installer__Group__6__Impl : ( ( rule__Installer__PackagingAssignment_6 )? ) ;
    public final void rule__Installer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1320:1: ( ( ( rule__Installer__PackagingAssignment_6 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1321:1: ( ( rule__Installer__PackagingAssignment_6 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1321:1: ( ( rule__Installer__PackagingAssignment_6 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1322:1: ( rule__Installer__PackagingAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getPackagingAssignment_6()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1323:1: ( rule__Installer__PackagingAssignment_6 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==61) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1323:2: rule__Installer__PackagingAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Installer__PackagingAssignment_6_in_rule__Installer__Group__6__Impl2936);
                    rule__Installer__PackagingAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getPackagingAssignment_6()); 
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
    // $ANTLR end "rule__Installer__Group__6__Impl"


    // $ANTLR start "rule__Installer__Group__7"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1333:1: rule__Installer__Group__7 : rule__Installer__Group__7__Impl rule__Installer__Group__8 ;
    public final void rule__Installer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1337:1: ( rule__Installer__Group__7__Impl rule__Installer__Group__8 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1338:2: rule__Installer__Group__7__Impl rule__Installer__Group__8
            {
            pushFollow(FOLLOW_rule__Installer__Group__7__Impl_in_rule__Installer__Group__72967);
            rule__Installer__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__8_in_rule__Installer__Group__72970);
            rule__Installer__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__7"


    // $ANTLR start "rule__Installer__Group__7__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1345:1: rule__Installer__Group__7__Impl : ( ( rule__Installer__VariablesAssignment_7 )* ) ;
    public final void rule__Installer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1349:1: ( ( ( rule__Installer__VariablesAssignment_7 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1350:1: ( ( rule__Installer__VariablesAssignment_7 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1350:1: ( ( rule__Installer__VariablesAssignment_7 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1351:1: ( rule__Installer__VariablesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getVariablesAssignment_7()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1352:1: ( rule__Installer__VariablesAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12||LA14_0==84) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1352:2: rule__Installer__VariablesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Installer__VariablesAssignment_7_in_rule__Installer__Group__7__Impl2997);
            	    rule__Installer__VariablesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getVariablesAssignment_7()); 
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
    // $ANTLR end "rule__Installer__Group__7__Impl"


    // $ANTLR start "rule__Installer__Group__8"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1362:1: rule__Installer__Group__8 : rule__Installer__Group__8__Impl rule__Installer__Group__9 ;
    public final void rule__Installer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1366:1: ( rule__Installer__Group__8__Impl rule__Installer__Group__9 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1367:2: rule__Installer__Group__8__Impl rule__Installer__Group__9
            {
            pushFollow(FOLLOW_rule__Installer__Group__8__Impl_in_rule__Installer__Group__83028);
            rule__Installer__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__9_in_rule__Installer__Group__83031);
            rule__Installer__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__8"


    // $ANTLR start "rule__Installer__Group__8__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1374:1: rule__Installer__Group__8__Impl : ( ( ( rule__Installer__PacksAssignment_8 ) ) ( ( rule__Installer__PacksAssignment_8 )* ) ) ;
    public final void rule__Installer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1378:1: ( ( ( ( rule__Installer__PacksAssignment_8 ) ) ( ( rule__Installer__PacksAssignment_8 )* ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1379:1: ( ( ( rule__Installer__PacksAssignment_8 ) ) ( ( rule__Installer__PacksAssignment_8 )* ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1379:1: ( ( ( rule__Installer__PacksAssignment_8 ) ) ( ( rule__Installer__PacksAssignment_8 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1380:1: ( ( rule__Installer__PacksAssignment_8 ) ) ( ( rule__Installer__PacksAssignment_8 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1380:1: ( ( rule__Installer__PacksAssignment_8 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1381:1: ( rule__Installer__PacksAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getPacksAssignment_8()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1382:1: ( rule__Installer__PacksAssignment_8 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1382:2: rule__Installer__PacksAssignment_8
            {
            pushFollow(FOLLOW_rule__Installer__PacksAssignment_8_in_rule__Installer__Group__8__Impl3060);
            rule__Installer__PacksAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getPacksAssignment_8()); 
            }

            }

            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1385:1: ( ( rule__Installer__PacksAssignment_8 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1386:1: ( rule__Installer__PacksAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getPacksAssignment_8()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1387:1: ( rule__Installer__PacksAssignment_8 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==63) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1387:2: rule__Installer__PacksAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Installer__PacksAssignment_8_in_rule__Installer__Group__8__Impl3072);
            	    rule__Installer__PacksAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getPacksAssignment_8()); 
            }

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
    // $ANTLR end "rule__Installer__Group__8__Impl"


    // $ANTLR start "rule__Installer__Group__9"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1398:1: rule__Installer__Group__9 : rule__Installer__Group__9__Impl rule__Installer__Group__10 ;
    public final void rule__Installer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1402:1: ( rule__Installer__Group__9__Impl rule__Installer__Group__10 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1403:2: rule__Installer__Group__9__Impl rule__Installer__Group__10
            {
            pushFollow(FOLLOW_rule__Installer__Group__9__Impl_in_rule__Installer__Group__93105);
            rule__Installer__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__10_in_rule__Installer__Group__93108);
            rule__Installer__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__9"


    // $ANTLR start "rule__Installer__Group__9__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1410:1: rule__Installer__Group__9__Impl : ( ( rule__Installer__LocaleAssignment_9 ) ) ;
    public final void rule__Installer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1414:1: ( ( ( rule__Installer__LocaleAssignment_9 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1415:1: ( ( rule__Installer__LocaleAssignment_9 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1415:1: ( ( rule__Installer__LocaleAssignment_9 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1416:1: ( rule__Installer__LocaleAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getLocaleAssignment_9()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1417:1: ( rule__Installer__LocaleAssignment_9 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1417:2: rule__Installer__LocaleAssignment_9
            {
            pushFollow(FOLLOW_rule__Installer__LocaleAssignment_9_in_rule__Installer__Group__9__Impl3135);
            rule__Installer__LocaleAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getLocaleAssignment_9()); 
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
    // $ANTLR end "rule__Installer__Group__9__Impl"


    // $ANTLR start "rule__Installer__Group__10"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1427:1: rule__Installer__Group__10 : rule__Installer__Group__10__Impl rule__Installer__Group__11 ;
    public final void rule__Installer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1431:1: ( rule__Installer__Group__10__Impl rule__Installer__Group__11 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1432:2: rule__Installer__Group__10__Impl rule__Installer__Group__11
            {
            pushFollow(FOLLOW_rule__Installer__Group__10__Impl_in_rule__Installer__Group__103165);
            rule__Installer__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group__11_in_rule__Installer__Group__103168);
            rule__Installer__Group__11();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__10"


    // $ANTLR start "rule__Installer__Group__10__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1439:1: rule__Installer__Group__10__Impl : ( 'display' ) ;
    public final void rule__Installer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1443:1: ( ( 'display' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1444:1: ( 'display' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1444:1: ( 'display' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1445:1: 'display'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getDisplayKeyword_10()); 
            }
            match(input,49,FOLLOW_49_in_rule__Installer__Group__10__Impl3196); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getDisplayKeyword_10()); 
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
    // $ANTLR end "rule__Installer__Group__10__Impl"


    // $ANTLR start "rule__Installer__Group__11"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1458:1: rule__Installer__Group__11 : rule__Installer__Group__11__Impl ;
    public final void rule__Installer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1462:1: ( rule__Installer__Group__11__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1463:2: rule__Installer__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Installer__Group__11__Impl_in_rule__Installer__Group__113227);
            rule__Installer__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group__11"


    // $ANTLR start "rule__Installer__Group__11__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1469:1: rule__Installer__Group__11__Impl : ( ( ( rule__Installer__PanelsAssignment_11 ) ) ( ( rule__Installer__PanelsAssignment_11 )* ) ) ;
    public final void rule__Installer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1473:1: ( ( ( ( rule__Installer__PanelsAssignment_11 ) ) ( ( rule__Installer__PanelsAssignment_11 )* ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1474:1: ( ( ( rule__Installer__PanelsAssignment_11 ) ) ( ( rule__Installer__PanelsAssignment_11 )* ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1474:1: ( ( ( rule__Installer__PanelsAssignment_11 ) ) ( ( rule__Installer__PanelsAssignment_11 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1475:1: ( ( rule__Installer__PanelsAssignment_11 ) ) ( ( rule__Installer__PanelsAssignment_11 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1475:1: ( ( rule__Installer__PanelsAssignment_11 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1476:1: ( rule__Installer__PanelsAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getPanelsAssignment_11()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1477:1: ( rule__Installer__PanelsAssignment_11 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1477:2: rule__Installer__PanelsAssignment_11
            {
            pushFollow(FOLLOW_rule__Installer__PanelsAssignment_11_in_rule__Installer__Group__11__Impl3256);
            rule__Installer__PanelsAssignment_11();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getPanelsAssignment_11()); 
            }

            }

            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1480:1: ( ( rule__Installer__PanelsAssignment_11 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1481:1: ( rule__Installer__PanelsAssignment_11 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getPanelsAssignment_11()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1482:1: ( rule__Installer__PanelsAssignment_11 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1482:2: rule__Installer__PanelsAssignment_11
            	    {
            	    pushFollow(FOLLOW_rule__Installer__PanelsAssignment_11_in_rule__Installer__Group__11__Impl3268);
            	    rule__Installer__PanelsAssignment_11();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getPanelsAssignment_11()); 
            }

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
    // $ANTLR end "rule__Installer__Group__11__Impl"


    // $ANTLR start "rule__Installer__Group_2__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1517:1: rule__Installer__Group_2__0 : rule__Installer__Group_2__0__Impl rule__Installer__Group_2__1 ;
    public final void rule__Installer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1521:1: ( rule__Installer__Group_2__0__Impl rule__Installer__Group_2__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1522:2: rule__Installer__Group_2__0__Impl rule__Installer__Group_2__1
            {
            pushFollow(FOLLOW_rule__Installer__Group_2__0__Impl_in_rule__Installer__Group_2__03325);
            rule__Installer__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group_2__1_in_rule__Installer__Group_2__03328);
            rule__Installer__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group_2__0"


    // $ANTLR start "rule__Installer__Group_2__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1529:1: rule__Installer__Group_2__0__Impl : ( 'by' ) ;
    public final void rule__Installer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1533:1: ( ( 'by' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1534:1: ( 'by' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1534:1: ( 'by' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1535:1: 'by'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getByKeyword_2_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__Installer__Group_2__0__Impl3356); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getByKeyword_2_0()); 
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
    // $ANTLR end "rule__Installer__Group_2__0__Impl"


    // $ANTLR start "rule__Installer__Group_2__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1548:1: rule__Installer__Group_2__1 : rule__Installer__Group_2__1__Impl ;
    public final void rule__Installer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1552:1: ( rule__Installer__Group_2__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1553:2: rule__Installer__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Installer__Group_2__1__Impl_in_rule__Installer__Group_2__13387);
            rule__Installer__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group_2__1"


    // $ANTLR start "rule__Installer__Group_2__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1559:1: rule__Installer__Group_2__1__Impl : ( ( rule__Installer__AuthorsAssignment_2_1 )* ) ;
    public final void rule__Installer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1563:1: ( ( ( rule__Installer__AuthorsAssignment_2_1 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1564:1: ( ( rule__Installer__AuthorsAssignment_2_1 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1564:1: ( ( rule__Installer__AuthorsAssignment_2_1 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1565:1: ( rule__Installer__AuthorsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getAuthorsAssignment_2_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1566:1: ( rule__Installer__AuthorsAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1566:2: rule__Installer__AuthorsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Installer__AuthorsAssignment_2_1_in_rule__Installer__Group_2__1__Impl3414);
            	    rule__Installer__AuthorsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getAuthorsAssignment_2_1()); 
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
    // $ANTLR end "rule__Installer__Group_2__1__Impl"


    // $ANTLR start "rule__Installer__Group_3__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1580:1: rule__Installer__Group_3__0 : rule__Installer__Group_3__0__Impl rule__Installer__Group_3__1 ;
    public final void rule__Installer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1584:1: ( rule__Installer__Group_3__0__Impl rule__Installer__Group_3__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1585:2: rule__Installer__Group_3__0__Impl rule__Installer__Group_3__1
            {
            pushFollow(FOLLOW_rule__Installer__Group_3__0__Impl_in_rule__Installer__Group_3__03449);
            rule__Installer__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group_3__1_in_rule__Installer__Group_3__03452);
            rule__Installer__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group_3__0"


    // $ANTLR start "rule__Installer__Group_3__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1592:1: rule__Installer__Group_3__0__Impl : ( 'constraints' ) ;
    public final void rule__Installer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1596:1: ( ( 'constraints' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1597:1: ( 'constraints' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1597:1: ( 'constraints' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1598:1: 'constraints'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getConstraintsKeyword_3_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Installer__Group_3__0__Impl3480); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getConstraintsKeyword_3_0()); 
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
    // $ANTLR end "rule__Installer__Group_3__0__Impl"


    // $ANTLR start "rule__Installer__Group_3__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1611:1: rule__Installer__Group_3__1 : rule__Installer__Group_3__1__Impl ;
    public final void rule__Installer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1615:1: ( rule__Installer__Group_3__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1616:2: rule__Installer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Installer__Group_3__1__Impl_in_rule__Installer__Group_3__13511);
            rule__Installer__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group_3__1"


    // $ANTLR start "rule__Installer__Group_3__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1622:1: rule__Installer__Group_3__1__Impl : ( ( rule__Installer__ConstraintAssignment_3_1 ) ) ;
    public final void rule__Installer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1626:1: ( ( ( rule__Installer__ConstraintAssignment_3_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1627:1: ( ( rule__Installer__ConstraintAssignment_3_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1627:1: ( ( rule__Installer__ConstraintAssignment_3_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1628:1: ( rule__Installer__ConstraintAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getConstraintAssignment_3_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1629:1: ( rule__Installer__ConstraintAssignment_3_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1629:2: rule__Installer__ConstraintAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Installer__ConstraintAssignment_3_1_in_rule__Installer__Group_3__1__Impl3538);
            rule__Installer__ConstraintAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getConstraintAssignment_3_1()); 
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
    // $ANTLR end "rule__Installer__Group_3__1__Impl"


    // $ANTLR start "rule__Installer__Group_4__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1643:1: rule__Installer__Group_4__0 : rule__Installer__Group_4__0__Impl rule__Installer__Group_4__1 ;
    public final void rule__Installer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1647:1: ( rule__Installer__Group_4__0__Impl rule__Installer__Group_4__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1648:2: rule__Installer__Group_4__0__Impl rule__Installer__Group_4__1
            {
            pushFollow(FOLLOW_rule__Installer__Group_4__0__Impl_in_rule__Installer__Group_4__03572);
            rule__Installer__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group_4__1_in_rule__Installer__Group_4__03575);
            rule__Installer__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group_4__0"


    // $ANTLR start "rule__Installer__Group_4__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1655:1: rule__Installer__Group_4__0__Impl : ( 'uninstall' ) ;
    public final void rule__Installer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1659:1: ( ( 'uninstall' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1660:1: ( 'uninstall' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1660:1: ( 'uninstall' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1661:1: 'uninstall'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getUninstallKeyword_4_0()); 
            }
            match(input,52,FOLLOW_52_in_rule__Installer__Group_4__0__Impl3603); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getUninstallKeyword_4_0()); 
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
    // $ANTLR end "rule__Installer__Group_4__0__Impl"


    // $ANTLR start "rule__Installer__Group_4__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1674:1: rule__Installer__Group_4__1 : rule__Installer__Group_4__1__Impl ;
    public final void rule__Installer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1678:1: ( rule__Installer__Group_4__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1679:2: rule__Installer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Installer__Group_4__1__Impl_in_rule__Installer__Group_4__13634);
            rule__Installer__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group_4__1"


    // $ANTLR start "rule__Installer__Group_4__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1685:1: rule__Installer__Group_4__1__Impl : ( ( rule__Installer__Alternatives_4_1 ) ) ;
    public final void rule__Installer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1689:1: ( ( ( rule__Installer__Alternatives_4_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1690:1: ( ( rule__Installer__Alternatives_4_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1690:1: ( ( rule__Installer__Alternatives_4_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1691:1: ( rule__Installer__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getAlternatives_4_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1692:1: ( rule__Installer__Alternatives_4_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1692:2: rule__Installer__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__Installer__Alternatives_4_1_in_rule__Installer__Group_4__1__Impl3661);
            rule__Installer__Alternatives_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getAlternatives_4_1()); 
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
    // $ANTLR end "rule__Installer__Group_4__1__Impl"


    // $ANTLR start "rule__Installer__Group_5__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1706:1: rule__Installer__Group_5__0 : rule__Installer__Group_5__0__Impl rule__Installer__Group_5__1 ;
    public final void rule__Installer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1710:1: ( rule__Installer__Group_5__0__Impl rule__Installer__Group_5__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1711:2: rule__Installer__Group_5__0__Impl rule__Installer__Group_5__1
            {
            pushFollow(FOLLOW_rule__Installer__Group_5__0__Impl_in_rule__Installer__Group_5__03695);
            rule__Installer__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group_5__1_in_rule__Installer__Group_5__03698);
            rule__Installer__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group_5__0"


    // $ANTLR start "rule__Installer__Group_5__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1718:1: rule__Installer__Group_5__0__Impl : ( 'log on' ) ;
    public final void rule__Installer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1722:1: ( ( 'log on' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1723:1: ( 'log on' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1723:1: ( 'log on' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1724:1: 'log on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getLogOnKeyword_5_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__Installer__Group_5__0__Impl3726); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getLogOnKeyword_5_0()); 
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
    // $ANTLR end "rule__Installer__Group_5__0__Impl"


    // $ANTLR start "rule__Installer__Group_5__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1737:1: rule__Installer__Group_5__1 : rule__Installer__Group_5__1__Impl rule__Installer__Group_5__2 ;
    public final void rule__Installer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1741:1: ( rule__Installer__Group_5__1__Impl rule__Installer__Group_5__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1742:2: rule__Installer__Group_5__1__Impl rule__Installer__Group_5__2
            {
            pushFollow(FOLLOW_rule__Installer__Group_5__1__Impl_in_rule__Installer__Group_5__13757);
            rule__Installer__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Installer__Group_5__2_in_rule__Installer__Group_5__13760);
            rule__Installer__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group_5__1"


    // $ANTLR start "rule__Installer__Group_5__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1749:1: rule__Installer__Group_5__1__Impl : ( ( rule__Installer__SummarylogAssignment_5_1 ) ) ;
    public final void rule__Installer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1753:1: ( ( ( rule__Installer__SummarylogAssignment_5_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1754:1: ( ( rule__Installer__SummarylogAssignment_5_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1754:1: ( ( rule__Installer__SummarylogAssignment_5_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1755:1: ( rule__Installer__SummarylogAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getSummarylogAssignment_5_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1756:1: ( rule__Installer__SummarylogAssignment_5_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1756:2: rule__Installer__SummarylogAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Installer__SummarylogAssignment_5_1_in_rule__Installer__Group_5__1__Impl3787);
            rule__Installer__SummarylogAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getSummarylogAssignment_5_1()); 
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
    // $ANTLR end "rule__Installer__Group_5__1__Impl"


    // $ANTLR start "rule__Installer__Group_5__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1766:1: rule__Installer__Group_5__2 : rule__Installer__Group_5__2__Impl ;
    public final void rule__Installer__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1770:1: ( rule__Installer__Group_5__2__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1771:2: rule__Installer__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Installer__Group_5__2__Impl_in_rule__Installer__Group_5__23817);
            rule__Installer__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Installer__Group_5__2"


    // $ANTLR start "rule__Installer__Group_5__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1777:1: rule__Installer__Group_5__2__Impl : ( ( rule__Installer__InstallationAssignment_5_2 )? ) ;
    public final void rule__Installer__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1781:1: ( ( ( rule__Installer__InstallationAssignment_5_2 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1782:1: ( ( rule__Installer__InstallationAssignment_5_2 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1782:1: ( ( rule__Installer__InstallationAssignment_5_2 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1783:1: ( rule__Installer__InstallationAssignment_5_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getInstallationAssignment_5_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1784:1: ( rule__Installer__InstallationAssignment_5_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==81) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1784:2: rule__Installer__InstallationAssignment_5_2
                    {
                    pushFollow(FOLLOW_rule__Installer__InstallationAssignment_5_2_in_rule__Installer__Group_5__2__Impl3844);
                    rule__Installer__InstallationAssignment_5_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getInstallationAssignment_5_2()); 
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
    // $ANTLR end "rule__Installer__Group_5__2__Impl"


    // $ANTLR start "rule__Locale__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1800:1: rule__Locale__Group__0 : rule__Locale__Group__0__Impl rule__Locale__Group__1 ;
    public final void rule__Locale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1804:1: ( rule__Locale__Group__0__Impl rule__Locale__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1805:2: rule__Locale__Group__0__Impl rule__Locale__Group__1
            {
            pushFollow(FOLLOW_rule__Locale__Group__0__Impl_in_rule__Locale__Group__03881);
            rule__Locale__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Locale__Group__1_in_rule__Locale__Group__03884);
            rule__Locale__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Locale__Group__0"


    // $ANTLR start "rule__Locale__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1812:1: rule__Locale__Group__0__Impl : ( 'locale' ) ;
    public final void rule__Locale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1816:1: ( ( 'locale' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1817:1: ( 'locale' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1817:1: ( 'locale' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1818:1: 'locale'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getLocaleKeyword_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__Locale__Group__0__Impl3912); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getLocaleKeyword_0()); 
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
    // $ANTLR end "rule__Locale__Group__0__Impl"


    // $ANTLR start "rule__Locale__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1831:1: rule__Locale__Group__1 : rule__Locale__Group__1__Impl ;
    public final void rule__Locale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1835:1: ( rule__Locale__Group__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1836:2: rule__Locale__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Locale__Group__1__Impl_in_rule__Locale__Group__13943);
            rule__Locale__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Locale__Group__1"


    // $ANTLR start "rule__Locale__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1842:1: rule__Locale__Group__1__Impl : ( ( ( rule__Locale__IsocodesAssignment_1 ) ) ( ( rule__Locale__IsocodesAssignment_1 )* ) ) ;
    public final void rule__Locale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1846:1: ( ( ( ( rule__Locale__IsocodesAssignment_1 ) ) ( ( rule__Locale__IsocodesAssignment_1 )* ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1847:1: ( ( ( rule__Locale__IsocodesAssignment_1 ) ) ( ( rule__Locale__IsocodesAssignment_1 )* ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1847:1: ( ( ( rule__Locale__IsocodesAssignment_1 ) ) ( ( rule__Locale__IsocodesAssignment_1 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1848:1: ( ( rule__Locale__IsocodesAssignment_1 ) ) ( ( rule__Locale__IsocodesAssignment_1 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1848:1: ( ( rule__Locale__IsocodesAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1849:1: ( rule__Locale__IsocodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getIsocodesAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1850:1: ( rule__Locale__IsocodesAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1850:2: rule__Locale__IsocodesAssignment_1
            {
            pushFollow(FOLLOW_rule__Locale__IsocodesAssignment_1_in_rule__Locale__Group__1__Impl3972);
            rule__Locale__IsocodesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getIsocodesAssignment_1()); 
            }

            }

            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1853:1: ( ( rule__Locale__IsocodesAssignment_1 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1854:1: ( rule__Locale__IsocodesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getIsocodesAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1855:1: ( rule__Locale__IsocodesAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=13 && LA19_0<=38)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1855:2: rule__Locale__IsocodesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Locale__IsocodesAssignment_1_in_rule__Locale__Group__1__Impl3984);
            	    rule__Locale__IsocodesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getIsocodesAssignment_1()); 
            }

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
    // $ANTLR end "rule__Locale__Group__1__Impl"


    // $ANTLR start "rule__Identification__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1870:1: rule__Identification__Group__0 : rule__Identification__Group__0__Impl rule__Identification__Group__1 ;
    public final void rule__Identification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1874:1: ( rule__Identification__Group__0__Impl rule__Identification__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1875:2: rule__Identification__Group__0__Impl rule__Identification__Group__1
            {
            pushFollow(FOLLOW_rule__Identification__Group__0__Impl_in_rule__Identification__Group__04021);
            rule__Identification__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Identification__Group__1_in_rule__Identification__Group__04024);
            rule__Identification__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Identification__Group__0"


    // $ANTLR start "rule__Identification__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1882:1: rule__Identification__Group__0__Impl : ( 'for' ) ;
    public final void rule__Identification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1886:1: ( ( 'for' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1887:1: ( 'for' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1887:1: ( 'for' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1888:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getForKeyword_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__Identification__Group__0__Impl4052); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getForKeyword_0()); 
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
    // $ANTLR end "rule__Identification__Group__0__Impl"


    // $ANTLR start "rule__Identification__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1901:1: rule__Identification__Group__1 : rule__Identification__Group__1__Impl rule__Identification__Group__2 ;
    public final void rule__Identification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1905:1: ( rule__Identification__Group__1__Impl rule__Identification__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1906:2: rule__Identification__Group__1__Impl rule__Identification__Group__2
            {
            pushFollow(FOLLOW_rule__Identification__Group__1__Impl_in_rule__Identification__Group__14083);
            rule__Identification__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Identification__Group__2_in_rule__Identification__Group__14086);
            rule__Identification__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Identification__Group__1"


    // $ANTLR start "rule__Identification__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1913:1: rule__Identification__Group__1__Impl : ( ( rule__Identification__NameAssignment_1 ) ) ;
    public final void rule__Identification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1917:1: ( ( ( rule__Identification__NameAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1918:1: ( ( rule__Identification__NameAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1918:1: ( ( rule__Identification__NameAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1919:1: ( rule__Identification__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getNameAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1920:1: ( rule__Identification__NameAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1920:2: rule__Identification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Identification__NameAssignment_1_in_rule__Identification__Group__1__Impl4113);
            rule__Identification__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Identification__Group__1__Impl"


    // $ANTLR start "rule__Identification__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1930:1: rule__Identification__Group__2 : rule__Identification__Group__2__Impl rule__Identification__Group__3 ;
    public final void rule__Identification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1934:1: ( rule__Identification__Group__2__Impl rule__Identification__Group__3 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1935:2: rule__Identification__Group__2__Impl rule__Identification__Group__3
            {
            pushFollow(FOLLOW_rule__Identification__Group__2__Impl_in_rule__Identification__Group__24143);
            rule__Identification__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Identification__Group__3_in_rule__Identification__Group__24146);
            rule__Identification__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Identification__Group__2"


    // $ANTLR start "rule__Identification__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1942:1: rule__Identification__Group__2__Impl : ( ( rule__Identification__VersionAssignment_2 ) ) ;
    public final void rule__Identification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1946:1: ( ( ( rule__Identification__VersionAssignment_2 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1947:1: ( ( rule__Identification__VersionAssignment_2 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1947:1: ( ( rule__Identification__VersionAssignment_2 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1948:1: ( rule__Identification__VersionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getVersionAssignment_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1949:1: ( rule__Identification__VersionAssignment_2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1949:2: rule__Identification__VersionAssignment_2
            {
            pushFollow(FOLLOW_rule__Identification__VersionAssignment_2_in_rule__Identification__Group__2__Impl4173);
            rule__Identification__VersionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getVersionAssignment_2()); 
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
    // $ANTLR end "rule__Identification__Group__2__Impl"


    // $ANTLR start "rule__Identification__Group__3"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1959:1: rule__Identification__Group__3 : rule__Identification__Group__3__Impl rule__Identification__Group__4 ;
    public final void rule__Identification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1963:1: ( rule__Identification__Group__3__Impl rule__Identification__Group__4 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1964:2: rule__Identification__Group__3__Impl rule__Identification__Group__4
            {
            pushFollow(FOLLOW_rule__Identification__Group__3__Impl_in_rule__Identification__Group__34203);
            rule__Identification__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Identification__Group__4_in_rule__Identification__Group__34206);
            rule__Identification__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Identification__Group__3"


    // $ANTLR start "rule__Identification__Group__3__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1971:1: rule__Identification__Group__3__Impl : ( ( rule__Identification__Group_3__0 )? ) ;
    public final void rule__Identification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1975:1: ( ( ( rule__Identification__Group_3__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1976:1: ( ( rule__Identification__Group_3__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1976:1: ( ( rule__Identification__Group_3__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1977:1: ( rule__Identification__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getGroup_3()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1978:1: ( rule__Identification__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==56) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1978:2: rule__Identification__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Identification__Group_3__0_in_rule__Identification__Group__3__Impl4233);
                    rule__Identification__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Identification__Group__3__Impl"


    // $ANTLR start "rule__Identification__Group__4"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1988:1: rule__Identification__Group__4 : rule__Identification__Group__4__Impl ;
    public final void rule__Identification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1992:1: ( rule__Identification__Group__4__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1993:2: rule__Identification__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Identification__Group__4__Impl_in_rule__Identification__Group__44264);
            rule__Identification__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Identification__Group__4"


    // $ANTLR start "rule__Identification__Group__4__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:1999:1: rule__Identification__Group__4__Impl : ( ( rule__Identification__Group_4__0 )? ) ;
    public final void rule__Identification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2003:1: ( ( ( rule__Identification__Group_4__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2004:1: ( ( rule__Identification__Group_4__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2004:1: ( ( rule__Identification__Group_4__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2005:1: ( rule__Identification__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getGroup_4()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2006:1: ( rule__Identification__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2006:2: rule__Identification__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Identification__Group_4__0_in_rule__Identification__Group__4__Impl4291);
                    rule__Identification__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Identification__Group__4__Impl"


    // $ANTLR start "rule__Identification__Group_3__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2026:1: rule__Identification__Group_3__0 : rule__Identification__Group_3__0__Impl rule__Identification__Group_3__1 ;
    public final void rule__Identification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2030:1: ( rule__Identification__Group_3__0__Impl rule__Identification__Group_3__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2031:2: rule__Identification__Group_3__0__Impl rule__Identification__Group_3__1
            {
            pushFollow(FOLLOW_rule__Identification__Group_3__0__Impl_in_rule__Identification__Group_3__04332);
            rule__Identification__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Identification__Group_3__1_in_rule__Identification__Group_3__04335);
            rule__Identification__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Identification__Group_3__0"


    // $ANTLR start "rule__Identification__Group_3__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2038:1: rule__Identification__Group_3__0__Impl : ( 'site' ) ;
    public final void rule__Identification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2042:1: ( ( 'site' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2043:1: ( 'site' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2043:1: ( 'site' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2044:1: 'site'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getSiteKeyword_3_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__Identification__Group_3__0__Impl4363); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getSiteKeyword_3_0()); 
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
    // $ANTLR end "rule__Identification__Group_3__0__Impl"


    // $ANTLR start "rule__Identification__Group_3__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2057:1: rule__Identification__Group_3__1 : rule__Identification__Group_3__1__Impl ;
    public final void rule__Identification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2061:1: ( rule__Identification__Group_3__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2062:2: rule__Identification__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Identification__Group_3__1__Impl_in_rule__Identification__Group_3__14394);
            rule__Identification__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Identification__Group_3__1"


    // $ANTLR start "rule__Identification__Group_3__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2068:1: rule__Identification__Group_3__1__Impl : ( ( rule__Identification__UrlAssignment_3_1 ) ) ;
    public final void rule__Identification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2072:1: ( ( ( rule__Identification__UrlAssignment_3_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2073:1: ( ( rule__Identification__UrlAssignment_3_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2073:1: ( ( rule__Identification__UrlAssignment_3_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2074:1: ( rule__Identification__UrlAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getUrlAssignment_3_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2075:1: ( rule__Identification__UrlAssignment_3_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2075:2: rule__Identification__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Identification__UrlAssignment_3_1_in_rule__Identification__Group_3__1__Impl4421);
            rule__Identification__UrlAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getUrlAssignment_3_1()); 
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
    // $ANTLR end "rule__Identification__Group_3__1__Impl"


    // $ANTLR start "rule__Identification__Group_4__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2089:1: rule__Identification__Group_4__0 : rule__Identification__Group_4__0__Impl rule__Identification__Group_4__1 ;
    public final void rule__Identification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2093:1: ( rule__Identification__Group_4__0__Impl rule__Identification__Group_4__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2094:2: rule__Identification__Group_4__0__Impl rule__Identification__Group_4__1
            {
            pushFollow(FOLLOW_rule__Identification__Group_4__0__Impl_in_rule__Identification__Group_4__04455);
            rule__Identification__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Identification__Group_4__1_in_rule__Identification__Group_4__04458);
            rule__Identification__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Identification__Group_4__0"


    // $ANTLR start "rule__Identification__Group_4__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2101:1: rule__Identification__Group_4__0__Impl : ( 'webroot' ) ;
    public final void rule__Identification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2105:1: ( ( 'webroot' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2106:1: ( 'webroot' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2106:1: ( 'webroot' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2107:1: 'webroot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getWebrootKeyword_4_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__Identification__Group_4__0__Impl4486); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getWebrootKeyword_4_0()); 
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
    // $ANTLR end "rule__Identification__Group_4__0__Impl"


    // $ANTLR start "rule__Identification__Group_4__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2120:1: rule__Identification__Group_4__1 : rule__Identification__Group_4__1__Impl ;
    public final void rule__Identification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2124:1: ( rule__Identification__Group_4__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2125:2: rule__Identification__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Identification__Group_4__1__Impl_in_rule__Identification__Group_4__14517);
            rule__Identification__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Identification__Group_4__1"


    // $ANTLR start "rule__Identification__Group_4__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2131:1: rule__Identification__Group_4__1__Impl : ( ( rule__Identification__WebdirAssignment_4_1 ) ) ;
    public final void rule__Identification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2135:1: ( ( ( rule__Identification__WebdirAssignment_4_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2136:1: ( ( rule__Identification__WebdirAssignment_4_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2136:1: ( ( rule__Identification__WebdirAssignment_4_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2137:1: ( rule__Identification__WebdirAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getWebdirAssignment_4_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2138:1: ( rule__Identification__WebdirAssignment_4_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2138:2: rule__Identification__WebdirAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Identification__WebdirAssignment_4_1_in_rule__Identification__Group_4__1__Impl4544);
            rule__Identification__WebdirAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getWebdirAssignment_4_1()); 
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
    // $ANTLR end "rule__Identification__Group_4__1__Impl"


    // $ANTLR start "rule__Author__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2152:1: rule__Author__Group__0 : rule__Author__Group__0__Impl rule__Author__Group__1 ;
    public final void rule__Author__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2156:1: ( rule__Author__Group__0__Impl rule__Author__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2157:2: rule__Author__Group__0__Impl rule__Author__Group__1
            {
            pushFollow(FOLLOW_rule__Author__Group__0__Impl_in_rule__Author__Group__04578);
            rule__Author__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Author__Group__1_in_rule__Author__Group__04581);
            rule__Author__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Author__Group__0"


    // $ANTLR start "rule__Author__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2164:1: rule__Author__Group__0__Impl : ( ( rule__Author__NameAssignment_0 ) ) ;
    public final void rule__Author__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2168:1: ( ( ( rule__Author__NameAssignment_0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2169:1: ( ( rule__Author__NameAssignment_0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2169:1: ( ( rule__Author__NameAssignment_0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2170:1: ( rule__Author__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorAccess().getNameAssignment_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2171:1: ( rule__Author__NameAssignment_0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2171:2: rule__Author__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Author__NameAssignment_0_in_rule__Author__Group__0__Impl4608);
            rule__Author__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Author__Group__0__Impl"


    // $ANTLR start "rule__Author__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2181:1: rule__Author__Group__1 : rule__Author__Group__1__Impl ;
    public final void rule__Author__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2185:1: ( rule__Author__Group__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2186:2: rule__Author__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Author__Group__1__Impl_in_rule__Author__Group__14638);
            rule__Author__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Author__Group__1"


    // $ANTLR start "rule__Author__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2192:1: rule__Author__Group__1__Impl : ( ( rule__Author__EmailAssignment_1 ) ) ;
    public final void rule__Author__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2196:1: ( ( ( rule__Author__EmailAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2197:1: ( ( rule__Author__EmailAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2197:1: ( ( rule__Author__EmailAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2198:1: ( rule__Author__EmailAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorAccess().getEmailAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2199:1: ( rule__Author__EmailAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2199:2: rule__Author__EmailAssignment_1
            {
            pushFollow(FOLLOW_rule__Author__EmailAssignment_1_in_rule__Author__Group__1__Impl4665);
            rule__Author__EmailAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorAccess().getEmailAssignment_1()); 
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
    // $ANTLR end "rule__Author__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2213:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2217:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2218:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__04699);
            rule__Constraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__04702);
            rule__Constraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2225:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__JavaversionAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2229:1: ( ( ( rule__Constraint__JavaversionAssignment_0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2230:1: ( ( rule__Constraint__JavaversionAssignment_0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2230:1: ( ( rule__Constraint__JavaversionAssignment_0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2231:1: ( rule__Constraint__JavaversionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getJavaversionAssignment_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2232:1: ( rule__Constraint__JavaversionAssignment_0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2232:2: rule__Constraint__JavaversionAssignment_0
            {
            pushFollow(FOLLOW_rule__Constraint__JavaversionAssignment_0_in_rule__Constraint__Group__0__Impl4729);
            rule__Constraint__JavaversionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getJavaversionAssignment_0()); 
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
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2242:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2246:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2247:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__14759);
            rule__Constraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__14762);
            rule__Constraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2254:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__RequiredJdkAssignment_1 )? ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2258:1: ( ( ( rule__Constraint__RequiredJdkAssignment_1 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2259:1: ( ( rule__Constraint__RequiredJdkAssignment_1 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2259:1: ( ( rule__Constraint__RequiredJdkAssignment_1 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2260:1: ( rule__Constraint__RequiredJdkAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getRequiredJdkAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2261:1: ( rule__Constraint__RequiredJdkAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==82) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2261:2: rule__Constraint__RequiredJdkAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Constraint__RequiredJdkAssignment_1_in_rule__Constraint__Group__1__Impl4789);
                    rule__Constraint__RequiredJdkAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getRequiredJdkAssignment_1()); 
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
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2271:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2275:1: ( rule__Constraint__Group__2__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2276:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__24820);
            rule__Constraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2282:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__PackedAssignment_2 )? ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2286:1: ( ( ( rule__Constraint__PackedAssignment_2 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2287:1: ( ( rule__Constraint__PackedAssignment_2 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2287:1: ( ( rule__Constraint__PackedAssignment_2 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2288:1: ( rule__Constraint__PackedAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getPackedAssignment_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2289:1: ( rule__Constraint__PackedAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==83) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2289:2: rule__Constraint__PackedAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Constraint__PackedAssignment_2_in_rule__Constraint__Group__2__Impl4847);
                    rule__Constraint__PackedAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getPackedAssignment_2()); 
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
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Uninstall__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2305:1: rule__Uninstall__Group__0 : rule__Uninstall__Group__0__Impl rule__Uninstall__Group__1 ;
    public final void rule__Uninstall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2309:1: ( rule__Uninstall__Group__0__Impl rule__Uninstall__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2310:2: rule__Uninstall__Group__0__Impl rule__Uninstall__Group__1
            {
            pushFollow(FOLLOW_rule__Uninstall__Group__0__Impl_in_rule__Uninstall__Group__04884);
            rule__Uninstall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Uninstall__Group__1_in_rule__Uninstall__Group__04887);
            rule__Uninstall__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Uninstall__Group__0"


    // $ANTLR start "rule__Uninstall__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2317:1: rule__Uninstall__Group__0__Impl : ( ( rule__Uninstall__Group_0__0 )? ) ;
    public final void rule__Uninstall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2321:1: ( ( ( rule__Uninstall__Group_0__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2322:1: ( ( rule__Uninstall__Group_0__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2322:1: ( ( rule__Uninstall__Group_0__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2323:1: ( rule__Uninstall__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUninstallAccess().getGroup_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2324:1: ( rule__Uninstall__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==58) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2324:2: rule__Uninstall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Uninstall__Group_0__0_in_rule__Uninstall__Group__0__Impl4914);
                    rule__Uninstall__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUninstallAccess().getGroup_0()); 
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
    // $ANTLR end "rule__Uninstall__Group__0__Impl"


    // $ANTLR start "rule__Uninstall__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2334:1: rule__Uninstall__Group__1 : rule__Uninstall__Group__1__Impl ;
    public final void rule__Uninstall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2338:1: ( rule__Uninstall__Group__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2339:2: rule__Uninstall__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Uninstall__Group__1__Impl_in_rule__Uninstall__Group__14945);
            rule__Uninstall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Uninstall__Group__1"


    // $ANTLR start "rule__Uninstall__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2345:1: rule__Uninstall__Group__1__Impl : ( ( rule__Uninstall__Group_1__0 )? ) ;
    public final void rule__Uninstall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2349:1: ( ( ( rule__Uninstall__Group_1__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2350:1: ( ( rule__Uninstall__Group_1__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2350:1: ( ( rule__Uninstall__Group_1__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2351:1: ( rule__Uninstall__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUninstallAccess().getGroup_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2352:1: ( rule__Uninstall__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2352:2: rule__Uninstall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Uninstall__Group_1__0_in_rule__Uninstall__Group__1__Impl4972);
                    rule__Uninstall__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUninstallAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Uninstall__Group__1__Impl"


    // $ANTLR start "rule__Uninstall__Group_0__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2366:1: rule__Uninstall__Group_0__0 : rule__Uninstall__Group_0__0__Impl rule__Uninstall__Group_0__1 ;
    public final void rule__Uninstall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2370:1: ( rule__Uninstall__Group_0__0__Impl rule__Uninstall__Group_0__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2371:2: rule__Uninstall__Group_0__0__Impl rule__Uninstall__Group_0__1
            {
            pushFollow(FOLLOW_rule__Uninstall__Group_0__0__Impl_in_rule__Uninstall__Group_0__05007);
            rule__Uninstall__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Uninstall__Group_0__1_in_rule__Uninstall__Group_0__05010);
            rule__Uninstall__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Uninstall__Group_0__0"


    // $ANTLR start "rule__Uninstall__Group_0__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2378:1: rule__Uninstall__Group_0__0__Impl : ( 'named' ) ;
    public final void rule__Uninstall__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2382:1: ( ( 'named' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2383:1: ( 'named' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2383:1: ( 'named' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2384:1: 'named'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUninstallAccess().getNamedKeyword_0_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__Uninstall__Group_0__0__Impl5038); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUninstallAccess().getNamedKeyword_0_0()); 
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
    // $ANTLR end "rule__Uninstall__Group_0__0__Impl"


    // $ANTLR start "rule__Uninstall__Group_0__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2397:1: rule__Uninstall__Group_0__1 : rule__Uninstall__Group_0__1__Impl ;
    public final void rule__Uninstall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2401:1: ( rule__Uninstall__Group_0__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2402:2: rule__Uninstall__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Uninstall__Group_0__1__Impl_in_rule__Uninstall__Group_0__15069);
            rule__Uninstall__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Uninstall__Group_0__1"


    // $ANTLR start "rule__Uninstall__Group_0__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2408:1: rule__Uninstall__Group_0__1__Impl : ( ( rule__Uninstall__NameAssignment_0_1 ) ) ;
    public final void rule__Uninstall__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2412:1: ( ( ( rule__Uninstall__NameAssignment_0_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2413:1: ( ( rule__Uninstall__NameAssignment_0_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2413:1: ( ( rule__Uninstall__NameAssignment_0_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2414:1: ( rule__Uninstall__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUninstallAccess().getNameAssignment_0_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2415:1: ( rule__Uninstall__NameAssignment_0_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2415:2: rule__Uninstall__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Uninstall__NameAssignment_0_1_in_rule__Uninstall__Group_0__1__Impl5096);
            rule__Uninstall__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUninstallAccess().getNameAssignment_0_1()); 
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
    // $ANTLR end "rule__Uninstall__Group_0__1__Impl"


    // $ANTLR start "rule__Uninstall__Group_1__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2429:1: rule__Uninstall__Group_1__0 : rule__Uninstall__Group_1__0__Impl rule__Uninstall__Group_1__1 ;
    public final void rule__Uninstall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2433:1: ( rule__Uninstall__Group_1__0__Impl rule__Uninstall__Group_1__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2434:2: rule__Uninstall__Group_1__0__Impl rule__Uninstall__Group_1__1
            {
            pushFollow(FOLLOW_rule__Uninstall__Group_1__0__Impl_in_rule__Uninstall__Group_1__05130);
            rule__Uninstall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Uninstall__Group_1__1_in_rule__Uninstall__Group_1__05133);
            rule__Uninstall__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Uninstall__Group_1__0"


    // $ANTLR start "rule__Uninstall__Group_1__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2441:1: rule__Uninstall__Group_1__0__Impl : ( 'path' ) ;
    public final void rule__Uninstall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2445:1: ( ( 'path' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2446:1: ( 'path' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2446:1: ( 'path' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2447:1: 'path'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUninstallAccess().getPathKeyword_1_0()); 
            }
            match(input,59,FOLLOW_59_in_rule__Uninstall__Group_1__0__Impl5161); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUninstallAccess().getPathKeyword_1_0()); 
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
    // $ANTLR end "rule__Uninstall__Group_1__0__Impl"


    // $ANTLR start "rule__Uninstall__Group_1__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2460:1: rule__Uninstall__Group_1__1 : rule__Uninstall__Group_1__1__Impl ;
    public final void rule__Uninstall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2464:1: ( rule__Uninstall__Group_1__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2465:2: rule__Uninstall__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Uninstall__Group_1__1__Impl_in_rule__Uninstall__Group_1__15192);
            rule__Uninstall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Uninstall__Group_1__1"


    // $ANTLR start "rule__Uninstall__Group_1__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2471:1: rule__Uninstall__Group_1__1__Impl : ( ( rule__Uninstall__PathAssignment_1_1 ) ) ;
    public final void rule__Uninstall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2475:1: ( ( ( rule__Uninstall__PathAssignment_1_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2476:1: ( ( rule__Uninstall__PathAssignment_1_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2476:1: ( ( rule__Uninstall__PathAssignment_1_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2477:1: ( rule__Uninstall__PathAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUninstallAccess().getPathAssignment_1_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2478:1: ( rule__Uninstall__PathAssignment_1_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2478:2: rule__Uninstall__PathAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Uninstall__PathAssignment_1_1_in_rule__Uninstall__Group_1__1__Impl5219);
            rule__Uninstall__PathAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUninstallAccess().getPathAssignment_1_1()); 
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
    // $ANTLR end "rule__Uninstall__Group_1__1__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2492:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2496:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2497:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__05253);
            rule__Option__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Option__Group__1_in_rule__Option__Group__05256);
            rule__Option__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2504:1: rule__Option__Group__0__Impl : ( ( rule__Option__NameAssignment_0 ) ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2508:1: ( ( ( rule__Option__NameAssignment_0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2509:1: ( ( rule__Option__NameAssignment_0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2509:1: ( ( rule__Option__NameAssignment_0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2510:1: ( rule__Option__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getNameAssignment_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2511:1: ( rule__Option__NameAssignment_0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2511:2: rule__Option__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Option__NameAssignment_0_in_rule__Option__Group__0__Impl5283);
            rule__Option__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2521:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2525:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2526:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__15313);
            rule__Option__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Option__Group__2_in_rule__Option__Group__15316);
            rule__Option__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2533:1: rule__Option__Group__1__Impl : ( '=' ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2537:1: ( ( '=' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2538:1: ( '=' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2538:1: ( '=' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2539:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,60,FOLLOW_60_in_rule__Option__Group__1__Impl5344); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2552:1: rule__Option__Group__2 : rule__Option__Group__2__Impl ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2556:1: ( rule__Option__Group__2__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2557:2: rule__Option__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__25375);
            rule__Option__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Option__Group__2"


    // $ANTLR start "rule__Option__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2563:1: rule__Option__Group__2__Impl : ( ( rule__Option__ValueAssignment_2 ) ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2567:1: ( ( ( rule__Option__ValueAssignment_2 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2568:1: ( ( rule__Option__ValueAssignment_2 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2568:1: ( ( rule__Option__ValueAssignment_2 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2569:1: ( rule__Option__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getValueAssignment_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2570:1: ( rule__Option__ValueAssignment_2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2570:2: rule__Option__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Option__ValueAssignment_2_in_rule__Option__Group__2__Impl5402);
            rule__Option__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__Option__Group__2__Impl"


    // $ANTLR start "rule__Packaging__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2586:1: rule__Packaging__Group__0 : rule__Packaging__Group__0__Impl rule__Packaging__Group__1 ;
    public final void rule__Packaging__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2590:1: ( rule__Packaging__Group__0__Impl rule__Packaging__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2591:2: rule__Packaging__Group__0__Impl rule__Packaging__Group__1
            {
            pushFollow(FOLLOW_rule__Packaging__Group__0__Impl_in_rule__Packaging__Group__05438);
            rule__Packaging__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Packaging__Group__1_in_rule__Packaging__Group__05441);
            rule__Packaging__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Packaging__Group__0"


    // $ANTLR start "rule__Packaging__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2598:1: rule__Packaging__Group__0__Impl : ( 'packaging' ) ;
    public final void rule__Packaging__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2602:1: ( ( 'packaging' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2603:1: ( 'packaging' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2603:1: ( 'packaging' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2604:1: 'packaging'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackagingAccess().getPackagingKeyword_0()); 
            }
            match(input,61,FOLLOW_61_in_rule__Packaging__Group__0__Impl5469); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackagingAccess().getPackagingKeyword_0()); 
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
    // $ANTLR end "rule__Packaging__Group__0__Impl"


    // $ANTLR start "rule__Packaging__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2617:1: rule__Packaging__Group__1 : rule__Packaging__Group__1__Impl rule__Packaging__Group__2 ;
    public final void rule__Packaging__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2621:1: ( rule__Packaging__Group__1__Impl rule__Packaging__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2622:2: rule__Packaging__Group__1__Impl rule__Packaging__Group__2
            {
            pushFollow(FOLLOW_rule__Packaging__Group__1__Impl_in_rule__Packaging__Group__15500);
            rule__Packaging__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Packaging__Group__2_in_rule__Packaging__Group__15503);
            rule__Packaging__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Packaging__Group__1"


    // $ANTLR start "rule__Packaging__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2629:1: rule__Packaging__Group__1__Impl : ( ( rule__Packaging__ClassAssignment_1 ) ) ;
    public final void rule__Packaging__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2633:1: ( ( ( rule__Packaging__ClassAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2634:1: ( ( rule__Packaging__ClassAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2634:1: ( ( rule__Packaging__ClassAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2635:1: ( rule__Packaging__ClassAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackagingAccess().getClassAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2636:1: ( rule__Packaging__ClassAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2636:2: rule__Packaging__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__Packaging__ClassAssignment_1_in_rule__Packaging__Group__1__Impl5530);
            rule__Packaging__ClassAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackagingAccess().getClassAssignment_1()); 
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
    // $ANTLR end "rule__Packaging__Group__1__Impl"


    // $ANTLR start "rule__Packaging__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2646:1: rule__Packaging__Group__2 : rule__Packaging__Group__2__Impl ;
    public final void rule__Packaging__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2650:1: ( rule__Packaging__Group__2__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2651:2: rule__Packaging__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Packaging__Group__2__Impl_in_rule__Packaging__Group__25560);
            rule__Packaging__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Packaging__Group__2"


    // $ANTLR start "rule__Packaging__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2657:1: rule__Packaging__Group__2__Impl : ( ( rule__Packaging__Group_2__0 )? ) ;
    public final void rule__Packaging__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2661:1: ( ( ( rule__Packaging__Group_2__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2662:1: ( ( rule__Packaging__Group_2__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2662:1: ( ( rule__Packaging__Group_2__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2663:1: ( rule__Packaging__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackagingAccess().getGroup_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2664:1: ( rule__Packaging__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==62) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2664:2: rule__Packaging__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Packaging__Group_2__0_in_rule__Packaging__Group__2__Impl5587);
                    rule__Packaging__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackagingAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Packaging__Group__2__Impl"


    // $ANTLR start "rule__Packaging__Group_2__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2680:1: rule__Packaging__Group_2__0 : rule__Packaging__Group_2__0__Impl rule__Packaging__Group_2__1 ;
    public final void rule__Packaging__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2684:1: ( rule__Packaging__Group_2__0__Impl rule__Packaging__Group_2__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2685:2: rule__Packaging__Group_2__0__Impl rule__Packaging__Group_2__1
            {
            pushFollow(FOLLOW_rule__Packaging__Group_2__0__Impl_in_rule__Packaging__Group_2__05624);
            rule__Packaging__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Packaging__Group_2__1_in_rule__Packaging__Group_2__05627);
            rule__Packaging__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Packaging__Group_2__0"


    // $ANTLR start "rule__Packaging__Group_2__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2692:1: rule__Packaging__Group_2__0__Impl : ( 'options' ) ;
    public final void rule__Packaging__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2696:1: ( ( 'options' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2697:1: ( 'options' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2697:1: ( 'options' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2698:1: 'options'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackagingAccess().getOptionsKeyword_2_0()); 
            }
            match(input,62,FOLLOW_62_in_rule__Packaging__Group_2__0__Impl5655); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackagingAccess().getOptionsKeyword_2_0()); 
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
    // $ANTLR end "rule__Packaging__Group_2__0__Impl"


    // $ANTLR start "rule__Packaging__Group_2__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2711:1: rule__Packaging__Group_2__1 : rule__Packaging__Group_2__1__Impl ;
    public final void rule__Packaging__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2715:1: ( rule__Packaging__Group_2__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2716:2: rule__Packaging__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Packaging__Group_2__1__Impl_in_rule__Packaging__Group_2__15686);
            rule__Packaging__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Packaging__Group_2__1"


    // $ANTLR start "rule__Packaging__Group_2__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2722:1: rule__Packaging__Group_2__1__Impl : ( ( rule__Packaging__OptionsAssignment_2_1 )* ) ;
    public final void rule__Packaging__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2726:1: ( ( ( rule__Packaging__OptionsAssignment_2_1 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2727:1: ( ( rule__Packaging__OptionsAssignment_2_1 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2727:1: ( ( rule__Packaging__OptionsAssignment_2_1 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2728:1: ( rule__Packaging__OptionsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackagingAccess().getOptionsAssignment_2_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2729:1: ( rule__Packaging__OptionsAssignment_2_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STRING) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2729:2: rule__Packaging__OptionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Packaging__OptionsAssignment_2_1_in_rule__Packaging__Group_2__1__Impl5713);
            	    rule__Packaging__OptionsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackagingAccess().getOptionsAssignment_2_1()); 
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
    // $ANTLR end "rule__Packaging__Group_2__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2743:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2747:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2748:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__05748);
            rule__Variable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__05751);
            rule__Variable__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2755:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__Alternatives_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2759:1: ( ( ( rule__Variable__Alternatives_0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2760:1: ( ( rule__Variable__Alternatives_0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2760:1: ( ( rule__Variable__Alternatives_0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2761:1: ( rule__Variable__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getAlternatives_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2762:1: ( rule__Variable__Alternatives_0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2762:2: rule__Variable__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Variable__Alternatives_0_in_rule__Variable__Group__0__Impl5778);
            rule__Variable__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2772:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2776:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2777:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__15808);
            rule__Variable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__15811);
            rule__Variable__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2784:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2788:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2789:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2789:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2790:1: ( rule__Variable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2791:1: ( rule__Variable__NameAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2791:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl5838);
            rule__Variable__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2801:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2805:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2806:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__25868);
            rule__Variable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__25871);
            rule__Variable__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2813:1: rule__Variable__Group__2__Impl : ( '=' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2817:1: ( ( '=' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2818:1: ( '=' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2818:1: ( '=' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2819:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 
            }
            match(input,60,FOLLOW_60_in_rule__Variable__Group__2__Impl5899); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2832:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2836:1: ( rule__Variable__Group__3__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2837:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__3__Impl_in_rule__Variable__Group__35930);
            rule__Variable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2843:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ValueAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2847:1: ( ( ( rule__Variable__ValueAssignment_3 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2848:1: ( ( rule__Variable__ValueAssignment_3 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2848:1: ( ( rule__Variable__ValueAssignment_3 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2849:1: ( rule__Variable__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueAssignment_3()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2850:1: ( rule__Variable__ValueAssignment_3 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2850:2: rule__Variable__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Variable__ValueAssignment_3_in_rule__Variable__Group__3__Impl5957);
            rule__Variable__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueAssignment_3()); 
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
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Pack__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2868:1: rule__Pack__Group__0 : rule__Pack__Group__0__Impl rule__Pack__Group__1 ;
    public final void rule__Pack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2872:1: ( rule__Pack__Group__0__Impl rule__Pack__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2873:2: rule__Pack__Group__0__Impl rule__Pack__Group__1
            {
            pushFollow(FOLLOW_rule__Pack__Group__0__Impl_in_rule__Pack__Group__05995);
            rule__Pack__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pack__Group__1_in_rule__Pack__Group__05998);
            rule__Pack__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group__0"


    // $ANTLR start "rule__Pack__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2880:1: rule__Pack__Group__0__Impl : ( 'pack' ) ;
    public final void rule__Pack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2884:1: ( ( 'pack' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2885:1: ( 'pack' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2885:1: ( 'pack' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2886:1: 'pack'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getPackKeyword_0()); 
            }
            match(input,63,FOLLOW_63_in_rule__Pack__Group__0__Impl6026); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getPackKeyword_0()); 
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
    // $ANTLR end "rule__Pack__Group__0__Impl"


    // $ANTLR start "rule__Pack__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2899:1: rule__Pack__Group__1 : rule__Pack__Group__1__Impl rule__Pack__Group__2 ;
    public final void rule__Pack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2903:1: ( rule__Pack__Group__1__Impl rule__Pack__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2904:2: rule__Pack__Group__1__Impl rule__Pack__Group__2
            {
            pushFollow(FOLLOW_rule__Pack__Group__1__Impl_in_rule__Pack__Group__16057);
            rule__Pack__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pack__Group__2_in_rule__Pack__Group__16060);
            rule__Pack__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group__1"


    // $ANTLR start "rule__Pack__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2911:1: rule__Pack__Group__1__Impl : ( ( rule__Pack__NameAssignment_1 ) ) ;
    public final void rule__Pack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2915:1: ( ( ( rule__Pack__NameAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2916:1: ( ( rule__Pack__NameAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2916:1: ( ( rule__Pack__NameAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2917:1: ( rule__Pack__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getNameAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2918:1: ( rule__Pack__NameAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2918:2: rule__Pack__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Pack__NameAssignment_1_in_rule__Pack__Group__1__Impl6087);
            rule__Pack__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Pack__Group__1__Impl"


    // $ANTLR start "rule__Pack__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2928:1: rule__Pack__Group__2 : rule__Pack__Group__2__Impl rule__Pack__Group__3 ;
    public final void rule__Pack__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2932:1: ( rule__Pack__Group__2__Impl rule__Pack__Group__3 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2933:2: rule__Pack__Group__2__Impl rule__Pack__Group__3
            {
            pushFollow(FOLLOW_rule__Pack__Group__2__Impl_in_rule__Pack__Group__26117);
            rule__Pack__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pack__Group__3_in_rule__Pack__Group__26120);
            rule__Pack__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group__2"


    // $ANTLR start "rule__Pack__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2940:1: rule__Pack__Group__2__Impl : ( ( rule__Pack__LabelAssignment_2 ) ) ;
    public final void rule__Pack__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2944:1: ( ( ( rule__Pack__LabelAssignment_2 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2945:1: ( ( rule__Pack__LabelAssignment_2 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2945:1: ( ( rule__Pack__LabelAssignment_2 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2946:1: ( rule__Pack__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getLabelAssignment_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2947:1: ( rule__Pack__LabelAssignment_2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2947:2: rule__Pack__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__Pack__LabelAssignment_2_in_rule__Pack__Group__2__Impl6147);
            rule__Pack__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getLabelAssignment_2()); 
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
    // $ANTLR end "rule__Pack__Group__2__Impl"


    // $ANTLR start "rule__Pack__Group__3"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2957:1: rule__Pack__Group__3 : rule__Pack__Group__3__Impl rule__Pack__Group__4 ;
    public final void rule__Pack__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2961:1: ( rule__Pack__Group__3__Impl rule__Pack__Group__4 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2962:2: rule__Pack__Group__3__Impl rule__Pack__Group__4
            {
            pushFollow(FOLLOW_rule__Pack__Group__3__Impl_in_rule__Pack__Group__36177);
            rule__Pack__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pack__Group__4_in_rule__Pack__Group__36180);
            rule__Pack__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group__3"


    // $ANTLR start "rule__Pack__Group__3__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2969:1: rule__Pack__Group__3__Impl : ( ( rule__Pack__OptionalAssignment_3 )? ) ;
    public final void rule__Pack__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2973:1: ( ( ( rule__Pack__OptionalAssignment_3 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2974:1: ( ( rule__Pack__OptionalAssignment_3 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2974:1: ( ( rule__Pack__OptionalAssignment_3 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2975:1: ( rule__Pack__OptionalAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getOptionalAssignment_3()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2976:1: ( rule__Pack__OptionalAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==85) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2976:2: rule__Pack__OptionalAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Pack__OptionalAssignment_3_in_rule__Pack__Group__3__Impl6207);
                    rule__Pack__OptionalAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getOptionalAssignment_3()); 
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
    // $ANTLR end "rule__Pack__Group__3__Impl"


    // $ANTLR start "rule__Pack__Group__4"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2986:1: rule__Pack__Group__4 : rule__Pack__Group__4__Impl rule__Pack__Group__5 ;
    public final void rule__Pack__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2990:1: ( rule__Pack__Group__4__Impl rule__Pack__Group__5 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2991:2: rule__Pack__Group__4__Impl rule__Pack__Group__5
            {
            pushFollow(FOLLOW_rule__Pack__Group__4__Impl_in_rule__Pack__Group__46238);
            rule__Pack__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pack__Group__5_in_rule__Pack__Group__46241);
            rule__Pack__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group__4"


    // $ANTLR start "rule__Pack__Group__4__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:2998:1: rule__Pack__Group__4__Impl : ( ( rule__Pack__LooseAssignment_4 )? ) ;
    public final void rule__Pack__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3002:1: ( ( ( rule__Pack__LooseAssignment_4 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3003:1: ( ( rule__Pack__LooseAssignment_4 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3003:1: ( ( rule__Pack__LooseAssignment_4 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3004:1: ( rule__Pack__LooseAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getLooseAssignment_4()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3005:1: ( rule__Pack__LooseAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==86) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3005:2: rule__Pack__LooseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Pack__LooseAssignment_4_in_rule__Pack__Group__4__Impl6268);
                    rule__Pack__LooseAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getLooseAssignment_4()); 
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
    // $ANTLR end "rule__Pack__Group__4__Impl"


    // $ANTLR start "rule__Pack__Group__5"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3015:1: rule__Pack__Group__5 : rule__Pack__Group__5__Impl rule__Pack__Group__6 ;
    public final void rule__Pack__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3019:1: ( rule__Pack__Group__5__Impl rule__Pack__Group__6 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3020:2: rule__Pack__Group__5__Impl rule__Pack__Group__6
            {
            pushFollow(FOLLOW_rule__Pack__Group__5__Impl_in_rule__Pack__Group__56299);
            rule__Pack__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pack__Group__6_in_rule__Pack__Group__56302);
            rule__Pack__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group__5"


    // $ANTLR start "rule__Pack__Group__5__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3027:1: rule__Pack__Group__5__Impl : ( ( rule__Pack__KeepAssignment_5 )? ) ;
    public final void rule__Pack__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3031:1: ( ( ( rule__Pack__KeepAssignment_5 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3032:1: ( ( rule__Pack__KeepAssignment_5 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3032:1: ( ( rule__Pack__KeepAssignment_5 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3033:1: ( rule__Pack__KeepAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getKeepAssignment_5()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3034:1: ( rule__Pack__KeepAssignment_5 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==87) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3034:2: rule__Pack__KeepAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Pack__KeepAssignment_5_in_rule__Pack__Group__5__Impl6329);
                    rule__Pack__KeepAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getKeepAssignment_5()); 
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
    // $ANTLR end "rule__Pack__Group__5__Impl"


    // $ANTLR start "rule__Pack__Group__6"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3044:1: rule__Pack__Group__6 : rule__Pack__Group__6__Impl rule__Pack__Group__7 ;
    public final void rule__Pack__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3048:1: ( rule__Pack__Group__6__Impl rule__Pack__Group__7 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3049:2: rule__Pack__Group__6__Impl rule__Pack__Group__7
            {
            pushFollow(FOLLOW_rule__Pack__Group__6__Impl_in_rule__Pack__Group__66360);
            rule__Pack__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pack__Group__7_in_rule__Pack__Group__66363);
            rule__Pack__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group__6"


    // $ANTLR start "rule__Pack__Group__6__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3056:1: rule__Pack__Group__6__Impl : ( ( rule__Pack__ParentAssignment_6 )? ) ;
    public final void rule__Pack__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3060:1: ( ( ( rule__Pack__ParentAssignment_6 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3061:1: ( ( rule__Pack__ParentAssignment_6 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3061:1: ( ( rule__Pack__ParentAssignment_6 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3062:1: ( rule__Pack__ParentAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getParentAssignment_6()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3063:1: ( rule__Pack__ParentAssignment_6 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3063:2: rule__Pack__ParentAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Pack__ParentAssignment_6_in_rule__Pack__Group__6__Impl6390);
                    rule__Pack__ParentAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getParentAssignment_6()); 
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
    // $ANTLR end "rule__Pack__Group__6__Impl"


    // $ANTLR start "rule__Pack__Group__7"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3073:1: rule__Pack__Group__7 : rule__Pack__Group__7__Impl rule__Pack__Group__8 ;
    public final void rule__Pack__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3077:1: ( rule__Pack__Group__7__Impl rule__Pack__Group__8 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3078:2: rule__Pack__Group__7__Impl rule__Pack__Group__8
            {
            pushFollow(FOLLOW_rule__Pack__Group__7__Impl_in_rule__Pack__Group__76421);
            rule__Pack__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pack__Group__8_in_rule__Pack__Group__76424);
            rule__Pack__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group__7"


    // $ANTLR start "rule__Pack__Group__7__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3085:1: rule__Pack__Group__7__Impl : ( ( rule__Pack__FilesAssignment_7 )* ) ;
    public final void rule__Pack__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3089:1: ( ( ( rule__Pack__FilesAssignment_7 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3090:1: ( ( rule__Pack__FilesAssignment_7 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3090:1: ( ( rule__Pack__FilesAssignment_7 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3091:1: ( rule__Pack__FilesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getFilesAssignment_7()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3092:1: ( rule__Pack__FilesAssignment_7 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_STRING) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3092:2: rule__Pack__FilesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Pack__FilesAssignment_7_in_rule__Pack__Group__7__Impl6451);
            	    rule__Pack__FilesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getFilesAssignment_7()); 
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
    // $ANTLR end "rule__Pack__Group__7__Impl"


    // $ANTLR start "rule__Pack__Group__8"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3102:1: rule__Pack__Group__8 : rule__Pack__Group__8__Impl ;
    public final void rule__Pack__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3106:1: ( rule__Pack__Group__8__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3107:2: rule__Pack__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Pack__Group__8__Impl_in_rule__Pack__Group__86482);
            rule__Pack__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group__8"


    // $ANTLR start "rule__Pack__Group__8__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3113:1: rule__Pack__Group__8__Impl : ( ( rule__Pack__Group_8__0 )? ) ;
    public final void rule__Pack__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3117:1: ( ( ( rule__Pack__Group_8__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3118:1: ( ( rule__Pack__Group_8__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3118:1: ( ( rule__Pack__Group_8__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3119:1: ( rule__Pack__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getGroup_8()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3120:1: ( rule__Pack__Group_8__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==64) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3120:2: rule__Pack__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Pack__Group_8__0_in_rule__Pack__Group__8__Impl6509);
                    rule__Pack__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getGroup_8()); 
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
    // $ANTLR end "rule__Pack__Group__8__Impl"


    // $ANTLR start "rule__Pack__Group_8__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3148:1: rule__Pack__Group_8__0 : rule__Pack__Group_8__0__Impl rule__Pack__Group_8__1 ;
    public final void rule__Pack__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3152:1: ( rule__Pack__Group_8__0__Impl rule__Pack__Group_8__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3153:2: rule__Pack__Group_8__0__Impl rule__Pack__Group_8__1
            {
            pushFollow(FOLLOW_rule__Pack__Group_8__0__Impl_in_rule__Pack__Group_8__06558);
            rule__Pack__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pack__Group_8__1_in_rule__Pack__Group_8__06561);
            rule__Pack__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group_8__0"


    // $ANTLR start "rule__Pack__Group_8__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3160:1: rule__Pack__Group_8__0__Impl : ( 'on' ) ;
    public final void rule__Pack__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3164:1: ( ( 'on' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3165:1: ( 'on' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3165:1: ( 'on' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3166:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getOnKeyword_8_0()); 
            }
            match(input,64,FOLLOW_64_in_rule__Pack__Group_8__0__Impl6589); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getOnKeyword_8_0()); 
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
    // $ANTLR end "rule__Pack__Group_8__0__Impl"


    // $ANTLR start "rule__Pack__Group_8__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3179:1: rule__Pack__Group_8__1 : rule__Pack__Group_8__1__Impl ;
    public final void rule__Pack__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3183:1: ( rule__Pack__Group_8__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3184:2: rule__Pack__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Pack__Group_8__1__Impl_in_rule__Pack__Group_8__16620);
            rule__Pack__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pack__Group_8__1"


    // $ANTLR start "rule__Pack__Group_8__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3190:1: rule__Pack__Group_8__1__Impl : ( ( rule__Pack__OsAssignment_8_1 ) ) ;
    public final void rule__Pack__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3194:1: ( ( ( rule__Pack__OsAssignment_8_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3195:1: ( ( rule__Pack__OsAssignment_8_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3195:1: ( ( rule__Pack__OsAssignment_8_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3196:1: ( rule__Pack__OsAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getOsAssignment_8_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3197:1: ( rule__Pack__OsAssignment_8_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3197:2: rule__Pack__OsAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Pack__OsAssignment_8_1_in_rule__Pack__Group_8__1__Impl6647);
            rule__Pack__OsAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getOsAssignment_8_1()); 
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
    // $ANTLR end "rule__Pack__Group_8__1__Impl"


    // $ANTLR start "rule__File__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3211:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3215:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3216:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__06681);
            rule__File__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__File__Group__1_in_rule__File__Group__06684);
            rule__File__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3223:1: rule__File__Group__0__Impl : ( ( rule__File__PathAssignment_0 ) ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3227:1: ( ( ( rule__File__PathAssignment_0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3228:1: ( ( rule__File__PathAssignment_0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3228:1: ( ( rule__File__PathAssignment_0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3229:1: ( rule__File__PathAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getPathAssignment_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3230:1: ( rule__File__PathAssignment_0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3230:2: rule__File__PathAssignment_0
            {
            pushFollow(FOLLOW_rule__File__PathAssignment_0_in_rule__File__Group__0__Impl6711);
            rule__File__PathAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getPathAssignment_0()); 
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
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3240:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3244:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3245:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__16741);
            rule__File__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__File__Group__2_in_rule__File__Group__16744);
            rule__File__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3252:1: rule__File__Group__1__Impl : ( ( rule__File__Group_1__0 )? ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3256:1: ( ( ( rule__File__Group_1__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3257:1: ( ( rule__File__Group_1__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3257:1: ( ( rule__File__Group_1__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3258:1: ( rule__File__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3259:1: ( rule__File__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==66) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3259:2: rule__File__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__File__Group_1__0_in_rule__File__Group__1__Impl6771);
                    rule__File__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getGroup_1()); 
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
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3269:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3273:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3274:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__26802);
            rule__File__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__File__Group__3_in_rule__File__Group__26805);
            rule__File__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3281:1: rule__File__Group__2__Impl : ( 'to' ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3285:1: ( ( 'to' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3286:1: ( 'to' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3286:1: ( 'to' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3287:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getToKeyword_2()); 
            }
            match(input,65,FOLLOW_65_in_rule__File__Group__2__Impl6833); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getToKeyword_2()); 
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
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3300:1: rule__File__Group__3 : rule__File__Group__3__Impl rule__File__Group__4 ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3304:1: ( rule__File__Group__3__Impl rule__File__Group__4 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3305:2: rule__File__Group__3__Impl rule__File__Group__4
            {
            pushFollow(FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__36864);
            rule__File__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__File__Group__4_in_rule__File__Group__36867);
            rule__File__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group__3"


    // $ANTLR start "rule__File__Group__3__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3312:1: rule__File__Group__3__Impl : ( ( rule__File__DestinationAssignment_3 ) ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3316:1: ( ( ( rule__File__DestinationAssignment_3 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3317:1: ( ( rule__File__DestinationAssignment_3 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3317:1: ( ( rule__File__DestinationAssignment_3 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3318:1: ( rule__File__DestinationAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getDestinationAssignment_3()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3319:1: ( rule__File__DestinationAssignment_3 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3319:2: rule__File__DestinationAssignment_3
            {
            pushFollow(FOLLOW_rule__File__DestinationAssignment_3_in_rule__File__Group__3__Impl6894);
            rule__File__DestinationAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getDestinationAssignment_3()); 
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
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__File__Group__4"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3329:1: rule__File__Group__4 : rule__File__Group__4__Impl rule__File__Group__5 ;
    public final void rule__File__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3333:1: ( rule__File__Group__4__Impl rule__File__Group__5 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3334:2: rule__File__Group__4__Impl rule__File__Group__5
            {
            pushFollow(FOLLOW_rule__File__Group__4__Impl_in_rule__File__Group__46924);
            rule__File__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__File__Group__5_in_rule__File__Group__46927);
            rule__File__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group__4"


    // $ANTLR start "rule__File__Group__4__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3341:1: rule__File__Group__4__Impl : ( ( rule__File__Group_4__0 )? ) ;
    public final void rule__File__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3345:1: ( ( ( rule__File__Group_4__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3346:1: ( ( rule__File__Group_4__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3346:1: ( ( rule__File__Group_4__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3347:1: ( rule__File__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup_4()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3348:1: ( rule__File__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==67) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3348:2: rule__File__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__File__Group_4__0_in_rule__File__Group__4__Impl6954);
                    rule__File__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getGroup_4()); 
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
    // $ANTLR end "rule__File__Group__4__Impl"


    // $ANTLR start "rule__File__Group__5"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3358:1: rule__File__Group__5 : rule__File__Group__5__Impl ;
    public final void rule__File__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3362:1: ( rule__File__Group__5__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3363:2: rule__File__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__File__Group__5__Impl_in_rule__File__Group__56985);
            rule__File__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group__5"


    // $ANTLR start "rule__File__Group__5__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3369:1: rule__File__Group__5__Impl : ( ( rule__File__Group_5__0 )? ) ;
    public final void rule__File__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3373:1: ( ( ( rule__File__Group_5__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3374:1: ( ( rule__File__Group_5__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3374:1: ( ( rule__File__Group_5__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3375:1: ( rule__File__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup_5()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3376:1: ( rule__File__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==64) ) {
                switch ( input.LA(2) ) {
                    case 39:
                        {
                        int LA36_3 = input.LA(3);

                        if ( (synpred65_InternalIzpack()) ) {
                            alt36=1;
                        }
                        }
                        break;
                    case 40:
                        {
                        int LA36_4 = input.LA(3);

                        if ( (synpred65_InternalIzpack()) ) {
                            alt36=1;
                        }
                        }
                        break;
                    case 41:
                        {
                        int LA36_5 = input.LA(3);

                        if ( (synpred65_InternalIzpack()) ) {
                            alt36=1;
                        }
                        }
                        break;
                    case 42:
                        {
                        int LA36_6 = input.LA(3);

                        if ( (synpred65_InternalIzpack()) ) {
                            alt36=1;
                        }
                        }
                        break;
                }

            }
            switch (alt36) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3376:2: rule__File__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__File__Group_5__0_in_rule__File__Group__5__Impl7012);
                    rule__File__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getGroup_5()); 
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
    // $ANTLR end "rule__File__Group__5__Impl"


    // $ANTLR start "rule__File__Group_1__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3398:1: rule__File__Group_1__0 : rule__File__Group_1__0__Impl rule__File__Group_1__1 ;
    public final void rule__File__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3402:1: ( rule__File__Group_1__0__Impl rule__File__Group_1__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3403:2: rule__File__Group_1__0__Impl rule__File__Group_1__1
            {
            pushFollow(FOLLOW_rule__File__Group_1__0__Impl_in_rule__File__Group_1__07055);
            rule__File__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__File__Group_1__1_in_rule__File__Group_1__07058);
            rule__File__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group_1__0"


    // $ANTLR start "rule__File__Group_1__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3410:1: rule__File__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__File__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3414:1: ( ( 'as' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3415:1: ( 'as' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3415:1: ( 'as' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3416:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getAsKeyword_1_0()); 
            }
            match(input,66,FOLLOW_66_in_rule__File__Group_1__0__Impl7086); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getAsKeyword_1_0()); 
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
    // $ANTLR end "rule__File__Group_1__0__Impl"


    // $ANTLR start "rule__File__Group_1__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3429:1: rule__File__Group_1__1 : rule__File__Group_1__1__Impl ;
    public final void rule__File__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3433:1: ( rule__File__Group_1__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3434:2: rule__File__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_1__1__Impl_in_rule__File__Group_1__17117);
            rule__File__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group_1__1"


    // $ANTLR start "rule__File__Group_1__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3440:1: rule__File__Group_1__1__Impl : ( ( rule__File__AliasAssignment_1_1 ) ) ;
    public final void rule__File__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3444:1: ( ( ( rule__File__AliasAssignment_1_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3445:1: ( ( rule__File__AliasAssignment_1_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3445:1: ( ( rule__File__AliasAssignment_1_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3446:1: ( rule__File__AliasAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getAliasAssignment_1_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3447:1: ( rule__File__AliasAssignment_1_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3447:2: rule__File__AliasAssignment_1_1
            {
            pushFollow(FOLLOW_rule__File__AliasAssignment_1_1_in_rule__File__Group_1__1__Impl7144);
            rule__File__AliasAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getAliasAssignment_1_1()); 
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
    // $ANTLR end "rule__File__Group_1__1__Impl"


    // $ANTLR start "rule__File__Group_4__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3461:1: rule__File__Group_4__0 : rule__File__Group_4__0__Impl rule__File__Group_4__1 ;
    public final void rule__File__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3465:1: ( rule__File__Group_4__0__Impl rule__File__Group_4__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3466:2: rule__File__Group_4__0__Impl rule__File__Group_4__1
            {
            pushFollow(FOLLOW_rule__File__Group_4__0__Impl_in_rule__File__Group_4__07178);
            rule__File__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__File__Group_4__1_in_rule__File__Group_4__07181);
            rule__File__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group_4__0"


    // $ANTLR start "rule__File__Group_4__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3473:1: rule__File__Group_4__0__Impl : ( 'override' ) ;
    public final void rule__File__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3477:1: ( ( 'override' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3478:1: ( 'override' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3478:1: ( 'override' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3479:1: 'override'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getOverrideKeyword_4_0()); 
            }
            match(input,67,FOLLOW_67_in_rule__File__Group_4__0__Impl7209); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getOverrideKeyword_4_0()); 
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
    // $ANTLR end "rule__File__Group_4__0__Impl"


    // $ANTLR start "rule__File__Group_4__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3492:1: rule__File__Group_4__1 : rule__File__Group_4__1__Impl ;
    public final void rule__File__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3496:1: ( rule__File__Group_4__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3497:2: rule__File__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_4__1__Impl_in_rule__File__Group_4__17240);
            rule__File__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group_4__1"


    // $ANTLR start "rule__File__Group_4__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3503:1: rule__File__Group_4__1__Impl : ( ( rule__File__OverrideAssignment_4_1 ) ) ;
    public final void rule__File__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3507:1: ( ( ( rule__File__OverrideAssignment_4_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3508:1: ( ( rule__File__OverrideAssignment_4_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3508:1: ( ( rule__File__OverrideAssignment_4_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3509:1: ( rule__File__OverrideAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getOverrideAssignment_4_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3510:1: ( rule__File__OverrideAssignment_4_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3510:2: rule__File__OverrideAssignment_4_1
            {
            pushFollow(FOLLOW_rule__File__OverrideAssignment_4_1_in_rule__File__Group_4__1__Impl7267);
            rule__File__OverrideAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getOverrideAssignment_4_1()); 
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
    // $ANTLR end "rule__File__Group_4__1__Impl"


    // $ANTLR start "rule__File__Group_5__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3524:1: rule__File__Group_5__0 : rule__File__Group_5__0__Impl ;
    public final void rule__File__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3528:1: ( rule__File__Group_5__0__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3529:2: rule__File__Group_5__0__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_5__0__Impl_in_rule__File__Group_5__07301);
            rule__File__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group_5__0"


    // $ANTLR start "rule__File__Group_5__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3535:1: rule__File__Group_5__0__Impl : ( ( rule__File__Group_5_0__0 ) ) ;
    public final void rule__File__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3539:1: ( ( ( rule__File__Group_5_0__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3540:1: ( ( rule__File__Group_5_0__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3540:1: ( ( rule__File__Group_5_0__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3541:1: ( rule__File__Group_5_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup_5_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3542:1: ( rule__File__Group_5_0__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3542:2: rule__File__Group_5_0__0
            {
            pushFollow(FOLLOW_rule__File__Group_5_0__0_in_rule__File__Group_5__0__Impl7328);
            rule__File__Group_5_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getGroup_5_0()); 
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
    // $ANTLR end "rule__File__Group_5__0__Impl"


    // $ANTLR start "rule__File__Group_5_0__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3554:1: rule__File__Group_5_0__0 : rule__File__Group_5_0__0__Impl rule__File__Group_5_0__1 ;
    public final void rule__File__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3558:1: ( rule__File__Group_5_0__0__Impl rule__File__Group_5_0__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3559:2: rule__File__Group_5_0__0__Impl rule__File__Group_5_0__1
            {
            pushFollow(FOLLOW_rule__File__Group_5_0__0__Impl_in_rule__File__Group_5_0__07360);
            rule__File__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__File__Group_5_0__1_in_rule__File__Group_5_0__07363);
            rule__File__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group_5_0__0"


    // $ANTLR start "rule__File__Group_5_0__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3566:1: rule__File__Group_5_0__0__Impl : ( 'on' ) ;
    public final void rule__File__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3570:1: ( ( 'on' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3571:1: ( 'on' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3571:1: ( 'on' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3572:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getOnKeyword_5_0_0()); 
            }
            match(input,64,FOLLOW_64_in_rule__File__Group_5_0__0__Impl7391); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getOnKeyword_5_0_0()); 
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
    // $ANTLR end "rule__File__Group_5_0__0__Impl"


    // $ANTLR start "rule__File__Group_5_0__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3585:1: rule__File__Group_5_0__1 : rule__File__Group_5_0__1__Impl ;
    public final void rule__File__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3589:1: ( rule__File__Group_5_0__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3590:2: rule__File__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_5_0__1__Impl_in_rule__File__Group_5_0__17422);
            rule__File__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__File__Group_5_0__1"


    // $ANTLR start "rule__File__Group_5_0__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3596:1: rule__File__Group_5_0__1__Impl : ( ( rule__File__OsAssignment_5_0_1 ) ) ;
    public final void rule__File__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3600:1: ( ( ( rule__File__OsAssignment_5_0_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3601:1: ( ( rule__File__OsAssignment_5_0_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3601:1: ( ( rule__File__OsAssignment_5_0_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3602:1: ( rule__File__OsAssignment_5_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getOsAssignment_5_0_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3603:1: ( rule__File__OsAssignment_5_0_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3603:2: rule__File__OsAssignment_5_0_1
            {
            pushFollow(FOLLOW_rule__File__OsAssignment_5_0_1_in_rule__File__Group_5_0__1__Impl7449);
            rule__File__OsAssignment_5_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getOsAssignment_5_0_1()); 
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
    // $ANTLR end "rule__File__Group_5_0__1__Impl"


    // $ANTLR start "rule__Panel__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3617:1: rule__Panel__Group__0 : rule__Panel__Group__0__Impl rule__Panel__Group__1 ;
    public final void rule__Panel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3621:1: ( rule__Panel__Group__0__Impl rule__Panel__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3622:2: rule__Panel__Group__0__Impl rule__Panel__Group__1
            {
            pushFollow(FOLLOW_rule__Panel__Group__0__Impl_in_rule__Panel__Group__07483);
            rule__Panel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Panel__Group__1_in_rule__Panel__Group__07486);
            rule__Panel__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Panel__Group__0"


    // $ANTLR start "rule__Panel__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3629:1: rule__Panel__Group__0__Impl : ( ( rule__Panel__NameAssignment_0 ) ) ;
    public final void rule__Panel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3633:1: ( ( ( rule__Panel__NameAssignment_0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3634:1: ( ( rule__Panel__NameAssignment_0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3634:1: ( ( rule__Panel__NameAssignment_0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3635:1: ( rule__Panel__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPanelAccess().getNameAssignment_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3636:1: ( rule__Panel__NameAssignment_0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3636:2: rule__Panel__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Panel__NameAssignment_0_in_rule__Panel__Group__0__Impl7513);
            rule__Panel__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPanelAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Panel__Group__0__Impl"


    // $ANTLR start "rule__Panel__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3646:1: rule__Panel__Group__1 : rule__Panel__Group__1__Impl rule__Panel__Group__2 ;
    public final void rule__Panel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3650:1: ( rule__Panel__Group__1__Impl rule__Panel__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3651:2: rule__Panel__Group__1__Impl rule__Panel__Group__2
            {
            pushFollow(FOLLOW_rule__Panel__Group__1__Impl_in_rule__Panel__Group__17543);
            rule__Panel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Panel__Group__2_in_rule__Panel__Group__17546);
            rule__Panel__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Panel__Group__1"


    // $ANTLR start "rule__Panel__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3658:1: rule__Panel__Group__1__Impl : ( ( rule__Panel__ClassnameAssignment_1 ) ) ;
    public final void rule__Panel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3662:1: ( ( ( rule__Panel__ClassnameAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3663:1: ( ( rule__Panel__ClassnameAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3663:1: ( ( rule__Panel__ClassnameAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3664:1: ( rule__Panel__ClassnameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPanelAccess().getClassnameAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3665:1: ( rule__Panel__ClassnameAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3665:2: rule__Panel__ClassnameAssignment_1
            {
            pushFollow(FOLLOW_rule__Panel__ClassnameAssignment_1_in_rule__Panel__Group__1__Impl7573);
            rule__Panel__ClassnameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPanelAccess().getClassnameAssignment_1()); 
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
    // $ANTLR end "rule__Panel__Group__1__Impl"


    // $ANTLR start "rule__Panel__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3675:1: rule__Panel__Group__2 : rule__Panel__Group__2__Impl ;
    public final void rule__Panel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3679:1: ( rule__Panel__Group__2__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3680:2: rule__Panel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Panel__Group__2__Impl_in_rule__Panel__Group__27603);
            rule__Panel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Panel__Group__2"


    // $ANTLR start "rule__Panel__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3686:1: rule__Panel__Group__2__Impl : ( ( rule__Panel__JarAssignment_2 ) ) ;
    public final void rule__Panel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3690:1: ( ( ( rule__Panel__JarAssignment_2 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3691:1: ( ( rule__Panel__JarAssignment_2 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3691:1: ( ( rule__Panel__JarAssignment_2 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3692:1: ( rule__Panel__JarAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPanelAccess().getJarAssignment_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3693:1: ( rule__Panel__JarAssignment_2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3693:2: rule__Panel__JarAssignment_2
            {
            pushFollow(FOLLOW_rule__Panel__JarAssignment_2_in_rule__Panel__Group__2__Impl7630);
            rule__Panel__JarAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPanelAccess().getJarAssignment_2()); 
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
    // $ANTLR end "rule__Panel__Group__2__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3709:1: rule__JvmTypeReference__Group_0__0 : rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1 ;
    public final void rule__JvmTypeReference__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3713:1: ( rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3714:2: rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1
            {
            pushFollow(FOLLOW_rule__JvmTypeReference__Group_0__0__Impl_in_rule__JvmTypeReference__Group_0__07666);
            rule__JvmTypeReference__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmTypeReference__Group_0__1_in_rule__JvmTypeReference__Group_0__07669);
            rule__JvmTypeReference__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0__0"


    // $ANTLR start "rule__JvmTypeReference__Group_0__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3721:1: rule__JvmTypeReference__Group_0__0__Impl : ( ruleJvmParameterizedTypeReference ) ;
    public final void rule__JvmTypeReference__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3725:1: ( ( ruleJvmParameterizedTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3726:1: ( ruleJvmParameterizedTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3726:1: ( ruleJvmParameterizedTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3727:1: ruleJvmParameterizedTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_rule__JvmTypeReference__Group_0__0__Impl7696);
            ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__JvmTypeReference__Group_0__0__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3738:1: rule__JvmTypeReference__Group_0__1 : rule__JvmTypeReference__Group_0__1__Impl ;
    public final void rule__JvmTypeReference__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3742:1: ( rule__JvmTypeReference__Group_0__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3743:2: rule__JvmTypeReference__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__JvmTypeReference__Group_0__1__Impl_in_rule__JvmTypeReference__Group_0__17725);
            rule__JvmTypeReference__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0__1"


    // $ANTLR start "rule__JvmTypeReference__Group_0__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3749:1: rule__JvmTypeReference__Group_0__1__Impl : ( ( rule__JvmTypeReference__Group_0_1__0 )* ) ;
    public final void rule__JvmTypeReference__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3753:1: ( ( ( rule__JvmTypeReference__Group_0_1__0 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3754:1: ( ( rule__JvmTypeReference__Group_0_1__0 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3754:1: ( ( rule__JvmTypeReference__Group_0_1__0 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3755:1: ( rule__JvmTypeReference__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3756:1: ( rule__JvmTypeReference__Group_0_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==68) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3756:2: rule__JvmTypeReference__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JvmTypeReference__Group_0_1__0_in_rule__JvmTypeReference__Group_0__1__Impl7752);
            	    rule__JvmTypeReference__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__JvmTypeReference__Group_0__1__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3770:1: rule__JvmTypeReference__Group_0_1__0 : rule__JvmTypeReference__Group_0_1__0__Impl ;
    public final void rule__JvmTypeReference__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3774:1: ( rule__JvmTypeReference__Group_0_1__0__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3775:2: rule__JvmTypeReference__Group_0_1__0__Impl
            {
            pushFollow(FOLLOW_rule__JvmTypeReference__Group_0_1__0__Impl_in_rule__JvmTypeReference__Group_0_1__07787);
            rule__JvmTypeReference__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1__0"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3781:1: rule__JvmTypeReference__Group_0_1__0__Impl : ( ( rule__JvmTypeReference__Group_0_1_0__0 ) ) ;
    public final void rule__JvmTypeReference__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3785:1: ( ( ( rule__JvmTypeReference__Group_0_1_0__0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3786:1: ( ( rule__JvmTypeReference__Group_0_1_0__0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3786:1: ( ( rule__JvmTypeReference__Group_0_1_0__0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3787:1: ( rule__JvmTypeReference__Group_0_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3788:1: ( rule__JvmTypeReference__Group_0_1_0__0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3788:2: rule__JvmTypeReference__Group_0_1_0__0
            {
            pushFollow(FOLLOW_rule__JvmTypeReference__Group_0_1_0__0_in_rule__JvmTypeReference__Group_0_1__0__Impl7814);
            rule__JvmTypeReference__Group_0_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0()); 
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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1__0__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3800:1: rule__JvmTypeReference__Group_0_1_0__0 : rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1 ;
    public final void rule__JvmTypeReference__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3804:1: ( rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3805:2: rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1
            {
            pushFollow(FOLLOW_rule__JvmTypeReference__Group_0_1_0__0__Impl_in_rule__JvmTypeReference__Group_0_1_0__07846);
            rule__JvmTypeReference__Group_0_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmTypeReference__Group_0_1_0__1_in_rule__JvmTypeReference__Group_0_1_0__07849);
            rule__JvmTypeReference__Group_0_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__0"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3812:1: rule__JvmTypeReference__Group_0_1_0__0__Impl : ( () ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3816:1: ( ( () ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3817:1: ( () )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3817:1: ( () )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3818:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3819:1: ()
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3821:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__0__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3831:1: rule__JvmTypeReference__Group_0_1_0__1 : rule__JvmTypeReference__Group_0_1_0__1__Impl rule__JvmTypeReference__Group_0_1_0__2 ;
    public final void rule__JvmTypeReference__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3835:1: ( rule__JvmTypeReference__Group_0_1_0__1__Impl rule__JvmTypeReference__Group_0_1_0__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3836:2: rule__JvmTypeReference__Group_0_1_0__1__Impl rule__JvmTypeReference__Group_0_1_0__2
            {
            pushFollow(FOLLOW_rule__JvmTypeReference__Group_0_1_0__1__Impl_in_rule__JvmTypeReference__Group_0_1_0__17907);
            rule__JvmTypeReference__Group_0_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmTypeReference__Group_0_1_0__2_in_rule__JvmTypeReference__Group_0_1_0__17910);
            rule__JvmTypeReference__Group_0_1_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__1"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3843:1: rule__JvmTypeReference__Group_0_1_0__1__Impl : ( '[' ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3847:1: ( ( '[' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3848:1: ( '[' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3848:1: ( '[' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3849:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1()); 
            }
            match(input,68,FOLLOW_68_in_rule__JvmTypeReference__Group_0_1_0__1__Impl7938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1()); 
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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__1__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3862:1: rule__JvmTypeReference__Group_0_1_0__2 : rule__JvmTypeReference__Group_0_1_0__2__Impl ;
    public final void rule__JvmTypeReference__Group_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3866:1: ( rule__JvmTypeReference__Group_0_1_0__2__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3867:2: rule__JvmTypeReference__Group_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__JvmTypeReference__Group_0_1_0__2__Impl_in_rule__JvmTypeReference__Group_0_1_0__27969);
            rule__JvmTypeReference__Group_0_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__2"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3873:1: rule__JvmTypeReference__Group_0_1_0__2__Impl : ( ']' ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3877:1: ( ( ']' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3878:1: ( ']' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3878:1: ( ']' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3879:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2()); 
            }
            match(input,69,FOLLOW_69_in_rule__JvmTypeReference__Group_0_1_0__2__Impl7997); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2()); 
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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__2__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3898:1: rule__XFunctionTypeRef__Group__0 : rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1 ;
    public final void rule__XFunctionTypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3902:1: ( rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3903:2: rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group__0__Impl_in_rule__XFunctionTypeRef__Group__08034);
            rule__XFunctionTypeRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group__1_in_rule__XFunctionTypeRef__Group__08037);
            rule__XFunctionTypeRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3910:1: rule__XFunctionTypeRef__Group__0__Impl : ( ( rule__XFunctionTypeRef__Group_0__0 )? ) ;
    public final void rule__XFunctionTypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3914:1: ( ( ( rule__XFunctionTypeRef__Group_0__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3915:1: ( ( rule__XFunctionTypeRef__Group_0__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3915:1: ( ( rule__XFunctionTypeRef__Group_0__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3916:1: ( rule__XFunctionTypeRef__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3917:1: ( rule__XFunctionTypeRef__Group_0__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==71) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3917:2: rule__XFunctionTypeRef__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0__0_in_rule__XFunctionTypeRef__Group__0__Impl8064);
                    rule__XFunctionTypeRef__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup_0()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__Group__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3927:1: rule__XFunctionTypeRef__Group__1 : rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2 ;
    public final void rule__XFunctionTypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3931:1: ( rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3932:2: rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group__1__Impl_in_rule__XFunctionTypeRef__Group__18095);
            rule__XFunctionTypeRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group__2_in_rule__XFunctionTypeRef__Group__18098);
            rule__XFunctionTypeRef__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3939:1: rule__XFunctionTypeRef__Group__1__Impl : ( '=>' ) ;
    public final void rule__XFunctionTypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3943:1: ( ( '=>' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3944:1: ( '=>' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3944:1: ( '=>' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3945:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }
            match(input,70,FOLLOW_70_in_rule__XFunctionTypeRef__Group__1__Impl8126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__Group__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3958:1: rule__XFunctionTypeRef__Group__2 : rule__XFunctionTypeRef__Group__2__Impl ;
    public final void rule__XFunctionTypeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3962:1: ( rule__XFunctionTypeRef__Group__2__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3963:2: rule__XFunctionTypeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group__2__Impl_in_rule__XFunctionTypeRef__Group__28157);
            rule__XFunctionTypeRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group__2"


    // $ANTLR start "rule__XFunctionTypeRef__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3969:1: rule__XFunctionTypeRef__Group__2__Impl : ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) ) ;
    public final void rule__XFunctionTypeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3973:1: ( ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3974:1: ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3974:1: ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3975:1: ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3976:1: ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3976:2: rule__XFunctionTypeRef__ReturnTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__ReturnTypeAssignment_2_in_rule__XFunctionTypeRef__Group__2__Impl8184);
            rule__XFunctionTypeRef__ReturnTypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__Group__2__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3992:1: rule__XFunctionTypeRef__Group_0__0 : rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1 ;
    public final void rule__XFunctionTypeRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3996:1: ( rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3997:2: rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0__0__Impl_in_rule__XFunctionTypeRef__Group_0__08220);
            rule__XFunctionTypeRef__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0__1_in_rule__XFunctionTypeRef__Group_0__08223);
            rule__XFunctionTypeRef__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4004:1: rule__XFunctionTypeRef__Group_0__0__Impl : ( '(' ) ;
    public final void rule__XFunctionTypeRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4008:1: ( ( '(' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4009:1: ( '(' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4009:1: ( '(' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4010:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,71,FOLLOW_71_in_rule__XFunctionTypeRef__Group_0__0__Impl8251); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4023:1: rule__XFunctionTypeRef__Group_0__1 : rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2 ;
    public final void rule__XFunctionTypeRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4027:1: ( rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4028:2: rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0__1__Impl_in_rule__XFunctionTypeRef__Group_0__18282);
            rule__XFunctionTypeRef__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0__2_in_rule__XFunctionTypeRef__Group_0__18285);
            rule__XFunctionTypeRef__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4035:1: rule__XFunctionTypeRef__Group_0__1__Impl : ( ( rule__XFunctionTypeRef__Group_0_1__0 )? ) ;
    public final void rule__XFunctionTypeRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4039:1: ( ( ( rule__XFunctionTypeRef__Group_0_1__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4040:1: ( ( rule__XFunctionTypeRef__Group_0_1__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4040:1: ( ( rule__XFunctionTypeRef__Group_0_1__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4041:1: ( rule__XFunctionTypeRef__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4042:1: ( rule__XFunctionTypeRef__Group_0_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||(LA39_0>=70 && LA39_0<=71)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4042:2: rule__XFunctionTypeRef__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0_1__0_in_rule__XFunctionTypeRef__Group_0__1__Impl8312);
                    rule__XFunctionTypeRef__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4052:1: rule__XFunctionTypeRef__Group_0__2 : rule__XFunctionTypeRef__Group_0__2__Impl ;
    public final void rule__XFunctionTypeRef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4056:1: ( rule__XFunctionTypeRef__Group_0__2__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4057:2: rule__XFunctionTypeRef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0__2__Impl_in_rule__XFunctionTypeRef__Group_0__28343);
            rule__XFunctionTypeRef__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__2"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4063:1: rule__XFunctionTypeRef__Group_0__2__Impl : ( ')' ) ;
    public final void rule__XFunctionTypeRef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4067:1: ( ( ')' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4068:1: ( ')' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4068:1: ( ')' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4069:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,72,FOLLOW_72_in_rule__XFunctionTypeRef__Group_0__2__Impl8371); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__2__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4088:1: rule__XFunctionTypeRef__Group_0_1__0 : rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1 ;
    public final void rule__XFunctionTypeRef__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4092:1: ( rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4093:2: rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0_1__0__Impl_in_rule__XFunctionTypeRef__Group_0_1__08408);
            rule__XFunctionTypeRef__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0_1__1_in_rule__XFunctionTypeRef__Group_0_1__08411);
            rule__XFunctionTypeRef__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4100:1: rule__XFunctionTypeRef__Group_0_1__0__Impl : ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) ) ;
    public final void rule__XFunctionTypeRef__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4104:1: ( ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4105:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4105:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4106:1: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4107:1: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4107:2: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0_in_rule__XFunctionTypeRef__Group_0_1__0__Impl8438);
            rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4117:1: rule__XFunctionTypeRef__Group_0_1__1 : rule__XFunctionTypeRef__Group_0_1__1__Impl ;
    public final void rule__XFunctionTypeRef__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4121:1: ( rule__XFunctionTypeRef__Group_0_1__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4122:2: rule__XFunctionTypeRef__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0_1__1__Impl_in_rule__XFunctionTypeRef__Group_0_1__18468);
            rule__XFunctionTypeRef__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4128:1: rule__XFunctionTypeRef__Group_0_1__1__Impl : ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* ) ;
    public final void rule__XFunctionTypeRef__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4132:1: ( ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4133:1: ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4133:1: ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4134:1: ( rule__XFunctionTypeRef__Group_0_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4135:1: ( rule__XFunctionTypeRef__Group_0_1_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==73) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4135:2: rule__XFunctionTypeRef__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0_1_1__0_in_rule__XFunctionTypeRef__Group_0_1__1__Impl8495);
            	    rule__XFunctionTypeRef__Group_0_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4149:1: rule__XFunctionTypeRef__Group_0_1_1__0 : rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1 ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4153:1: ( rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4154:2: rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0_1_1__0__Impl_in_rule__XFunctionTypeRef__Group_0_1_1__08530);
            rule__XFunctionTypeRef__Group_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0_1_1__1_in_rule__XFunctionTypeRef__Group_0_1_1__08533);
            rule__XFunctionTypeRef__Group_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4161:1: rule__XFunctionTypeRef__Group_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4165:1: ( ( ',' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4166:1: ( ',' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4166:1: ( ',' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4167:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0()); 
            }
            match(input,73,FOLLOW_73_in_rule__XFunctionTypeRef__Group_0_1_1__0__Impl8561); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4180:1: rule__XFunctionTypeRef__Group_0_1_1__1 : rule__XFunctionTypeRef__Group_0_1_1__1__Impl ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4184:1: ( rule__XFunctionTypeRef__Group_0_1_1__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4185:2: rule__XFunctionTypeRef__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__Group_0_1_1__1__Impl_in_rule__XFunctionTypeRef__Group_0_1_1__18592);
            rule__XFunctionTypeRef__Group_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4191:1: rule__XFunctionTypeRef__Group_0_1_1__1__Impl : ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) ) ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4195:1: ( ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4196:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4196:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4197:1: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4198:1: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4198:2: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1_in_rule__XFunctionTypeRef__Group_0_1_1__1__Impl8619);
            rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4212:1: rule__JvmParameterizedTypeReference__Group__0 : rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1 ;
    public final void rule__JvmParameterizedTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4216:1: ( rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4217:2: rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group__0__Impl_in_rule__JvmParameterizedTypeReference__Group__08653);
            rule__JvmParameterizedTypeReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group__1_in_rule__JvmParameterizedTypeReference__Group__08656);
            rule__JvmParameterizedTypeReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4224:1: rule__JvmParameterizedTypeReference__Group__0__Impl : ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4228:1: ( ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4229:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4229:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4230:1: ( rule__JvmParameterizedTypeReference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4231:1: ( rule__JvmParameterizedTypeReference__TypeAssignment_0 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4231:2: rule__JvmParameterizedTypeReference__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__TypeAssignment_0_in_rule__JvmParameterizedTypeReference__Group__0__Impl8683);
            rule__JvmParameterizedTypeReference__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4241:1: rule__JvmParameterizedTypeReference__Group__1 : rule__JvmParameterizedTypeReference__Group__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4245:1: ( rule__JvmParameterizedTypeReference__Group__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4246:2: rule__JvmParameterizedTypeReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group__1__Impl_in_rule__JvmParameterizedTypeReference__Group__18713);
            rule__JvmParameterizedTypeReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4252:1: rule__JvmParameterizedTypeReference__Group__1__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? ) ;
    public final void rule__JvmParameterizedTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4256:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4257:1: ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4257:1: ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4258:1: ( rule__JvmParameterizedTypeReference__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4259:1: ( rule__JvmParameterizedTypeReference__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==74) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4259:2: rule__JvmParameterizedTypeReference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1__0_in_rule__JvmParameterizedTypeReference__Group__1__Impl8740);
                    rule__JvmParameterizedTypeReference__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4273:1: rule__JvmParameterizedTypeReference__Group_1__0 : rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4277:1: ( rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4278:2: rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1__0__Impl_in_rule__JvmParameterizedTypeReference__Group_1__08775);
            rule__JvmParameterizedTypeReference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1__1_in_rule__JvmParameterizedTypeReference__Group_1__08778);
            rule__JvmParameterizedTypeReference__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4285:1: rule__JvmParameterizedTypeReference__Group_1__0__Impl : ( ( '<' ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4289:1: ( ( ( '<' ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4290:1: ( ( '<' ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4290:1: ( ( '<' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4291:1: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4292:1: ( '<' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4293:2: '<'
            {
            match(input,74,FOLLOW_74_in_rule__JvmParameterizedTypeReference__Group_1__0__Impl8807); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4304:1: rule__JvmParameterizedTypeReference__Group_1__1 : rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4308:1: ( rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4309:2: rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1__1__Impl_in_rule__JvmParameterizedTypeReference__Group_1__18839);
            rule__JvmParameterizedTypeReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1__2_in_rule__JvmParameterizedTypeReference__Group_1__18842);
            rule__JvmParameterizedTypeReference__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4316:1: rule__JvmParameterizedTypeReference__Group_1__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4320:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4321:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4321:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4322:1: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4323:1: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4323:2: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1_in_rule__JvmParameterizedTypeReference__Group_1__1__Impl8869);
            rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4333:1: rule__JvmParameterizedTypeReference__Group_1__2 : rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4337:1: ( rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4338:2: rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1__2__Impl_in_rule__JvmParameterizedTypeReference__Group_1__28899);
            rule__JvmParameterizedTypeReference__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1__3_in_rule__JvmParameterizedTypeReference__Group_1__28902);
            rule__JvmParameterizedTypeReference__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__2"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4345:1: rule__JvmParameterizedTypeReference__Group_1__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4349:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4350:1: ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4350:1: ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4351:1: ( rule__JvmParameterizedTypeReference__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4352:1: ( rule__JvmParameterizedTypeReference__Group_1_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==73) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4352:2: rule__JvmParameterizedTypeReference__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1_2__0_in_rule__JvmParameterizedTypeReference__Group_1__2__Impl8929);
            	    rule__JvmParameterizedTypeReference__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__2__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__3"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4362:1: rule__JvmParameterizedTypeReference__Group_1__3 : rule__JvmParameterizedTypeReference__Group_1__3__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4366:1: ( rule__JvmParameterizedTypeReference__Group_1__3__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4367:2: rule__JvmParameterizedTypeReference__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1__3__Impl_in_rule__JvmParameterizedTypeReference__Group_1__38960);
            rule__JvmParameterizedTypeReference__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__3"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__3__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4373:1: rule__JvmParameterizedTypeReference__Group_1__3__Impl : ( '>' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4377:1: ( ( '>' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4378:1: ( '>' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4378:1: ( '>' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4379:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3()); 
            }
            match(input,75,FOLLOW_75_in_rule__JvmParameterizedTypeReference__Group_1__3__Impl8988); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__3__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4400:1: rule__JvmParameterizedTypeReference__Group_1_2__0 : rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4404:1: ( rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4405:2: rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1_2__0__Impl_in_rule__JvmParameterizedTypeReference__Group_1_2__09027);
            rule__JvmParameterizedTypeReference__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1_2__1_in_rule__JvmParameterizedTypeReference__Group_1_2__09030);
            rule__JvmParameterizedTypeReference__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4412:1: rule__JvmParameterizedTypeReference__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4416:1: ( ( ',' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4417:1: ( ',' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4417:1: ( ',' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4418:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,73,FOLLOW_73_in_rule__JvmParameterizedTypeReference__Group_1_2__0__Impl9058); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4431:1: rule__JvmParameterizedTypeReference__Group_1_2__1 : rule__JvmParameterizedTypeReference__Group_1_2__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4435:1: ( rule__JvmParameterizedTypeReference__Group_1_2__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4436:2: rule__JvmParameterizedTypeReference__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__Group_1_2__1__Impl_in_rule__JvmParameterizedTypeReference__Group_1_2__19089);
            rule__JvmParameterizedTypeReference__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4442:1: rule__JvmParameterizedTypeReference__Group_1_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4446:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4447:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4447:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4448:1: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4449:1: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4449:2: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1_in_rule__JvmParameterizedTypeReference__Group_1_2__1__Impl9116);
            rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__1__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4463:1: rule__JvmWildcardTypeReference__Group__0 : rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1 ;
    public final void rule__JvmWildcardTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4467:1: ( rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4468:2: rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1
            {
            pushFollow(FOLLOW_rule__JvmWildcardTypeReference__Group__0__Impl_in_rule__JvmWildcardTypeReference__Group__09150);
            rule__JvmWildcardTypeReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmWildcardTypeReference__Group__1_in_rule__JvmWildcardTypeReference__Group__09153);
            rule__JvmWildcardTypeReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__0"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4475:1: rule__JvmWildcardTypeReference__Group__0__Impl : ( () ) ;
    public final void rule__JvmWildcardTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4479:1: ( ( () ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4480:1: ( () )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4480:1: ( () )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4481:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4482:1: ()
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4484:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__0__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4494:1: rule__JvmWildcardTypeReference__Group__1 : rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2 ;
    public final void rule__JvmWildcardTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4498:1: ( rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4499:2: rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2
            {
            pushFollow(FOLLOW_rule__JvmWildcardTypeReference__Group__1__Impl_in_rule__JvmWildcardTypeReference__Group__19211);
            rule__JvmWildcardTypeReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmWildcardTypeReference__Group__2_in_rule__JvmWildcardTypeReference__Group__19214);
            rule__JvmWildcardTypeReference__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__1"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4506:1: rule__JvmWildcardTypeReference__Group__1__Impl : ( '?' ) ;
    public final void rule__JvmWildcardTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4510:1: ( ( '?' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4511:1: ( '?' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4511:1: ( '?' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4512:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1()); 
            }
            match(input,76,FOLLOW_76_in_rule__JvmWildcardTypeReference__Group__1__Impl9242); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1()); 
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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__1__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4525:1: rule__JvmWildcardTypeReference__Group__2 : rule__JvmWildcardTypeReference__Group__2__Impl ;
    public final void rule__JvmWildcardTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4529:1: ( rule__JvmWildcardTypeReference__Group__2__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4530:2: rule__JvmWildcardTypeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JvmWildcardTypeReference__Group__2__Impl_in_rule__JvmWildcardTypeReference__Group__29273);
            rule__JvmWildcardTypeReference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__2"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__2__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4536:1: rule__JvmWildcardTypeReference__Group__2__Impl : ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? ) ;
    public final void rule__JvmWildcardTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4540:1: ( ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4541:1: ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4541:1: ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4542:1: ( rule__JvmWildcardTypeReference__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4543:1: ( rule__JvmWildcardTypeReference__Alternatives_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==77||LA43_0==79) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4543:2: rule__JvmWildcardTypeReference__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__JvmWildcardTypeReference__Alternatives_2_in_rule__JvmWildcardTypeReference__Group__2__Impl9300);
                    rule__JvmWildcardTypeReference__Alternatives_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__2__Impl"


    // $ANTLR start "rule__JvmUpperBound__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4559:1: rule__JvmUpperBound__Group__0 : rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1 ;
    public final void rule__JvmUpperBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4563:1: ( rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4564:2: rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1
            {
            pushFollow(FOLLOW_rule__JvmUpperBound__Group__0__Impl_in_rule__JvmUpperBound__Group__09337);
            rule__JvmUpperBound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmUpperBound__Group__1_in_rule__JvmUpperBound__Group__09340);
            rule__JvmUpperBound__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmUpperBound__Group__0"


    // $ANTLR start "rule__JvmUpperBound__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4571:1: rule__JvmUpperBound__Group__0__Impl : ( 'extends' ) ;
    public final void rule__JvmUpperBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4575:1: ( ( 'extends' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4576:1: ( 'extends' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4576:1: ( 'extends' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4577:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0()); 
            }
            match(input,77,FOLLOW_77_in_rule__JvmUpperBound__Group__0__Impl9368); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0()); 
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
    // $ANTLR end "rule__JvmUpperBound__Group__0__Impl"


    // $ANTLR start "rule__JvmUpperBound__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4590:1: rule__JvmUpperBound__Group__1 : rule__JvmUpperBound__Group__1__Impl ;
    public final void rule__JvmUpperBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4594:1: ( rule__JvmUpperBound__Group__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4595:2: rule__JvmUpperBound__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JvmUpperBound__Group__1__Impl_in_rule__JvmUpperBound__Group__19399);
            rule__JvmUpperBound__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmUpperBound__Group__1"


    // $ANTLR start "rule__JvmUpperBound__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4601:1: rule__JvmUpperBound__Group__1__Impl : ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmUpperBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4605:1: ( ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4606:1: ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4606:1: ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4607:1: ( rule__JvmUpperBound__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4608:1: ( rule__JvmUpperBound__TypeReferenceAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4608:2: rule__JvmUpperBound__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__JvmUpperBound__TypeReferenceAssignment_1_in_rule__JvmUpperBound__Group__1__Impl9426);
            rule__JvmUpperBound__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1()); 
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
    // $ANTLR end "rule__JvmUpperBound__Group__1__Impl"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4622:1: rule__JvmUpperBoundAnded__Group__0 : rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1 ;
    public final void rule__JvmUpperBoundAnded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4626:1: ( rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4627:2: rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1
            {
            pushFollow(FOLLOW_rule__JvmUpperBoundAnded__Group__0__Impl_in_rule__JvmUpperBoundAnded__Group__09460);
            rule__JvmUpperBoundAnded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmUpperBoundAnded__Group__1_in_rule__JvmUpperBoundAnded__Group__09463);
            rule__JvmUpperBoundAnded__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__0"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4634:1: rule__JvmUpperBoundAnded__Group__0__Impl : ( '&' ) ;
    public final void rule__JvmUpperBoundAnded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4638:1: ( ( '&' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4639:1: ( '&' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4639:1: ( '&' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4640:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0()); 
            }
            match(input,78,FOLLOW_78_in_rule__JvmUpperBoundAnded__Group__0__Impl9491); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0()); 
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
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__0__Impl"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4653:1: rule__JvmUpperBoundAnded__Group__1 : rule__JvmUpperBoundAnded__Group__1__Impl ;
    public final void rule__JvmUpperBoundAnded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4657:1: ( rule__JvmUpperBoundAnded__Group__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4658:2: rule__JvmUpperBoundAnded__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JvmUpperBoundAnded__Group__1__Impl_in_rule__JvmUpperBoundAnded__Group__19522);
            rule__JvmUpperBoundAnded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__1"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4664:1: rule__JvmUpperBoundAnded__Group__1__Impl : ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmUpperBoundAnded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4668:1: ( ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4669:1: ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4669:1: ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4670:1: ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4671:1: ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4671:2: rule__JvmUpperBoundAnded__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__JvmUpperBoundAnded__TypeReferenceAssignment_1_in_rule__JvmUpperBoundAnded__Group__1__Impl9549);
            rule__JvmUpperBoundAnded__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1()); 
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
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__1__Impl"


    // $ANTLR start "rule__JvmLowerBound__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4685:1: rule__JvmLowerBound__Group__0 : rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1 ;
    public final void rule__JvmLowerBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4689:1: ( rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4690:2: rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1
            {
            pushFollow(FOLLOW_rule__JvmLowerBound__Group__0__Impl_in_rule__JvmLowerBound__Group__09583);
            rule__JvmLowerBound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JvmLowerBound__Group__1_in_rule__JvmLowerBound__Group__09586);
            rule__JvmLowerBound__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmLowerBound__Group__0"


    // $ANTLR start "rule__JvmLowerBound__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4697:1: rule__JvmLowerBound__Group__0__Impl : ( 'super' ) ;
    public final void rule__JvmLowerBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4701:1: ( ( 'super' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4702:1: ( 'super' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4702:1: ( 'super' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4703:1: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0()); 
            }
            match(input,79,FOLLOW_79_in_rule__JvmLowerBound__Group__0__Impl9614); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0()); 
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
    // $ANTLR end "rule__JvmLowerBound__Group__0__Impl"


    // $ANTLR start "rule__JvmLowerBound__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4716:1: rule__JvmLowerBound__Group__1 : rule__JvmLowerBound__Group__1__Impl ;
    public final void rule__JvmLowerBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4720:1: ( rule__JvmLowerBound__Group__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4721:2: rule__JvmLowerBound__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JvmLowerBound__Group__1__Impl_in_rule__JvmLowerBound__Group__19645);
            rule__JvmLowerBound__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmLowerBound__Group__1"


    // $ANTLR start "rule__JvmLowerBound__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4727:1: rule__JvmLowerBound__Group__1__Impl : ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmLowerBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4731:1: ( ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4732:1: ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4732:1: ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4733:1: ( rule__JvmLowerBound__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4734:1: ( rule__JvmLowerBound__TypeReferenceAssignment_1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4734:2: rule__JvmLowerBound__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__JvmLowerBound__TypeReferenceAssignment_1_in_rule__JvmLowerBound__Group__1__Impl9672);
            rule__JvmLowerBound__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1()); 
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
    // $ANTLR end "rule__JvmLowerBound__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4750:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4754:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4755:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09708);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09711);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4762:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4766:1: ( ( ruleValidID ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4767:1: ( ruleValidID )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4767:1: ( ruleValidID )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4768:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl9738);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4779:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4783:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4784:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19767);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4790:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4794:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4795:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4795:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4796:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4797:1: ( rule__QualifiedName__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==80) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4797:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9794);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4811:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4815:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4816:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09829);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09832);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4823:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4827:1: ( ( '.' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4828:1: ( '.' )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4828:1: ( '.' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4829:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,80,FOLLOW_80_in_rule__QualifiedName__Group_1__0__Impl9860); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4842:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4846:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4847:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19891);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4853:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4857:1: ( ( ruleValidID ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4858:1: ( ruleValidID )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4858:1: ( ruleValidID )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4859:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl9918);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Installer__IdentificationAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4875:1: rule__Installer__IdentificationAssignment_1 : ( ruleIdentification ) ;
    public final void rule__Installer__IdentificationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4879:1: ( ( ruleIdentification ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4880:1: ( ruleIdentification )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4880:1: ( ruleIdentification )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4881:1: ruleIdentification
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getIdentificationIdentificationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleIdentification_in_rule__Installer__IdentificationAssignment_19956);
            ruleIdentification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getIdentificationIdentificationParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Installer__IdentificationAssignment_1"


    // $ANTLR start "rule__Installer__AuthorsAssignment_2_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4890:1: rule__Installer__AuthorsAssignment_2_1 : ( ruleAuthor ) ;
    public final void rule__Installer__AuthorsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4894:1: ( ( ruleAuthor ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4895:1: ( ruleAuthor )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4895:1: ( ruleAuthor )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4896:1: ruleAuthor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getAuthorsAuthorParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAuthor_in_rule__Installer__AuthorsAssignment_2_19987);
            ruleAuthor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getAuthorsAuthorParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Installer__AuthorsAssignment_2_1"


    // $ANTLR start "rule__Installer__ConstraintAssignment_3_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4905:1: rule__Installer__ConstraintAssignment_3_1 : ( ruleConstraint ) ;
    public final void rule__Installer__ConstraintAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4909:1: ( ( ruleConstraint ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4910:1: ( ruleConstraint )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4910:1: ( ruleConstraint )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4911:1: ruleConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getConstraintConstraintParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraint_in_rule__Installer__ConstraintAssignment_3_110018);
            ruleConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getConstraintConstraintParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Installer__ConstraintAssignment_3_1"


    // $ANTLR start "rule__Installer__UninstallAssignment_4_1_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4920:1: rule__Installer__UninstallAssignment_4_1_1 : ( ruleUninstall ) ;
    public final void rule__Installer__UninstallAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4924:1: ( ( ruleUninstall ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4925:1: ( ruleUninstall )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4925:1: ( ruleUninstall )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4926:1: ruleUninstall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getUninstallUninstallParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleUninstall_in_rule__Installer__UninstallAssignment_4_1_110049);
            ruleUninstall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getUninstallUninstallParserRuleCall_4_1_1_0()); 
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
    // $ANTLR end "rule__Installer__UninstallAssignment_4_1_1"


    // $ANTLR start "rule__Installer__SummarylogAssignment_5_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4935:1: rule__Installer__SummarylogAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Installer__SummarylogAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4939:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4940:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4940:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4941:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getSummarylogSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Installer__SummarylogAssignment_5_110080); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getSummarylogSTRINGTerminalRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__Installer__SummarylogAssignment_5_1"


    // $ANTLR start "rule__Installer__InstallationAssignment_5_2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4950:1: rule__Installer__InstallationAssignment_5_2 : ( ( 'write installation info' ) ) ;
    public final void rule__Installer__InstallationAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4954:1: ( ( ( 'write installation info' ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4955:1: ( ( 'write installation info' ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4955:1: ( ( 'write installation info' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4956:1: ( 'write installation info' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getInstallationWriteInstallationInfoKeyword_5_2_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4957:1: ( 'write installation info' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4958:1: 'write installation info'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getInstallationWriteInstallationInfoKeyword_5_2_0()); 
            }
            match(input,81,FOLLOW_81_in_rule__Installer__InstallationAssignment_5_210116); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getInstallationWriteInstallationInfoKeyword_5_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getInstallationWriteInstallationInfoKeyword_5_2_0()); 
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
    // $ANTLR end "rule__Installer__InstallationAssignment_5_2"


    // $ANTLR start "rule__Installer__PackagingAssignment_6"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4973:1: rule__Installer__PackagingAssignment_6 : ( rulePackaging ) ;
    public final void rule__Installer__PackagingAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4977:1: ( ( rulePackaging ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4978:1: ( rulePackaging )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4978:1: ( rulePackaging )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4979:1: rulePackaging
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getPackagingPackagingParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_rulePackaging_in_rule__Installer__PackagingAssignment_610155);
            rulePackaging();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getPackagingPackagingParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Installer__PackagingAssignment_6"


    // $ANTLR start "rule__Installer__VariablesAssignment_7"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4988:1: rule__Installer__VariablesAssignment_7 : ( ruleVariable ) ;
    public final void rule__Installer__VariablesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4992:1: ( ( ruleVariable ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4993:1: ( ruleVariable )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4993:1: ( ruleVariable )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:4994:1: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getVariablesVariableParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_rule__Installer__VariablesAssignment_710186);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getVariablesVariableParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Installer__VariablesAssignment_7"


    // $ANTLR start "rule__Installer__PacksAssignment_8"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5003:1: rule__Installer__PacksAssignment_8 : ( rulePack ) ;
    public final void rule__Installer__PacksAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5007:1: ( ( rulePack ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5008:1: ( rulePack )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5008:1: ( rulePack )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5009:1: rulePack
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getPacksPackParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_rulePack_in_rule__Installer__PacksAssignment_810217);
            rulePack();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getPacksPackParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__Installer__PacksAssignment_8"


    // $ANTLR start "rule__Installer__LocaleAssignment_9"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5018:1: rule__Installer__LocaleAssignment_9 : ( ruleLocale ) ;
    public final void rule__Installer__LocaleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5022:1: ( ( ruleLocale ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5023:1: ( ruleLocale )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5023:1: ( ruleLocale )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5024:1: ruleLocale
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getLocaleLocaleParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleLocale_in_rule__Installer__LocaleAssignment_910248);
            ruleLocale();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getLocaleLocaleParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__Installer__LocaleAssignment_9"


    // $ANTLR start "rule__Installer__PanelsAssignment_11"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5033:1: rule__Installer__PanelsAssignment_11 : ( rulePanel ) ;
    public final void rule__Installer__PanelsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5037:1: ( ( rulePanel ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5038:1: ( rulePanel )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5038:1: ( rulePanel )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5039:1: rulePanel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstallerAccess().getPanelsPanelParserRuleCall_11_0()); 
            }
            pushFollow(FOLLOW_rulePanel_in_rule__Installer__PanelsAssignment_1110279);
            rulePanel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstallerAccess().getPanelsPanelParserRuleCall_11_0()); 
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
    // $ANTLR end "rule__Installer__PanelsAssignment_11"


    // $ANTLR start "rule__Locale__IsocodesAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5048:1: rule__Locale__IsocodesAssignment_1 : ( ruleISO3Code ) ;
    public final void rule__Locale__IsocodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5052:1: ( ( ruleISO3Code ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5053:1: ( ruleISO3Code )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5053:1: ( ruleISO3Code )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5054:1: ruleISO3Code
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getIsocodesISO3CodeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleISO3Code_in_rule__Locale__IsocodesAssignment_110310);
            ruleISO3Code();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getIsocodesISO3CodeEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__Locale__IsocodesAssignment_1"


    // $ANTLR start "rule__Identification__NameAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5063:1: rule__Identification__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Identification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5067:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5068:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5068:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5069:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Identification__NameAssignment_110341); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Identification__NameAssignment_1"


    // $ANTLR start "rule__Identification__VersionAssignment_2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5078:1: rule__Identification__VersionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Identification__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5082:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5083:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5083:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5084:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Identification__VersionAssignment_210372); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Identification__VersionAssignment_2"


    // $ANTLR start "rule__Identification__UrlAssignment_3_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5093:1: rule__Identification__UrlAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Identification__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5097:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5098:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5098:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5099:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Identification__UrlAssignment_3_110403); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Identification__UrlAssignment_3_1"


    // $ANTLR start "rule__Identification__WebdirAssignment_4_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5108:1: rule__Identification__WebdirAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Identification__WebdirAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5112:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5113:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5113:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5114:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentificationAccess().getWebdirSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Identification__WebdirAssignment_4_110434); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentificationAccess().getWebdirSTRINGTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__Identification__WebdirAssignment_4_1"


    // $ANTLR start "rule__Author__NameAssignment_0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5123:1: rule__Author__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Author__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5127:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5128:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5128:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5129:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Author__NameAssignment_010465); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorAccess().getNameSTRINGTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Author__NameAssignment_0"


    // $ANTLR start "rule__Author__EmailAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5138:1: rule__Author__EmailAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Author__EmailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5142:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5143:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5143:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5144:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Author__EmailAssignment_110496); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Author__EmailAssignment_1"


    // $ANTLR start "rule__Constraint__JavaversionAssignment_0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5153:1: rule__Constraint__JavaversionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Constraint__JavaversionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5157:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5158:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5158:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5159:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getJavaversionSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__JavaversionAssignment_010527); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getJavaversionSTRINGTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Constraint__JavaversionAssignment_0"


    // $ANTLR start "rule__Constraint__RequiredJdkAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5168:1: rule__Constraint__RequiredJdkAssignment_1 : ( ( 'with jdk' ) ) ;
    public final void rule__Constraint__RequiredJdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5172:1: ( ( ( 'with jdk' ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5173:1: ( ( 'with jdk' ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5173:1: ( ( 'with jdk' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5174:1: ( 'with jdk' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getRequiredJdkWithJdkKeyword_1_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5175:1: ( 'with jdk' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5176:1: 'with jdk'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getRequiredJdkWithJdkKeyword_1_0()); 
            }
            match(input,82,FOLLOW_82_in_rule__Constraint__RequiredJdkAssignment_110563); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getRequiredJdkWithJdkKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getRequiredJdkWithJdkKeyword_1_0()); 
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
    // $ANTLR end "rule__Constraint__RequiredJdkAssignment_1"


    // $ANTLR start "rule__Constraint__PackedAssignment_2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5191:1: rule__Constraint__PackedAssignment_2 : ( ( 'packed' ) ) ;
    public final void rule__Constraint__PackedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5195:1: ( ( ( 'packed' ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5196:1: ( ( 'packed' ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5196:1: ( ( 'packed' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5197:1: ( 'packed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getPackedPackedKeyword_2_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5198:1: ( 'packed' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5199:1: 'packed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getPackedPackedKeyword_2_0()); 
            }
            match(input,83,FOLLOW_83_in_rule__Constraint__PackedAssignment_210607); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getPackedPackedKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getPackedPackedKeyword_2_0()); 
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
    // $ANTLR end "rule__Constraint__PackedAssignment_2"


    // $ANTLR start "rule__Uninstall__NameAssignment_0_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5214:1: rule__Uninstall__NameAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Uninstall__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5218:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5219:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5219:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5220:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUninstallAccess().getNameSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Uninstall__NameAssignment_0_110646); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUninstallAccess().getNameSTRINGTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Uninstall__NameAssignment_0_1"


    // $ANTLR start "rule__Uninstall__PathAssignment_1_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5229:1: rule__Uninstall__PathAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Uninstall__PathAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5233:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5234:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5234:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5235:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUninstallAccess().getPathSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Uninstall__PathAssignment_1_110677); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUninstallAccess().getPathSTRINGTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Uninstall__PathAssignment_1_1"


    // $ANTLR start "rule__Option__NameAssignment_0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5244:1: rule__Option__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Option__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5248:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5249:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5249:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5250:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Option__NameAssignment_010708); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getNameSTRINGTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Option__NameAssignment_0"


    // $ANTLR start "rule__Option__ValueAssignment_2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5259:1: rule__Option__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Option__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5263:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5264:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5264:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5265:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Option__ValueAssignment_210739); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Option__ValueAssignment_2"


    // $ANTLR start "rule__Packaging__ClassAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5274:1: rule__Packaging__ClassAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__Packaging__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5278:1: ( ( ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5279:1: ( ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5279:1: ( ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5280:1: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackagingAccess().getClassJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_rule__Packaging__ClassAssignment_110770);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackagingAccess().getClassJvmTypeReferenceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Packaging__ClassAssignment_1"


    // $ANTLR start "rule__Packaging__OptionsAssignment_2_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5289:1: rule__Packaging__OptionsAssignment_2_1 : ( ruleOption ) ;
    public final void rule__Packaging__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5293:1: ( ( ruleOption ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5294:1: ( ruleOption )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5294:1: ( ruleOption )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5295:1: ruleOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackagingAccess().getOptionsOptionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleOption_in_rule__Packaging__OptionsAssignment_2_110801);
            ruleOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackagingAccess().getOptionsOptionParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Packaging__OptionsAssignment_2_1"


    // $ANTLR start "rule__Variable__IsDynamicAssignment_0_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5304:1: rule__Variable__IsDynamicAssignment_0_1 : ( ( 'var' ) ) ;
    public final void rule__Variable__IsDynamicAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5308:1: ( ( ( 'var' ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5309:1: ( ( 'var' ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5309:1: ( ( 'var' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5310:1: ( 'var' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getIsDynamicVarKeyword_0_1_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5311:1: ( 'var' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5312:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getIsDynamicVarKeyword_0_1_0()); 
            }
            match(input,84,FOLLOW_84_in_rule__Variable__IsDynamicAssignment_0_110837); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getIsDynamicVarKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getIsDynamicVarKeyword_0_1_0()); 
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
    // $ANTLR end "rule__Variable__IsDynamicAssignment_0_1"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5327:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5331:1: ( ( RULE_ID ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5332:1: ( RULE_ID )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5332:1: ( RULE_ID )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5333:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_110876); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__ValueAssignment_3"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5342:1: rule__Variable__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Variable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5346:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5347:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5347:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5348:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Variable__ValueAssignment_310907); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Variable__ValueAssignment_3"


    // $ANTLR start "rule__Pack__NameAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5357:1: rule__Pack__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pack__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5361:1: ( ( RULE_ID ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5362:1: ( RULE_ID )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5362:1: ( RULE_ID )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5363:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Pack__NameAssignment_110938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Pack__NameAssignment_1"


    // $ANTLR start "rule__Pack__LabelAssignment_2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5372:1: rule__Pack__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pack__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5376:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5377:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5377:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5378:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pack__LabelAssignment_210969); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Pack__LabelAssignment_2"


    // $ANTLR start "rule__Pack__OptionalAssignment_3"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5387:1: rule__Pack__OptionalAssignment_3 : ( ( 'optional' ) ) ;
    public final void rule__Pack__OptionalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5391:1: ( ( ( 'optional' ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5392:1: ( ( 'optional' ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5392:1: ( ( 'optional' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5393:1: ( 'optional' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getOptionalOptionalKeyword_3_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5394:1: ( 'optional' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5395:1: 'optional'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getOptionalOptionalKeyword_3_0()); 
            }
            match(input,85,FOLLOW_85_in_rule__Pack__OptionalAssignment_311005); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getOptionalOptionalKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getOptionalOptionalKeyword_3_0()); 
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
    // $ANTLR end "rule__Pack__OptionalAssignment_3"


    // $ANTLR start "rule__Pack__LooseAssignment_4"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5410:1: rule__Pack__LooseAssignment_4 : ( ( 'loose' ) ) ;
    public final void rule__Pack__LooseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5414:1: ( ( ( 'loose' ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5415:1: ( ( 'loose' ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5415:1: ( ( 'loose' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5416:1: ( 'loose' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getLooseLooseKeyword_4_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5417:1: ( 'loose' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5418:1: 'loose'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getLooseLooseKeyword_4_0()); 
            }
            match(input,86,FOLLOW_86_in_rule__Pack__LooseAssignment_411049); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getLooseLooseKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getLooseLooseKeyword_4_0()); 
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
    // $ANTLR end "rule__Pack__LooseAssignment_4"


    // $ANTLR start "rule__Pack__KeepAssignment_5"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5433:1: rule__Pack__KeepAssignment_5 : ( ( 'keep' ) ) ;
    public final void rule__Pack__KeepAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5437:1: ( ( ( 'keep' ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5438:1: ( ( 'keep' ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5438:1: ( ( 'keep' ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5439:1: ( 'keep' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getKeepKeepKeyword_5_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5440:1: ( 'keep' )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5441:1: 'keep'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getKeepKeepKeyword_5_0()); 
            }
            match(input,87,FOLLOW_87_in_rule__Pack__KeepAssignment_511093); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getKeepKeepKeyword_5_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getKeepKeepKeyword_5_0()); 
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
    // $ANTLR end "rule__Pack__KeepAssignment_5"


    // $ANTLR start "rule__Pack__ParentAssignment_6"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5456:1: rule__Pack__ParentAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Pack__ParentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5460:1: ( ( ( RULE_ID ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5461:1: ( ( RULE_ID ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5461:1: ( ( RULE_ID ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5462:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getParentPackCrossReference_6_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5463:1: ( RULE_ID )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5464:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getParentPackIDTerminalRuleCall_6_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Pack__ParentAssignment_611136); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getParentPackIDTerminalRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getParentPackCrossReference_6_0()); 
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
    // $ANTLR end "rule__Pack__ParentAssignment_6"


    // $ANTLR start "rule__Pack__FilesAssignment_7"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5475:1: rule__Pack__FilesAssignment_7 : ( ruleFile ) ;
    public final void rule__Pack__FilesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5479:1: ( ( ruleFile ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5480:1: ( ruleFile )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5480:1: ( ruleFile )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5481:1: ruleFile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getFilesFileParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleFile_in_rule__Pack__FilesAssignment_711171);
            ruleFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getFilesFileParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Pack__FilesAssignment_7"


    // $ANTLR start "rule__Pack__OsAssignment_8_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5490:1: rule__Pack__OsAssignment_8_1 : ( ruleOS ) ;
    public final void rule__Pack__OsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5494:1: ( ( ruleOS ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5495:1: ( ruleOS )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5495:1: ( ruleOS )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5496:1: ruleOS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackAccess().getOsOSEnumRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_ruleOS_in_rule__Pack__OsAssignment_8_111202);
            ruleOS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackAccess().getOsOSEnumRuleCall_8_1_0()); 
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
    // $ANTLR end "rule__Pack__OsAssignment_8_1"


    // $ANTLR start "rule__File__PathAssignment_0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5505:1: rule__File__PathAssignment_0 : ( RULE_STRING ) ;
    public final void rule__File__PathAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5509:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5510:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5510:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5511:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getPathSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__File__PathAssignment_011233); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getPathSTRINGTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__File__PathAssignment_0"


    // $ANTLR start "rule__File__AliasAssignment_1_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5520:1: rule__File__AliasAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__File__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5524:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5525:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5525:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5526:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getAliasSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__File__AliasAssignment_1_111264); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getAliasSTRINGTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__File__AliasAssignment_1_1"


    // $ANTLR start "rule__File__DestinationAssignment_3"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5535:1: rule__File__DestinationAssignment_3 : ( RULE_STRING ) ;
    public final void rule__File__DestinationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5539:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5540:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5540:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5541:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getDestinationSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__File__DestinationAssignment_311295); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getDestinationSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__File__DestinationAssignment_3"


    // $ANTLR start "rule__File__OverrideAssignment_4_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5550:1: rule__File__OverrideAssignment_4_1 : ( ruleOverrideFlag ) ;
    public final void rule__File__OverrideAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5554:1: ( ( ruleOverrideFlag ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5555:1: ( ruleOverrideFlag )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5555:1: ( ruleOverrideFlag )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5556:1: ruleOverrideFlag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getOverrideOverrideFlagEnumRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleOverrideFlag_in_rule__File__OverrideAssignment_4_111326);
            ruleOverrideFlag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getOverrideOverrideFlagEnumRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__File__OverrideAssignment_4_1"


    // $ANTLR start "rule__File__OsAssignment_5_0_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5565:1: rule__File__OsAssignment_5_0_1 : ( ruleOS ) ;
    public final void rule__File__OsAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5569:1: ( ( ruleOS ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5570:1: ( ruleOS )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5570:1: ( ruleOS )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5571:1: ruleOS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getOsOSEnumRuleCall_5_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleOS_in_rule__File__OsAssignment_5_0_111357);
            ruleOS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getOsOSEnumRuleCall_5_0_1_0()); 
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
    // $ANTLR end "rule__File__OsAssignment_5_0_1"


    // $ANTLR start "rule__Panel__NameAssignment_0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5580:1: rule__Panel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Panel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5584:1: ( ( RULE_ID ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5585:1: ( RULE_ID )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5585:1: ( RULE_ID )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5586:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPanelAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Panel__NameAssignment_011388); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPanelAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Panel__NameAssignment_0"


    // $ANTLR start "rule__Panel__ClassnameAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5595:1: rule__Panel__ClassnameAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__Panel__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5599:1: ( ( ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5600:1: ( ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5600:1: ( ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5601:1: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPanelAccess().getClassnameJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_rule__Panel__ClassnameAssignment_111419);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPanelAccess().getClassnameJvmTypeReferenceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Panel__ClassnameAssignment_1"


    // $ANTLR start "rule__Panel__JarAssignment_2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5610:1: rule__Panel__JarAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Panel__JarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5614:1: ( ( RULE_STRING ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5615:1: ( RULE_STRING )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5615:1: ( RULE_STRING )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5616:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPanelAccess().getJarSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Panel__JarAssignment_211450); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPanelAccess().getJarSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Panel__JarAssignment_2"


    // $ANTLR start "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5625:1: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5629:1: ( ( ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5630:1: ( ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5630:1: ( ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5631:1: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_rule__XFunctionTypeRef__ParamTypesAssignment_0_1_011481);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0"


    // $ANTLR start "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5640:1: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5644:1: ( ( ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5645:1: ( ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5645:1: ( ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5646:1: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_111512);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1"


    // $ANTLR start "rule__XFunctionTypeRef__ReturnTypeAssignment_2"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5655:1: rule__XFunctionTypeRef__ReturnTypeAssignment_2 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5659:1: ( ( ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5660:1: ( ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5660:1: ( ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5661:1: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_rule__XFunctionTypeRef__ReturnTypeAssignment_211543);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__XFunctionTypeRef__ReturnTypeAssignment_2"


    // $ANTLR start "rule__JvmParameterizedTypeReference__TypeAssignment_0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5670:1: rule__JvmParameterizedTypeReference__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__JvmParameterizedTypeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5674:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5675:1: ( ( ruleQualifiedName ) )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5675:1: ( ( ruleQualifiedName ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5676:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
            }
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5677:1: ( ruleQualifiedName )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5678:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__JvmParameterizedTypeReference__TypeAssignment_011578);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__TypeAssignment_0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5689:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5693:1: ( ( ruleJvmArgumentTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5694:1: ( ruleJvmArgumentTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5694:1: ( ruleJvmArgumentTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5695:1: ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_111613);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5704:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5708:1: ( ( ruleJvmArgumentTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5709:1: ( ruleJvmArgumentTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5709:1: ( ruleJvmArgumentTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5710:1: ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_111644);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5719:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0 : ( ruleJvmUpperBound ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5723:1: ( ( ruleJvmUpperBound ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5724:1: ( ruleJvmUpperBound )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5724:1: ( ruleJvmUpperBound )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5725:1: ruleJvmUpperBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_rule__JvmWildcardTypeReference__ConstraintsAssignment_2_011675);
            ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0"


    // $ANTLR start "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5734:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1 : ( ruleJvmLowerBound ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5738:1: ( ( ruleJvmLowerBound ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5739:1: ( ruleJvmLowerBound )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5739:1: ( ruleJvmLowerBound )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5740:1: ruleJvmLowerBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_rule__JvmWildcardTypeReference__ConstraintsAssignment_2_111706);
            ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1"


    // $ANTLR start "rule__JvmUpperBound__TypeReferenceAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5749:1: rule__JvmUpperBound__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmUpperBound__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5753:1: ( ( ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5754:1: ( ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5754:1: ( ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5755:1: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_rule__JvmUpperBound__TypeReferenceAssignment_111737);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__JvmUpperBound__TypeReferenceAssignment_1"


    // $ANTLR start "rule__JvmUpperBoundAnded__TypeReferenceAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5764:1: rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmUpperBoundAnded__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5768:1: ( ( ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5769:1: ( ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5769:1: ( ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5770:1: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_rule__JvmUpperBoundAnded__TypeReferenceAssignment_111768);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__JvmUpperBoundAnded__TypeReferenceAssignment_1"


    // $ANTLR start "rule__JvmLowerBound__TypeReferenceAssignment_1"
    // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5779:1: rule__JvmLowerBound__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmLowerBound__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5783:1: ( ( ruleJvmTypeReference ) )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5784:1: ( ruleJvmTypeReference )
            {
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5784:1: ( ruleJvmTypeReference )
            // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:5785:1: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_rule__JvmLowerBound__TypeReferenceAssignment_111799);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__JvmLowerBound__TypeReferenceAssignment_1"

    // $ANTLR start synpred65_InternalIzpack
    public final void synpred65_InternalIzpack_fragment() throws RecognitionException {   
        // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3376:2: ( rule__File__Group_5__0 )
        // ../com.devoxx2012.xtext.izpack.ui/src-gen/com/devoxx2012/xtext/ui/contentassist/antlr/internal/InternalIzpack.g:3376:2: rule__File__Group_5__0
        {
        pushFollow(FOLLOW_rule__File__Group_5__0_in_synpred65_InternalIzpack7012);
        rule__File__Group_5__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalIzpack

    // Delegated rules

    public final boolean synpred65_InternalIzpack() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalIzpack_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleInstaller_in_entryRuleInstaller67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstaller74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__0_in_ruleInstaller100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocale_in_entryRuleLocale127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocale134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Locale__Group__0_in_ruleLocale160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentification_in_entryRuleIdentification187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentification194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group__0_in_ruleIdentification220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthor_in_entryRuleAuthor247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthor254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Author__Group__0_in_ruleAuthor280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUninstall_in_entryRuleUninstall367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUninstall374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__Group__0_in_ruleUninstall400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0_in_ruleOption460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackaging_in_entryRulePackaging487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackaging494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Packaging__Group__0_in_rulePackaging520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePack_in_entryRulePack607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePack614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group__0_in_rulePack640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0_in_ruleFile700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePanel_in_entryRulePanel727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePanel734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__Group__0_in_rulePanel760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Alternatives_in_ruleJvmTypeReference820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group__0_in_ruleXFunctionTypeRef880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group__0_in_ruleJvmParameterizedTypeReference940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmArgumentTypeReference__Alternatives_in_ruleJvmArgumentTypeReference1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmWildcardTypeReference__Group__0_in_ruleJvmWildcardTypeReference1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmUpperBound__Group__0_in_ruleJvmUpperBound1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmUpperBoundAnded__Group__0_in_ruleJvmUpperBoundAnded1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmLowerBound__Group__0_in_ruleJvmLowerBound1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ISO3Code__Alternatives_in_ruleISO3Code1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OS__Alternatives_in_ruleOS1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverrideFlag__Alternatives_in_ruleOverrideFlag1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Installer__Alternatives_4_11506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__UninstallAssignment_4_1_1_in_rule__Installer__Alternatives_4_11525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Variable__Alternatives_01559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__IsDynamicAssignment_0_1_in_rule__Variable__Alternatives_01578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0__0_in_rule__JvmTypeReference__Alternatives1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_rule__JvmTypeReference__Alternatives1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rule__JvmArgumentTypeReference__Alternatives1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_rule__JvmArgumentTypeReference__Alternatives1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_in_rule__JvmWildcardTypeReference__Alternatives_21710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_in_rule__JvmWildcardTypeReference__Alternatives_21728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ISO3Code__Alternatives1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ISO3Code__Alternatives1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ISO3Code__Alternatives1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ISO3Code__Alternatives1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ISO3Code__Alternatives1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ISO3Code__Alternatives1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ISO3Code__Alternatives1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ISO3Code__Alternatives1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ISO3Code__Alternatives1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ISO3Code__Alternatives1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ISO3Code__Alternatives1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ISO3Code__Alternatives1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ISO3Code__Alternatives2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ISO3Code__Alternatives2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ISO3Code__Alternatives2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ISO3Code__Alternatives2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ISO3Code__Alternatives2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ISO3Code__Alternatives2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ISO3Code__Alternatives2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ISO3Code__Alternatives2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ISO3Code__Alternatives2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ISO3Code__Alternatives2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ISO3Code__Alternatives2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ISO3Code__Alternatives2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ISO3Code__Alternatives2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ISO3Code__Alternatives2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__OS__Alternatives2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__OS__Alternatives2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__OS__Alternatives2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__OS__Alternatives2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__OverrideFlag__Alternatives2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__OverrideFlag__Alternatives2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__OverrideFlag__Alternatives2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__OverrideFlag__Alternatives2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__OverrideFlag__Alternatives2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__0__Impl_in_rule__Installer__Group__02540 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Installer__Group__1_in_rule__Installer__Group__02543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Installer__Group__0__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__1__Impl_in_rule__Installer__Group__12602 = new BitSet(new long[]{0xA03C000000001000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Installer__Group__2_in_rule__Installer__Group__12605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__IdentificationAssignment_1_in_rule__Installer__Group__1__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__2__Impl_in_rule__Installer__Group__22662 = new BitSet(new long[]{0xA03C000000001000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Installer__Group__3_in_rule__Installer__Group__22665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_2__0_in_rule__Installer__Group__2__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__3__Impl_in_rule__Installer__Group__32723 = new BitSet(new long[]{0xA03C000000001000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Installer__Group__4_in_rule__Installer__Group__32726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_3__0_in_rule__Installer__Group__3__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__4__Impl_in_rule__Installer__Group__42784 = new BitSet(new long[]{0xA03C000000001000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Installer__Group__5_in_rule__Installer__Group__42787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_4__0_in_rule__Installer__Group__4__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__5__Impl_in_rule__Installer__Group__52845 = new BitSet(new long[]{0xA03C000000001000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Installer__Group__6_in_rule__Installer__Group__52848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_5__0_in_rule__Installer__Group__5__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__6__Impl_in_rule__Installer__Group__62906 = new BitSet(new long[]{0xA03C000000001000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Installer__Group__7_in_rule__Installer__Group__62909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__PackagingAssignment_6_in_rule__Installer__Group__6__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__7__Impl_in_rule__Installer__Group__72967 = new BitSet(new long[]{0xA03C000000001000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Installer__Group__8_in_rule__Installer__Group__72970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__VariablesAssignment_7_in_rule__Installer__Group__7__Impl2997 = new BitSet(new long[]{0x0000000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Installer__Group__8__Impl_in_rule__Installer__Group__83028 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Installer__Group__9_in_rule__Installer__Group__83031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__PacksAssignment_8_in_rule__Installer__Group__8__Impl3060 = new BitSet(new long[]{0xA03C000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Installer__PacksAssignment_8_in_rule__Installer__Group__8__Impl3072 = new BitSet(new long[]{0xA03C000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Installer__Group__9__Impl_in_rule__Installer__Group__93105 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Installer__Group__10_in_rule__Installer__Group__93108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__LocaleAssignment_9_in_rule__Installer__Group__9__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__10__Impl_in_rule__Installer__Group__103165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Installer__Group__11_in_rule__Installer__Group__103168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Installer__Group__10__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group__11__Impl_in_rule__Installer__Group__113227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__PanelsAssignment_11_in_rule__Installer__Group__11__Impl3256 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Installer__PanelsAssignment_11_in_rule__Installer__Group__11__Impl3268 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Installer__Group_2__0__Impl_in_rule__Installer__Group_2__03325 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Installer__Group_2__1_in_rule__Installer__Group_2__03328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Installer__Group_2__0__Impl3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_2__1__Impl_in_rule__Installer__Group_2__13387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__AuthorsAssignment_2_1_in_rule__Installer__Group_2__1__Impl3414 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Installer__Group_3__0__Impl_in_rule__Installer__Group_3__03449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Installer__Group_3__1_in_rule__Installer__Group_3__03452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Installer__Group_3__0__Impl3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_3__1__Impl_in_rule__Installer__Group_3__13511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__ConstraintAssignment_3_1_in_rule__Installer__Group_3__1__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_4__0__Impl_in_rule__Installer__Group_4__03572 = new BitSet(new long[]{0x0C00000000000800L});
    public static final BitSet FOLLOW_rule__Installer__Group_4__1_in_rule__Installer__Group_4__03575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Installer__Group_4__0__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_4__1__Impl_in_rule__Installer__Group_4__13634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Alternatives_4_1_in_rule__Installer__Group_4__1__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_5__0__Impl_in_rule__Installer__Group_5__03695 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Installer__Group_5__1_in_rule__Installer__Group_5__03698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Installer__Group_5__0__Impl3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_5__1__Impl_in_rule__Installer__Group_5__13757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Installer__Group_5__2_in_rule__Installer__Group_5__13760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__SummarylogAssignment_5_1_in_rule__Installer__Group_5__1__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__Group_5__2__Impl_in_rule__Installer__Group_5__23817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Installer__InstallationAssignment_5_2_in_rule__Installer__Group_5__2__Impl3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Locale__Group__0__Impl_in_rule__Locale__Group__03881 = new BitSet(new long[]{0x0000007FFFFFE000L});
    public static final BitSet FOLLOW_rule__Locale__Group__1_in_rule__Locale__Group__03884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Locale__Group__0__Impl3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Locale__Group__1__Impl_in_rule__Locale__Group__13943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Locale__IsocodesAssignment_1_in_rule__Locale__Group__1__Impl3972 = new BitSet(new long[]{0x0000007FFFFFE002L});
    public static final BitSet FOLLOW_rule__Locale__IsocodesAssignment_1_in_rule__Locale__Group__1__Impl3984 = new BitSet(new long[]{0x0000007FFFFFE002L});
    public static final BitSet FOLLOW_rule__Identification__Group__0__Impl_in_rule__Identification__Group__04021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Identification__Group__1_in_rule__Identification__Group__04024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Identification__Group__0__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group__1__Impl_in_rule__Identification__Group__14083 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Identification__Group__2_in_rule__Identification__Group__14086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__NameAssignment_1_in_rule__Identification__Group__1__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group__2__Impl_in_rule__Identification__Group__24143 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__Identification__Group__3_in_rule__Identification__Group__24146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__VersionAssignment_2_in_rule__Identification__Group__2__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group__3__Impl_in_rule__Identification__Group__34203 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__Identification__Group__4_in_rule__Identification__Group__34206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group_3__0_in_rule__Identification__Group__3__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group__4__Impl_in_rule__Identification__Group__44264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group_4__0_in_rule__Identification__Group__4__Impl4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group_3__0__Impl_in_rule__Identification__Group_3__04332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Identification__Group_3__1_in_rule__Identification__Group_3__04335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Identification__Group_3__0__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group_3__1__Impl_in_rule__Identification__Group_3__14394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__UrlAssignment_3_1_in_rule__Identification__Group_3__1__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group_4__0__Impl_in_rule__Identification__Group_4__04455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Identification__Group_4__1_in_rule__Identification__Group_4__04458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Identification__Group_4__0__Impl4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__Group_4__1__Impl_in_rule__Identification__Group_4__14517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identification__WebdirAssignment_4_1_in_rule__Identification__Group_4__1__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Author__Group__0__Impl_in_rule__Author__Group__04578 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Author__Group__1_in_rule__Author__Group__04581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Author__NameAssignment_0_in_rule__Author__Group__0__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Author__Group__1__Impl_in_rule__Author__Group__14638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Author__EmailAssignment_1_in_rule__Author__Group__1__Impl4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__04699 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__04702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__JavaversionAssignment_0_in_rule__Constraint__Group__0__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__14759 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__14762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__RequiredJdkAssignment_1_in_rule__Constraint__Group__1__Impl4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__24820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__PackedAssignment_2_in_rule__Constraint__Group__2__Impl4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__Group__0__Impl_in_rule__Uninstall__Group__04884 = new BitSet(new long[]{0x0C00000000000800L});
    public static final BitSet FOLLOW_rule__Uninstall__Group__1_in_rule__Uninstall__Group__04887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__Group_0__0_in_rule__Uninstall__Group__0__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__Group__1__Impl_in_rule__Uninstall__Group__14945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__Group_1__0_in_rule__Uninstall__Group__1__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__Group_0__0__Impl_in_rule__Uninstall__Group_0__05007 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Uninstall__Group_0__1_in_rule__Uninstall__Group_0__05010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Uninstall__Group_0__0__Impl5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__Group_0__1__Impl_in_rule__Uninstall__Group_0__15069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__NameAssignment_0_1_in_rule__Uninstall__Group_0__1__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__Group_1__0__Impl_in_rule__Uninstall__Group_1__05130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Uninstall__Group_1__1_in_rule__Uninstall__Group_1__05133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Uninstall__Group_1__0__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__Group_1__1__Impl_in_rule__Uninstall__Group_1__15192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uninstall__PathAssignment_1_1_in_rule__Uninstall__Group_1__1__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__05253 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__05256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__NameAssignment_0_in_rule__Option__Group__0__Impl5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__15313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Option__Group__2_in_rule__Option__Group__15316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Option__Group__1__Impl5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__25375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__ValueAssignment_2_in_rule__Option__Group__2__Impl5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Packaging__Group__0__Impl_in_rule__Packaging__Group__05438 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Packaging__Group__1_in_rule__Packaging__Group__05441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Packaging__Group__0__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Packaging__Group__1__Impl_in_rule__Packaging__Group__15500 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__Packaging__Group__2_in_rule__Packaging__Group__15503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Packaging__ClassAssignment_1_in_rule__Packaging__Group__1__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Packaging__Group__2__Impl_in_rule__Packaging__Group__25560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Packaging__Group_2__0_in_rule__Packaging__Group__2__Impl5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Packaging__Group_2__0__Impl_in_rule__Packaging__Group_2__05624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Packaging__Group_2__1_in_rule__Packaging__Group_2__05627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Packaging__Group_2__0__Impl5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Packaging__Group_2__1__Impl_in_rule__Packaging__Group_2__15686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Packaging__OptionsAssignment_2_1_in_rule__Packaging__Group_2__1__Impl5713 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__05748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__05751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Alternatives_0_in_rule__Variable__Group__0__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__15808 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__15811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__25868 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__25871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Variable__Group__2__Impl5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__3__Impl_in_rule__Variable__Group__35930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ValueAssignment_3_in_rule__Variable__Group__3__Impl5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group__0__Impl_in_rule__Pack__Group__05995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pack__Group__1_in_rule__Pack__Group__05998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Pack__Group__0__Impl6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group__1__Impl_in_rule__Pack__Group__16057 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Pack__Group__2_in_rule__Pack__Group__16060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__NameAssignment_1_in_rule__Pack__Group__1__Impl6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group__2__Impl_in_rule__Pack__Group__26117 = new BitSet(new long[]{0x0000000000000030L,0x0000000000E00001L});
    public static final BitSet FOLLOW_rule__Pack__Group__3_in_rule__Pack__Group__26120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__LabelAssignment_2_in_rule__Pack__Group__2__Impl6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group__3__Impl_in_rule__Pack__Group__36177 = new BitSet(new long[]{0x0000000000000030L,0x0000000000E00001L});
    public static final BitSet FOLLOW_rule__Pack__Group__4_in_rule__Pack__Group__36180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__OptionalAssignment_3_in_rule__Pack__Group__3__Impl6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group__4__Impl_in_rule__Pack__Group__46238 = new BitSet(new long[]{0x0000000000000030L,0x0000000000E00001L});
    public static final BitSet FOLLOW_rule__Pack__Group__5_in_rule__Pack__Group__46241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__LooseAssignment_4_in_rule__Pack__Group__4__Impl6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group__5__Impl_in_rule__Pack__Group__56299 = new BitSet(new long[]{0x0000000000000030L,0x0000000000E00001L});
    public static final BitSet FOLLOW_rule__Pack__Group__6_in_rule__Pack__Group__56302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__KeepAssignment_5_in_rule__Pack__Group__5__Impl6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group__6__Impl_in_rule__Pack__Group__66360 = new BitSet(new long[]{0x0000000000000030L,0x0000000000E00001L});
    public static final BitSet FOLLOW_rule__Pack__Group__7_in_rule__Pack__Group__66363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__ParentAssignment_6_in_rule__Pack__Group__6__Impl6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group__7__Impl_in_rule__Pack__Group__76421 = new BitSet(new long[]{0x0000000000000030L,0x0000000000E00001L});
    public static final BitSet FOLLOW_rule__Pack__Group__8_in_rule__Pack__Group__76424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__FilesAssignment_7_in_rule__Pack__Group__7__Impl6451 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Pack__Group__8__Impl_in_rule__Pack__Group__86482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group_8__0_in_rule__Pack__Group__8__Impl6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group_8__0__Impl_in_rule__Pack__Group_8__06558 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_rule__Pack__Group_8__1_in_rule__Pack__Group_8__06561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Pack__Group_8__0__Impl6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__Group_8__1__Impl_in_rule__Pack__Group_8__16620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pack__OsAssignment_8_1_in_rule__Pack__Group_8__1__Impl6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__06681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__06684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__PathAssignment_0_in_rule__File__Group__0__Impl6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__16741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_rule__File__Group__2_in_rule__File__Group__16744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_1__0_in_rule__File__Group__1__Impl6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__26802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__File__Group__3_in_rule__File__Group__26805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__File__Group__2__Impl6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__36864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_rule__File__Group__4_in_rule__File__Group__36867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__DestinationAssignment_3_in_rule__File__Group__3__Impl6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__4__Impl_in_rule__File__Group__46924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_rule__File__Group__5_in_rule__File__Group__46927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__0_in_rule__File__Group__4__Impl6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__5__Impl_in_rule__File__Group__56985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_5__0_in_rule__File__Group__5__Impl7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_1__0__Impl_in_rule__File__Group_1__07055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__File__Group_1__1_in_rule__File__Group_1__07058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__File__Group_1__0__Impl7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_1__1__Impl_in_rule__File__Group_1__17117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__AliasAssignment_1_1_in_rule__File__Group_1__1__Impl7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__0__Impl_in_rule__File__Group_4__07178 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_rule__File__Group_4__1_in_rule__File__Group_4__07181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__File__Group_4__0__Impl7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__1__Impl_in_rule__File__Group_4__17240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__OverrideAssignment_4_1_in_rule__File__Group_4__1__Impl7267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_5__0__Impl_in_rule__File__Group_5__07301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_5_0__0_in_rule__File__Group_5__0__Impl7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_5_0__0__Impl_in_rule__File__Group_5_0__07360 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_rule__File__Group_5_0__1_in_rule__File__Group_5_0__07363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__File__Group_5_0__0__Impl7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_5_0__1__Impl_in_rule__File__Group_5_0__17422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__OsAssignment_5_0_1_in_rule__File__Group_5_0__1__Impl7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__Group__0__Impl_in_rule__Panel__Group__07483 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Panel__Group__1_in_rule__Panel__Group__07486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__NameAssignment_0_in_rule__Panel__Group__0__Impl7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__Group__1__Impl_in_rule__Panel__Group__17543 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Panel__Group__2_in_rule__Panel__Group__17546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__ClassnameAssignment_1_in_rule__Panel__Group__1__Impl7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__Group__2__Impl_in_rule__Panel__Group__27603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__JarAssignment_2_in_rule__Panel__Group__2__Impl7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0__0__Impl_in_rule__JvmTypeReference__Group_0__07666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0__1_in_rule__JvmTypeReference__Group_0__07669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_rule__JvmTypeReference__Group_0__0__Impl7696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0__1__Impl_in_rule__JvmTypeReference__Group_0__17725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0_1__0_in_rule__JvmTypeReference__Group_0__1__Impl7752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0_1__0__Impl_in_rule__JvmTypeReference__Group_0_1__07787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0_1_0__0_in_rule__JvmTypeReference__Group_0_1__0__Impl7814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0_1_0__0__Impl_in_rule__JvmTypeReference__Group_0_1_0__07846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0_1_0__1_in_rule__JvmTypeReference__Group_0_1_0__07849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0_1_0__1__Impl_in_rule__JvmTypeReference__Group_0_1_0__17907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0_1_0__2_in_rule__JvmTypeReference__Group_0_1_0__17910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__JvmTypeReference__Group_0_1_0__1__Impl7938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmTypeReference__Group_0_1_0__2__Impl_in_rule__JvmTypeReference__Group_0_1_0__27969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__JvmTypeReference__Group_0_1_0__2__Impl7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group__0__Impl_in_rule__XFunctionTypeRef__Group__08034 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group__1_in_rule__XFunctionTypeRef__Group__08037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0__0_in_rule__XFunctionTypeRef__Group__0__Impl8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group__1__Impl_in_rule__XFunctionTypeRef__Group__18095 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group__2_in_rule__XFunctionTypeRef__Group__18098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__XFunctionTypeRef__Group__1__Impl8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group__2__Impl_in_rule__XFunctionTypeRef__Group__28157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__ReturnTypeAssignment_2_in_rule__XFunctionTypeRef__Group__2__Impl8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0__0__Impl_in_rule__XFunctionTypeRef__Group_0__08220 = new BitSet(new long[]{0x0000000000000010L,0x00000000000001C0L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0__1_in_rule__XFunctionTypeRef__Group_0__08223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__XFunctionTypeRef__Group_0__0__Impl8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0__1__Impl_in_rule__XFunctionTypeRef__Group_0__18282 = new BitSet(new long[]{0x0000000000000010L,0x00000000000001C0L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0__2_in_rule__XFunctionTypeRef__Group_0__18285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0_1__0_in_rule__XFunctionTypeRef__Group_0__1__Impl8312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0__2__Impl_in_rule__XFunctionTypeRef__Group_0__28343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__XFunctionTypeRef__Group_0__2__Impl8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0_1__0__Impl_in_rule__XFunctionTypeRef__Group_0_1__08408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0_1__1_in_rule__XFunctionTypeRef__Group_0_1__08411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0_in_rule__XFunctionTypeRef__Group_0_1__0__Impl8438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0_1__1__Impl_in_rule__XFunctionTypeRef__Group_0_1__18468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0_1_1__0_in_rule__XFunctionTypeRef__Group_0_1__1__Impl8495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0_1_1__0__Impl_in_rule__XFunctionTypeRef__Group_0_1_1__08530 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0_1_1__1_in_rule__XFunctionTypeRef__Group_0_1_1__08533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__XFunctionTypeRef__Group_0_1_1__0__Impl8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__Group_0_1_1__1__Impl_in_rule__XFunctionTypeRef__Group_0_1_1__18592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1_in_rule__XFunctionTypeRef__Group_0_1_1__1__Impl8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group__0__Impl_in_rule__JvmParameterizedTypeReference__Group__08653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group__1_in_rule__JvmParameterizedTypeReference__Group__08656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__TypeAssignment_0_in_rule__JvmParameterizedTypeReference__Group__0__Impl8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group__1__Impl_in_rule__JvmParameterizedTypeReference__Group__18713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1__0_in_rule__JvmParameterizedTypeReference__Group__1__Impl8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1__0__Impl_in_rule__JvmParameterizedTypeReference__Group_1__08775 = new BitSet(new long[]{0x0000000000000010L,0x00000000000010C0L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1__1_in_rule__JvmParameterizedTypeReference__Group_1__08778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__JvmParameterizedTypeReference__Group_1__0__Impl8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1__1__Impl_in_rule__JvmParameterizedTypeReference__Group_1__18839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1__2_in_rule__JvmParameterizedTypeReference__Group_1__18842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1_in_rule__JvmParameterizedTypeReference__Group_1__1__Impl8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1__2__Impl_in_rule__JvmParameterizedTypeReference__Group_1__28899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1__3_in_rule__JvmParameterizedTypeReference__Group_1__28902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1_2__0_in_rule__JvmParameterizedTypeReference__Group_1__2__Impl8929 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1__3__Impl_in_rule__JvmParameterizedTypeReference__Group_1__38960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__JvmParameterizedTypeReference__Group_1__3__Impl8988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1_2__0__Impl_in_rule__JvmParameterizedTypeReference__Group_1_2__09027 = new BitSet(new long[]{0x0000000000000010L,0x00000000000010C0L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1_2__1_in_rule__JvmParameterizedTypeReference__Group_1_2__09030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__JvmParameterizedTypeReference__Group_1_2__0__Impl9058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__Group_1_2__1__Impl_in_rule__JvmParameterizedTypeReference__Group_1_2__19089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1_in_rule__JvmParameterizedTypeReference__Group_1_2__1__Impl9116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmWildcardTypeReference__Group__0__Impl_in_rule__JvmWildcardTypeReference__Group__09150 = new BitSet(new long[]{0x0000000000000010L,0x00000000000010C0L});
    public static final BitSet FOLLOW_rule__JvmWildcardTypeReference__Group__1_in_rule__JvmWildcardTypeReference__Group__09153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmWildcardTypeReference__Group__1__Impl_in_rule__JvmWildcardTypeReference__Group__19211 = new BitSet(new long[]{0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_rule__JvmWildcardTypeReference__Group__2_in_rule__JvmWildcardTypeReference__Group__19214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__JvmWildcardTypeReference__Group__1__Impl9242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmWildcardTypeReference__Group__2__Impl_in_rule__JvmWildcardTypeReference__Group__29273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmWildcardTypeReference__Alternatives_2_in_rule__JvmWildcardTypeReference__Group__2__Impl9300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmUpperBound__Group__0__Impl_in_rule__JvmUpperBound__Group__09337 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__JvmUpperBound__Group__1_in_rule__JvmUpperBound__Group__09340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__JvmUpperBound__Group__0__Impl9368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmUpperBound__Group__1__Impl_in_rule__JvmUpperBound__Group__19399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmUpperBound__TypeReferenceAssignment_1_in_rule__JvmUpperBound__Group__1__Impl9426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmUpperBoundAnded__Group__0__Impl_in_rule__JvmUpperBoundAnded__Group__09460 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__JvmUpperBoundAnded__Group__1_in_rule__JvmUpperBoundAnded__Group__09463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__JvmUpperBoundAnded__Group__0__Impl9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmUpperBoundAnded__Group__1__Impl_in_rule__JvmUpperBoundAnded__Group__19522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmUpperBoundAnded__TypeReferenceAssignment_1_in_rule__JvmUpperBoundAnded__Group__1__Impl9549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmLowerBound__Group__0__Impl_in_rule__JvmLowerBound__Group__09583 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__JvmLowerBound__Group__1_in_rule__JvmLowerBound__Group__09586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__JvmLowerBound__Group__0__Impl9614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmLowerBound__Group__1__Impl_in_rule__JvmLowerBound__Group__19645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JvmLowerBound__TypeReferenceAssignment_1_in_rule__JvmLowerBound__Group__1__Impl9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl9738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__QualifiedName__Group_1__0__Impl9860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl9918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentification_in_rule__Installer__IdentificationAssignment_19956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthor_in_rule__Installer__AuthorsAssignment_2_19987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Installer__ConstraintAssignment_3_110018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUninstall_in_rule__Installer__UninstallAssignment_4_1_110049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Installer__SummarylogAssignment_5_110080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__Installer__InstallationAssignment_5_210116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackaging_in_rule__Installer__PackagingAssignment_610155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Installer__VariablesAssignment_710186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePack_in_rule__Installer__PacksAssignment_810217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocale_in_rule__Installer__LocaleAssignment_910248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePanel_in_rule__Installer__PanelsAssignment_1110279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleISO3Code_in_rule__Locale__IsocodesAssignment_110310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Identification__NameAssignment_110341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Identification__VersionAssignment_210372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Identification__UrlAssignment_3_110403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Identification__WebdirAssignment_4_110434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Author__NameAssignment_010465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Author__EmailAssignment_110496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__JavaversionAssignment_010527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__Constraint__RequiredJdkAssignment_110563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__Constraint__PackedAssignment_210607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Uninstall__NameAssignment_0_110646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Uninstall__PathAssignment_1_110677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Option__NameAssignment_010708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Option__ValueAssignment_210739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rule__Packaging__ClassAssignment_110770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Packaging__OptionsAssignment_2_110801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__Variable__IsDynamicAssignment_0_110837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_110876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Variable__ValueAssignment_310907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Pack__NameAssignment_110938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pack__LabelAssignment_210969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__Pack__OptionalAssignment_311005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__Pack__LooseAssignment_411049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__Pack__KeepAssignment_511093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Pack__ParentAssignment_611136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__Pack__FilesAssignment_711171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOS_in_rule__Pack__OsAssignment_8_111202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__File__PathAssignment_011233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__File__AliasAssignment_1_111264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__File__DestinationAssignment_311295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverrideFlag_in_rule__File__OverrideAssignment_4_111326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOS_in_rule__File__OsAssignment_5_0_111357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Panel__NameAssignment_011388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rule__Panel__ClassnameAssignment_111419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Panel__JarAssignment_211450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rule__XFunctionTypeRef__ParamTypesAssignment_0_1_011481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_111512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rule__XFunctionTypeRef__ReturnTypeAssignment_211543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__JvmParameterizedTypeReference__TypeAssignment_011578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_111613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_111644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_rule__JvmWildcardTypeReference__ConstraintsAssignment_2_011675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_rule__JvmWildcardTypeReference__ConstraintsAssignment_2_111706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rule__JvmUpperBound__TypeReferenceAssignment_111737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rule__JvmUpperBoundAnded__TypeReferenceAssignment_111768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_rule__JvmLowerBound__TypeReferenceAssignment_111799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_5__0_in_synpred65_InternalIzpack7012 = new BitSet(new long[]{0x0000000000000002L});

}