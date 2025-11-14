package F6;

import C6.InterfaceC0007h;
import java.util.Collection;
import java.util.List;
import m7.AbstractC1098d;

/* renamed from: F6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045e implements w7.J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0046f f1523a;

    public C0045e(AbstractC0046f abstractC0046f) {
        this.f1523a = abstractC0046f;
    }

    @Override // w7.J
    public final boolean a() {
        return true;
    }

    @Override // w7.J
    public final InterfaceC0007h c() {
        return this.f1523a;
    }

    @Override // w7.J
    public final Collection d() {
        Collection d2 = ((u7.s) this.f1523a).O0().B0().d();
        o6.j.d(d2, "getSupertypes(...)");
        return d2;
    }

    @Override // w7.J
    public final List e() {
        List list = ((u7.s) this.f1523a).f15456t;
        if (list != null) {
            return list;
        }
        o6.j.i("typeConstructorParameters");
        throw null;
    }

    @Override // w7.J
    public final z6.h o() {
        return AbstractC1098d.e(this.f1523a);
    }

    public final String toString() {
        return "[typealias " + this.f1523a.getName().b() + ']';
    }
}
