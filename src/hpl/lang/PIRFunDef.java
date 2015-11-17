package hpl.lang;

import java.util.ArrayList;

public class PIRFunDef extends PIRStatement {

	private final String fnName;
	private final ArrayList<ASTExp<AIRExp>> nArgExps;
	private final ArrayList<ASTExp<PIRExp>> pArgExps;
	private final PIRSequence fnBody;

	public PIRFunDef(String name, ArrayList<ASTExp<AIRExp>> nArgs, 
		ArrayList<ASTExp<AIRExp>> pArgs, PIRSequence body) {
		fnName = name;
		nArgExps = nArgs;
		pArgExps = pArgs;
		fnBody = body;
	}

	/**
     *
     * @return The name of the function in this function definition.
     */
	public getFunName(){
		return fnName;
	}
 	
 	/**
     *
     * @return The list of numerical argument expressions in this definition.
     */
    public ArrayList<ASTExp<AIRExp>> getNumericalArgExps() {
        return nArgExps;
    }

    /**
     *
     * @return The list of painter argument expressions in this definition.
     */
    public ArrayList<ASTExp<PIRExp>> getPainterArgExps() {
        return pArgExps;
    }

    /**
     *
     * @return The list of painter argument expressions in this definition.
     */
    public PIRSequence getbody() {
        return fnBody;
    }

	public abstract <S, T> T visit(HPLVisitor<S, T> v, S state) throws HPLException {
		return v.visitPIRStatement(this, state);
	}
}