package z1;

import android.view.View;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC1853a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f16614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f16615b;

    public /* synthetic */ ViewOnFocusChangeListenerC1853a(View view, b bVar) {
        this.f16614a = view;
        this.f16615b = bVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        if (this.f16614a.getId() == view.getId() && !z8) {
            this.f16615b.D();
        }
    }
}
