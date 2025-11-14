package c3;

import J3.C0079d;
import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.KotlinNothingValueException;
import n6.InterfaceC1164c;

/* renamed from: c3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f9613h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0573e f9614i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0571c(C0573e c0573e, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9614i = c0573e;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        ((C0571c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
        return EnumC0646a.f10656d;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0571c(this.f9614i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f9613h;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
            throw new KotlinNothingValueException();
        }
        Z5.a.d(obj);
        C0573e c0573e = this.f9614i;
        i0 i0Var = c0573e.W().f9648e;
        C0079d c0079d = new C0079d(3, c0573e);
        this.f9613h = 1;
        i0Var.x(c0079d, this);
        return EnumC0646a.f10656d;
    }
}
