package grammar.Absyn; // Java Package generated by the BNF Converter.

public class SymmetryInstances extends Statement {
  public final ListSymInstance listsyminstance_;
  public SymmetryInstances(ListSymInstance p1) { listsyminstance_ = p1; }

  public <R,A> R accept(grammar.Absyn.Statement.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.SymmetryInstances) {
      grammar.Absyn.SymmetryInstances x = (grammar.Absyn.SymmetryInstances)o;
      return this.listsyminstance_.equals(x.listsyminstance_);
    }
    return false;
  }

  public int hashCode() {
    return this.listsyminstance_.hashCode();
  }


}
