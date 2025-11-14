package C7;

import m7.AbstractC1098d;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public abstract class w implements e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1163b f843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f844b;

    public w(String str, InterfaceC1163b interfaceC1163b) {
        this.f843a = interfaceC1163b;
        this.f844b = "must return ".concat(str);
    }

    @Override // C7.e
    public final String a() {
        return this.f844b;
    }

    @Override // C7.e
    public final boolean b(R6.f fVar) {
        return o6.j.a(fVar.k, this.f843a.m(AbstractC1098d.e(fVar)));
    }

    @Override // C7.e
    public final String c(R6.f fVar) {
        return D2.f.v(this, fVar);
    }
}
