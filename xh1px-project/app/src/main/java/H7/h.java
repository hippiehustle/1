package H7;

import java.util.Iterator;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f2060a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1163b f2061b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1163b f2062c;

    public h(k kVar, InterfaceC1163b interfaceC1163b, InterfaceC1163b interfaceC1163b2) {
        o6.j.e(interfaceC1163b, "transformer");
        this.f2060a = kVar;
        this.f2061b = interfaceC1163b;
        this.f2062c = interfaceC1163b2;
    }

    @Override // H7.k
    public final Iterator iterator() {
        return new f(this);
    }
}
