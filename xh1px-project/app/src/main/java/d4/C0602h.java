package d4;

import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: d4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f10385h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0604j f10386i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0602h(C0604j c0604j, boolean z8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f10386i = c0604j;
        this.j = z8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0602h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0602h(this.f10386i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f10385h;
        y yVar = y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        i0 i0Var = this.f10386i.f10390c;
        Boolean valueOf = Boolean.valueOf(this.j);
        this.f10385h = 1;
        i0Var.n(valueOf, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (yVar == enumC0646a) {
            return enumC0646a;
        }
        return yVar;
    }
}
