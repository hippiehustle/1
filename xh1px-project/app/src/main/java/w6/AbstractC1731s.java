package w6;

import C6.InterfaceC0002c;
import i.AbstractC0862a;
import java.util.List;
import u6.InterfaceC1641b;
import x6.InterfaceC1803g;

/* renamed from: w6.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1731s implements InterfaceC1641b, q0 {

    /* renamed from: d, reason: collision with root package name */
    public final s0 f15907d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15908e;

    public AbstractC1731s() {
        AbstractC0862a.l(null, new C1729p(this, 0));
        this.f15907d = AbstractC0862a.l(null, new C1729p(this, 1));
        AbstractC0862a.l(null, new C1729p(this, 2));
        AbstractC0862a.l(null, new C1729p(this, 3));
        AbstractC0862a.l(null, new C1729p(this, 4));
        this.f15908e = Z5.a.c(Z5.h.f7482d, new C1729p(this, 5));
    }

    public final Object g(Object... objArr) {
        try {
            return h().d(objArr);
        } catch (IllegalAccessException e9) {
            throw new Exception(e9);
        }
    }

    public abstract InterfaceC1803g h();

    public abstract F k();

    public abstract InterfaceC1803g n();

    public abstract InterfaceC0002c o();

    public final List r() {
        Object a3 = this.f15907d.a();
        o6.j.d(a3, "invoke(...)");
        return (List) a3;
    }

    public final boolean s() {
        if (o6.j.a(getName(), "<init>") && k().d().isAnnotation()) {
            return true;
        }
        return false;
    }

    public abstract boolean t();
}
