package j3;

import M3.V;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: j3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0938x extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11903g;

    /* renamed from: h, reason: collision with root package name */
    public int f11904h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f11905i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0938x(V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f11905i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11903g = obj;
        this.f11904h |= Integer.MIN_VALUE;
        return this.f11905i.n(null, this);
    }
}
