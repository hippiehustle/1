package o6;

import u6.InterfaceC1641b;
import u6.InterfaceC1647h;
import w6.AbstractC1731s;

/* loaded from: classes.dex */
public class m extends q implements u6.i, u6.j {
    public m(Class cls, String str, String str2, int i4) {
        super(C1283b.f13627d, cls, str, str2, i4);
    }

    public void e(Object obj, Object obj2) {
        ((AbstractC1731s) i()).g(obj, obj2);
    }

    @Override // o6.AbstractC1284c
    public final InterfaceC1641b f() {
        return v.f13643a.d(this);
    }

    public Object get(Object obj) {
        return ((AbstractC1731s) c()).g(obj);
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        return get(obj);
    }

    @Override // u6.s
    public final u6.q c() {
        return ((u6.i) k()).c();
    }

    @Override // u6.j
    public final InterfaceC1647h i() {
        return ((u6.i) k()).i();
    }
}
