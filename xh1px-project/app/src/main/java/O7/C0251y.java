package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: O7.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251y extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public L3.M f4197g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4198h;

    /* renamed from: i, reason: collision with root package name */
    public int f4199i;
    public final /* synthetic */ L3.M j;
    public Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251y(L3.M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.j = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4198h = obj;
        this.f4199i |= Integer.MIN_VALUE;
        return this.j.n(null, this);
    }
}
