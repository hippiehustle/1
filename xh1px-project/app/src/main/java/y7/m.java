package y7;

import C6.InterfaceC0007h;
import f7.C0725e;
import java.util.Collection;
import java.util.Set;
import n6.InterfaceC1163b;
import p7.C1324f;

/* loaded from: classes.dex */
public final class m extends g {
    @Override // y7.g, p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        throw new IllegalStateException(this.f16522b);
    }

    @Override // y7.g, p7.InterfaceC1333o
    public final Set b() {
        throw new IllegalStateException();
    }

    @Override // y7.g, p7.InterfaceC1333o
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override // y7.g, p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        throw new IllegalStateException(this.f16522b + ", required name: " + c0725e);
    }

    @Override // y7.g, p7.InterfaceC1333o
    public final Set e() {
        throw new IllegalStateException();
    }

    @Override // y7.g, p7.InterfaceC1333o
    public final /* bridge */ /* synthetic */ Collection f(C0725e c0725e, K6.b bVar) {
        f(c0725e, bVar);
        throw null;
    }

    @Override // y7.g, p7.InterfaceC1333o
    public final /* bridge */ /* synthetic */ Collection g(C0725e c0725e, K6.b bVar) {
        g(c0725e, bVar);
        throw null;
    }

    @Override // y7.g
    /* renamed from: h */
    public final Set g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        throw new IllegalStateException(this.f16522b + ", required name: " + c0725e);
    }

    @Override // y7.g
    /* renamed from: i */
    public final Set f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        throw new IllegalStateException(this.f16522b + ", required name: " + c0725e);
    }

    @Override // y7.g
    public final String toString() {
        return A.j.q(new StringBuilder("ThrowingScope{"), this.f16522b, '}');
    }
}
