package grammar.Absyn; // Java Package generated by the BNF Converter.

public class SymmetryPair extends SymmetryPairRule {
  public final NameSequenceRule namesequencerule_1, namesequencerule_2;
  public SymmetryPair(NameSequenceRule p1, NameSequenceRule p2) { namesequencerule_1 = p1; namesequencerule_2 = p2; }

  public <R,A> R accept(grammar.Absyn.SymmetryPairRule.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.SymmetryPair) {
      grammar.Absyn.SymmetryPair x = (grammar.Absyn.SymmetryPair)o;
      return this.namesequencerule_1.equals(x.namesequencerule_1) && this.namesequencerule_2.equals(x.namesequencerule_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.namesequencerule_1.hashCode())+this.namesequencerule_2.hashCode();
  }


}
