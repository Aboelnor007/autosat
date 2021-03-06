package grammar.Absyn; // Java Package generated by the BNF Converter.

public class AutomorphismCondition extends CheckingConditionRule {
  public AutomorphismCondition() { }

  public <R,A> R accept(grammar.Absyn.CheckingConditionRule.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.AutomorphismCondition) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
