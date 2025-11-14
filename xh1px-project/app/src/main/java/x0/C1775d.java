package x0;

import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import h6.AbstractC0837b;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import u0.z;
import w0.r;
import w0.y;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1775d implements z, y {

    /* renamed from: a, reason: collision with root package name */
    public final C1772a f16084a;

    public C1775d(C1772a c1772a) {
        this.f16084a = c1772a;
    }

    @Override // u0.InterfaceC1624o
    public final Object a(String str, InterfaceC1163b interfaceC1163b, AbstractC0713c abstractC0713c) {
        AbstractC1778g L8 = this.f16084a.L(str);
        try {
            Object m6 = interfaceC1163b.m(L8);
            AbstractC0837b.d(L8, null);
            return m6;
        } finally {
        }
    }

    @Override // u0.z
    public final Object b(AbstractC0720j abstractC0720j) {
        return Boolean.valueOf(this.f16084a.f16079d.w());
    }

    @Override // w0.y
    public final D0.a c() {
        return this.f16084a;
    }

    @Override // u0.z
    public final Object d(u0.y yVar, InterfaceC1164c interfaceC1164c, AbstractC0720j abstractC0720j) {
        return e(yVar, interfaceC1164c, abstractC0720j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(u0.y yVar, InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        C1774c c1774c;
        int i4;
        Throwable th;
        E0.a aVar;
        C1775d c1775d;
        if (abstractC0713c instanceof C1774c) {
            c1774c = (C1774c) abstractC0713c;
            int i8 = c1774c.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1774c.k = i8 - Integer.MIN_VALUE;
                Object obj = c1774c.f16083i;
                i4 = c1774c.k;
                if (i4 == 0) {
                    if (i4 == 1) {
                        aVar = c1774c.f16082h;
                        c1775d = c1774c.f16081g;
                        try {
                            Z5.a.d(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            aVar.f();
                            if (!aVar.w()) {
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    E0.a aVar2 = this.f16084a.f16079d;
                    aVar2.w();
                    int ordinal = yVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                aVar2.g();
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            aVar2.E();
                        }
                    } else {
                        aVar2.t();
                    }
                    try {
                        Object rVar = new r(1, this);
                        c1774c.f16081g = this;
                        c1774c.f16082h = aVar2;
                        c1774c.k = 1;
                        Object l6 = interfaceC1164c.l(rVar, c1774c);
                        Object obj2 = EnumC0646a.f10656d;
                        if (l6 == obj2) {
                            return obj2;
                        }
                        obj = l6;
                        aVar = aVar2;
                        c1775d = this;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar = aVar2;
                        c1775d = this;
                        aVar.f();
                        if (!aVar.w()) {
                            c1775d.getClass();
                        }
                        throw th;
                    }
                }
                aVar.C();
                aVar.f();
                if (!aVar.w()) {
                    c1775d.getClass();
                }
                return obj;
            }
        }
        c1774c = new C1774c(this, abstractC0713c);
        Object obj3 = c1774c.f16083i;
        i4 = c1774c.k;
        if (i4 == 0) {
        }
        aVar.C();
        aVar.f();
        if (!aVar.w()) {
        }
        return obj3;
    }
}
