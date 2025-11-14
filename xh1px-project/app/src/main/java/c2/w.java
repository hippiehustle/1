package c2;

import f6.AbstractC0713c;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public long f9590g;

    /* renamed from: h, reason: collision with root package name */
    public List f9591h;

    /* renamed from: i, reason: collision with root package name */
    public R.g f9592i;
    public R.g j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f9593l;

    /* renamed from: m, reason: collision with root package name */
    public int f9594m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9593l = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f9594m |= Integer.MIN_VALUE;
        return this.f9593l.j(0L, null, this);
    }
}
