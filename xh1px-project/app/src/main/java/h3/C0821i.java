package h3;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: h3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f11351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0826n f11352i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0821i(C0826n c0826n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11352i = c0826n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0821i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0821i(this.f11352i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f11351h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            g3.e eVar = this.f11352i.f11358b;
            this.f11351h = 1;
            Object c6 = eVar.c(this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (c6 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
