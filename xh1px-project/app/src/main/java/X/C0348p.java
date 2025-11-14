package X;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: X.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348p extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6761g;

    /* renamed from: h, reason: collision with root package name */
    public int f6762h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T3.x f6763i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0348p(T3.x xVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f6763i = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6761g = obj;
        this.f6762h |= Integer.MIN_VALUE;
        return this.f6763i.n(null, this);
    }
}
