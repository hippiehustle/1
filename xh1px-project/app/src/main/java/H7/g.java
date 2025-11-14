package H7;

import java.util.Iterator;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f2057a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2058b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1163b f2059c;

    public g(k kVar, boolean z8, InterfaceC1163b interfaceC1163b) {
        this.f2057a = kVar;
        this.f2058b = z8;
        this.f2059c = interfaceC1163b;
    }

    @Override // H7.k
    public final Iterator iterator() {
        return new f(this);
    }
}
