package br.ufes.nemo.ledzeppllin.blackdog.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.ufes.nemo.ledzeppllin.blackdog.services.BlackDogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlackDogParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'None'", "'Create'", "'List'", "'Update'", "'Delete'", "'datatype'", "'entity'", "'{'", "'}'", "'extends'", "':'", "'@'", "'many'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBlackDogParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBlackDogParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBlackDogParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBlackDog.g"; }


    	private BlackDogGrammarAccess grammarAccess;

    	public void setGrammarAccess(BlackDogGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalBlackDog.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalBlackDog.g:54:1: ( ruleDomainmodel EOF )
            // InternalBlackDog.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalBlackDog.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalBlackDog.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalBlackDog.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalBlackDog.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalBlackDog.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=17)||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBlackDog.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalBlackDog.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalBlackDog.g:79:1: ( ruleType EOF )
            // InternalBlackDog.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalBlackDog.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalBlackDog.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalBlackDog.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalBlackDog.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalBlackDog.g:94:3: ( rule__Type__Alternatives )
            // InternalBlackDog.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalBlackDog.g:103:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalBlackDog.g:104:1: ( ruleDataType EOF )
            // InternalBlackDog.g:105:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalBlackDog.g:112:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:116:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalBlackDog.g:117:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalBlackDog.g:117:2: ( ( rule__DataType__Group__0 ) )
            // InternalBlackDog.g:118:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalBlackDog.g:119:3: ( rule__DataType__Group__0 )
            // InternalBlackDog.g:119:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalBlackDog.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalBlackDog.g:129:1: ( ruleEntity EOF )
            // InternalBlackDog.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalBlackDog.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalBlackDog.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalBlackDog.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalBlackDog.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalBlackDog.g:144:3: ( rule__Entity__Group__0 )
            // InternalBlackDog.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalBlackDog.g:153:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalBlackDog.g:154:1: ( ruleFeature EOF )
            // InternalBlackDog.g:155:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalBlackDog.g:162:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:166:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalBlackDog.g:167:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalBlackDog.g:167:2: ( ( rule__Feature__Group__0 ) )
            // InternalBlackDog.g:168:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalBlackDog.g:169:3: ( rule__Feature__Group__0 )
            // InternalBlackDog.g:169:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAnnotation"
    // InternalBlackDog.g:178:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalBlackDog.g:179:1: ( ruleAnnotation EOF )
            // InternalBlackDog.g:180:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalBlackDog.g:187:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:191:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalBlackDog.g:192:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalBlackDog.g:192:2: ( ( rule__Annotation__Group__0 ) )
            // InternalBlackDog.g:193:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalBlackDog.g:194:3: ( rule__Annotation__Group__0 )
            // InternalBlackDog.g:194:4: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleViews"
    // InternalBlackDog.g:203:1: entryRuleViews : ruleViews EOF ;
    public final void entryRuleViews() throws RecognitionException {
        try {
            // InternalBlackDog.g:204:1: ( ruleViews EOF )
            // InternalBlackDog.g:205:1: ruleViews EOF
            {
             before(grammarAccess.getViewsRule()); 
            pushFollow(FOLLOW_1);
            ruleViews();

            state._fsp--;

             after(grammarAccess.getViewsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleViews"


    // $ANTLR start "ruleViews"
    // InternalBlackDog.g:212:1: ruleViews : ( ( rule__Views__Alternatives ) ) ;
    public final void ruleViews() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:216:2: ( ( ( rule__Views__Alternatives ) ) )
            // InternalBlackDog.g:217:2: ( ( rule__Views__Alternatives ) )
            {
            // InternalBlackDog.g:217:2: ( ( rule__Views__Alternatives ) )
            // InternalBlackDog.g:218:3: ( rule__Views__Alternatives )
            {
             before(grammarAccess.getViewsAccess().getAlternatives()); 
            // InternalBlackDog.g:219:3: ( rule__Views__Alternatives )
            // InternalBlackDog.g:219:4: rule__Views__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Views__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getViewsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleViews"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalBlackDog.g:227:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:231:1: ( ( ruleDataType ) | ( ruleEntity ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17||LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBlackDog.g:232:2: ( ruleDataType )
                    {
                    // InternalBlackDog.g:232:2: ( ruleDataType )
                    // InternalBlackDog.g:233:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlackDog.g:238:2: ( ruleEntity )
                    {
                    // InternalBlackDog.g:238:2: ( ruleEntity )
                    // InternalBlackDog.g:239:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Views__Alternatives"
    // InternalBlackDog.g:248:1: rule__Views__Alternatives : ( ( 'None' ) | ( 'Create' ) | ( 'List' ) | ( 'Update' ) | ( 'Delete' ) );
    public final void rule__Views__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:252:1: ( ( 'None' ) | ( 'Create' ) | ( 'List' ) | ( 'Update' ) | ( 'Delete' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBlackDog.g:253:2: ( 'None' )
                    {
                    // InternalBlackDog.g:253:2: ( 'None' )
                    // InternalBlackDog.g:254:3: 'None'
                    {
                     before(grammarAccess.getViewsAccess().getNoneKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getViewsAccess().getNoneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlackDog.g:259:2: ( 'Create' )
                    {
                    // InternalBlackDog.g:259:2: ( 'Create' )
                    // InternalBlackDog.g:260:3: 'Create'
                    {
                     before(grammarAccess.getViewsAccess().getCreateKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getViewsAccess().getCreateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlackDog.g:265:2: ( 'List' )
                    {
                    // InternalBlackDog.g:265:2: ( 'List' )
                    // InternalBlackDog.g:266:3: 'List'
                    {
                     before(grammarAccess.getViewsAccess().getListKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getViewsAccess().getListKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlackDog.g:271:2: ( 'Update' )
                    {
                    // InternalBlackDog.g:271:2: ( 'Update' )
                    // InternalBlackDog.g:272:3: 'Update'
                    {
                     before(grammarAccess.getViewsAccess().getUpdateKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getViewsAccess().getUpdateKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlackDog.g:277:2: ( 'Delete' )
                    {
                    // InternalBlackDog.g:277:2: ( 'Delete' )
                    // InternalBlackDog.g:278:3: 'Delete'
                    {
                     before(grammarAccess.getViewsAccess().getDeleteKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getViewsAccess().getDeleteKeyword_4()); 

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
    // $ANTLR end "rule__Views__Alternatives"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalBlackDog.g:287:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:291:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalBlackDog.g:292:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalBlackDog.g:299:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:303:1: ( ( 'datatype' ) )
            // InternalBlackDog.g:304:1: ( 'datatype' )
            {
            // InternalBlackDog.g:304:1: ( 'datatype' )
            // InternalBlackDog.g:305:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

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
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalBlackDog.g:314:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:318:1: ( rule__DataType__Group__1__Impl )
            // InternalBlackDog.g:319:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalBlackDog.g:325:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:329:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalBlackDog.g:330:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalBlackDog.g:330:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalBlackDog.g:331:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalBlackDog.g:332:2: ( rule__DataType__NameAssignment_1 )
            // InternalBlackDog.g:332:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalBlackDog.g:341:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:345:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalBlackDog.g:346:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalBlackDog.g:353:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__AnnotationsAssignment_0 )* ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:357:1: ( ( ( rule__Entity__AnnotationsAssignment_0 )* ) )
            // InternalBlackDog.g:358:1: ( ( rule__Entity__AnnotationsAssignment_0 )* )
            {
            // InternalBlackDog.g:358:1: ( ( rule__Entity__AnnotationsAssignment_0 )* )
            // InternalBlackDog.g:359:2: ( rule__Entity__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); 
            // InternalBlackDog.g:360:2: ( rule__Entity__AnnotationsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBlackDog.g:360:3: rule__Entity__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Entity__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalBlackDog.g:368:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:372:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalBlackDog.g:373:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalBlackDog.g:380:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:384:1: ( ( 'entity' ) )
            // InternalBlackDog.g:385:1: ( 'entity' )
            {
            // InternalBlackDog.g:385:1: ( 'entity' )
            // InternalBlackDog.g:386:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalBlackDog.g:395:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:399:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalBlackDog.g:400:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalBlackDog.g:407:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:411:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalBlackDog.g:412:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalBlackDog.g:412:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalBlackDog.g:413:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalBlackDog.g:414:2: ( rule__Entity__NameAssignment_2 )
            // InternalBlackDog.g:414:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalBlackDog.g:422:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:426:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalBlackDog.g:427:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalBlackDog.g:434:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:438:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalBlackDog.g:439:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalBlackDog.g:439:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalBlackDog.g:440:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalBlackDog.g:441:2: ( rule__Entity__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBlackDog.g:441:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalBlackDog.g:449:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:453:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalBlackDog.g:454:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalBlackDog.g:461:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:465:1: ( ( '{' ) )
            // InternalBlackDog.g:466:1: ( '{' )
            {
            // InternalBlackDog.g:466:1: ( '{' )
            // InternalBlackDog.g:467:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalBlackDog.g:476:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:480:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalBlackDog.g:481:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalBlackDog.g:488:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__FeaturesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:492:1: ( ( ( rule__Entity__FeaturesAssignment_5 )* ) )
            // InternalBlackDog.g:493:1: ( ( rule__Entity__FeaturesAssignment_5 )* )
            {
            // InternalBlackDog.g:493:1: ( ( rule__Entity__FeaturesAssignment_5 )* )
            // InternalBlackDog.g:494:2: ( rule__Entity__FeaturesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 
            // InternalBlackDog.g:495:2: ( rule__Entity__FeaturesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBlackDog.g:495:3: rule__Entity__FeaturesAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__FeaturesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalBlackDog.g:503:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:507:1: ( rule__Entity__Group__6__Impl )
            // InternalBlackDog.g:508:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalBlackDog.g:514:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:518:1: ( ( '}' ) )
            // InternalBlackDog.g:519:1: ( '}' )
            {
            // InternalBlackDog.g:519:1: ( '}' )
            // InternalBlackDog.g:520:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalBlackDog.g:530:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:534:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalBlackDog.g:535:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalBlackDog.g:542:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:546:1: ( ( 'extends' ) )
            // InternalBlackDog.g:547:1: ( 'extends' )
            {
            // InternalBlackDog.g:547:1: ( 'extends' )
            // InternalBlackDog.g:548:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalBlackDog.g:557:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:561:1: ( rule__Entity__Group_3__1__Impl )
            // InternalBlackDog.g:562:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalBlackDog.g:568:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:572:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // InternalBlackDog.g:573:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // InternalBlackDog.g:573:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // InternalBlackDog.g:574:2: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // InternalBlackDog.g:575:2: ( rule__Entity__SuperTypeAssignment_3_1 )
            // InternalBlackDog.g:575:3: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalBlackDog.g:584:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:588:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalBlackDog.g:589:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalBlackDog.g:596:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:600:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // InternalBlackDog.g:601:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // InternalBlackDog.g:601:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // InternalBlackDog.g:602:2: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // InternalBlackDog.g:603:2: ( rule__Feature__ManyAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBlackDog.g:603:3: rule__Feature__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_0()); 

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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalBlackDog.g:611:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:615:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalBlackDog.g:616:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalBlackDog.g:623:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:627:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalBlackDog.g:628:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalBlackDog.g:628:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalBlackDog.g:629:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalBlackDog.g:630:2: ( rule__Feature__NameAssignment_1 )
            // InternalBlackDog.g:630:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalBlackDog.g:638:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:642:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalBlackDog.g:643:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalBlackDog.g:650:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:654:1: ( ( ':' ) )
            // InternalBlackDog.g:655:1: ( ':' )
            {
            // InternalBlackDog.g:655:1: ( ':' )
            // InternalBlackDog.g:656:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalBlackDog.g:665:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:669:1: ( rule__Feature__Group__3__Impl )
            // InternalBlackDog.g:670:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__3__Impl();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalBlackDog.g:676:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:680:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // InternalBlackDog.g:681:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // InternalBlackDog.g:681:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // InternalBlackDog.g:682:2: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // InternalBlackDog.g:683:2: ( rule__Feature__TypeAssignment_3 )
            // InternalBlackDog.g:683:3: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalBlackDog.g:692:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:696:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalBlackDog.g:697:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

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
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalBlackDog.g:704:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:708:1: ( ( '@' ) )
            // InternalBlackDog.g:709:1: ( '@' )
            {
            // InternalBlackDog.g:709:1: ( '@' )
            // InternalBlackDog.g:710:2: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalBlackDog.g:719:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:723:1: ( rule__Annotation__Group__1__Impl )
            // InternalBlackDog.g:724:2: rule__Annotation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1__Impl();

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
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalBlackDog.g:730:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:734:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // InternalBlackDog.g:735:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // InternalBlackDog.g:735:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // InternalBlackDog.g:736:2: ( rule__Annotation__NameAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            // InternalBlackDog.g:737:2: ( rule__Annotation__NameAssignment_1 )
            // InternalBlackDog.g:737:3: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalBlackDog.g:746:1: rule__Domainmodel__ElementsAssignment : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:750:1: ( ( ruleType ) )
            // InternalBlackDog.g:751:2: ( ruleType )
            {
            // InternalBlackDog.g:751:2: ( ruleType )
            // InternalBlackDog.g:752:3: ruleType
            {
             before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalBlackDog.g:761:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:765:1: ( ( RULE_ID ) )
            // InternalBlackDog.g:766:2: ( RULE_ID )
            {
            // InternalBlackDog.g:766:2: ( RULE_ID )
            // InternalBlackDog.g:767:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_0"
    // InternalBlackDog.g:776:1: rule__Entity__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:780:1: ( ( ruleAnnotation ) )
            // InternalBlackDog.g:781:2: ( ruleAnnotation )
            {
            // InternalBlackDog.g:781:2: ( ruleAnnotation )
            // InternalBlackDog.g:782:3: ruleAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Entity__AnnotationsAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalBlackDog.g:791:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:795:1: ( ( RULE_ID ) )
            // InternalBlackDog.g:796:2: ( RULE_ID )
            {
            // InternalBlackDog.g:796:2: ( RULE_ID )
            // InternalBlackDog.g:797:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_3_1"
    // InternalBlackDog.g:806:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:810:1: ( ( ( RULE_ID ) ) )
            // InternalBlackDog.g:811:2: ( ( RULE_ID ) )
            {
            // InternalBlackDog.g:811:2: ( ( RULE_ID ) )
            // InternalBlackDog.g:812:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // InternalBlackDog.g:813:3: ( RULE_ID )
            // InternalBlackDog.g:814:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_5"
    // InternalBlackDog.g:825:1: rule__Entity__FeaturesAssignment_5 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:829:1: ( ( ruleFeature ) )
            // InternalBlackDog.g:830:2: ( ruleFeature )
            {
            // InternalBlackDog.g:830:2: ( ruleFeature )
            // InternalBlackDog.g:831:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Entity__FeaturesAssignment_5"


    // $ANTLR start "rule__Feature__ManyAssignment_0"
    // InternalBlackDog.g:840:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:844:1: ( ( ( 'many' ) ) )
            // InternalBlackDog.g:845:2: ( ( 'many' ) )
            {
            // InternalBlackDog.g:845:2: ( ( 'many' ) )
            // InternalBlackDog.g:846:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // InternalBlackDog.g:847:3: ( 'many' )
            // InternalBlackDog.g:848:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

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
    // $ANTLR end "rule__Feature__ManyAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalBlackDog.g:859:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:863:1: ( ( RULE_ID ) )
            // InternalBlackDog.g:864:2: ( RULE_ID )
            {
            // InternalBlackDog.g:864:2: ( RULE_ID )
            // InternalBlackDog.g:865:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // InternalBlackDog.g:874:1: rule__Feature__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:878:1: ( ( ( RULE_ID ) ) )
            // InternalBlackDog.g:879:2: ( ( RULE_ID ) )
            {
            // InternalBlackDog.g:879:2: ( ( RULE_ID ) )
            // InternalBlackDog.g:880:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            // InternalBlackDog.g:881:3: ( RULE_ID )
            // InternalBlackDog.g:882:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Feature__TypeAssignment_3"


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // InternalBlackDog.g:893:1: rule__Annotation__NameAssignment_1 : ( ruleViews ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:897:1: ( ( ruleViews ) )
            // InternalBlackDog.g:898:2: ( ruleViews )
            {
            // InternalBlackDog.g:898:2: ( ruleViews )
            // InternalBlackDog.g:899:3: ruleViews
            {
             before(grammarAccess.getAnnotationAccess().getNameViewsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleViews();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getNameViewsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Annotation__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000430002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000430000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000880010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000F800L});

}