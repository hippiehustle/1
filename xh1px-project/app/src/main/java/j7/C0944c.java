package j7;

import C6.InterfaceC0007h;
import a6.s;
import java.util.Collection;
import java.util.List;
import o6.j;
import w7.AbstractC1759v;
import w7.M;
import w7.X;
import x7.C1827i;
import z6.h;

/* renamed from: j7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944c implements InterfaceC0943b {

    /* renamed from: a, reason: collision with root package name */
    public final M f11946a;

    /* renamed from: b, reason: collision with root package name */
    public C1827i f11947b;

    public C0944c(M m6) {
        j.e(m6, "projection");
        this.f11946a = m6;
        m6.a();
    }

    @Override // w7.J
    public final boolean a() {
        return false;
    }

    @Override // j7.InterfaceC0943b
    public final M b() {
        return this.f11946a;
    }

    @Override // w7.J
    public final /* bridge */ /* synthetic */ InterfaceC0007h c() {
        return null;
    }

    @Override // w7.J
    public final Collection d() {
        AbstractC1759v p8;
        M m6 = this.f11946a;
        if (m6.a() == X.OUT_VARIANCE) {
            p8 = m6.b();
        } else {
            p8 = o().p();
        }
        j.b(p8);
        return E2.d.y(p8);
    }

    @Override // w7.J
    public final List e() {
        return s.f7766d;
    }

    @Override // w7.J
    public final h o() {
        h o7 = this.f11946a.b().B0().o();
        j.d(o7, "getBuiltIns(...)");
        return o7;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f11946a + ')';
    }
}
