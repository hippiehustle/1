package x7;

import C6.InterfaceC0007h;
import C6.T;
import a.AbstractC0405a;
import j7.InterfaceC0943b;
import java.util.Collection;
import java.util.List;
import n6.InterfaceC1162a;
import u7.C1652e;
import w7.AbstractC1759v;
import w7.M;

/* renamed from: x7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1827i implements InterfaceC0943b {

    /* renamed from: a, reason: collision with root package name */
    public final M f16289a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1162a f16290b;

    /* renamed from: c, reason: collision with root package name */
    public final C1827i f16291c;

    /* renamed from: d, reason: collision with root package name */
    public final T f16292d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16293e;

    public C1827i(M m6, InterfaceC1162a interfaceC1162a, C1827i c1827i, T t8) {
        o6.j.e(m6, "projection");
        this.f16289a = m6;
        this.f16290b = interfaceC1162a;
        this.f16291c = c1827i;
        this.f16292d = t8;
        this.f16293e = Z5.a.c(Z5.h.f7482d, new B6.j(29, this));
    }

    @Override // w7.J
    public final boolean a() {
        return false;
    }

    @Override // j7.InterfaceC0943b
    public final M b() {
        return this.f16289a;
    }

    @Override // w7.J
    public final InterfaceC0007h c() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // w7.J
    public final Collection d() {
        List list = (List) this.f16293e.getValue();
        if (list == null) {
            return a6.s.f7766d;
        }
        return list;
    }

    @Override // w7.J
    public final List e() {
        return a6.s.f7766d;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C1827i.class.equals(cls)) {
            return false;
        }
        o6.j.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C1827i c1827i = (C1827i) obj;
        C1827i c1827i2 = this.f16291c;
        if (c1827i2 == null) {
            c1827i2 = this;
        }
        C1827i c1827i3 = c1827i.f16291c;
        if (c1827i3 != null) {
            obj = c1827i3;
        }
        if (c1827i2 == obj) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C1827i c1827i = this.f16291c;
        if (c1827i != null) {
            return c1827i.hashCode();
        }
        return super.hashCode();
    }

    @Override // w7.J
    public final z6.h o() {
        AbstractC1759v b4 = this.f16289a.b();
        o6.j.d(b4, "getType(...)");
        return AbstractC0405a.A(b4);
    }

    public final String toString() {
        return "CapturedType(" + this.f16289a + ')';
    }

    public /* synthetic */ C1827i(M m6, C1652e c1652e, T t8, int i4) {
        this(m6, (i4 & 2) != 0 ? null : c1652e, (C1827i) null, (i4 & 8) != 0 ? null : t8);
    }
}
