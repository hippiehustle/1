package k3;

import M3.V;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: k3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963j extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11993g;

    /* renamed from: h, reason: collision with root package name */
    public int f11994h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f11995i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0963j(V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f11995i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11993g = obj;
        this.f11994h |= Integer.MIN_VALUE;
        return this.f11995i.n(null, this);
    }
}
