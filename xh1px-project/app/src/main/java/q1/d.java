package q1;

import android.graphics.Bitmap;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f13920g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13921h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f13922i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f13922i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13921h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f13922i.c(null, null, this);
    }
}
