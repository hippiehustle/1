package X6;

import P.V;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import w7.z;

/* loaded from: classes.dex */
public final class c implements V {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6992a;

    /* renamed from: b, reason: collision with root package name */
    public int f6993b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6994c;

    public c(FloatingActionButton floatingActionButton) {
        this.f6992a = false;
        this.f6993b = 0;
        this.f6994c = floatingActionButton;
    }

    @Override // P.V
    public void F() {
        ActionBarContextView.a((ActionBarContextView) this.f6994c);
        this.f6992a = false;
    }

    @Override // P.V
    public void c() {
        if (this.f6992a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f6994c;
        actionBarContextView.f8348i = null;
        ActionBarContextView.b(actionBarContextView, this.f6993b);
    }

    @Override // P.V
    public void d() {
        this.f6992a = true;
    }

    public c(z zVar, int i4, boolean z8) {
        this.f6994c = zVar;
        this.f6993b = i4;
        this.f6992a = z8;
    }

    public c(ActionBarContextView actionBarContextView) {
        this.f6994c = actionBarContextView;
        this.f6992a = false;
    }
}
