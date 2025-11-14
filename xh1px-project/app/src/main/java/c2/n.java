package c2;

import f6.AbstractC0713c;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Iterator f9553g;

    /* renamed from: h, reason: collision with root package name */
    public int f9554h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9555i;
    public final /* synthetic */ z j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z zVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9555i = obj;
        this.k |= Integer.MIN_VALUE;
        return z.a(this.j, null, this);
    }
}
