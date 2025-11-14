package O7;

import J3.C0079d;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: O7.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240m extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0079d f4161h;

    /* renamed from: i, reason: collision with root package name */
    public int f4162i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240m(C0079d c0079d, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4161h = c0079d;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4160g = obj;
        this.f4162i |= Integer.MIN_VALUE;
        return this.f4161h.n(null, this);
    }
}
