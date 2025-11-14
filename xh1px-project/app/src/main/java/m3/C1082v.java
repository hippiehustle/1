package m3;

import M3.V;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: m3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082v extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12483g;

    /* renamed from: h, reason: collision with root package name */
    public int f12484h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f12485i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1082v(V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12485i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12483g = obj;
        this.f12484h |= Integer.MIN_VALUE;
        return this.f12485i.n(null, this);
    }
}
