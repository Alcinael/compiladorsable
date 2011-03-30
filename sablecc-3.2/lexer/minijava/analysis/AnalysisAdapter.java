/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.analysis;

import java.util.*;
import minijava.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAProgramProgram(AProgramProgram node)
    {
        defaultCase(node);
    }

    public void caseAMainclassMainclass(AMainclassMainclass node)
    {
        defaultCase(node);
    }

    public void caseAClassdeclClassdecl(AClassdeclClassdecl node)
    {
        defaultCase(node);
    }

    public void caseAClassdecl(AClassdecl node)
    {
        defaultCase(node);
    }

    public void caseAVardeclVardecl(AVardeclVardecl node)
    {
        defaultCase(node);
    }

    public void caseAMethoddecl(AMethoddecl node)
    {
        defaultCase(node);
    }

    public void caseAFormallistFormallist(AFormallistFormallist node)
    {
        defaultCase(node);
    }

    public void caseAFormallist(AFormallist node)
    {
        defaultCase(node);
    }

    public void caseAFormalrest(AFormalrest node)
    {
        defaultCase(node);
    }

    public void caseAIntfType(AIntfType node)
    {
        defaultCase(node);
    }

    public void caseABooleanType(ABooleanType node)
    {
        defaultCase(node);
    }

    public void caseAIntType(AIntType node)
    {
        defaultCase(node);
    }

    public void caseAIdType(AIdType node)
    {
        defaultCase(node);
    }

    public void caseAStatementStatement(AStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAIfStatement(AIfStatement node)
    {
        defaultCase(node);
    }

    public void caseAWhileStatement(AWhileStatement node)
    {
        defaultCase(node);
    }

    public void caseAPrintStatement(APrintStatement node)
    {
        defaultCase(node);
    }

    public void caseAIgualStatement(AIgualStatement node)
    {
        defaultCase(node);
    }

    public void caseAExpigualStatement(AExpigualStatement node)
    {
        defaultCase(node);
    }

    public void caseAExpExp(AExpExp node)
    {
        defaultCase(node);
    }

    public void caseATermExp(ATermExp node)
    {
        defaultCase(node);
    }

    public void caseATimeTerm(ATimeTerm node)
    {
        defaultCase(node);
    }

    public void caseAMedTerm(AMedTerm node)
    {
        defaultCase(node);
    }

    public void caseAPlusMed(APlusMed node)
    {
        defaultCase(node);
    }

    public void caseAMinusMed(AMinusMed node)
    {
        defaultCase(node);
    }

    public void caseALowMed(ALowMed node)
    {
        defaultCase(node);
    }

    public void caseAAndLow(AAndLow node)
    {
        defaultCase(node);
    }

    public void caseAMenorLow(AMenorLow node)
    {
        defaultCase(node);
    }

    public void caseAExclamacaoLow(AExclamacaoLow node)
    {
        defaultCase(node);
    }

    public void caseAFactorLow(AFactorLow node)
    {
        defaultCase(node);
    }

    public void caseALengthFactor(ALengthFactor node)
    {
        defaultCase(node);
    }

    public void caseAExplistFactor(AExplistFactor node)
    {
        defaultCase(node);
    }

    public void caseANewintFactor(ANewintFactor node)
    {
        defaultCase(node);
    }

    public void caseAEntreparFactor(AEntreparFactor node)
    {
        defaultCase(node);
    }

    public void caseAIntliteralFactor(AIntliteralFactor node)
    {
        defaultCase(node);
    }

    public void caseATrueFactor(ATrueFactor node)
    {
        defaultCase(node);
    }

    public void caseAFalseFactor(AFalseFactor node)
    {
        defaultCase(node);
    }

    public void caseAIdFactor(AIdFactor node)
    {
        defaultCase(node);
    }

    public void caseAThisFactor(AThisFactor node)
    {
        defaultCase(node);
    }

    public void caseANewidFactor(ANewidFactor node)
    {
        defaultCase(node);
    }

    public void caseAExprestExplist(AExprestExplist node)
    {
        defaultCase(node);
    }

    public void caseAExplist(AExplist node)
    {
        defaultCase(node);
    }

    public void caseAExprest(AExprest node)
    {
        defaultCase(node);
    }

    public void caseTTkLchave(TTkLchave node)
    {
        defaultCase(node);
    }

    public void caseTTkRchave(TTkRchave node)
    {
        defaultCase(node);
    }

    public void caseTTkLparen(TTkLparen node)
    {
        defaultCase(node);
    }

    public void caseTTkRparen(TTkRparen node)
    {
        defaultCase(node);
    }

    public void caseTTkLcolchete(TTkLcolchete node)
    {
        defaultCase(node);
    }

    public void caseTTkRcolchete(TTkRcolchete node)
    {
        defaultCase(node);
    }

    public void caseTTkSemicolon(TTkSemicolon node)
    {
        defaultCase(node);
    }

    public void caseTTkVirgula(TTkVirgula node)
    {
        defaultCase(node);
    }

    public void caseTTkIgual(TTkIgual node)
    {
        defaultCase(node);
    }

    public void caseTTkIf(TTkIf node)
    {
        defaultCase(node);
    }

    public void caseTTkElse(TTkElse node)
    {
        defaultCase(node);
    }

    public void caseTTkWhile(TTkWhile node)
    {
        defaultCase(node);
    }

    public void caseTTkClass(TTkClass node)
    {
        defaultCase(node);
    }

    public void caseTTkPublic(TTkPublic node)
    {
        defaultCase(node);
    }

    public void caseTTkStatic(TTkStatic node)
    {
        defaultCase(node);
    }

    public void caseTTkVoid(TTkVoid node)
    {
        defaultCase(node);
    }

    public void caseTTkMain(TTkMain node)
    {
        defaultCase(node);
    }

    public void caseTTkExtends(TTkExtends node)
    {
        defaultCase(node);
    }

    public void caseTTkIntf(TTkIntf node)
    {
        defaultCase(node);
    }

    public void caseTTkInt(TTkInt node)
    {
        defaultCase(node);
    }

    public void caseTTkBoolean(TTkBoolean node)
    {
        defaultCase(node);
    }

    public void caseTTkReturn(TTkReturn node)
    {
        defaultCase(node);
    }

    public void caseTTkPrint(TTkPrint node)
    {
        defaultCase(node);
    }

    public void caseTTkTrue(TTkTrue node)
    {
        defaultCase(node);
    }

    public void caseTTkFalse(TTkFalse node)
    {
        defaultCase(node);
    }

    public void caseTTkTipo(TTkTipo node)
    {
        defaultCase(node);
    }

    public void caseTTkBooleano(TTkBooleano node)
    {
        defaultCase(node);
    }

    public void caseTTkPlus(TTkPlus node)
    {
        defaultCase(node);
    }

    public void caseTTkMinus(TTkMinus node)
    {
        defaultCase(node);
    }

    public void caseTTkTime(TTkTime node)
    {
        defaultCase(node);
    }

    public void caseTTkAnd(TTkAnd node)
    {
        defaultCase(node);
    }

    public void caseTTkMenor(TTkMenor node)
    {
        defaultCase(node);
    }

    public void caseTTkNew(TTkNew node)
    {
        defaultCase(node);
    }

    public void caseTTkThis(TTkThis node)
    {
        defaultCase(node);
    }

    public void caseTTkVazio(TTkVazio node)
    {
        defaultCase(node);
    }

    public void caseTTkIntegerLiteral(TTkIntegerLiteral node)
    {
        defaultCase(node);
    }

    public void caseTTkLength(TTkLength node)
    {
        defaultCase(node);
    }

    public void caseTTkPonto(TTkPonto node)
    {
        defaultCase(node);
    }

    public void caseTTkString(TTkString node)
    {
        defaultCase(node);
    }

    public void caseTTkExclamacao(TTkExclamacao node)
    {
        defaultCase(node);
    }

    public void caseTTkId(TTkId node)
    {
        defaultCase(node);
    }

    public void caseTTkTokIntegerlit(TTkTokIntegerlit node)
    {
        defaultCase(node);
    }

    public void caseTTkReal(TTkReal node)
    {
        defaultCase(node);
    }

    public void caseTTkWhitespace(TTkWhitespace node)
    {
        defaultCase(node);
    }

    public void caseTTkComments(TTkComments node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
