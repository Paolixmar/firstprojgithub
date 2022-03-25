public class Aliante extends Aereomobile
{
    private int coefficienteAereo;

    public Aliante(int coefficienteAereo){this.coefficienteAereo=coefficienteAereo;}

    public int getCoefficienteAereo() {return coefficienteAereo;}

    public void setCoefficienteAereo(int coefficienteAereo) {this.coefficienteAereo = coefficienteAereo;}

    @Override
    public boolean superiore(CMP x)
    {
        if(x instanceof Aliante)return this.getCoefficienteAereo()>((Aliante) x).getCoefficienteAereo();
        else return false;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aliante aliante = (Aliante) o;
        return coefficienteAereo == aliante.coefficienteAereo;
    }

    @Override
    public String toString() {return "Aliante{" + "coefficienteAereo=" + coefficienteAereo + '}';}

}
