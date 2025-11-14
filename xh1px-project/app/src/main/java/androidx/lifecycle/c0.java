package androidx.lifecycle;

import h4.AbstractC0832f;
import k0.AbstractC0948c;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public class c0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public static c0 f8832a;

    @Override // androidx.lifecycle.b0
    public Z a(Class cls, AbstractC0948c abstractC0948c) {
        o6.j.e(abstractC0948c, "extras");
        return b(cls);
    }

    @Override // androidx.lifecycle.b0
    public Z b(Class cls) {
        o6.j.e(cls, "modelClass");
        return AbstractC0832f.k(cls);
    }

    @Override // androidx.lifecycle.b0
    public final Z c(InterfaceC1642c interfaceC1642c, AbstractC0948c abstractC0948c) {
        o6.j.e(interfaceC1642c, "modelClass");
        return a(h2.a.k(interfaceC1642c), abstractC0948c);
    }
}
