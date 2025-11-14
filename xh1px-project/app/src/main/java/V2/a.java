package V2;

import R.g;
import android.graphics.Point;
import android.net.Uri;
import f6.AbstractC0713c;
import java.util.List;
import o6.s;

/* loaded from: classes.dex */
public final class a extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Uri f6315g;

    /* renamed from: h, reason: collision with root package name */
    public List f6316h;

    /* renamed from: i, reason: collision with root package name */
    public List f6317i;
    public Point j;
    public A4.a k;

    /* renamed from: l, reason: collision with root package name */
    public s f6318l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6319m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f6320n;

    /* renamed from: o, reason: collision with root package name */
    public int f6321o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f6320n = gVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6319m = obj;
        this.f6321o |= Integer.MIN_VALUE;
        return this.f6320n.l(null, null, null, null, null, this);
    }
}
