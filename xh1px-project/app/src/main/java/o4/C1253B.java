package o4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: o4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1253B extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13504g;

    /* renamed from: h, reason: collision with root package name */
    public int f13505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f13506i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1253B(z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13506i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13504g = obj;
        this.f13505h |= Integer.MIN_VALUE;
        return this.f13506i.n(null, this);
    }
}
