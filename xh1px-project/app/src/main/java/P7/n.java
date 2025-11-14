package P7;

import L7.AbstractC0166y;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class n extends h {

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0720j f4665h;

    /* JADX WARN: Multi-variable type inference failed */
    public n(InterfaceC1165d interfaceC1165d, InterfaceC0233f interfaceC0233f, InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        super(i4, aVar, interfaceC0233f, interfaceC0622h);
        this.f4665h = (AbstractC0720j) interfaceC1165d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f6.j, n6.d] */
    @Override // P7.f
    public final f b(InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        return new n(this.f4665h, this.f4652g, interfaceC0622h, i4, aVar);
    }

    @Override // P7.h
    public final Object d(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        Object f8 = AbstractC0166y.f(new m(this, interfaceC0234g, null), interfaceC0617c);
        if (f8 == EnumC0646a.f10656d) {
            return f8;
        }
        return Z5.y.f7506a;
    }
}
