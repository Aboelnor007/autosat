package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class CheckingConditionRule implements java.io.Serializable {
  public abstract <R,A> R accept(CheckingConditionRule.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.ParikhCondition p, A arg);
    public R visit(grammar.Absyn.AutomorphismCondition p, A arg);
    public R visit(grammar.Absyn.PermutativeCondition p, A arg);
    public R visit(grammar.Absyn.InjectiveOutputCondition p, A arg);
    public R visit(grammar.Absyn.InjectiveInputCondition p, A arg);
    public R visit(grammar.Absyn.CopycatCondition p, A arg);
    public R visit(grammar.Absyn.OutputUniversalCondition p, A arg);
    public R visit(grammar.Absyn.InputUniversalCondition p, A arg);

  }

}
