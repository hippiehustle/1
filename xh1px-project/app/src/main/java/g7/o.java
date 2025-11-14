package g7;

import java.io.Serializable;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class o extends AbstractC0793b implements Serializable {
    public static n g(AbstractC0793b abstractC0793b, AbstractC0793b abstractC0793b2, int i4, L l6, Class cls) {
        return new n(abstractC0793b, Collections.EMPTY_LIST, abstractC0793b2, new C0804m(i4, l6, true), cls);
    }

    public static n h(AbstractC0793b abstractC0793b, Object obj, AbstractC0793b abstractC0793b2, int i4, L l6, Class cls) {
        return new n(abstractC0793b, obj, abstractC0793b2, new C0804m(i4, l6, false), cls);
    }
}
