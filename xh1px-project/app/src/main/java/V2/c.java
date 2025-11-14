package V2;

import R.g;
import android.graphics.Point;
import android.net.Uri;
import f6.AbstractC0713c;
import o6.s;

/* loaded from: classes.dex */
public final class c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Uri f6339g;

    /* renamed from: h, reason: collision with root package name */
    public Point f6340h;

    /* renamed from: i, reason: collision with root package name */
    public A4.a f6341i;
    public s j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f6342l;

    /* renamed from: m, reason: collision with root package name */
    public int f6343m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f6342l = gVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f6343m |= Integer.MIN_VALUE;
        return this.f6342l.H(null, null, null, this);
    }
}
