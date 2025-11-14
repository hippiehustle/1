package s2;

import android.graphics.Bitmap;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class q extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f14498g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14499h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f14500i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f14500i = nVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14499h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f14500i.a(null, this);
    }
}
