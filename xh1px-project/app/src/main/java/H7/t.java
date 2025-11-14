package H7;

import java.util.Iterator;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class t implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f2082a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1163b f2083b;

    public t(k kVar, InterfaceC1163b interfaceC1163b) {
        o6.j.e(interfaceC1163b, "transformer");
        this.f2082a = kVar;
        this.f2083b = interfaceC1163b;
    }

    @Override // H7.k
    public final Iterator iterator() {
        return new s(this);
    }
}
