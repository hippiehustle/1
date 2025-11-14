package q1;

import R3.r;
import f6.AbstractC0713c;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Iterator f13925g;

    /* renamed from: h, reason: collision with root package name */
    public int f13926h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13927i;
    public final /* synthetic */ r j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13927i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.y(null, this);
    }
}
