package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class SymInstance implements java.io.Serializable {
  public abstract <R,A> R accept(SymInstance.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.SymmetryInstance p, A arg);

  }

}
