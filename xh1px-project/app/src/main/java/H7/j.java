package H7;

import java.util.Iterator;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2066a;

    /* renamed from: b, reason: collision with root package name */
    public final Z5.d f2067b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2068c;

    public /* synthetic */ j(Object obj, Z5.d dVar, int i4) {
        this.f2066a = i4;
        this.f2068c = obj;
        this.f2067b = dVar;
    }

    @Override // H7.k
    public final Iterator iterator() {
        switch (this.f2066a) {
            case 0:
                return new i(this);
            case 1:
                return new f(this);
            default:
                return new I7.b(this);
        }
    }

    public j(k kVar, InterfaceC1163b interfaceC1163b) {
        this.f2066a = 1;
        o6.j.e(kVar, "sequence");
        this.f2068c = kVar;
        this.f2067b = interfaceC1163b;
    }
}
