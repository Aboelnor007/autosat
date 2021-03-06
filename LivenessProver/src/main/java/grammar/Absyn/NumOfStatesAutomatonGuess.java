package grammar.Absyn; // Java Package generated by the BNF Converter.

public class NumOfStatesAutomatonGuess extends VerifierOption {
  public final String myinteger_1, myinteger_2;

  public NumOfStatesAutomatonGuess(String p1, String p2) { myinteger_1 = p1; myinteger_2 = p2; }

  public <R,A> R accept(grammar.Absyn.VerifierOption.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.NumOfStatesAutomatonGuess) {
      grammar.Absyn.NumOfStatesAutomatonGuess x = (grammar.Absyn.NumOfStatesAutomatonGuess)o;
      return this.myinteger_1.equals(x.myinteger_1) && this.myinteger_2.equals(x.myinteger_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.myinteger_1.hashCode())+this.myinteger_2.hashCode();
  }


}
