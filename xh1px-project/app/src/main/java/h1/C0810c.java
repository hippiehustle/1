package h1;

import L7.InterfaceC0163v;
import O7.InterfaceC0233f;
import O7.V;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f11316h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0233f f11317i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0810c(InterfaceC0233f interfaceC0233f, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11317i = interfaceC0233f;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0810c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0810c(this.f11317i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f11316h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        this.f11316h = 1;
        Object p8 = V.p(this.f11317i, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (p8 == enumC0646a) {
            return enumC0646a;
        }
        return p8;
    }
}
