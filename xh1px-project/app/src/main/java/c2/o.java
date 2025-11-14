package c2;

import f6.AbstractC0713c;
import java.util.List;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class o extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public long f9556g;

    /* renamed from: h, reason: collision with root package name */
    public List f9557h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1164c f9558i;
    public R.g j;
    public R.g k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9559l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f9560m;

    /* renamed from: n, reason: collision with root package name */
    public int f9561n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9560m = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9559l = obj;
        this.f9561n |= Integer.MIN_VALUE;
        return this.f9560m.h(0L, null, null, this);
    }
}
