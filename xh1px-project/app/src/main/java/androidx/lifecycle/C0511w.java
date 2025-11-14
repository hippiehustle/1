package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511w {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0504o f8857a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0508t f8858b;

    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        EnumC0504o a3 = enumC0503n.a();
        EnumC0504o enumC0504o = this.f8857a;
        o6.j.e(enumC0504o, "state1");
        if (a3.compareTo(enumC0504o) < 0) {
            enumC0504o = a3;
        }
        this.f8857a = enumC0504o;
        this.f8858b.a(interfaceC0510v, enumC0503n);
        this.f8857a = a3;
    }
}
