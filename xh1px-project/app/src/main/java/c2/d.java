package c2;

import O7.InterfaceC0234g;
import O7.V;
import S1.E;
import S1.F;
import S1.J;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import i.AbstractC0863b;
import n6.InterfaceC1165d;
import u0.C1621l;

/* loaded from: classes.dex */
public final class d extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9521h;

    /* renamed from: i, reason: collision with root package name */
    public int f9522i;
    public /* synthetic */ InterfaceC0234g j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f9523l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(InterfaceC0617c interfaceC0617c, long j, int i4) {
        super(3, interfaceC0617c);
        this.f9521h = i4;
        this.f9523l = j;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        InterfaceC0234g interfaceC0234g = (InterfaceC0234g) obj;
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj3;
        switch (this.f9521h) {
            case 0:
                d dVar = new d(interfaceC0617c, this.f9523l, 0);
                dVar.j = interfaceC0234g;
                dVar.k = obj2;
                return dVar.v(Z5.y.f7506a);
            case 1:
                d dVar2 = new d(interfaceC0617c, this.f9523l, 1);
                dVar2.j = interfaceC0234g;
                dVar2.k = obj2;
                return dVar2.v(Z5.y.f7506a);
            default:
                d dVar3 = new d(interfaceC0617c, this.f9523l, 2);
                dVar3.j = interfaceC0234g;
                dVar3.k = obj2;
                return dVar3.v(Z5.y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C1621l c6;
        C1621l c9;
        C1621l c10;
        switch (this.f9521h) {
            case 0:
                int i4 = this.f9522i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    InterfaceC0234g interfaceC0234g = this.j;
                    S1.w wVar = (S1.w) this.k;
                    int i8 = wVar.f5305a;
                    long j = this.f9523l;
                    switch (i8) {
                        case 0:
                            c6 = AbstractC0863b.c(wVar.f5306b, true, new String[]{"intent_extra_table", "event_toggle_table", "action_table", "condition_table", "event_table"}, new S1.r(j, wVar, 0));
                            break;
                        default:
                            c6 = AbstractC0863b.c(wVar.f5306b, true, new String[]{"intent_extra_table", "event_toggle_table", "action_table", "condition_table", "event_table"}, new S1.x(j, wVar, 0));
                            break;
                    }
                    this.j = null;
                    this.k = null;
                    this.f9522i = 1;
                    Object l6 = V.l(interfaceC0234g, c6, this);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (l6 == enumC0646a) {
                        return enumC0646a;
                    }
                }
                return Z5.y.f7506a;
            case 1:
                int i9 = this.f9522i;
                if (i9 != 0) {
                    if (i9 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    InterfaceC0234g interfaceC0234g2 = this.j;
                    F f8 = (F) this.k;
                    int i10 = f8.f5221a;
                    long j5 = this.f9523l;
                    switch (i10) {
                        case 0:
                            c9 = AbstractC0863b.c(f8.f5222b, true, new String[]{"event_table", "scenario_usage_table", "scenario_table"}, new E(j5, f8, 1));
                            break;
                        default:
                            c9 = AbstractC0863b.c(f8.f5222b, true, new String[]{"event_table", "scenario_usage_table", "scenario_table"}, new J(j5, f8, 0));
                            break;
                    }
                    this.j = null;
                    this.k = null;
                    this.f9522i = 1;
                    Object l8 = V.l(interfaceC0234g2, c9, this);
                    EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                    if (l8 == enumC0646a2) {
                        return enumC0646a2;
                    }
                }
                return Z5.y.f7506a;
            default:
                int i11 = this.f9522i;
                if (i11 != 0) {
                    if (i11 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    InterfaceC0234g interfaceC0234g3 = this.j;
                    S1.w wVar2 = (S1.w) this.k;
                    int i12 = wVar2.f5305a;
                    long j8 = this.f9523l;
                    switch (i12) {
                        case 0:
                            c10 = AbstractC0863b.c(wVar2.f5306b, true, new String[]{"intent_extra_table", "event_toggle_table", "action_table", "condition_table", "event_table"}, new S1.r(j8, wVar2, 1));
                            break;
                        default:
                            c10 = AbstractC0863b.c(wVar2.f5306b, true, new String[]{"intent_extra_table", "event_toggle_table", "action_table", "condition_table", "event_table"}, new S1.x(j8, wVar2, 2));
                            break;
                    }
                    this.j = null;
                    this.k = null;
                    this.f9522i = 1;
                    Object l9 = V.l(interfaceC0234g3, c10, this);
                    EnumC0646a enumC0646a3 = EnumC0646a.f10656d;
                    if (l9 == enumC0646a3) {
                        return enumC0646a3;
                    }
                }
                return Z5.y.f7506a;
        }
    }
}
