package o4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class N extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13537g;

    /* renamed from: h, reason: collision with root package name */
    public int f13538h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f13539i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13539i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13537g = obj;
        this.f13538h |= Integer.MIN_VALUE;
        return this.f13539i.n(null, this);
    }
}
