package X3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6918g;

    /* renamed from: h, reason: collision with root package name */
    public int f6919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f6920i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f6920i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6918g = obj;
        this.f6919h |= Integer.MIN_VALUE;
        return this.f6920i.n(null, this);
    }
}
