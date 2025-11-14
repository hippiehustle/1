package X;

import J3.C0079d;
import L7.C0156n;
import L7.InterfaceC0163v;
import O7.InterfaceC0233f;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352u extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6776h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f6777i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0352u(H h8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6777i = h8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0352u) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0352u(this.f6777i, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r7 == r5) goto L19;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f6776h;
        Z5.y yVar = Z5.y.f7506a;
        H h8 = this.f6777i;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    Z5.a.d(obj);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            A4.a aVar = h8.f6661l;
            this.f6776h = 1;
            Object e02 = ((C0156n) aVar.f281f).e0(this);
            if (e02 != enumC0646a) {
                e02 = yVar;
            }
        }
        InterfaceC0233f g8 = O7.V.g(h8.h().f6715c, -1);
        C0079d c0079d = new C0079d(2, h8);
        this.f6776h = 2;
        if (g8.x(c0079d, this) == enumC0646a) {
            return enumC0646a;
        }
        return yVar;
    }
}
