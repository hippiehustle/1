package O7;

import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class r implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W5.a f4176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S3.h f4177e;

    public r(W5.a aVar, S3.h hVar) {
        this.f4176d = aVar;
        this.f4177e = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // O7.InterfaceC0233f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        C0244q c0244q;
        int i4;
        EnumC0646a enumC0646a;
        r rVar;
        k0 k0Var;
        S3.h hVar;
        P7.y yVar;
        Throwable th;
        P7.y yVar2;
        S3.h hVar2;
        try {
            if (interfaceC0617c instanceof C0244q) {
                c0244q = (C0244q) interfaceC0617c;
                int i8 = c0244q.f4174h;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0244q.f4174h = i8 - Integer.MIN_VALUE;
                    Object obj = c0244q.f4173g;
                    i4 = c0244q.f4174h;
                    enumC0646a = EnumC0646a.f10656d;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    yVar2 = (P7.y) c0244q.j;
                                    try {
                                        Z5.a.d(obj);
                                        yVar2.w();
                                        return Z5.y.f7506a;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        yVar2.w();
                                        throw th;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th3 = (Throwable) c0244q.j;
                            Z5.a.d(obj);
                            throw th3;
                        }
                        interfaceC0234g = c0244q.k;
                        rVar = (r) c0244q.j;
                        try {
                            Z5.a.d(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            k0Var = new k0(th);
                            hVar = rVar.f4177e;
                            c0244q.j = th;
                            c0244q.k = null;
                            c0244q.f4174h = 2;
                            if (V.e(k0Var, hVar, th, c0244q) != enumC0646a) {
                            }
                        }
                    } else {
                        Z5.a.d(obj);
                        try {
                            W5.a aVar = this.f4176d;
                            c0244q.j = this;
                            c0244q.k = interfaceC0234g;
                            c0244q.f4174h = 1;
                            if (aVar.x(interfaceC0234g, c0244q) != enumC0646a) {
                                rVar = this;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            rVar = this;
                            k0Var = new k0(th);
                            hVar = rVar.f4177e;
                            c0244q.j = th;
                            c0244q.k = null;
                            c0244q.f4174h = 2;
                            if (V.e(k0Var, hVar, th, c0244q) != enumC0646a) {
                                return enumC0646a;
                            }
                            throw th;
                        }
                        return enumC0646a;
                    }
                    InterfaceC0622h interfaceC0622h = c0244q.f10782e;
                    o6.j.b(interfaceC0622h);
                    yVar = new P7.y(interfaceC0234g, interfaceC0622h);
                    hVar2 = rVar.f4177e;
                    c0244q.j = yVar;
                    c0244q.k = null;
                    c0244q.f4174h = 3;
                    if (hVar2.j(yVar, null, c0244q) != enumC0646a) {
                        yVar2 = yVar;
                        yVar2.w();
                        return Z5.y.f7506a;
                    }
                    return enumC0646a;
                }
            }
            hVar2 = rVar.f4177e;
            c0244q.j = yVar;
            c0244q.k = null;
            c0244q.f4174h = 3;
            if (hVar2.j(yVar, null, c0244q) != enumC0646a) {
            }
            return enumC0646a;
        } catch (Throwable th6) {
            th = th6;
            yVar2 = yVar;
            yVar2.w();
            throw th;
        }
        c0244q = new C0244q(this, interfaceC0617c);
        Object obj2 = c0244q.f4173g;
        i4 = c0244q.f4174h;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        InterfaceC0622h interfaceC0622h2 = c0244q.f10782e;
        o6.j.b(interfaceC0622h2);
        yVar = new P7.y(interfaceC0234g, interfaceC0622h2);
    }
}
