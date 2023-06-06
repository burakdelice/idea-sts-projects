package v1;

public class JenerikSinifOrnegi <T> {

    T nesne;

  /*  public v1.JenerikSinifOrnegi() {
    }*/

    public JenerikSinifOrnegi(T nesne) {
        this.nesne = nesne;
    }

    public T getNesne() {
        return nesne;
    }

    public void setNesne(T nesne) {
        this.nesne = nesne;
    }

    @Override
    public String toString() {
        return "v1.JenerikSinifOrnegi{" +
                "nesne=" + nesne +
                '}';
    }
}
