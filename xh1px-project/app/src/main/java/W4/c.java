package W4;

import f6.AbstractC0713c;
import java.util.ArrayList;
import l2.C1001a;

/* loaded from: classes.dex */
public final class c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public C1001a f6586g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f6587h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6588i;
    public final /* synthetic */ A4.a j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(A4.a aVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = aVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6588i = obj;
        this.k |= Integer.MIN_VALUE;
        return A4.a.b(this.j, null, this);
    }
}
