package Y6;

import C6.F;
import a6.AbstractC0434i;
import a7.C0450k;
import a7.E;
import c7.C0587f;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import q4.X;
import s7.C1513d;
import s7.C1518i;
import u7.EnumC1656i;
import u7.v;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f7214b = X.T(Z6.a.CLASS);

    /* renamed from: c, reason: collision with root package name */
    public static final Set f7215c = AbstractC0434i.l1(new Z6.a[]{Z6.a.FILE_FACADE, Z6.a.MULTIFILE_CLASS_PART});

    /* renamed from: d, reason: collision with root package name */
    public static final C0587f f7216d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0587f f7217e;

    /* renamed from: a, reason: collision with root package name */
    public C1518i f7218a;

    static {
        new C0587f(new int[]{1, 1, 2}, false);
        f7216d = new C0587f(new int[]{1, 1, 11}, false);
        f7217e = new C0587f(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (Y6.e.f7215c.contains(r0.f7517a) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u7.p a(F f8, H6.b bVar) {
        Z5.j jVar;
        o6.j.e(bVar, "kotlinClass");
        Z6.b bVar2 = bVar.f2038b;
        String[] strArr = bVar2.f7519c;
        if (strArr == null) {
            strArr = bVar2.f7520d;
        }
        if (strArr != null) {
        }
        strArr = null;
        if (strArr != null) {
            C0587f c0587f = bVar2.f7518b;
            String[] strArr2 = bVar2.f7521e;
            if (strArr2 != null) {
                try {
                    try {
                        jVar = e7.g.h(strArr, strArr2);
                    } catch (InvalidProtocolBufferException e9) {
                        throw new IllegalStateException("Could not read data from " + bVar.a(), e9);
                    }
                } catch (Throwable th) {
                    c().f14575c.getClass();
                    if (!c0587f.b(e())) {
                        jVar = null;
                    } else {
                        throw th;
                    }
                }
                if (jVar != null) {
                    e7.f fVar = (e7.f) jVar.f7485d;
                    E e10 = (E) jVar.f7486e;
                    d(bVar);
                    g gVar = new g(bVar, e10, fVar, f(bVar), b(bVar));
                    return new u7.p(f8, e10, fVar, c0587f, gVar, c(), "scope for " + gVar + " in " + f8, d.f7213d);
                }
            }
        }
        return null;
    }

    public final EnumC1656i b(H6.b bVar) {
        c().f14575c.getClass();
        int i4 = bVar.f2038b.f7523g;
        if ((i4 & 16) != 0 && (i4 & 32) == 0) {
            return EnumC1656i.f15416e;
        }
        return EnumC1656i.f15415d;
    }

    public final C1518i c() {
        C1518i c1518i = this.f7218a;
        if (c1518i != null) {
            return c1518i;
        }
        o6.j.i("components");
        throw null;
    }

    public final s7.n d(H6.b bVar) {
        C0587f c0587f;
        c().f14575c.getClass();
        if (bVar.f2038b.f7518b.b(e())) {
            return null;
        }
        C0587f c0587f2 = bVar.f2038b.f7518b;
        C0587f c0587f3 = C0587f.f9721g;
        C0587f e9 = e();
        C0587f e10 = e();
        boolean z8 = c0587f2.f9723f;
        e10.getClass();
        if (z8) {
            c0587f = c0587f3;
        } else {
            c0587f = C0587f.f9722h;
        }
        int i4 = c0587f.f9675b;
        int i8 = e10.f9675b;
        if (i4 > i8 || (i4 >= i8 && c0587f.f9676c > e10.f9676c)) {
            e10 = c0587f;
        }
        return new s7.n(c0587f2, c0587f3, e9, e10, bVar.a());
    }

    public final C0587f e() {
        c().f14575c.getClass();
        return C0587f.f9721g;
    }

    public final boolean f(H6.b bVar) {
        c().f14575c.getClass();
        c().f14575c.getClass();
        Z6.b bVar2 = bVar.f2038b;
        if ((bVar2.f7523g & 2) == 0 || !bVar2.f7518b.equals(f7216d)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (Y6.e.f7214b.contains(r1.f7517a) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1513d g(H6.b bVar) {
        Z5.j jVar;
        Z6.b bVar2 = bVar.f2038b;
        String[] strArr = bVar2.f7519c;
        if (strArr == null) {
            strArr = bVar2.f7520d;
        }
        if (strArr != null) {
        }
        strArr = null;
        if (strArr != null) {
            C0587f c0587f = bVar2.f7518b;
            String[] strArr2 = bVar2.f7521e;
            try {
            } catch (Throwable th) {
                c().f14575c.getClass();
                if (!c0587f.b(e())) {
                    jVar = null;
                } else {
                    throw th;
                }
            }
            if (strArr2 != null) {
                try {
                    jVar = e7.g.f(strArr, strArr2);
                    if (jVar != null) {
                        e7.f fVar = (e7.f) jVar.f7485d;
                        C0450k c0450k = (C0450k) jVar.f7486e;
                        d(bVar);
                        return new C1513d(fVar, c0450k, c0587f, new o(bVar, new v(f(bVar)), b(bVar)));
                    }
                } catch (InvalidProtocolBufferException e9) {
                    throw new IllegalStateException("Could not read data from " + bVar.a(), e9);
                }
            }
        }
        return null;
    }
}
