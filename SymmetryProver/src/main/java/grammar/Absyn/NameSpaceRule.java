package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class NameSpaceRule implements java.io.Serializable {
  public abstract <R,A> R accept(NameSpaceRule.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.NameSpace p, A arg);

  }

}
