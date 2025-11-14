package S3;

import X.H;
import X.J;
import Z5.y;
import a6.AbstractC0438m;
import d6.InterfaceC0617c;
import e1.C0637a;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.List;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class h extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5345h;

    /* renamed from: i, reason: collision with root package name */
    public int f5346i;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i4, InterfaceC0617c interfaceC0617c, int i8) {
        super(i4, interfaceC0617c);
        this.f5345h = i8;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        switch (this.f5345h) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                h hVar = new h(3, (InterfaceC0617c) obj3, 0);
                hVar.j = (List) obj;
                hVar.f5346i = intValue;
                return hVar.v(y.f7506a);
            case 1:
                return new h((H) this.j, (InterfaceC0617c) obj3).v(y.f7506a);
            default:
                ((Boolean) obj2).getClass();
                h hVar2 = new h(3, (InterfaceC0617c) obj3, 2);
                hVar2.j = (J) obj;
                return hVar2.v(y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8;
        switch (this.f5345h) {
            case 0:
                List<C0637a> list = (List) this.j;
                int i4 = this.f5346i;
                Z5.a.d(obj);
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
                for (C0637a c0637a : list) {
                    if ((((Number) c0637a.f10594a).intValue() & i4) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    arrayList.add(new k(c0637a, z8));
                }
                return arrayList;
            case 1:
                int i8 = this.f5346i;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    H h8 = (H) this.j;
                    this.f5346i = 1;
                    Object a3 = H.a(h8, this);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (a3 == enumC0646a) {
                        return enumC0646a;
                    }
                }
                return y.f7506a;
            default:
                int i9 = this.f5346i;
                if (i9 != 0) {
                    if (i9 == 1) {
                        Z5.a.d(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                J j = (J) this.j;
                this.f5346i = 1;
                j.getClass();
                Object a4 = J.a(j, this);
                EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                if (a4 == enumC0646a2) {
                    return enumC0646a2;
                }
                return a4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(H h8, InterfaceC0617c interfaceC0617c) {
        super(3, interfaceC0617c);
        this.f5345h = 1;
        this.j = h8;
    }
}
