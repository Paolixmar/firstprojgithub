public class AereoAMotore extends Aereomobile
{
    private double potenzaMotore;

    public AereoAMotore(double potenzaMotore){this.potenzaMotore=potenzaMotore;}

    public double getPotenzaMotore() {return potenzaMotore;}

    public void setPotenzaMotore(double potenzaMotore) {this.potenzaMotore = potenzaMotore;}

    @Override
    public boolean superiore(CMP x)
    {
        if(x instanceof AereoAMotore)return this.getPotenzaMotore()>((AereoAMotore) x).getPotenzaMotore();
        else return false;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AereoAMotore that = (AereoAMotore) o;
        return Double.compare(that.potenzaMotore, potenzaMotore) == 0;
    }

    @Override
    public String toString() {return "AereoAMotore{" + "potenzaMotore=" + potenzaMotore + '}';}

}
