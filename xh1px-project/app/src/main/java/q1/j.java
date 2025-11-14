package q1;

import R3.r;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class j extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public String f13934g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13935h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f13936i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f13936i = rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13935h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f13936i.Z(null, null, this);
    }
}
