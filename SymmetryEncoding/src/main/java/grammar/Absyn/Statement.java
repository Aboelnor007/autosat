package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class Statement implements java.io.Serializable {
  public abstract <R,A> R accept(Statement.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.NumberOfStatesGuess p, A arg);
    public R visit(grammar.Absyn.SymmetryPairs p, A arg);
    public R visit(grammar.Absyn.SymmetryInstances p, A arg);
    public R visit(grammar.Absyn.FiniteOutput p, A arg);
    public R visit(grammar.Absyn.ImpossiblePairs p, A arg);
    public R visit(grammar.Absyn.ValidConfiguration p, A arg);
    public R visit(grammar.Absyn.TurnOffConditions p, A arg);

  }

}
