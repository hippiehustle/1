package M1;

import D4.t;
import L7.InterfaceC0163v;
import O7.P;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.KotlinNothingValueException;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f3303h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f3304i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3304i = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        ((b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
        return EnumC0646a.f10656d;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new b(this.f3304i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f3303h;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
            throw new KotlinNothingValueException();
        }
        Z5.a.d(obj);
        h hVar = this.f3304i;
        P p8 = ((l) hVar.f3321x0.getValue()).f3330c;
        t tVar = new t(4, hVar);
        this.f3303h = 1;
        p8.f4088d.x(tVar, this);
        return EnumC0646a.f10656d;
    }
}
