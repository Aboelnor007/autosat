package grammar.Absyn; // Java Package generated by the BNF Converter.

public class Model extends ModelRule {
  public final AutomatonRule automatonrule_1, automatonrule_2;
  public final MaybeClosed maybeclosed_;
  public final TransducerRule transducerrule_1, transducerrule_2;
  public final ListVerifierOption listverifieroption_;

  public Model(AutomatonRule p1, MaybeClosed p2, AutomatonRule p3, TransducerRule p4, TransducerRule p5, ListVerifierOption p6) { automatonrule_1 = p1; maybeclosed_ = p2; automatonrule_2 = p3; transducerrule_1 = p4; transducerrule_2 = p5; listverifieroption_ = p6; }

  public <R,A> R accept(grammar.Absyn.ModelRule.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.Model) {
      grammar.Absyn.Model x = (grammar.Absyn.Model)o;
      return this.automatonrule_1.equals(x.automatonrule_1) && this.maybeclosed_.equals(x.maybeclosed_) && this.automatonrule_2.equals(x.automatonrule_2) && this.transducerrule_1.equals(x.transducerrule_1) && this.transducerrule_2.equals(x.transducerrule_2) && this.listverifieroption_.equals(x.listverifieroption_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(37*(37*(this.automatonrule_1.hashCode())+this.maybeclosed_.hashCode())+this.automatonrule_2.hashCode())+this.transducerrule_1.hashCode())+this.transducerrule_2.hashCode())+this.listverifieroption_.hashCode();
  }


}
