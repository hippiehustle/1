package s2;

import android.graphics.Bitmap;
import f6.AbstractC0713c;
import java.util.Iterator;
import k2.C0952b;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class r extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f14501g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1165d f14502h;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f14503i;
    public C0952b j;
    public k k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f14504l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f14505m;

    /* renamed from: n, reason: collision with root package name */
    public int f14506n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(n nVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f14505m = nVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14504l = obj;
        this.f14506n |= Integer.MIN_VALUE;
        return this.f14505m.b(null, null, null, this);
    }
}
