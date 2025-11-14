package Y6;

import I6.AbstractC0065d;
import u7.EnumC1656i;
import u7.InterfaceC1657j;
import u7.v;

/* loaded from: classes.dex */
public final class o implements InterfaceC1657j {

    /* renamed from: d, reason: collision with root package name */
    public final H6.b f7236d;

    public o(H6.b bVar, v vVar, EnumC1656i enumC1656i) {
        this.f7236d = bVar;
    }

    @Override // u7.InterfaceC1657j
    public final String a() {
        return A.j.q(new StringBuilder("Class '"), AbstractC0065d.a(this.f7236d.f2037a).a().f10797a.f10800a, '\'');
    }

    public final String toString() {
        return o.class.getSimpleName() + ": " + this.f7236d;
    }
}
