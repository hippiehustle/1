package o4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: o4.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1255D extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13509g;

    /* renamed from: h, reason: collision with root package name */
    public int f13510h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f13511i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1255D(z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13511i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13509g = obj;
        this.f13510h |= Integer.MIN_VALUE;
        return this.f13511i.n(null, this);
    }
}
