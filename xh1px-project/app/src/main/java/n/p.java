package n;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public W5.a f12693a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f12694b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f12694b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z8) {
        W5.a aVar = this.f12693a;
        if (aVar != null) {
            m mVar = ((o) aVar.f6634e).f12680n;
            mVar.f12648h = true;
            mVar.p(true);
        }
    }
}
