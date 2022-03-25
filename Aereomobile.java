import java.util.Objects;

public abstract class Aereomobile implements CMP
{
    private String ID;

    public String getID() {return ID;}

    public void setID(String ID) {this.ID = ID;}

    public abstract boolean superiore(CMP x);

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aereomobile that = (Aereomobile) o;
        return Objects.equals(ID, that.ID);
    }

    @Override
    public String toString() {return "Aereomobile{" + "ID='" + ID + '\'' + '}';}

}
