package w6;

import c7.InterfaceC0588g;
import f7.C0722b;
import h6.AbstractC0837b;
import h7.C0845h;
import i.AbstractC0862a;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import o6.C1283b;
import x6.InterfaceC1803g;

/* loaded from: classes.dex */
public abstract class m0 extends AbstractC1731s implements u6.s {

    /* renamed from: l, reason: collision with root package name */
    public static final Object f15876l = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final F f15877f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15878g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15879h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f15880i;
    public final Object j;
    public final s0 k;

    public m0(F f8, String str, String str2, C6.M m6, Object obj) {
        this.f15877f = f8;
        this.f15878g = str;
        this.f15879h = str2;
        this.f15880i = obj;
        this.j = Z5.a.c(Z5.h.f7482d, new g0(this, 0));
        this.k = AbstractC0862a.l(m6, new g0(this, 1));
    }

    public final boolean equals(Object obj) {
        m0 c6 = y0.c(obj);
        if (c6 == null || !o6.j.a(this.f15877f, c6.f15877f) || !o6.j.a(this.f15878g, c6.f15878g) || !o6.j.a(this.f15879h, c6.f15879h) || !o6.j.a(this.f15880i, c6.f15880i)) {
            return false;
        }
        return true;
    }

    @Override // u6.InterfaceC1641b
    public final String getName() {
        return this.f15878g;
    }

    @Override // w6.AbstractC1731s
    public final InterfaceC1803g h() {
        return w().h();
    }

    public final int hashCode() {
        return this.f15879h.hashCode() + A.j.c(this.f15878g, this.f15877f.hashCode() * 31, 31);
    }

    @Override // w6.AbstractC1731s
    public final F k() {
        return this.f15877f;
    }

    @Override // w6.AbstractC1731s
    public final InterfaceC1803g n() {
        w().getClass();
        return null;
    }

    @Override // u6.InterfaceC1641b
    public final boolean p() {
        return false;
    }

    @Override // w6.AbstractC1731s
    public final boolean t() {
        if (this.f15880i != C1283b.f13627d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        C0845h c0845h = v0.f15919a;
        return v0.c(o());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, Z5.g] */
    public final Member u() {
        if (!o().f0()) {
            return null;
        }
        C0722b c0722b = w0.f15923a;
        AbstractC0837b b4 = w0.b(o());
        if (b4 instanceof C1727n) {
            C1727n c1727n = (C1727n) b4;
            InterfaceC0588g interfaceC0588g = c1727n.f15884d;
            d7.e eVar = c1727n.f15883c;
            if ((eVar.f10475e & 16) == 16) {
                d7.c cVar = eVar.j;
                int i4 = cVar.f10462e;
                if ((i4 & 1) != 1 || (i4 & 2) != 2) {
                    return null;
                }
                return this.f15877f.g(interfaceC0588g.getString(cVar.f10463f), interfaceC0588g.getString(cVar.f10464g));
            }
        }
        return (Field) this.j.getValue();
    }

    @Override // w6.AbstractC1731s
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final C6.M o() {
        Object a3 = this.k.a();
        o6.j.d(a3, "invoke(...)");
        return (C6.M) a3;
    }

    public abstract j0 w();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(F f8, String str, String str2, Object obj) {
        this(f8, str, str2, null, obj);
        o6.j.e(f8, "container");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m0(F f8, C6.M m6) {
        this(f8, r3, w0.b(m6).a(), m6, C1283b.f13627d);
        o6.j.e(m6, "descriptor");
        String b4 = m6.getName().b();
        o6.j.d(b4, "asString(...)");
    }
}
