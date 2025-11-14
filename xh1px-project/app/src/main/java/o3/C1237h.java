package o3;

import L7.InterfaceC0163v;
import O7.P;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.KotlinNothingValueException;
import n6.InterfaceC1164c;

/* renamed from: o3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13454h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1243n f13455i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1237h(C1243n c1243n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13455i = c1243n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        ((C1237h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
        return EnumC0646a.f10656d;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1237h(this.f13455i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13454h;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
            throw new KotlinNothingValueException();
        }
        Z5.a.d(obj);
        C1243n c1243n = this.f13455i;
        P p8 = c1243n.h0().f13493f;
        C1236g c1236g = new C1236g(c1243n, 0);
        this.f13454h = 1;
        p8.f4088d.x(c1236g, this);
        return EnumC0646a.f10656d;
    }
}
