package D6;

import C6.O;
import f7.C0723c;
import java.util.Map;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final z6.h f1046a;

    /* renamed from: b, reason: collision with root package name */
    public final C0723c f1047b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f1048c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1049d;

    public l(z6.h hVar, C0723c c0723c, Map map) {
        o6.j.e(hVar, "builtIns");
        o6.j.e(c0723c, "fqName");
        this.f1046a = hVar;
        this.f1047b = c0723c;
        this.f1048c = map;
        this.f1049d = Z5.a.c(Z5.h.f7482d, new B6.j(2, this));
    }

    @Override // D6.c
    public final C0723c a() {
        return this.f1047b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // D6.c
    public final AbstractC1759v b() {
        Object value = this.f1049d.getValue();
        o6.j.d(value, "getValue(...)");
        return (AbstractC1759v) value;
    }

    @Override // D6.c
    public final Map c() {
        return this.f1048c;
    }

    @Override // D6.c
    public final O h() {
        return O.f726a;
    }
}
