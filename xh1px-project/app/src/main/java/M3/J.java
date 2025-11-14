package M3;

import android.content.Context;
import f6.AbstractC0713c;
import j2.C0902b;

/* loaded from: classes.dex */
public final class J extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Context f3370g;

    /* renamed from: h, reason: collision with root package name */
    public f2.e f3371h;

    /* renamed from: i, reason: collision with root package name */
    public C0902b f3372i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Z k;

    /* renamed from: l, reason: collision with root package name */
    public int f3373l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Z z8, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = z8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f3373l |= Integer.MIN_VALUE;
        return Z.e(this.k, null, null, null, this);
    }
}
