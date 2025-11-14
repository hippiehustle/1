package b5;

import D4.C0025a;
import L7.AbstractC0160s;
import O7.V;
import O7.i0;
import android.content.Context;
import androidx.lifecycle.Z;
import b2.r;
import d6.InterfaceC0617c;
import kotlin.Metadata;
import o6.j;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb5/h;", "Landroidx/lifecycle/Z;", "smartautoclicker_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0160s f9198b;

    /* renamed from: c, reason: collision with root package name */
    public final r f9199c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f9200d;

    /* renamed from: e, reason: collision with root package name */
    public final A4.c f9201e;

    public h(Context context, AbstractC0160s abstractC0160s, r rVar) {
        j.e(rVar, "smartRepository");
        this.f9198b = abstractC0160s;
        this.f9199c = rVar;
        i0 c6 = V.c(i.f9202d);
        this.f9200d = c6;
        this.f9201e = new A4.c(c6, rVar.f9119i, new C0025a(context, (InterfaceC0617c) null), 27);
    }
}
