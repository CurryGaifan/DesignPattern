package pattern.structure.adapter;

/**
 * ÀàÊÊÅäÆ÷
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specileRequest();
    }
}
