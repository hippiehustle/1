package U3;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import l3.C1014m;

/* loaded from: classes.dex */
public final class q implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f6130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D2.k f6131f;

    public /* synthetic */ q(InterfaceC0234g interfaceC0234g, D2.k kVar, int i4) {
        this.f6129d = i4;
        this.f6130e = interfaceC0234g;
        this.f6131f = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        p pVar;
        int i4;
        long j;
        C1014m c1014m;
        int i8;
        p4.q qVar;
        int i9;
        switch (this.f6129d) {
            case 0:
                if (interfaceC0617c instanceof p) {
                    pVar = (p) interfaceC0617c;
                    int i10 = pVar.f6127h;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        pVar.f6127h = i10 - Integer.MIN_VALUE;
                        Object obj2 = pVar.f6126g;
                        i4 = pVar.f6127h;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                Z5.a.d(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj2);
                            Long l6 = ((f2.i) obj).f10723e;
                            if (l6 != null) {
                                j = l6.longValue();
                            } else {
                                j = 0;
                            }
                            String U8 = E2.c.U(this.f6131f, j);
                            pVar.f6127h = 1;
                            Object n3 = this.f6130e.n(U8, pVar);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (n3 == enumC0646a) {
                                return enumC0646a;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                pVar = new p(this, interfaceC0617c);
                Object obj22 = pVar.f6126g;
                i4 = pVar.f6127h;
                if (i4 == 0) {
                }
                return Z5.y.f7506a;
            case 1:
                if (interfaceC0617c instanceof C1014m) {
                    c1014m = (C1014m) interfaceC0617c;
                    int i11 = c1014m.f12226h;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1014m.f12226h = i11 - Integer.MIN_VALUE;
                        Object obj3 = c1014m.f12225g;
                        i8 = c1014m.f12226h;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                Z5.a.d(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj3);
                            String U9 = E2.c.U(this.f6131f, ((p2.b) obj).f13689e);
                            c1014m.f12226h = 1;
                            Object n8 = this.f6130e.n(U9, c1014m);
                            EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                            if (n8 == enumC0646a2) {
                                return enumC0646a2;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1014m = new C1014m(this, interfaceC0617c);
                Object obj32 = c1014m.f12225g;
                i8 = c1014m.f12226h;
                if (i8 == 0) {
                }
                return Z5.y.f7506a;
            default:
                if (interfaceC0617c instanceof p4.q) {
                    qVar = (p4.q) interfaceC0617c;
                    int i12 = qVar.f13774h;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        qVar.f13774h = i12 - Integer.MIN_VALUE;
                        Object obj4 = qVar.f13773g;
                        i9 = qVar.f13774h;
                        if (i9 == 0) {
                            if (i9 == 1) {
                                Z5.a.d(obj4);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj4);
                            String U10 = E2.c.U(this.f6131f, ((j2.f) obj).f11817d);
                            qVar.f13774h = 1;
                            Object n9 = this.f6130e.n(U10, qVar);
                            EnumC0646a enumC0646a3 = EnumC0646a.f10656d;
                            if (n9 == enumC0646a3) {
                                return enumC0646a3;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                qVar = new p4.q(this, interfaceC0617c);
                Object obj42 = qVar.f13773g;
                i9 = qVar.f13774h;
                if (i9 == 0) {
                }
                return Z5.y.f7506a;
        }
    }
}
