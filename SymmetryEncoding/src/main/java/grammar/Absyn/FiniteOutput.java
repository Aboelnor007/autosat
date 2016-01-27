package grammar.Absyn; // Java Package generated by the BNF Converter.

public class FiniteOutput extends Statement {
  public final ListName listname_;
  public FiniteOutput(ListName p1) { listname_ = p1; }

  public <R,A> R accept(grammar.Absyn.Statement.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.FiniteOutput) {
      grammar.Absyn.FiniteOutput x = (grammar.Absyn.FiniteOutput)o;
      return this.listname_.equals(x.listname_);
    }
    return false;
  }

  public int hashCode() {
    return this.listname_.hashCode();
  }


}
