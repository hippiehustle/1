package a5;

import X3.t;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418b extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7734g;

    /* renamed from: h, reason: collision with root package name */
    public int f7735h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f7736i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0418b(t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f7736i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7734g = obj;
        this.f7735h |= Integer.MIN_VALUE;
        return this.f7736i.n(null, this);
    }
}
