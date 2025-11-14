package c3;

import O7.InterfaceC0234g;
import Z5.y;
import android.content.Context;
import d6.InterfaceC0617c;

/* loaded from: classes.dex */
public final class h implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f9638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f9639f;

    public /* synthetic */ h(j jVar, Context context, int i4) {
        this.f9637d = i4;
        this.f9638e = jVar;
        this.f9639f = context;
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        switch (this.f9637d) {
            case 0:
                Context context = this.f9639f;
                j.e(this.f9638e, context, (b3.e) obj, true);
                return y.f7506a;
            default:
                Context context2 = this.f9639f;
                j.e(this.f9638e, context2, (b3.e) obj, false);
                return y.f7506a;
        }
    }
}
