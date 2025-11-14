package K3;

import android.graphics.PointF;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class C extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public PointF f2637g;

    /* renamed from: h, reason: collision with root package name */
    public long f2638h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2639i;
    public final /* synthetic */ D j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d2, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = d2;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2639i = obj;
        this.k |= Integer.MIN_VALUE;
        return D.e(this.j, null, null, this);
    }
}
