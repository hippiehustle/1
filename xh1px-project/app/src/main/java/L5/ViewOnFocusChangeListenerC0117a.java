package L5;

import android.view.View;

/* renamed from: L5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0117a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f2933b;

    public /* synthetic */ ViewOnFocusChangeListenerC0117a(o oVar, int i4) {
        this.f2932a = i4;
        this.f2933b = oVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        switch (this.f2932a) {
            case 0:
                d dVar = (d) this.f2933b;
                dVar.t(dVar.u());
                return;
            default:
                i iVar = (i) this.f2933b;
                iVar.f2955l = z8;
                iVar.q();
                if (!z8) {
                    iVar.t(false);
                    iVar.f2956m = false;
                    return;
                }
                return;
        }
    }
}
