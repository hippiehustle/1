package o4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: o4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1252A extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13501g;

    /* renamed from: h, reason: collision with root package name */
    public int f13502h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L3.M f13503i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1252A(L3.M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13503i = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13501g = obj;
        this.f13502h |= Integer.MIN_VALUE;
        return this.f13503i.n(null, this);
    }
}
