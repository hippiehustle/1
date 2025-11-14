package b3;

import N7.r;
import N7.s;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class f extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9127h;

    /* renamed from: i, reason: collision with root package name */
    public int f9128i;
    public /* synthetic */ Integer j;
    public /* synthetic */ Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f9129l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(s sVar, InterfaceC0617c interfaceC0617c, int i4) {
        super(3, interfaceC0617c);
        this.f9127h = i4;
        this.f9129l = sVar;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj3;
        switch (this.f9127h) {
            case 0:
                f fVar = new f(this.f9129l, interfaceC0617c, 0);
                fVar.j = num;
                fVar.k = num2;
                return fVar.v(y.f7506a);
            default:
                f fVar2 = new f(this.f9129l, interfaceC0617c, 1);
                fVar2.j = num;
                fVar2.k = num2;
                return fVar2.v(y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        switch (this.f9127h) {
            case 0:
                Integer num = this.j;
                Integer num2 = this.k;
                int i4 = this.f9128i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    c cVar = new c(num, num2);
                    this.j = null;
                    this.k = null;
                    this.f9128i = 1;
                    Object b4 = ((r) this.f9129l).f3845g.b(this, cVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (b4 == enumC0646a) {
                        return enumC0646a;
                    }
                }
                return y.f7506a;
            default:
                Integer num3 = this.j;
                Integer num4 = this.k;
                int i8 = this.f9128i;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    c cVar2 = new c(num3, num4);
                    this.j = null;
                    this.k = null;
                    this.f9128i = 1;
                    Object b9 = ((r) this.f9129l).f3845g.b(this, cVar2);
                    EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                    if (b9 == enumC0646a2) {
                        return enumC0646a2;
                    }
                }
                return y.f7506a;
        }
    }
}
