/*
 * generated by Xtext 2.21.0
 */
grammar InternalBlackDog;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package br.ufes.nemo.ledzeppllin.blackdog.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleDomainmodel
entryRuleDomainmodel
:
{ before(grammarAccess.getDomainmodelRule()); }
	 ruleDomainmodel
{ after(grammarAccess.getDomainmodelRule()); } 
	 EOF 
;

// Rule Domainmodel
ruleDomainmodel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); }
		(rule__Domainmodel__ElementsAssignment)*
		{ after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataType
entryRuleDataType
:
{ before(grammarAccess.getDataTypeRule()); }
	 ruleDataType
{ after(grammarAccess.getDataTypeRule()); } 
	 EOF 
;

// Rule DataType
ruleDataType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataTypeAccess().getGroup()); }
		(rule__DataType__Group__0)
		{ after(grammarAccess.getDataTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getGroup()); }
		(rule__Feature__Group__0)
		{ after(grammarAccess.getFeatureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotation
entryRuleAnnotation
:
{ before(grammarAccess.getAnnotationRule()); }
	 ruleAnnotation
{ after(grammarAccess.getAnnotationRule()); } 
	 EOF 
;

// Rule Annotation
ruleAnnotation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationAccess().getGroup()); }
		(rule__Annotation__Group__0)
		{ after(grammarAccess.getAnnotationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleViews
entryRuleViews
:
{ before(grammarAccess.getViewsRule()); }
	 ruleViews
{ after(grammarAccess.getViewsRule()); } 
	 EOF 
;

// Rule Views
ruleViews 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getViewsAccess().getAlternatives()); }
		(rule__Views__Alternatives)
		{ after(grammarAccess.getViewsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); }
		ruleDataType
		{ after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); }
		ruleEntity
		{ after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Views__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getViewsAccess().getNoneKeyword_0()); }
		'None'
		{ after(grammarAccess.getViewsAccess().getNoneKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getViewsAccess().getCreateKeyword_1()); }
		'Create'
		{ after(grammarAccess.getViewsAccess().getCreateKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getViewsAccess().getListKeyword_2()); }
		'List'
		{ after(grammarAccess.getViewsAccess().getListKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getViewsAccess().getUpdateKeyword_3()); }
		'Update'
		{ after(grammarAccess.getViewsAccess().getUpdateKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getViewsAccess().getDeleteKeyword_4()); }
		'Delete'
		{ after(grammarAccess.getViewsAccess().getDeleteKeyword_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__0__Impl
	rule__DataType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); }
	'datatype'
	{ after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); }
	(rule__DataType__NameAssignment_1)
	{ after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); }
	(rule__Entity__AnnotationsAssignment_0)*
	{ after(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_1()); }
	'entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_2()); }
	(rule__Entity__NameAssignment_2)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_3()); }
	(rule__Entity__Group_3__0)?
	{ after(grammarAccess.getEntityAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__4__Impl
	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__5__Impl
	rule__Entity__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); }
	(rule__Entity__FeaturesAssignment_5)*
	{ after(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_3__0__Impl
	rule__Entity__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); }
	'extends'
	{ after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); }
	(rule__Entity__SuperTypeAssignment_3_1)
	{ after(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getManyAssignment_0()); }
	(rule__Feature__ManyAssignment_0)?
	{ after(grammarAccess.getFeatureAccess().getManyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getNameAssignment_1()); }
	(rule__Feature__NameAssignment_1)
	{ after(grammarAccess.getFeatureAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__2__Impl
	rule__Feature__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getFeatureAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); }
	(rule__Feature__TypeAssignment_3)
	{ after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__0__Impl
	rule__Annotation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); }
	'@'
	{ after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); }
	(rule__Annotation__NameAssignment_1)
	{ after(grammarAccess.getAnnotationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Domainmodel__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); }
		ruleType
		{ after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__SuperTypeAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FeaturesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); }
		ruleFeature
		{ after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__ManyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
			'many'
			{ after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
		)
		{ after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getNameViewsParserRuleCall_1_0()); }
		ruleViews
		{ after(grammarAccess.getAnnotationAccess().getNameViewsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
