package y2;

import L3.B;
import O7.InterfaceC0234g;
import Z5.y;
import a0.C0407b;
import d6.InterfaceC0617c;
import e2.AbstractC0640c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class j implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f16481e;

    public /* synthetic */ j(InterfaceC0234g interfaceC0234g, int i4) {
        this.f16480d = i4;
        this.f16481e = interfaceC0234g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        i iVar;
        int i4;
        boolean z8;
        B b4;
        int i8;
        switch (this.f16480d) {
            case 0:
                if (interfaceC0617c instanceof i) {
                    iVar = (i) interfaceC0617c;
                    int i9 = iVar.f16478h;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        iVar.f16478h = i9 - Integer.MIN_VALUE;
                        Object obj2 = iVar.f16477g;
                        i4 = iVar.f16478h;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                Z5.a.d(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj2);
                            Boolean bool = (Boolean) ((C0407b) obj).c(p.f16489d);
                            if (bool != null) {
                                z8 = bool.booleanValue();
                            } else {
                                z8 = false;
                            }
                            Boolean valueOf = Boolean.valueOf(z8);
                            iVar.f16478h = 1;
                            Object n3 = this.f16481e.n(valueOf, iVar);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (n3 == enumC0646a) {
                                return enumC0646a;
                            }
                        }
                        return y.f7506a;
                    }
                }
                iVar = new i(this, interfaceC0617c);
                Object obj22 = iVar.f16477g;
                i4 = iVar.f16478h;
                if (i4 == 0) {
                }
                return y.f7506a;
            default:
                if (interfaceC0617c instanceof B) {
                    b4 = (B) interfaceC0617c;
                    int i10 = b4.f2781h;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        b4.f2781h = i10 - Integer.MIN_VALUE;
                        Object obj3 = b4.f2780g;
                        i8 = b4.f2781h;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                Z5.a.d(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj3);
                            AbstractC0640c abstractC0640c = ((f2.c) obj).f10686g;
                            b4.f2781h = 1;
                            Object n8 = this.f16481e.n(abstractC0640c, b4);
                            EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                            if (n8 == enumC0646a2) {
                                return enumC0646a2;
                            }
                        }
                        return y.f7506a;
                    }
                }
                b4 = new B(this, interfaceC0617c);
                Object obj32 = b4.f2780g;
                i8 = b4.f2781h;
                if (i8 == 0) {
                }
                return y.f7506a;
        }
    }
}
