package WebApplication1;
import javax.ejb.Stateless;
@Stateless
public class ejbsession {
int i,j,k;
    public int getI() {
        return i;}

    public void setI(int i) {
        this.i = i; }

    public int getJ() {
        return j;}

    public void setJ(int j) {
        this.j = j;}
    public void add()
    { k=i+j;}
      public int getK() 
      {
        return k;
      }
}