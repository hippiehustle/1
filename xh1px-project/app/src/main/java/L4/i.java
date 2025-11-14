package L4;

import L7.InterfaceC0163v;
import L7.k0;
import Z5.y;
import c2.z;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import l1.C0999a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2916h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f2917i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2917i = jVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new i(this.f2917i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f2916h;
        j jVar = this.f2917i;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            k0 k0Var = jVar.j;
            if (k0Var != null) {
                this.f2916h = 1;
                Object v8 = k0Var.v(this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (v8 == enumC0646a) {
                    return enumC0646a;
                }
            }
        }
        jVar.j = null;
        C0999a c0999a = jVar.f2925h;
        if (c0999a != null) {
            jVar.f2919b.b(c0999a, false);
        }
        jVar.f2925h = null;
        jVar.k.g(null);
        z zVar = jVar.f2918a.f9111a;
        zVar.f9602c.g(zVar.f9600a);
        return y.f7506a;
    }
}
