package pl.infoshare.ten;

import java.util.ArrayList;
import java.util.Collection;

public class MojaLista<E> extends ArrayList<E> {

    @Override
    public E get(int index) {
        return super.get(0);
    }

}

