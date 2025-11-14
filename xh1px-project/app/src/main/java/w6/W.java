package w6;

import C6.InterfaceC0002c;
import C6.InterfaceC0019u;
import f7.C0725e;
import h7.C0845h;
import i.AbstractC0862a;
import kotlin.NoWhenBranchMatchedException;
import n1.AbstractC1149a;
import n6.InterfaceC1162a;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class W implements u6.l {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f15824e;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1731s f15825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15826b;

    /* renamed from: c, reason: collision with root package name */
    public final u6.k f15827c;

    /* renamed from: d, reason: collision with root package name */
    public final s0 f15828d;

    static {
        o6.p pVar = new o6.p(W.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        o6.w wVar = o6.v.f13643a;
        f15824e = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(W.class, "annotations", "getAnnotations()Ljava/util/List;", 0, wVar)};
    }

    public W(AbstractC1731s abstractC1731s, int i4, u6.k kVar, InterfaceC1162a interfaceC1162a) {
        this.f15825a = abstractC1731s;
        this.f15826b = i4;
        this.f15827c = kVar;
        this.f15828d = AbstractC0862a.l(null, interfaceC1162a);
        AbstractC0862a.l(null, new U(this, 0));
    }

    public final C6.K a() {
        u6.s sVar = f15824e[0];
        Object a3 = this.f15828d.a();
        o6.j.d(a3, "getValue(...)");
        return (C6.K) a3;
    }

    public final String b() {
        F6.U u8;
        C6.K a3 = a();
        if (a3 instanceof F6.U) {
            u8 = (F6.U) a3;
        } else {
            u8 = null;
        }
        if (u8 != null && !u8.q().S()) {
            C0725e name = u8.getName();
            o6.j.d(name, "getName(...)");
            if (!name.f10805e) {
                return name.b();
            }
        }
        return null;
    }

    public final o0 c() {
        AbstractC1759v b4 = a().b();
        o6.j.d(b4, "getType(...)");
        return new o0(b4, new U(this, 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof W) {
            W w8 = (W) obj;
            if (o6.j.a(this.f15825a, w8.f15825a) && this.f15826b == w8.f15826b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15826b) + (this.f15825a.hashCode() * 31);
    }

    public final String toString() {
        String b4;
        C0845h c0845h = v0.f15919a;
        StringBuilder sb = new StringBuilder();
        int ordinal = this.f15827c.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    sb.append("parameter #" + this.f15826b + ' ' + b());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                sb.append("extension receiver parameter");
            }
        } else {
            sb.append("instance parameter");
        }
        sb.append(" of ");
        InterfaceC0002c o7 = this.f15825a.o();
        if (o7 instanceof C6.M) {
            b4 = v0.c((C6.M) o7);
        } else if (o7 instanceof InterfaceC0019u) {
            b4 = v0.b((InterfaceC0019u) o7);
        } else {
            throw new IllegalStateException(("Illegal callable: " + o7).toString());
        }
        sb.append(b4);
        return sb.toString();
    }
}
