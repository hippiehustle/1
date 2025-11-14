package v2;

import L7.InterfaceC0163v;
import Z5.y;
import b2.r;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import l1.C0999a;
import n6.InterfaceC1164c;

/* renamed from: v2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1663c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f15487i;
    public final /* synthetic */ C0999a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1663c(h hVar, C0999a c0999a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15487i = hVar;
        this.j = c0999a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1663c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1663c(this.f15487i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15486h;
        y yVar = y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        r rVar = this.f15487i.f15501a;
        this.f15486h = 1;
        Object f8 = rVar.f9111a.f(this.j.f12187a, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (f8 != enumC0646a) {
            f8 = yVar;
        }
        if (f8 == enumC0646a) {
            return enumC0646a;
        }
        return yVar;
    }
}
