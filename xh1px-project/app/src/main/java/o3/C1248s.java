package o3;

import M3.V;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: o3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13483g;

    /* renamed from: h, reason: collision with root package name */
    public int f13484h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f13485i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248s(V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13485i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13483g = obj;
        this.f13484h |= Integer.MIN_VALUE;
        return this.f13485i.n(null, this);
    }
}
