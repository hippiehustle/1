package O7;

import P7.AbstractC0285b;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* renamed from: O7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231d implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0233f f4131d;

    public C0231d(InterfaceC0233f interfaceC0233f) {
        this.f4131d = interfaceC0233f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o6.u] */
    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        ?? obj = new Object();
        obj.f13642d = AbstractC0285b.f4640b;
        Object x8 = this.f4131d.x(new L3.M(this, (o6.u) obj, interfaceC0234g), interfaceC0617c);
        if (x8 == EnumC0646a.f10656d) {
            return x8;
        }
        return Z5.y.f7506a;
    }
}
