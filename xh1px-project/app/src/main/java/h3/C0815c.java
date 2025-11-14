package h3;

import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.KotlinNothingValueException;
import n6.InterfaceC1164c;

/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f11336h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0820h f11337i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815c(C0820h c0820h, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11337i = c0820h;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        ((C0815c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
        return EnumC0646a.f10656d;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0815c(this.f11337i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f11336h;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
            throw new KotlinNothingValueException();
        }
        Z5.a.d(obj);
        C0820h c0820h = this.f11337i;
        i0 i0Var = c0820h.S().f11362f;
        C0814b c0814b = new C0814b(c0820h, 0);
        this.f11336h = 1;
        i0Var.x(c0814b, this);
        return EnumC0646a.f10656d;
    }
}
