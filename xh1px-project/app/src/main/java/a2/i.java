package a2;

import O7.Y;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class i extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public MediaProjectionManager f7722g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f7723h;

    /* renamed from: i, reason: collision with root package name */
    public int f7724i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Y k;

    /* renamed from: l, reason: collision with root package name */
    public int f7725l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Y y4, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = y4;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f7725l |= Integer.MIN_VALUE;
        return this.k.d(null, 0, null, this);
    }
}
