package c2;

import f6.AbstractC0713c;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class v extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public List f9585g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1164c f9586h;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f9587i;
    public int j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f9588l;

    /* renamed from: m, reason: collision with root package name */
    public int f9589m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9588l = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f9589m |= Integer.MIN_VALUE;
        return z.c(this.f9588l, null, null, this);
    }
}
