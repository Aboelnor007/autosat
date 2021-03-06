package grammar.Absyn; // Java Package generated by the BNF Converter.

public class FulTransition extends TransitionRule {
  public final Name name_1, name_2, name_3, name_4;

  public FulTransition(Name p1, Name p2, Name p3, Name p4) { name_1 = p1; name_2 = p2; name_3 = p3; name_4 = p4; }

  public <R,A> R accept(grammar.Absyn.TransitionRule.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.FulTransition) {
      grammar.Absyn.FulTransition x = (grammar.Absyn.FulTransition)o;
      return this.name_1.equals(x.name_1) && this.name_2.equals(x.name_2) && this.name_3.equals(x.name_3) && this.name_4.equals(x.name_4);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(this.name_1.hashCode())+this.name_2.hashCode())+this.name_3.hashCode())+this.name_4.hashCode();
  }


}
