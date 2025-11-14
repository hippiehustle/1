package X;

import e6.EnumC0646a;
import f6.AbstractC0713c;
import n6.InterfaceC1164c;

/* renamed from: X.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U7.a f6743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o6.r f6744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o6.u f6745c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f6746d;

    public C0342j(U7.a aVar, o6.r rVar, o6.u uVar, H h8) {
        this.f6743a = aVar;
        this.f6744b = rVar;
        this.f6745c = uVar;
        this.f6746d = h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ac, B:30:0x00b4), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d3, B:46:0x00da), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {all -> 0x00d0, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d3, B:46:0x00da), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0338f c0338f, AbstractC0713c abstractC0713c) {
        C0341i c0341i;
        int i4;
        U7.a aVar;
        H h8;
        o6.r rVar;
        o6.u uVar;
        InterfaceC1164c interfaceC1164c;
        U7.a aVar2;
        U7.a aVar3;
        H h9;
        Object obj;
        try {
            if (abstractC0713c instanceof C0341i) {
                c0341i = (C0341i) abstractC0713c;
                int i8 = c0341i.f6742n;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0341i.f6742n = i8 - Integer.MIN_VALUE;
                    Object obj2 = c0341i.f6740l;
                    i4 = c0341i.f6742n;
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    obj = c0341i.f6739i;
                                    uVar = (o6.u) c0341i.f6738h;
                                    aVar2 = (U7.a) c0341i.f6737g;
                                    try {
                                        Z5.a.d(obj2);
                                        uVar.f13642d = obj;
                                        Object obj3 = uVar.f13642d;
                                        aVar2.a(null);
                                        return obj3;
                                    } catch (Throwable th) {
                                        th = th;
                                        aVar2.a(null);
                                        throw th;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h9 = (H) c0341i.f6739i;
                            uVar = (o6.u) c0341i.f6738h;
                            aVar3 = (U7.a) c0341i.f6737g;
                            try {
                                Z5.a.d(obj2);
                                if (o6.j.a(obj2, uVar.f13642d)) {
                                    c0341i.f6737g = aVar3;
                                    c0341i.f6738h = uVar;
                                    c0341i.f6739i = obj2;
                                    c0341i.f6742n = 3;
                                    if (h9.k(obj2, false, c0341i) != enumC0646a) {
                                        obj = obj2;
                                        aVar2 = aVar3;
                                        uVar.f13642d = obj;
                                        Object obj32 = uVar.f13642d;
                                        aVar2.a(null);
                                        return obj32;
                                    }
                                    return enumC0646a;
                                }
                                aVar2 = aVar3;
                                Object obj322 = uVar.f13642d;
                                aVar2.a(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar3;
                                aVar2.a(null);
                                throw th;
                            }
                        }
                        H h10 = c0341i.k;
                        uVar = c0341i.j;
                        rVar = (o6.r) c0341i.f6739i;
                        U7.a aVar4 = (U7.a) c0341i.f6738h;
                        InterfaceC1164c interfaceC1164c2 = (InterfaceC1164c) c0341i.f6737g;
                        Z5.a.d(obj2);
                        h8 = h10;
                        interfaceC1164c = interfaceC1164c2;
                        aVar = aVar4;
                    } else {
                        Z5.a.d(obj2);
                        c0341i.f6737g = c0338f;
                        aVar = this.f6743a;
                        c0341i.f6738h = aVar;
                        o6.r rVar2 = this.f6744b;
                        c0341i.f6739i = rVar2;
                        o6.u uVar2 = this.f6745c;
                        c0341i.j = uVar2;
                        h8 = this.f6746d;
                        c0341i.k = h8;
                        c0341i.f6742n = 1;
                        if (aVar.d(c0341i) != enumC0646a) {
                            rVar = rVar2;
                            uVar = uVar2;
                            interfaceC1164c = c0338f;
                        }
                        return enumC0646a;
                    }
                    if (rVar.f13639d) {
                        Object obj4 = uVar.f13642d;
                        c0341i.f6737g = aVar;
                        c0341i.f6738h = uVar;
                        c0341i.f6739i = h8;
                        c0341i.j = null;
                        c0341i.k = null;
                        c0341i.f6742n = 2;
                        Object l6 = interfaceC1164c.l(obj4, c0341i);
                        if (l6 != enumC0646a) {
                            aVar3 = aVar;
                            obj2 = l6;
                            h9 = h8;
                            if (o6.j.a(obj2, uVar.f13642d)) {
                            }
                        }
                        return enumC0646a;
                    }
                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                }
            }
            if (rVar.f13639d) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.a(null);
            throw th;
        }
        c0341i = new C0341i(this, abstractC0713c);
        Object obj22 = c0341i.f6740l;
        i4 = c0341i.f6742n;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
    }
}
