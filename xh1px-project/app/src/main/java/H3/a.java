package H3;

import android.content.Context;
import android.graphics.Rect;
import f6.AbstractC0713c;
import l1.C0999a;

/* loaded from: classes.dex */
public final class a extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Context f1897g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f1898h;

    /* renamed from: i, reason: collision with root package name */
    public C0999a f1899i;
    public /* synthetic */ Object j;
    public final /* synthetic */ b k;

    /* renamed from: l, reason: collision with root package name */
    public int f1900l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = bVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f1900l |= Integer.MIN_VALUE;
        return this.k.c(null, null, null, this);
    }
}
