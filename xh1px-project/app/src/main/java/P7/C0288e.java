package P7;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: P7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4645h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4646i;
    public final /* synthetic */ f j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0288e(f fVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = fVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0288e) p((InterfaceC0617c) obj2, (N7.s) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0288e c0288e = new C0288e(this.j, interfaceC0617c);
        c0288e.f4646i = obj;
        return c0288e;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4645h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            N7.s sVar = (N7.s) this.f4646i;
            this.f4645h = 1;
            Object a3 = this.j.a(sVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (a3 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
