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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'None'", "'Create'", "'List'", "'Update'", "'Delete'", "'datatype'", "'#'", "'entity'", "'{'", "'}'", "'extends'", "':'", "'@'", "'many'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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

                if ( ((LA1_0>=16 && LA1_0<=18)||LA1_0==23) ) {
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


    // $ANTLR start "entryRuleDescription"
    // InternalBlackDog.g:128:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalBlackDog.g:129:1: ( ruleDescription EOF )
            // InternalBlackDog.g:130:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalBlackDog.g:137:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:141:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalBlackDog.g:142:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalBlackDog.g:142:2: ( ( rule__Description__Group__0 ) )
            // InternalBlackDog.g:143:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalBlackDog.g:144:3: ( rule__Description__Group__0 )
            // InternalBlackDog.g:144:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleEntity"
    // InternalBlackDog.g:153:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalBlackDog.g:154:1: ( ruleEntity EOF )
            // InternalBlackDog.g:155:1: ruleEntity EOF
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
    // InternalBlackDog.g:162:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:166:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalBlackDog.g:167:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalBlackDog.g:167:2: ( ( rule__Entity__Group__0 ) )
            // InternalBlackDog.g:168:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalBlackDog.g:169:3: ( rule__Entity__Group__0 )
            // InternalBlackDog.g:169:4: rule__Entity__Group__0
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
    // InternalBlackDog.g:178:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalBlackDog.g:179:1: ( ruleFeature EOF )
            // InternalBlackDog.g:180:1: ruleFeature EOF
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
    // InternalBlackDog.g:187:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:191:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalBlackDog.g:192:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalBlackDog.g:192:2: ( ( rule__Feature__Group__0 ) )
            // InternalBlackDog.g:193:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalBlackDog.g:194:3: ( rule__Feature__Group__0 )
            // InternalBlackDog.g:194:4: rule__Feature__Group__0
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
    // InternalBlackDog.g:203:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalBlackDog.g:204:1: ( ruleAnnotation EOF )
            // InternalBlackDog.g:205:1: ruleAnnotation EOF
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
    // InternalBlackDog.g:212:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:216:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalBlackDog.g:217:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalBlackDog.g:217:2: ( ( rule__Annotation__Group__0 ) )
            // InternalBlackDog.g:218:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalBlackDog.g:219:3: ( rule__Annotation__Group__0 )
            // InternalBlackDog.g:219:4: rule__Annotation__Group__0
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
    // InternalBlackDog.g:228:1: entryRuleViews : ruleViews EOF ;
    public final void entryRuleViews() throws RecognitionException {
        try {
            // InternalBlackDog.g:229:1: ( ruleViews EOF )
            // InternalBlackDog.g:230:1: ruleViews EOF
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
    // InternalBlackDog.g:237:1: ruleViews : ( ( rule__Views__Alternatives ) ) ;
    public final void ruleViews() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:241:2: ( ( ( rule__Views__Alternatives ) ) )
            // InternalBlackDog.g:242:2: ( ( rule__Views__Alternatives ) )
            {
            // InternalBlackDog.g:242:2: ( ( rule__Views__Alternatives ) )
            // InternalBlackDog.g:243:3: ( rule__Views__Alternatives )
            {
             before(grammarAccess.getViewsAccess().getAlternatives()); 
            // InternalBlackDog.g:244:3: ( rule__Views__Alternatives )
            // InternalBlackDog.g:244:4: rule__Views__Alternatives
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
    // InternalBlackDog.g:252:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:256:1: ( ( ruleDataType ) | ( ruleEntity ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=17 && LA2_0<=18)||LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBlackDog.g:257:2: ( ruleDataType )
                    {
                    // InternalBlackDog.g:257:2: ( ruleDataType )
                    // InternalBlackDog.g:258:3: ruleDataType
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
                    // InternalBlackDog.g:263:2: ( ruleEntity )
                    {
                    // InternalBlackDog.g:263:2: ( ruleEntity )
                    // InternalBlackDog.g:264:3: ruleEntity
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
    // InternalBlackDog.g:273:1: rule__Views__Alternatives : ( ( 'None' ) | ( 'Create' ) | ( 'List' ) | ( 'Update' ) | ( 'Delete' ) );
    public final void rule__Views__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:277:1: ( ( 'None' ) | ( 'Create' ) | ( 'List' ) | ( 'Update' ) | ( 'Delete' ) )
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
                    // InternalBlackDog.g:278:2: ( 'None' )
                    {
                    // InternalBlackDog.g:278:2: ( 'None' )
                    // InternalBlackDog.g:279:3: 'None'
                    {
                     before(grammarAccess.getViewsAccess().getNoneKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getViewsAccess().getNoneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlackDog.g:284:2: ( 'Create' )
                    {
                    // InternalBlackDog.g:284:2: ( 'Create' )
                    // InternalBlackDog.g:285:3: 'Create'
                    {
                     before(grammarAccess.getViewsAccess().getCreateKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getViewsAccess().getCreateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlackDog.g:290:2: ( 'List' )
                    {
                    // InternalBlackDog.g:290:2: ( 'List' )
                    // InternalBlackDog.g:291:3: 'List'
                    {
                     before(grammarAccess.getViewsAccess().getListKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getViewsAccess().getListKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlackDog.g:296:2: ( 'Update' )
                    {
                    // InternalBlackDog.g:296:2: ( 'Update' )
                    // InternalBlackDog.g:297:3: 'Update'
                    {
                     before(grammarAccess.getViewsAccess().getUpdateKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getViewsAccess().getUpdateKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlackDog.g:302:2: ( 'Delete' )
                    {
                    // InternalBlackDog.g:302:2: ( 'Delete' )
                    // InternalBlackDog.g:303:3: 'Delete'
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
    // InternalBlackDog.g:312:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:316:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalBlackDog.g:317:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalBlackDog.g:324:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:328:1: ( ( 'datatype' ) )
            // InternalBlackDog.g:329:1: ( 'datatype' )
            {
            // InternalBlackDog.g:329:1: ( 'datatype' )
            // InternalBlackDog.g:330:2: 'datatype'
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
    // InternalBlackDog.g:339:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:343:1: ( rule__DataType__Group__1__Impl )
            // InternalBlackDog.g:344:2: rule__DataType__Group__1__Impl
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
    // InternalBlackDog.g:350:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:354:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalBlackDog.g:355:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalBlackDog.g:355:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalBlackDog.g:356:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalBlackDog.g:357:2: ( rule__DataType__NameAssignment_1 )
            // InternalBlackDog.g:357:3: rule__DataType__NameAssignment_1
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


    // $ANTLR start "rule__Description__Group__0"
    // InternalBlackDog.g:366:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:370:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalBlackDog.g:371:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

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
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalBlackDog.g:378:1: rule__Description__Group__0__Impl : ( '#' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:382:1: ( ( '#' ) )
            // InternalBlackDog.g:383:1: ( '#' )
            {
            // InternalBlackDog.g:383:1: ( '#' )
            // InternalBlackDog.g:384:2: '#'
            {
             before(grammarAccess.getDescriptionAccess().getNumberSignKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalBlackDog.g:393:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:397:1: ( rule__Description__Group__1__Impl )
            // InternalBlackDog.g:398:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__1__Impl();

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
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalBlackDog.g:404:1: rule__Description__Group__1__Impl : ( ( rule__Description__TextfieldAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:408:1: ( ( ( rule__Description__TextfieldAssignment_1 ) ) )
            // InternalBlackDog.g:409:1: ( ( rule__Description__TextfieldAssignment_1 ) )
            {
            // InternalBlackDog.g:409:1: ( ( rule__Description__TextfieldAssignment_1 ) )
            // InternalBlackDog.g:410:2: ( rule__Description__TextfieldAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getTextfieldAssignment_1()); 
            // InternalBlackDog.g:411:2: ( rule__Description__TextfieldAssignment_1 )
            // InternalBlackDog.g:411:3: rule__Description__TextfieldAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Description__TextfieldAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getTextfieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalBlackDog.g:420:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:424:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalBlackDog.g:425:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBlackDog.g:432:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__DescriptionAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:436:1: ( ( ( rule__Entity__DescriptionAssignment_0 )? ) )
            // InternalBlackDog.g:437:1: ( ( rule__Entity__DescriptionAssignment_0 )? )
            {
            // InternalBlackDog.g:437:1: ( ( rule__Entity__DescriptionAssignment_0 )? )
            // InternalBlackDog.g:438:2: ( rule__Entity__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_0()); 
            // InternalBlackDog.g:439:2: ( rule__Entity__DescriptionAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBlackDog.g:439:3: rule__Entity__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getDescriptionAssignment_0()); 

            }


            }

        }
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
    // InternalBlackDog.g:447:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:451:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalBlackDog.g:452:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalBlackDog.g:459:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__AnnotationsAssignment_1 )* ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:463:1: ( ( ( rule__Entity__AnnotationsAssignment_1 )* ) )
            // InternalBlackDog.g:464:1: ( ( rule__Entity__AnnotationsAssignment_1 )* )
            {
            // InternalBlackDog.g:464:1: ( ( rule__Entity__AnnotationsAssignment_1 )* )
            // InternalBlackDog.g:465:2: ( rule__Entity__AnnotationsAssignment_1 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1()); 
            // InternalBlackDog.g:466:2: ( rule__Entity__AnnotationsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBlackDog.g:466:3: rule__Entity__AnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__AnnotationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_1()); 

            }


            }

        }
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
    // InternalBlackDog.g:474:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:478:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalBlackDog.g:479:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalBlackDog.g:486:1: rule__Entity__Group__2__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:490:1: ( ( 'entity' ) )
            // InternalBlackDog.g:491:1: ( 'entity' )
            {
            // InternalBlackDog.g:491:1: ( 'entity' )
            // InternalBlackDog.g:492:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_2()); 

            }


            }

        }
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
    // InternalBlackDog.g:501:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:505:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalBlackDog.g:506:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalBlackDog.g:513:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__NameAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:517:1: ( ( ( rule__Entity__NameAssignment_3 ) ) )
            // InternalBlackDog.g:518:1: ( ( rule__Entity__NameAssignment_3 ) )
            {
            // InternalBlackDog.g:518:1: ( ( rule__Entity__NameAssignment_3 ) )
            // InternalBlackDog.g:519:2: ( rule__Entity__NameAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_3()); 
            // InternalBlackDog.g:520:2: ( rule__Entity__NameAssignment_3 )
            // InternalBlackDog.g:520:3: rule__Entity__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalBlackDog.g:528:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:532:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalBlackDog.g:533:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalBlackDog.g:540:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:544:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // InternalBlackDog.g:545:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // InternalBlackDog.g:545:1: ( ( rule__Entity__Group_4__0 )? )
            // InternalBlackDog.g:546:2: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // InternalBlackDog.g:547:2: ( rule__Entity__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBlackDog.g:547:3: rule__Entity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalBlackDog.g:555:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:559:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalBlackDog.g:560:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalBlackDog.g:567:1: rule__Entity__Group__5__Impl : ( '{' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:571:1: ( ( '{' ) )
            // InternalBlackDog.g:572:1: ( '{' )
            {
            // InternalBlackDog.g:572:1: ( '{' )
            // InternalBlackDog.g:573:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalBlackDog.g:582:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:586:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalBlackDog.g:587:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__7();

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
    // InternalBlackDog.g:594:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__FeaturesAssignment_6 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:598:1: ( ( ( rule__Entity__FeaturesAssignment_6 )* ) )
            // InternalBlackDog.g:599:1: ( ( rule__Entity__FeaturesAssignment_6 )* )
            {
            // InternalBlackDog.g:599:1: ( ( rule__Entity__FeaturesAssignment_6 )* )
            // InternalBlackDog.g:600:2: ( rule__Entity__FeaturesAssignment_6 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_6()); 
            // InternalBlackDog.g:601:2: ( rule__Entity__FeaturesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==17||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBlackDog.g:601:3: rule__Entity__FeaturesAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__FeaturesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__Group__7"
    // InternalBlackDog.g:609:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:613:1: ( rule__Entity__Group__7__Impl )
            // InternalBlackDog.g:614:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__7__Impl();

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
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // InternalBlackDog.g:620:1: rule__Entity__Group__7__Impl : ( '}' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:624:1: ( ( '}' ) )
            // InternalBlackDog.g:625:1: ( '}' )
            {
            // InternalBlackDog.g:625:1: ( '}' )
            // InternalBlackDog.g:626:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // InternalBlackDog.g:636:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:640:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // InternalBlackDog.g:641:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__1();

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
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // InternalBlackDog.g:648:1: rule__Entity__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:652:1: ( ( 'extends' ) )
            // InternalBlackDog.g:653:1: ( 'extends' )
            {
            // InternalBlackDog.g:653:1: ( 'extends' )
            // InternalBlackDog.g:654:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // InternalBlackDog.g:663:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:667:1: ( rule__Entity__Group_4__1__Impl )
            // InternalBlackDog.g:668:2: rule__Entity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // InternalBlackDog.g:674:1: rule__Entity__Group_4__1__Impl : ( ( rule__Entity__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:678:1: ( ( ( rule__Entity__SuperTypeAssignment_4_1 ) ) )
            // InternalBlackDog.g:679:1: ( ( rule__Entity__SuperTypeAssignment_4_1 ) )
            {
            // InternalBlackDog.g:679:1: ( ( rule__Entity__SuperTypeAssignment_4_1 ) )
            // InternalBlackDog.g:680:2: ( rule__Entity__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_4_1()); 
            // InternalBlackDog.g:681:2: ( rule__Entity__SuperTypeAssignment_4_1 )
            // InternalBlackDog.g:681:3: rule__Entity__SuperTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalBlackDog.g:690:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:694:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalBlackDog.g:695:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBlackDog.g:702:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__DescriptionAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:706:1: ( ( ( rule__Feature__DescriptionAssignment_0 )? ) )
            // InternalBlackDog.g:707:1: ( ( rule__Feature__DescriptionAssignment_0 )? )
            {
            // InternalBlackDog.g:707:1: ( ( rule__Feature__DescriptionAssignment_0 )? )
            // InternalBlackDog.g:708:2: ( rule__Feature__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_0()); 
            // InternalBlackDog.g:709:2: ( rule__Feature__DescriptionAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBlackDog.g:709:3: rule__Feature__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getDescriptionAssignment_0()); 

            }


            }

        }
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
    // InternalBlackDog.g:717:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:721:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalBlackDog.g:722:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalBlackDog.g:729:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ManyAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:733:1: ( ( ( rule__Feature__ManyAssignment_1 )? ) )
            // InternalBlackDog.g:734:1: ( ( rule__Feature__ManyAssignment_1 )? )
            {
            // InternalBlackDog.g:734:1: ( ( rule__Feature__ManyAssignment_1 )? )
            // InternalBlackDog.g:735:2: ( rule__Feature__ManyAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_1()); 
            // InternalBlackDog.g:736:2: ( rule__Feature__ManyAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBlackDog.g:736:3: rule__Feature__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ManyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_1()); 

            }


            }

        }
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
    // InternalBlackDog.g:744:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:748:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalBlackDog.g:749:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalBlackDog.g:756:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:760:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalBlackDog.g:761:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalBlackDog.g:761:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalBlackDog.g:762:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalBlackDog.g:763:2: ( rule__Feature__NameAssignment_2 )
            // InternalBlackDog.g:763:3: rule__Feature__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalBlackDog.g:771:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:775:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalBlackDog.g:776:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

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
    // InternalBlackDog.g:783:1: rule__Feature__Group__3__Impl : ( ':' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:787:1: ( ( ':' ) )
            // InternalBlackDog.g:788:1: ( ':' )
            {
            // InternalBlackDog.g:788:1: ( ':' )
            // InternalBlackDog.g:789:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature__Group__4"
    // InternalBlackDog.g:798:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:802:1: ( rule__Feature__Group__4__Impl )
            // InternalBlackDog.g:803:2: rule__Feature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4__Impl();

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
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalBlackDog.g:809:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__TypeAssignment_4 ) ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:813:1: ( ( ( rule__Feature__TypeAssignment_4 ) ) )
            // InternalBlackDog.g:814:1: ( ( rule__Feature__TypeAssignment_4 ) )
            {
            // InternalBlackDog.g:814:1: ( ( rule__Feature__TypeAssignment_4 ) )
            // InternalBlackDog.g:815:2: ( rule__Feature__TypeAssignment_4 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_4()); 
            // InternalBlackDog.g:816:2: ( rule__Feature__TypeAssignment_4 )
            // InternalBlackDog.g:816:3: rule__Feature__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalBlackDog.g:825:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:829:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalBlackDog.g:830:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBlackDog.g:837:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:841:1: ( ( '@' ) )
            // InternalBlackDog.g:842:1: ( '@' )
            {
            // InternalBlackDog.g:842:1: ( '@' )
            // InternalBlackDog.g:843:2: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBlackDog.g:852:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:856:1: ( rule__Annotation__Group__1__Impl )
            // InternalBlackDog.g:857:2: rule__Annotation__Group__1__Impl
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
    // InternalBlackDog.g:863:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:867:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // InternalBlackDog.g:868:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // InternalBlackDog.g:868:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // InternalBlackDog.g:869:2: ( rule__Annotation__NameAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            // InternalBlackDog.g:870:2: ( rule__Annotation__NameAssignment_1 )
            // InternalBlackDog.g:870:3: rule__Annotation__NameAssignment_1
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
    // InternalBlackDog.g:879:1: rule__Domainmodel__ElementsAssignment : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:883:1: ( ( ruleType ) )
            // InternalBlackDog.g:884:2: ( ruleType )
            {
            // InternalBlackDog.g:884:2: ( ruleType )
            // InternalBlackDog.g:885:3: ruleType
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
    // InternalBlackDog.g:894:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:898:1: ( ( RULE_ID ) )
            // InternalBlackDog.g:899:2: ( RULE_ID )
            {
            // InternalBlackDog.g:899:2: ( RULE_ID )
            // InternalBlackDog.g:900:3: RULE_ID
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


    // $ANTLR start "rule__Description__TextfieldAssignment_1"
    // InternalBlackDog.g:909:1: rule__Description__TextfieldAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__TextfieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:913:1: ( ( RULE_STRING ) )
            // InternalBlackDog.g:914:2: ( RULE_STRING )
            {
            // InternalBlackDog.g:914:2: ( RULE_STRING )
            // InternalBlackDog.g:915:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getTextfieldSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getTextfieldSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__TextfieldAssignment_1"


    // $ANTLR start "rule__Entity__DescriptionAssignment_0"
    // InternalBlackDog.g:924:1: rule__Entity__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__Entity__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:928:1: ( ( ruleDescription ) )
            // InternalBlackDog.g:929:2: ( ruleDescription )
            {
            // InternalBlackDog.g:929:2: ( ruleDescription )
            // InternalBlackDog.g:930:3: ruleDescription
            {
             before(grammarAccess.getEntityAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getDescriptionDescriptionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__DescriptionAssignment_0"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_1"
    // InternalBlackDog.g:939:1: rule__Entity__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:943:1: ( ( ruleAnnotation ) )
            // InternalBlackDog.g:944:2: ( ruleAnnotation )
            {
            // InternalBlackDog.g:944:2: ( ruleAnnotation )
            // InternalBlackDog.g:945:3: ruleAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AnnotationsAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_3"
    // InternalBlackDog.g:954:1: rule__Entity__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:958:1: ( ( RULE_ID ) )
            // InternalBlackDog.g:959:2: ( RULE_ID )
            {
            // InternalBlackDog.g:959:2: ( RULE_ID )
            // InternalBlackDog.g:960:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_3"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_4_1"
    // InternalBlackDog.g:969:1: rule__Entity__SuperTypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:973:1: ( ( ( RULE_ID ) ) )
            // InternalBlackDog.g:974:2: ( ( RULE_ID ) )
            {
            // InternalBlackDog.g:974:2: ( ( RULE_ID ) )
            // InternalBlackDog.g:975:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_4_1_0()); 
            // InternalBlackDog.g:976:3: ( RULE_ID )
            // InternalBlackDog.g:977:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_4_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_6"
    // InternalBlackDog.g:988:1: rule__Entity__FeaturesAssignment_6 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:992:1: ( ( ruleFeature ) )
            // InternalBlackDog.g:993:2: ( ruleFeature )
            {
            // InternalBlackDog.g:993:2: ( ruleFeature )
            // InternalBlackDog.g:994:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_6"


    // $ANTLR start "rule__Feature__DescriptionAssignment_0"
    // InternalBlackDog.g:1003:1: rule__Feature__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__Feature__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:1007:1: ( ( ruleDescription ) )
            // InternalBlackDog.g:1008:2: ( ruleDescription )
            {
            // InternalBlackDog.g:1008:2: ( ruleDescription )
            // InternalBlackDog.g:1009:3: ruleDescription
            {
             before(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DescriptionAssignment_0"


    // $ANTLR start "rule__Feature__ManyAssignment_1"
    // InternalBlackDog.g:1018:1: rule__Feature__ManyAssignment_1 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:1022:1: ( ( ( 'many' ) ) )
            // InternalBlackDog.g:1023:2: ( ( 'many' ) )
            {
            // InternalBlackDog.g:1023:2: ( ( 'many' ) )
            // InternalBlackDog.g:1024:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_1_0()); 
            // InternalBlackDog.g:1025:3: ( 'many' )
            // InternalBlackDog.g:1026:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_1_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ManyAssignment_1"


    // $ANTLR start "rule__Feature__NameAssignment_2"
    // InternalBlackDog.g:1037:1: rule__Feature__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:1041:1: ( ( RULE_ID ) )
            // InternalBlackDog.g:1042:2: ( RULE_ID )
            {
            // InternalBlackDog.g:1042:2: ( RULE_ID )
            // InternalBlackDog.g:1043:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_2"


    // $ANTLR start "rule__Feature__TypeAssignment_4"
    // InternalBlackDog.g:1052:1: rule__Feature__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:1056:1: ( ( ( RULE_ID ) ) )
            // InternalBlackDog.g:1057:2: ( ( RULE_ID ) )
            {
            // InternalBlackDog.g:1057:2: ( ( RULE_ID ) )
            // InternalBlackDog.g:1058:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_4_0()); 
            // InternalBlackDog.g:1059:3: ( RULE_ID )
            // InternalBlackDog.g:1060:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_4"


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // InternalBlackDog.g:1071:1: rule__Annotation__NameAssignment_1 : ( ruleViews ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlackDog.g:1075:1: ( ( ruleViews ) )
            // InternalBlackDog.g:1076:2: ( ruleViews )
            {
            // InternalBlackDog.g:1076:2: ( ruleViews )
            // InternalBlackDog.g:1077:3: ruleViews
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000870002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000870000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001120010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001020012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001020010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000F800L});

}