package O7;

import D4.C0027c;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: O7.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246t extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public C0027c f4182g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4183h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4184i;
    public final /* synthetic */ C0027c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246t(C0027c c0027c, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.j = c0027c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4184i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.n(null, this);
    }
}
