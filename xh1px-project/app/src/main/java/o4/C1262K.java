package o4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: o4.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1262K extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13528g;

    /* renamed from: h, reason: collision with root package name */
    public int f13529h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f13530i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1262K(z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13530i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13528g = obj;
        this.f13529h |= Integer.MIN_VALUE;
        return this.f13530i.n(null, this);
    }
}
