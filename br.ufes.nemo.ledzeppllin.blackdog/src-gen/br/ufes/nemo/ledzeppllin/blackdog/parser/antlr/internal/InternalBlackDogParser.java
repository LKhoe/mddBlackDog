package br.ufes.nemo.ledzeppllin.blackdog.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufes.nemo.ledzeppllin.blackdog.services.BlackDogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlackDogParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'entity'", "'extends'", "'{'", "'}'", "'many'", "':'", "'@'", "'None'", "'Create'", "'List'", "'Update'", "'Delete'"
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

        public InternalBlackDogParser(TokenStream input, BlackDogGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected BlackDogGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalBlackDog.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalBlackDog.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalBlackDog.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalBlackDog.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalBlackDog.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalBlackDog.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalBlackDog.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBlackDog.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalBlackDog.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalBlackDog.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"br.ufes.nemo.ledzeppllin.blackdog.BlackDog.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalBlackDog.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalBlackDog.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalBlackDog.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalBlackDog.g:107:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalBlackDog.g:113:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // InternalBlackDog.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // InternalBlackDog.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12||LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBlackDog.g:115:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBlackDog.g:124:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalBlackDog.g:136:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalBlackDog.g:136:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalBlackDog.g:137:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalBlackDog.g:143:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBlackDog.g:149:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBlackDog.g:150:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBlackDog.g:150:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBlackDog.g:151:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalBlackDog.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBlackDog.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBlackDog.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalBlackDog.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalBlackDog.g:177:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalBlackDog.g:177:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalBlackDog.g:178:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalBlackDog.g:184:1: ruleEntity returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalBlackDog.g:190:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' ) )
            // InternalBlackDog.g:191:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )
            {
            // InternalBlackDog.g:191:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )
            // InternalBlackDog.g:192:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}'
            {
            // InternalBlackDog.g:192:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBlackDog.g:193:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalBlackDog.g:193:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalBlackDog.g:194:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"br.ufes.nemo.ledzeppllin.blackdog.BlackDog.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalBlackDog.g:215:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBlackDog.g:216:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBlackDog.g:216:4: (lv_name_2_0= RULE_ID )
            // InternalBlackDog.g:217:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBlackDog.g:233:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBlackDog.g:234:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                    			
                    // InternalBlackDog.g:238:4: ( (otherlv_4= RULE_ID ) )
                    // InternalBlackDog.g:239:5: (otherlv_4= RULE_ID )
                    {
                    // InternalBlackDog.g:239:5: (otherlv_4= RULE_ID )
                    // InternalBlackDog.g:240:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBlackDog.g:256:3: ( (lv_features_6_0= ruleFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBlackDog.g:257:4: (lv_features_6_0= ruleFeature )
            	    {
            	    // InternalBlackDog.g:257:4: (lv_features_6_0= ruleFeature )
            	    // InternalBlackDog.g:258:5: lv_features_6_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_features_6_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"br.ufes.nemo.ledzeppllin.blackdog.BlackDog.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalBlackDog.g:283:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalBlackDog.g:283:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalBlackDog.g:284:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalBlackDog.g:290:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBlackDog.g:296:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBlackDog.g:297:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBlackDog.g:297:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalBlackDog.g:298:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalBlackDog.g:298:3: ( (lv_many_0_0= 'many' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBlackDog.g:299:4: (lv_many_0_0= 'many' )
                    {
                    // InternalBlackDog.g:299:4: (lv_many_0_0= 'many' )
                    // InternalBlackDog.g:300:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalBlackDog.g:312:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBlackDog.g:313:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBlackDog.g:313:4: (lv_name_1_0= RULE_ID )
            // InternalBlackDog.g:314:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
            		
            // InternalBlackDog.g:334:3: ( (otherlv_3= RULE_ID ) )
            // InternalBlackDog.g:335:4: (otherlv_3= RULE_ID )
            {
            // InternalBlackDog.g:335:4: (otherlv_3= RULE_ID )
            // InternalBlackDog.g:336:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0());
            				

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAnnotation"
    // InternalBlackDog.g:351:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalBlackDog.g:351:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalBlackDog.g:352:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalBlackDog.g:358:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleViews ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBlackDog.g:364:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleViews ) ) ) )
            // InternalBlackDog.g:365:2: (otherlv_0= '@' ( (lv_name_1_0= ruleViews ) ) )
            {
            // InternalBlackDog.g:365:2: (otherlv_0= '@' ( (lv_name_1_0= ruleViews ) ) )
            // InternalBlackDog.g:366:3: otherlv_0= '@' ( (lv_name_1_0= ruleViews ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
            		
            // InternalBlackDog.g:370:3: ( (lv_name_1_0= ruleViews ) )
            // InternalBlackDog.g:371:4: (lv_name_1_0= ruleViews )
            {
            // InternalBlackDog.g:371:4: (lv_name_1_0= ruleViews )
            // InternalBlackDog.g:372:5: lv_name_1_0= ruleViews
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getNameViewsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleViews();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.ufes.nemo.ledzeppllin.blackdog.BlackDog.Views");
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleViews"
    // InternalBlackDog.g:393:1: entryRuleViews returns [String current=null] : iv_ruleViews= ruleViews EOF ;
    public final String entryRuleViews() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleViews = null;


        try {
            // InternalBlackDog.g:393:45: (iv_ruleViews= ruleViews EOF )
            // InternalBlackDog.g:394:2: iv_ruleViews= ruleViews EOF
            {
             newCompositeNode(grammarAccess.getViewsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViews=ruleViews();

            state._fsp--;

             current =iv_ruleViews.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleViews"


    // $ANTLR start "ruleViews"
    // InternalBlackDog.g:400:1: ruleViews returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'None' | kw= 'Create' | kw= 'List' | kw= 'Update' | kw= 'Delete' ) ;
    public final AntlrDatatypeRuleToken ruleViews() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBlackDog.g:406:2: ( (kw= 'None' | kw= 'Create' | kw= 'List' | kw= 'Update' | kw= 'Delete' ) )
            // InternalBlackDog.g:407:2: (kw= 'None' | kw= 'Create' | kw= 'List' | kw= 'Update' | kw= 'Delete' )
            {
            // InternalBlackDog.g:407:2: (kw= 'None' | kw= 'Create' | kw= 'List' | kw= 'Update' | kw= 'Delete' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBlackDog.g:408:3: kw= 'None'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getViewsAccess().getNoneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBlackDog.g:414:3: kw= 'Create'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getViewsAccess().getCreateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBlackDog.g:420:3: kw= 'List'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getViewsAccess().getListKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBlackDog.g:426:3: kw= 'Update'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getViewsAccess().getUpdateKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBlackDog.g:432:3: kw= 'Delete'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getViewsAccess().getDeleteKeyword_4());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleViews"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000041802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F80000L});

}