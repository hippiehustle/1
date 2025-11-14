package c2;

import f6.AbstractC0713c;
import java.util.List;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public long f9571g;

    /* renamed from: h, reason: collision with root package name */
    public List f9572h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1164c f9573i;
    public R.g j;
    public R.g k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9574l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f9575m;

    /* renamed from: n, reason: collision with root package name */
    public int f9576n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9575m = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9574l = obj;
        this.f9576n |= Integer.MIN_VALUE;
        return z.b(this.f9575m, 0L, null, null, this);
    }
}
