package V4;

import O7.i0;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f6376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f6377f;

    public /* synthetic */ b(k kVar, t tVar, int i4) {
        this.f6375d = i4;
        this.f6376e = kVar;
        this.f6377f = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6375d) {
            case 0:
                i0 i0Var = this.f6376e.W().f6418h;
                i0Var.getClass();
                i0Var.h(null, this.f6377f);
                return;
            default:
                i0 i0Var2 = this.f6376e.W().f6418h;
                i0Var2.getClass();
                i0Var2.h(null, this.f6377f);
                return;
        }
    }
}
