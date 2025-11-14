package q3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import o4.z;

/* loaded from: classes.dex */
public final class l extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14004g;

    /* renamed from: h, reason: collision with root package name */
    public int f14005h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f14006i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14006i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14004g = obj;
        this.f14005h |= Integer.MIN_VALUE;
        return this.f14006i.n(null, this);
    }
}
