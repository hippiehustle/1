package m3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import l3.C1018q;

/* renamed from: m3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1056A extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12413g;

    /* renamed from: h, reason: collision with root package name */
    public int f12414h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1018q f12415i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056A(C1018q c1018q, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12415i = c1018q;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12413g = obj;
        this.f12414h |= Integer.MIN_VALUE;
        return this.f12415i.n(null, this);
    }
}
