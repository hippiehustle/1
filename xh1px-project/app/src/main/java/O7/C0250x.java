package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: O7.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250x extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4194g;

    /* renamed from: h, reason: collision with root package name */
    public int f4195h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A.i f4196i;
    public L3.M j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0250x(A.i iVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4196i = iVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4194g = obj;
        this.f4195h |= Integer.MIN_VALUE;
        return this.f4196i.x(null, this);
    }
}
