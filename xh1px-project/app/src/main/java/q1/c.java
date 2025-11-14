package q1;

import android.graphics.Bitmap;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public String f13915g;

    /* renamed from: h, reason: collision with root package name */
    public Bitmap f13916h;

    /* renamed from: i, reason: collision with root package name */
    public int f13917i;
    public int j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f13918l;

    /* renamed from: m, reason: collision with root package name */
    public int f13919m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f13918l = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f13919m |= Integer.MIN_VALUE;
        return this.f13918l.b(null, 0, 0, this);
    }
}
