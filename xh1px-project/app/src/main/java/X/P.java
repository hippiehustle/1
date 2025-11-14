package X;

import f6.AbstractC0713c;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class P extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public FileOutputStream f6689g;

    /* renamed from: h, reason: collision with root package name */
    public FileOutputStream f6690h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6691i;
    public final /* synthetic */ Q j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q6, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = q6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6691i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, this);
    }
}
