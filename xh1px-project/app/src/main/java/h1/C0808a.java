package h1;

import R.g;
import f6.AbstractC0713c;
import java.util.Map;
import n6.InterfaceC1164c;
import n6.InterfaceC1167f;
import o6.i;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808a extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public i f11306g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1164c f11307h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1167f f11308i;
    public Map j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f11309l;

    /* renamed from: m, reason: collision with root package name */
    public int f11310m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0808a(g gVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f11309l = gVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f11310m |= Integer.MIN_VALUE;
        return this.f11309l.w(null, null, null, null, this);
    }
}
