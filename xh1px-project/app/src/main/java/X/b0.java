package X;

import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import java.util.concurrent.atomic.AtomicInteger;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final U7.c f6713a = new U7.c();

    /* renamed from: b, reason: collision with root package name */
    public final W0.c f6714b = new W0.c(19);

    /* renamed from: c, reason: collision with root package name */
    public final W0.d f6715c = new W0.d((InterfaceC1164c) new AbstractC0720j(2, null));

    /* JADX WARN: Type inference failed for: r3v3, types: [f6.j, n6.c] */
    public b0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f6714b.f6486e).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.d(r0) == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(InterfaceC1163b interfaceC1163b, AbstractC0713c abstractC0713c) {
        Y y4;
        int i4;
        EnumC0646a enumC0646a;
        U7.c cVar;
        Throwable th;
        U7.a aVar;
        Object m6;
        try {
            if (abstractC0713c instanceof Y) {
                y4 = (Y) abstractC0713c;
                int i8 = y4.k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    y4.k = i8 - Integer.MIN_VALUE;
                    Object obj = y4.f6707i;
                    i4 = y4.k;
                    enumC0646a = EnumC0646a.f10656d;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                aVar = (U7.a) y4.f6705g;
                                try {
                                    Z5.a.d(obj);
                                    aVar.a(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    aVar.a(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        U7.c cVar2 = y4.f6706h;
                        InterfaceC1163b interfaceC1163b2 = (InterfaceC1163b) y4.f6705g;
                        Z5.a.d(obj);
                        cVar = cVar2;
                        interfaceC1163b = interfaceC1163b2;
                    } else {
                        Z5.a.d(obj);
                        y4.f6705g = interfaceC1163b;
                        cVar = this.f6713a;
                        y4.f6706h = cVar;
                        y4.k = 1;
                    }
                    y4.f6705g = cVar;
                    y4.f6706h = null;
                    y4.k = 2;
                    m6 = interfaceC1163b.m(y4);
                    if (m6 != enumC0646a) {
                        U7.c cVar3 = cVar;
                        obj = m6;
                        aVar = cVar3;
                        aVar.a(null);
                        return obj;
                    }
                    return enumC0646a;
                }
            }
            y4.f6705g = cVar;
            y4.f6706h = null;
            y4.k = 2;
            m6 = interfaceC1163b.m(y4);
            if (m6 != enumC0646a) {
            }
            return enumC0646a;
        } catch (Throwable th3) {
            U7.c cVar4 = cVar;
            th = th3;
            aVar = cVar4;
            aVar.a(null);
            throw th;
        }
        y4 = new Y(this, abstractC0713c);
        Object obj2 = y4.f6707i;
        i4 = y4.k;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        Z z8;
        int i4;
        U7.c cVar;
        Throwable th;
        boolean z9;
        if (abstractC0713c instanceof Z) {
            z8 = (Z) abstractC0713c;
            int i8 = z8.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                z8.k = i8 - Integer.MIN_VALUE;
                Object obj = z8.f6710i;
                i4 = z8.k;
                if (i4 == 0) {
                    if (i4 == 1) {
                        z9 = z8.f6709h;
                        cVar = z8.f6708g;
                        try {
                            Z5.a.d(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            if (z9) {
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    U7.c cVar2 = this.f6713a;
                    boolean e9 = cVar2.e();
                    try {
                        Object valueOf = Boolean.valueOf(e9);
                        z8.f6708g = cVar2;
                        z8.f6709h = e9;
                        z8.k = 1;
                        Object l6 = interfaceC1164c.l(valueOf, z8);
                        Object obj2 = EnumC0646a.f10656d;
                        if (l6 == obj2) {
                            return obj2;
                        }
                        cVar = cVar2;
                        obj = l6;
                        z9 = e9;
                    } catch (Throwable th3) {
                        cVar = cVar2;
                        th = th3;
                        z9 = e9;
                        if (z9) {
                            cVar.a(null);
                        }
                        throw th;
                    }
                }
                if (z9) {
                    cVar.a(null);
                }
                return obj;
            }
        }
        z8 = new Z(this, abstractC0713c);
        Object obj3 = z8.f6710i;
        i4 = z8.k;
        if (i4 == 0) {
        }
        if (z9) {
        }
        return obj3;
    }
}
