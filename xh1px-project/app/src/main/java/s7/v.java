package s7;

import C6.O;
import c7.InterfaceC0588g;
import f7.C0723c;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0588g f14628a;

    /* renamed from: b, reason: collision with root package name */
    public final F6.B f14629b;

    /* renamed from: c, reason: collision with root package name */
    public final O f14630c;

    public v(InterfaceC0588g interfaceC0588g, F6.B b4, O o7) {
        this.f14628a = interfaceC0588g;
        this.f14629b = b4;
        this.f14630c = o7;
    }

    public abstract C0723c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
