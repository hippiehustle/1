package H1;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class c implements LayoutTransition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1887a;

    public c(d dVar) {
        this.f1887a = dVar;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i4) {
        d dVar = this.f1887a;
        LinkedHashSet linkedHashSet = dVar.f1893f;
        if (view != null) {
            view.getId();
            linkedHashSet.remove(new e(view.getId(), i4));
            if (linkedHashSet.isEmpty()) {
                dVar.f1891d.m(dVar.a());
                dVar.f1892e = false;
            }
        }
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i4) {
        if (view == null) {
            return;
        }
        view.getId();
        this.f1887a.f1893f.add(new e(view.getId(), i4));
    }
}
