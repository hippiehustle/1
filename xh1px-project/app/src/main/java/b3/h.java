package b3;

import N7.r;
import N7.s;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class h extends AbstractC0720j implements InterfaceC1163b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9134h;

    /* renamed from: i, reason: collision with root package name */
    public int f9135i;
    public final /* synthetic */ s j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(s sVar, InterfaceC0617c interfaceC0617c, int i4) {
        super(1, interfaceC0617c);
        this.f9134h = i4;
        this.j = sVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj;
        switch (this.f9134h) {
            case 0:
                return new h(this.j, interfaceC0617c, 0).v(y.f7506a);
            case 1:
                return new h(this.j, interfaceC0617c, 1).v(y.f7506a);
            default:
                return new h(this.j, interfaceC0617c, 2).v(y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        switch (this.f9134h) {
            case 0:
                int i4 = this.f9135i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    this.f9135i = 1;
                    Object b4 = ((r) this.j).f3845g.b(this, b.f9123a);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (b4 == enumC0646a) {
                        return enumC0646a;
                    }
                }
                return y.f7506a;
            case 1:
                int i8 = this.f9135i;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    this.f9135i = 1;
                    Object b9 = ((r) this.j).f3845g.b(this, b.f9123a);
                    EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                    if (b9 == enumC0646a2) {
                        return enumC0646a2;
                    }
                }
                return y.f7506a;
            default:
                int i9 = this.f9135i;
                if (i9 != 0) {
                    if (i9 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    this.f9135i = 1;
                    Object b10 = ((r) this.j).f3845g.b(this, d.f9126a);
                    EnumC0646a enumC0646a3 = EnumC0646a.f10656d;
                    if (b10 == enumC0646a3) {
                        return enumC0646a3;
                    }
                }
                return y.f7506a;
        }
    }
}
