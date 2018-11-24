// Generated from EHP.g4 by ANTLR 4.7
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EHPParser}.
 */
public interface EHPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EHPParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(EHPParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(EHPParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(EHPParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(EHPParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(EHPParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(EHPParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(EHPParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(EHPParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(EHPParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(EHPParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(EHPParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(EHPParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(EHPParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(EHPParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(EHPParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(EHPParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(EHPParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(EHPParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(EHPParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(EHPParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(EHPParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(EHPParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(EHPParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(EHPParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(EHPParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(EHPParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(EHPParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(EHPParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(EHPParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(EHPParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(EHPParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(EHPParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(EHPParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(EHPParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(EHPParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(EHPParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(EHPParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(EHPParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(EHPParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(EHPParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(EHPParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(EHPParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(EHPParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(EHPParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(EHPParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(EHPParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EHPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EHPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(EHPParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(EHPParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(EHPParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(EHPParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(EHPParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(EHPParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(EHPParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(EHPParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(EHPParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(EHPParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(EHPParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(EHPParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#functionCallDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallDeclarator(EHPParser.FunctionCallDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#functionCallDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallDeclarator(EHPParser.FunctionCallDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(EHPParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(EHPParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(EHPParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(EHPParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(EHPParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(EHPParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(EHPParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(EHPParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(EHPParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(EHPParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(EHPParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(EHPParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(EHPParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(EHPParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(EHPParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(EHPParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(EHPParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(EHPParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(EHPParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(EHPParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(EHPParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(EHPParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(EHPParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(EHPParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(EHPParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(EHPParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(EHPParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(EHPParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(EHPParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(EHPParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(EHPParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(EHPParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(EHPParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(EHPParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(EHPParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(EHPParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(EHPParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(EHPParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(EHPParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(EHPParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(EHPParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(EHPParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(EHPParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(EHPParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(EHPParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(EHPParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(EHPParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(EHPParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(EHPParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(EHPParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(EHPParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(EHPParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(EHPParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(EHPParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(EHPParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(EHPParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(EHPParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(EHPParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(EHPParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(EHPParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(EHPParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(EHPParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(EHPParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(EHPParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(EHPParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(EHPParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(EHPParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(EHPParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(EHPParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(EHPParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(EHPParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(EHPParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(EHPParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(EHPParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(EHPParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(EHPParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(EHPParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(EHPParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(EHPParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(EHPParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(EHPParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(EHPParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EHPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EHPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(EHPParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(EHPParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(EHPParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(EHPParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(EHPParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(EHPParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(EHPParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(EHPParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(EHPParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(EHPParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(EHPParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(EHPParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(EHPParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(EHPParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(EHPParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(EHPParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(EHPParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(EHPParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(EHPParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(EHPParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(EHPParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(EHPParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(EHPParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(EHPParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(EHPParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(EHPParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(EHPParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(EHPParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#taskDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTaskDeclaration(EHPParser.TaskDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#taskDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTaskDeclaration(EHPParser.TaskDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#taskStartTag}.
	 * @param ctx the parse tree
	 */
	void enterTaskStartTag(EHPParser.TaskStartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#taskStartTag}.
	 * @param ctx the parse tree
	 */
	void exitTaskStartTag(EHPParser.TaskStartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#taskEndTag}.
	 * @param ctx the parse tree
	 */
	void enterTaskEndTag(EHPParser.TaskEndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#taskEndTag}.
	 * @param ctx the parse tree
	 */
	void exitTaskEndTag(EHPParser.TaskEndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(EHPParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(EHPParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EHPParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(EHPParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EHPParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(EHPParser.DeclarationListContext ctx);
}