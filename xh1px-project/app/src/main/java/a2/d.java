package a2;

import android.graphics.Point;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Point f7705g;

    /* renamed from: h, reason: collision with root package name */
    public U7.c f7706h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7707i;
    public final /* synthetic */ h j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = hVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7707i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(null, this);
    }
}
