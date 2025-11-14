package O7;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.io.Serializable;
import kotlin.KotlinNothingValueException;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class c0 extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4129h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4130i;
    public final /* synthetic */ P7.D j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(P7.D d2, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = d2;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        ((c0) p((InterfaceC0617c) obj2, (InterfaceC0234g) obj)).v(Z5.y.f7506a);
        return EnumC0646a.f10656d;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        c0 c0Var = new c0(this.j, interfaceC0617c);
        c0Var.f4130i = obj;
        return c0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.io.Serializable] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4129h;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
            throw new KotlinNothingValueException();
        }
        Z5.a.d(obj);
        L3.M m6 = new L3.M((Serializable) new Object(), (InterfaceC0234g) this.f4130i, 8);
        this.f4129h = 1;
        this.j.x(m6, this);
        return EnumC0646a.f10656d;
    }
}
