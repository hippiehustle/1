package X;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1163b;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337e extends AbstractC0720j implements InterfaceC1163b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6723h;

    /* renamed from: i, reason: collision with root package name */
    public int f6724i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0337e(Object obj, InterfaceC0617c interfaceC0617c, int i4) {
        super(1, interfaceC0617c);
        this.f6723h = i4;
        this.j = obj;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj;
        switch (this.f6723h) {
            case 0:
                return new C0337e((y2.c) this.j, interfaceC0617c, 0).v(Z5.y.f7506a);
            default:
                return new C0337e((A) this.j, interfaceC0617c, 1).v(Z5.y.f7506a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        switch (this.f6723h) {
            case 0:
                int i4 = this.f6724i;
                Z5.y yVar = Z5.y.f7506a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                y2.c cVar = (y2.c) this.j;
                this.f6724i = 1;
                Object P4 = cVar.f16463a.P(new AbstractC0720j(2, null), this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (P4 != enumC0646a) {
                    P4 = yVar;
                }
                if (P4 == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            default:
                int i8 = this.f6724i;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Z5.a.d(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                A a3 = (A) this.j;
                this.f6724i = 1;
                Object m6 = a3.m(this);
                EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                if (m6 == enumC0646a2) {
                    return enumC0646a2;
                }
                return m6;
        }
    }
}
