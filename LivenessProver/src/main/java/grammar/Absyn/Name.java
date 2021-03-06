package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class Name implements java.io.Serializable {
  public abstract <R,A> R accept(Name.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.NumberName p, A arg);
    public R visit(grammar.Absyn.LiteralName p, A arg);

  }

}
