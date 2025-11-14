package s7;

import C6.O;
import a7.C0450k;
import a7.EnumC0449j;
import c7.AbstractC0586e;
import c7.InterfaceC0588g;
import f7.C0722b;
import f7.C0723c;
import h7.AbstractC0842e;

/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: d, reason: collision with root package name */
    public final C0450k f14622d;

    /* renamed from: e, reason: collision with root package name */
    public final t f14623e;

    /* renamed from: f, reason: collision with root package name */
    public final C0722b f14624f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC0449j f14625g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14626h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C0450k c0450k, InterfaceC0588g interfaceC0588g, F6.B b4, O o7, t tVar) {
        super(interfaceC0588g, b4, o7);
        o6.j.e(c0450k, "classProto");
        o6.j.e(interfaceC0588g, "nameResolver");
        this.f14622d = c0450k;
        this.f14623e = tVar;
        this.f14624f = AbstractC0842e.m(interfaceC0588g, c0450k.f8160h);
        EnumC0449j enumC0449j = (EnumC0449j) AbstractC0586e.f9702f.c(c0450k.f8159g);
        this.f14625g = enumC0449j == null ? EnumC0449j.CLASS : enumC0449j;
        this.f14626h = AbstractC0586e.f9703g.c(c0450k.f8159g).booleanValue();
        AbstractC0586e.f9704h.getClass();
    }

    @Override // s7.v
    public final C0723c a() {
        return this.f14624f.a();
    }
}
