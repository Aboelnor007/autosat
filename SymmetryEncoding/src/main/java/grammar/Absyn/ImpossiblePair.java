package grammar.Absyn; // Java Package generated by the BNF Converter.

public class ImpossiblePair extends ImpossiblePairRule {
  public final Name name_1, name_2;
  public ImpossiblePair(Name p1, Name p2) { name_1 = p1; name_2 = p2; }

  public <R,A> R accept(grammar.Absyn.ImpossiblePairRule.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.ImpossiblePair) {
      grammar.Absyn.ImpossiblePair x = (grammar.Absyn.ImpossiblePair)o;
      return this.name_1.equals(x.name_1) && this.name_2.equals(x.name_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.name_1.hashCode())+this.name_2.hashCode();
  }


}
