package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class VerifierOption implements java.io.Serializable {
  public abstract <R,A> R accept(VerifierOption.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.NumOfStatesTransducerGuess p, A arg);
    public R visit(grammar.Absyn.NumOfStatesAutomatonGuess p, A arg);
    public R visit(grammar.Absyn.NumOfInitStatesAutomatonGuess p, A arg);
    public R visit(grammar.Absyn.SymmetryOptions p, A arg);
    public R visit(grammar.Absyn.ExplicitChecks p, A arg);
    public R visit(grammar.Absyn.UseRankingFunctions p, A arg);
    public R visit(grammar.Absyn.MonolithicWitness p, A arg);
    public R visit(grammar.Absyn.NoPrecomputedInv p, A arg);
    public R visit(grammar.Absyn.LogLevel p, A arg);
    public R visit(grammar.Absyn.ParLevel p, A arg);

  }

}
